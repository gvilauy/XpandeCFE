package org.xpande.cfe.utils;

import dto.uy.gub.dgi.cfe.*;
import org.adempiere.exceptions.AdempiereException;
import org.compiere.model.*;
import org.compiere.util.Env;
import org.eevolution.model.X_C_TaxGroup;
import org.xpande.cfe.model.MZCFEConfig;
import org.xpande.cfe.model.MZCFEConfigDocDGI;
import org.xpande.cfe.model.MZCFEConfigDocSend;
import org.xpande.cfe.model.MZCFEVendorOrg;

import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Properties;

/**
 * Product: Adempiere ERP & CRM Smart Business Solution. Localization : Uruguay - Xpande
 * Xpande. Created by Gabriel Vila on 10/30/18.
 */
public class HandlerCFESisteco extends HandlerCFE {

    private CFEEmpresasType empresasType = null;
    private CFEDefType defType = null;

    public HandlerCFESisteco(Properties ctx, PO model, String trxName, MZCFEConfigDocSend configDocSend) {

        super(ctx, model, trxName, configDocSend);

        // Instancio modelos para CFE
        this.empresasType = new CFEEmpresasType();
        this.defType = new CFEDefType();
        this.empresasType.setCFE(defType);
    }

    /***
     * Carga modelos para envío de CFE correspondiente a Invoices.
     * Xpande. Created by Gabriel Vila on 10/30/18.
     * @return
     * @throws Exception
     */
    @Override
    protected String executeInvoice() throws Exception {

        String message = null;

        try{

            MZCFEConfigDocDGI docDGI = (MZCFEConfigDocDGI) this.configDocSend.getZ_CFE_ConfigDocDGI();
            if ((docDGI == null) || (docDGI.get_ID() <= 0)){
                return "Falta indicar documento de DGI para configuración de envío de este documento - organización - proveedor de CFE";
            }

            // Obtengo datos del Emisor
            Emisor emisor = this.setEmisor(this.configDocSend.getAD_OrgTrx_ID());

            // Obtengo totales
            Totales totales = this.setTotalesInvoice();

            // Identificación y encabezado del Documento segun sea del tipo eFactura o eTicket.
            if ((docDGI.getValue().equalsIgnoreCase("E-FACTURA")) || (docDGI.getValue().equalsIgnoreCase("E-FACTURA NC"))
                    || (docDGI.getValue().equalsIgnoreCase("E-FACTURA ND")) || (docDGI.getValue().equalsIgnoreCase("E-FACTURA CTAAJE"))
                    || (docDGI.getValue().equalsIgnoreCase("E-FACTURA CTAAJE NC")) || (docDGI.getValue().equalsIgnoreCase("E-FACTURA CTAAJE ND"))){

                // Obtengo datos del Receptor
                ReceptorFact receptor = this.setReceptor_eFactura();

                message = this.setEncabezado_eFactura(docDGI, emisor, receptor, totales);

            }
            else if ((docDGI.getValue().equalsIgnoreCase("E-TICKET")) || (docDGI.getValue().equalsIgnoreCase("E-TICKET NC"))
                    || (docDGI.getValue().equalsIgnoreCase("E-TICKET ND")) || (docDGI.getValue().equalsIgnoreCase("E-TICKET CTAAJE"))
                    || (docDGI.getValue().equalsIgnoreCase("E-TICKET CTAAJE NC")) || (docDGI.getValue().equalsIgnoreCase("E-TICKET CTAAJE ND"))){

                message = this.setEncabezado_eTicket(docDGI);
            }

        }
        catch (Exception e){
            throw new AdempiereException(e);
        }

        return message;
    }


    /***
     * Obtiene y setea información de Totales para el envío de CFE.
     * Xpande. Created by Gabriel Vila on 10/30/18.
     * @return
     */
    private Totales setTotalesInvoice() {

        Totales totales = new Totales();

        try{

            MCurrency currency = new MCurrency(this.ctx, this.model.get_ValueAsInt("C_Currency_ID"), null);
            if ((currency == null) || (currency.get_ID() <= 0)){
                throw new AdempiereException("Falta indicar Moneda del Documento");
            }

            totales.setTpoMoneda(TipMonType.valueOf(currency.getISO_Code()));

            // Si moneda no es Pesos Uruguayos, debo informar la tasa de cambio
            if (currency.get_ID() != 142){
                BigDecimal currencyRate = (BigDecimal) this.model.get_Value("DivideRate");
                if (currencyRate == null){
                    Timestamp dateInvoiced = (Timestamp) this.model.get_Value("DateInvoiced");
                    if (dateInvoiced != null){
                        currencyRate = MConversionRate.getRate(currency.get_ID(), 142, dateInvoiced, 0, model.getAD_Client_ID(), 0);
                    }
                }
                if ((currencyRate == null) || (currencyRate.compareTo(Env.ZERO) <= 0)){
                    throw new AdempiereException("No se obtuvo Tasa de Cambio para Fecha y Moneda de este Documento");
                }

                totales.setTpoCambio(currencyRate.setScale(3, BigDecimal.ROUND_HALF_UP));
            }

            // Inicializo montos antes de setearlos
            totales.setMntNoGrv(Env.ZERO);
            totales.setMntExpoyAsim(Env.ZERO);
            totales.setMntImpuestoPerc(Env.ZERO);
            totales.setMntNetoIvaTasaMin(Env.ZERO);
            totales.setMntNetoIVATasaBasica(Env.ZERO);
            totales.setMntNetoIVAOtra(Env.ZERO);
            totales.setMntIVATasaMin(Env.ZERO);
            totales.setMntIVATasaBasica(Env.ZERO);
            totales.setMntIVAOtra(Env.ZERO);
            totales.setMontoNF(Env.ZERO);
            totales.setMntTotal(Env.ZERO);

            BigDecimal amtTotal = Env.ZERO;

            // Recorro lineas para cargar totaless
            MInvoice invoice = (MInvoice) this.model;
            MInvoiceLine[] invoiceLines = ((MInvoice) this.model).getLines(true);
            for (int i = 0; i < invoiceLines.length; i++){

                MInvoiceLine invoiceLine = invoiceLines[i];
                MTax tax = MTax.get(this.ctx, invoiceLine.getC_Tax_ID());

                if ((tax == null) || (tax.get_ID() <= 0)){

                    String message = null;

                    if (invoiceLine.getM_Product_ID() > 0){
                        MProduct product = (MProduct) invoiceLine.getM_Product();
                        message = "Falta indicar Impuesto para la linea correspondiente al producto : " + product.getValue() + " - "  + product.getName();
                    }
                    else if (invoiceLine.getC_Charge_ID() > 0){
                        MCharge charge = (MCharge) invoiceLine.getC_Charge();
                        message = "Falta indicar Impuesto para la linea correspondiente al cargo : " + charge.getName();
                    }
                    throw new AdempiereException(message);
                }

                if (tax.getRate() == null){
                    throw new AdempiereException("Falta indicar Tasa del impuesto : " + tax.getName());
                }

                BigDecimal taxRate = tax.getRate();
                BigDecimal amtSubtotal = (BigDecimal) invoiceLine.get_Value("AmtSubtotal");
                BigDecimal taxAmt = invoiceLine.getTaxAmt();

                if (amtSubtotal == null) amtSubtotal = Env.ZERO;
                if (taxAmt == null) taxAmt = Env.ZERO;

                if (tax.getRate().compareTo(Env.ZERO) == 0){
                    totales.setMntNoGrv(totales.getMntNoGrv().add(amtSubtotal));
                }
                else if (tax.getRate().compareTo(new BigDecimal(10)) == 0){
                    totales.setMntNetoIvaTasaMin(totales.getMntNetoIvaTasaMin().add(amtSubtotal));
                    totales.setMntIVATasaMin(totales.getMntIVATasaMin().add(taxAmt));
                }
                else if (tax.getRate().compareTo(new BigDecimal(22)) == 0){
                    totales.setMntNetoIVATasaBasica(totales.getMntNetoIVATasaBasica().add(amtSubtotal));
                    totales.setMntIVATasaBasica(totales.getMntIVATasaBasica().add(taxAmt));
                }
                else {
                    totales.setMntNetoIVAOtra(totales.getMntNetoIVAOtra().add(amtSubtotal));
                    totales.setMntIVAOtra(totales.getMntIVAOtra().add(taxAmt));
                }
                amtTotal = amtTotal.add(amtSubtotal).add(taxAmt);

            }

            MZCFEConfig cfeConfig = (MZCFEConfig) this.configDocSend.getZ_CFE_Config();

            MTax ivaBasico = new MTax(this.ctx, cfeConfig.getTaxBasico_ID(), null);
            if ((ivaBasico == null) || (ivaBasico.get_ID() > 0)){
                throw new AdempiereException("Falta indicar Tasa de Impuesto Básico en Configuración CFE");
            }

            MTax ivaMinimo = new MTax(this.ctx, cfeConfig.getTaxMinimo_ID(), null);
            if ((ivaMinimo == null) || (ivaMinimo.get_ID() > 0)){
                throw new AdempiereException("Falta indicar Tasa de Impuesto Mínimo en Configuración CFE");
            }

            totales.setIVATasaMin(ivaMinimo.getRate().setScale(3));
            totales.setIVATasaBasica(ivaBasico.getRate().setScale(3));
            totales.setMntTotal(amtTotal);
            totales.setMntPagar(invoice.getGrandTotal());
            totales.setCantLinDet(invoiceLines.length);

        }
        catch (Exception e){
            throw new AdempiereException(e);
        }

        return totales;
    }


    /***
     * Obtiene y retorna información del Receptor para comprobantes CFE del tipo eFactura.
     * Xpande. Created by Gabriel Vila on 10/30/18.
     * @return
     */
    private ReceptorFact setReceptor_eFactura() {

        ReceptorFact receptor = null;

        try{

            MBPartner partner =  new MBPartner(this.ctx, this.model.get_ValueAsInt("C_BPartner_ID"), null);
            MBPartnerLocation partnerLocation = new MBPartnerLocation(this.ctx, this.model.get_ValueAsInt("C_BPartner_Location_ID"), null);
            if ((partnerLocation == null) || (partnerLocation.get_ID() <= 0)){
                MBPartnerLocation[] locations = partner.getLocations(false);
                if ((locations == null) || (locations.length <= 0)){
                    throw new AdempiereException("Falta indicar Localización del Socio de Negocio de este Documento.");
                }
                partnerLocation = locations[0];
            }
            MLocation location = (MLocation) partnerLocation.getC_Location();
            if ((location == null) || (location.get_ID() <= 0)){
                throw new AdempiereException("Falta indicar Dirección en la Localización del Socio de Negocio de este Documento.");
            }
            MCountry country = (MCountry) location.getC_Country();
            if ((country == null) || (country.get_ID() <= 0)){
                throw new AdempiereException("Falta indicar País en la Localización del Socio de Negocio de este Documento.");
            }

            // 2 = RUT, 3 = CI, 4 = Otros
            int tipoIdentificacion = 4;
            X_C_TaxGroup taxGroup = (X_C_TaxGroup) partner.getC_TaxGroup();
            if (taxGroup.getValue() != null){
                if (taxGroup.getValue().equalsIgnoreCase("RUT")){
                    tipoIdentificacion = 2;
                }
                else if (taxGroup.getValue().equalsIgnoreCase("CI")){
                    tipoIdentificacion = 3;
                }
            }
            String nroIdentificacion = partner.getTaxID();

            receptor.setTipoDocRecep(tipoIdentificacion);
            receptor.setDocRecep(nroIdentificacion);
            receptor.setRznSocRecep(partner.getName());

            // Datos geográficos
            String direccion = location.getAddress1();
            if (direccion != null) {
                if (direccion.length() > 70){
                    direccion = direccion.substring(0, 70);
                }
            }

            receptor.setCodPaisRecep(country.getCountryCode());
            receptor.setPaisRecep(country.getName());
            receptor.setCiudadRecep(location.getCity());
            receptor.setDeptoRecep(location.getRegionName());
            receptor.setDirRecep(direccion);

        }
        catch (Exception e){
            throw new AdempiereException(e);
        }

        return receptor;
    }


    @Override
    protected String executeResguardo() throws Exception {

        String message = null;

        try{

        }
        catch (Exception e){
            throw new AdempiereException(e);
        }

        return message;
    }

    @Override
    protected String executeInOut() throws Exception {

        String message = null;

        try{

        }
        catch (Exception e){
            throw new AdempiereException(e);
        }

        return message;
    }

    @Override
    protected String send(MZCFEVendorOrg vendorOrg) throws Exception {
        return null;
    }


    /***
     * Setea información del Emisor para comprobantes CFE.
     * Xpande. Created by Gabriel Vila on 10/30/18.
     * @param adOrgID
     * @return
     */
    private Emisor setEmisor(int adOrgID){

        Emisor emisor = new Emisor();

        try{

            MOrg org = new MOrg(this.ctx, adOrgID, null);
            MOrgInfo orgInfo = MOrgInfo.get(this.ctx, adOrgID, null);

            emisor.setRznSoc(org.getDescription());
            emisor.setRUCEmisor(orgInfo.getTaxID());
            emisor.setCorreoEmisor(orgInfo.getEMail());
            emisor.setCdgDGISucur(BigInteger.valueOf(1));

            MWarehouse warehouse = MWarehouse.get(this.ctx, orgInfo.getM_Warehouse_ID());
            emisor.setEmiSucursal(warehouse.getName());

            MLocation location = (MLocation) orgInfo.getC_Location();
            emisor.setDomFiscal(location.getAddress1());
            emisor.setCiudad(location.getCity());
            emisor.setDepartamento(location.getRegionName().toUpperCase());

        }
        catch (Exception e){
            throw new AdempiereException(e);
        }

        return emisor;
    }


    /***
     * Obtiene y setea información del Encabezado de documento para envío de CFE.
     * Xpande. Created by Gabriel Vila on 10/30/18.
     * @param docDGI
     * @param emisor
     * @param receptor
     * @param totales
     * @return
     */
    private String setEncabezado_eFactura(MZCFEConfigDocDGI docDGI, Emisor emisor, ReceptorFact receptor, Totales totales) {

        String message = null;

        try{

            CFEDefType.EFact eFactura = new CFEDefType.EFact();
            CFEDefType.EFact.Encabezado eFactEncabezado = new CFEDefType.EFact.Encabezado();
            this.defType.setEFact(eFactura);
            eFactura.setEncabezado(eFactEncabezado);

            IdDocFact idDoc = new IdDocFact();
            eFactEncabezado.setIdDoc(idDoc);
            idDoc.setTipoCFE(BigInteger.valueOf(Long.parseLong(docDGI.getCodigoDGI())));
            idDoc.setSerie(configDocSend.getDocumentSerie().trim());

            String cfeNumero = this.model.get_ValueAsString("DocumentNo").replaceAll("[^0-9]", "");
            cfeNumero = org.apache.commons.lang.StringUtils.leftPad(String.valueOf(cfeNumero), 7, "0");
            idDoc.setNro(new BigInteger(cfeNumero));

            this.defType.setVersion("1.0");

            //Emisor emisor = new Emisor();
            //ReceptorTck receptorTck = new ReceptorTck();
            //ReceptorFact receptorFact = new ReceptorFact();
            //Totales totales = new Totales();
            eFactEncabezado.setEmisor(emisor);
            eFactEncabezado.setReceptor(receptor);
            eFactEncabezado.setTotales(totales);



            GregorianCalendar gcal = (GregorianCalendar) GregorianCalendar.getInstance();
            gcal.setTime((Timestamp)this.model.get_Value("DateInvoiced"));
            XMLGregorianCalendar xgCalDateInvoiced = DatatypeFactory.newInstance().newXMLGregorianCalendarDate(gcal.get(Calendar.YEAR),
                    gcal.get(Calendar.MONTH)+1, gcal.get(Calendar.DAY_OF_MONTH), DatatypeConstants.FIELD_UNDEFINED);
            idDoc.setFchEmis(xgCalDateInvoiced);

            idDoc.setMntBruto(new BigInteger("0"));
            MPriceList priceList = new MPriceList(this.ctx, this.model.get_ValueAsInt("M_PriceList_ID"), null);
            if (priceList != null && priceList.isTaxIncluded()) {
                idDoc.setMntBruto(new BigInteger("1"));
            }

            idDoc.setFmaPago(BigInteger.valueOf(2)); // 2 = Credito, 1 = Contado
            String payRuleType = model.get_ValueAsString("PaymentRule");
            if (payRuleType != null){
                if ((payRuleType.equalsIgnoreCase(X_C_Invoice.PAYMENTRULE_Cash)) || (payRuleType.equalsIgnoreCase(X_C_Invoice.PAYMENTRULE_DirectDeposit))
                        || (payRuleType.equalsIgnoreCase(X_C_Invoice.PAYMENTRULE_DirectDebit))) {

                    idDoc.setFmaPago(BigInteger.valueOf(1)); // 2 = Credito, 1 = Contado
                }
            }

            Timestamp dueDate = (Timestamp) this.model.get_Value("DueDate");
            if (dueDate != null) {
                GregorianCalendar gcalDue = (GregorianCalendar) GregorianCalendar.getInstance();
                gcalDue.setTime(dueDate);
                XMLGregorianCalendar xgCalDueDate = DatatypeFactory.newInstance().newXMLGregorianCalendarDate(gcalDue.get(Calendar.YEAR),
                        gcalDue.get(Calendar.MONTH)+1, gcalDue.get(Calendar.DAY_OF_MONTH),
                        DatatypeConstants.FIELD_UNDEFINED);
                idDoc.setFchVenc(xgCalDueDate);
            }





        }
        catch (Exception e){
            throw new AdempiereException(e);
        }

        return message;
    }



    private String setEncabezado_eTicket(MZCFEConfigDocDGI docDGI) {

        String message = null;

        try{

            CFEDefType.ETck eTicket = new CFEDefType.ETck();
            CFEDefType.ETck.Encabezado eTicketEncabezado = new CFEDefType.ETck.Encabezado();
            IdDocTck idDocTck = new IdDocTck();

        }
        catch (Exception e){
            throw new AdempiereException(e);
        }

        return message;
    }

}
