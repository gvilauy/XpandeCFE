package org.xpande.cfe.utils;

import dto.migrate.CFEInvoiCyCollectionType;
import dto.migrate.CFEInvoiCyType;
import dto.migrate.EnvioCFE;
import dto.migrate.CFEInvoiCyType.Emisor;
import dto.migrate.CFEInvoiCyType.Receptor;
import dto.migrate.CFEInvoiCyType.Totales;
import dto.migrate.TipMonType;
import dto.uy.gub.dgi.cfe.CFEDefType;
import dto.uy.gub.dgi.cfe.IdDocFact;
import dto.uy.gub.dgi.cfe.ReceptorFact;
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
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Properties;

/**
 * Manejador de facturación electrónica con el proveedor MIGRATE.
 * Product: Adempiere ERP & CRM Smart Business Solution. Localization : Uruguay - Xpande
 * Xpande. Created by Gabriel Vila on 10/30/18.
 */
public class HandlerCFEMigrate extends HandlerCFE {

    private List<CFEInvoiCyType> cfeInvoiCyTypes = null;
    private EnvioCFE envioCFE = null;


    /***
     * Constructor
     * @param ctx
     * @param model
     * @param trxName
     * @param configDocSend
     */
    public HandlerCFEMigrate(Properties ctx, PO model, String trxName, MZCFEConfigDocSend configDocSend) {

        super(ctx, model, trxName, configDocSend);

        // Instancio modelos para CFE
        this.envioCFE = new EnvioCFE();
        this.envioCFE.setCFE(new CFEInvoiCyCollectionType());
        this.cfeInvoiCyTypes = this.envioCFE.getCFE().getCFEItem();
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

            // Obtengo datos del Receptor
            Receptor receptor = this.setReceptor();

            // Obtengo totales
            Totales totales = this.setTotalesInvoice();

            // Identificación y encabezado del Documento segun sea del tipo eFactura o eTicket.
            if ((docDGI.getValue().equalsIgnoreCase("E-FACTURA")) || (docDGI.getValue().equalsIgnoreCase("E-FACTURA NC"))
                    || (docDGI.getValue().equalsIgnoreCase("E-FACTURA ND")) || (docDGI.getValue().equalsIgnoreCase("E-FACTURA CTAAJE"))
                    || (docDGI.getValue().equalsIgnoreCase("E-FACTURA CTAAJE NC")) || (docDGI.getValue().equalsIgnoreCase("E-FACTURA CTAAJE ND"))){


                // Obtengo deatos del encabezado
                message = this.setEncabezado_eFactura(docDGI, emisor, receptor, totales);
                if (message != null) return message;

                // Obtengo datos de las lineas
//                message = this.setDetalleInvoice_eFactura();
                if (message != null) return message;

                // Si el Documento se corresponde con una nota de crédito, debo setear datos de las facturas referenciadas
                if ((docDGI.getValue().equalsIgnoreCase("E-FACTURA NC")) || (docDGI.getValue().equalsIgnoreCase("E-FACTURA CTAAJE NC"))){
//                    message = this.setReferencia_eFactura();
                    if (message != null) return message;
                }

                // Datos de CAE
//                message = this.setCAE_eFactura();
                if (message != null) return message;

            }
            else if ((docDGI.getValue().equalsIgnoreCase("E-TICKET")) || (docDGI.getValue().equalsIgnoreCase("E-TICKET NC"))
                    || (docDGI.getValue().equalsIgnoreCase("E-TICKET ND")) || (docDGI.getValue().equalsIgnoreCase("E-TICKET CTAAJE"))
                    || (docDGI.getValue().equalsIgnoreCase("E-TICKET CTAAJE NC")) || (docDGI.getValue().equalsIgnoreCase("E-TICKET CTAAJE ND"))){

                // Obtengo deatos del encabezado
//                message = this.setEncabezado_eTicket(docDGI);
                if (message != null) return message;

            }

        }
        catch (Exception e){
            throw new AdempiereException(e);
        }

        return message;

    }

    @Override
    protected String executeResguardo() throws Exception {
        return null;
    }

    @Override
    protected String executeInOut() throws Exception {
        return null;
    }

    @Override
    protected String send(MZCFEVendorOrg vendorOrg, int cDocType, String documentNo) throws Exception {
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

            emisor.setEmiRznSoc(org.getDescription());
            emisor.setEmiCorreoEmisor(orgInfo.getEMail());

            if (orgInfo.getPhone() != null) {
                emisor.setEmiTelefono(orgInfo.getPhone());
            }

            MWarehouse warehouse = MWarehouse.get(this.ctx, orgInfo.getM_Warehouse_ID());
            emisor.setEmiSucursal(warehouse.getName());

            MLocation location = (MLocation) orgInfo.getC_Location();
            emisor.setEmiDomFiscal(location.getAddress1());
            emisor.setEmiCiudad(location.getCity());
            emisor.setEmiDepartamento(location.getRegionName().toUpperCase());

        }
        catch (Exception e){
            throw new AdempiereException(e);
        }

        return emisor;
    }

    /***
     * Obtiene y setea información de Totales para el envío de CFE.
     * Xpande. Created by Gabriel Vila on 10/30/18.
     * @return
     */
    private Totales setTotalesInvoice() {

        Totales totales = new Totales();

        try{

            // Instancio configurador de CFE
            MZCFEConfig cfeConfig = (MZCFEConfig) this.configDocSend.getZ_CFE_Config();

            // Instancio modelos de referencia para Tasa Básico y Tasa Minimo.
            MTax ivaBasico = new MTax(this.ctx, cfeConfig.getTaxBasico_ID(), null);
            if ((ivaBasico == null) || (ivaBasico.get_ID() <= 0)){
                throw new AdempiereException("Falta indicar Tasa de Impuesto Básico en Configuración CFE");
            }

            MTax ivaMinimo = new MTax(this.ctx, cfeConfig.getTaxMinimo_ID(), null);
            if ((ivaMinimo == null) || (ivaMinimo.get_ID() <= 0)){
                throw new AdempiereException("Falta indicar Tasa de Impuesto Mínimo en Configuración CFE");
            }

            MCurrency currency = new MCurrency(this.ctx, this.model.get_ValueAsInt("C_Currency_ID"), null);
            if ((currency == null) || (currency.get_ID() <= 0)){
                throw new AdempiereException("Falta indicar Moneda del Documento");
            }

            totales.setTotTpoMoneda(TipMonType.valueOf(currency.getISO_Code()));

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

                totales.setTotTpoCambio(currencyRate.setScale(3, BigDecimal.ROUND_HALF_UP));
            }

            // Inicializo montos antes de setearlos
            totales.setTotMntNoGrv(Env.ZERO);
            totales.setTotMntExpoyAsim(Env.ZERO);
            totales.setTotMntImpuestoPerc(Env.ZERO);
            totales.setTotMntNetoIvaTasaMin(Env.ZERO);
            totales.setTotMntNetoIVATasaBasica(Env.ZERO);
            totales.setTotMntNetoIVAOtra(Env.ZERO);
            totales.setTotMntIVATasaMin(Env.ZERO);
            totales.setTotMntIVATasaBasica(Env.ZERO);
            totales.setTotMntIVAOtra(Env.ZERO);
            totales.setTotMontoNF(Env.ZERO);
            totales.setTotMntTotal(Env.ZERO);
            totales.setTotMntTotRetenido(Env.ZERO);

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
                    totales.setTotMntNoGrv(totales.getTotMntNoGrv().add(amtSubtotal));
                }
                else if (tax.getRate().compareTo(ivaMinimo.getRate()) == 0){
                    totales.setTotMntNetoIvaTasaMin(totales.getTotMntNetoIvaTasaMin().add(amtSubtotal));
                    totales.setTotMntIVATasaMin(totales.getTotMntIVATasaMin().add(taxAmt));
                }
                else if (tax.getRate().compareTo(ivaBasico.getRate()) == 0){
                    totales.setTotMntNetoIVATasaBasica(totales.getTotMntNetoIVATasaBasica().add(amtSubtotal));
                    totales.setTotMntIVATasaBasica(totales.getTotMntIVATasaBasica().add(taxAmt));
                }
                else {
                    totales.setTotMntNetoIVAOtra(totales.getTotMntNetoIVAOtra().add(amtSubtotal));
                    totales.setTotMntIVAOtra(totales.getTotMntIVAOtra().add(taxAmt));
                }
                amtTotal = amtTotal.add(amtSubtotal).add(taxAmt);

            }


            totales.setTotIVATasaMin(ivaMinimo.getRate().setScale(3));
            totales.setTotIVATasaBasica(ivaBasico.getRate().setScale(3));
            totales.setTotMntTotal(amtTotal);
            totales.setTotMntPagar(invoice.getGrandTotal());
            //totales.setTotCantLinDet(invoiceLines.length);

        }
        catch (Exception e){
            throw new AdempiereException(e);
        }

        return totales;
    }


    /***
     * Obtiene y retorna información del Receptor para comprobantes CFE.
     * Xpande. Created by Gabriel Vila on 10/30/18.
     * @return
     */
    private Receptor setReceptor() {

        Receptor receptor = new Receptor();

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

            receptor.setRcpCorreoRecep(partnerLocation.getEMail());

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

            receptor.setRcpTipoDocRecep(tipoIdentificacion);
            receptor.setRcpDocRecep(nroIdentificacion);
            receptor.setRcpRznSocRecep(partner.getName());

            // Datos geográficos
            String direccion = location.getAddress1();
            if (direccion != null) {
                if (direccion.length() > 70){
                    direccion = direccion.substring(0, 70);
                }
            }

            receptor.setRcpCodPaisRecep(country.getCountryCode());
            receptor.setRcpCiudadRecep(location.getCity());
            receptor.setRcpDeptoRecep(location.getRegionName());
            receptor.setRcpDirRecep(direccion);

        }
        catch (Exception e){
            throw new AdempiereException(e);
        }

        return receptor;
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
    private String setEncabezado_eFactura(MZCFEConfigDocDGI docDGI, Emisor emisor, Receptor receptor, Totales totales) {

        String message = null;

        try{

            /*

            MInvoice invoice = (MInvoice) this.model;

            // ADENDA
            this.empresasType.setAdenda(invoice.getDescription());

            CFEDefType.EFact eFactura = new CFEDefType.EFact();
            CFEDefType.EFact.Encabezado eFactEncabezado = new CFEDefType.EFact.Encabezado();
            this.defType.setEFact(eFactura);
            eFactura.setEncabezado(eFactEncabezado);

            eFactura.setTmstFirma(TS_to_XmlGregorianCalendar_OnlyDate(invoice.getDateInvoiced(), true));
            eFactura.setTmstFirma(null);


            CFEInvoiCyType.IdDoc idDoc = new CFEInvoiCyType.IdDoc();
            this.cfeInvoiCyType.setIdDoc(idDoc);
            idDoc.setCFETipoCFE(BigInteger.valueOf(Long.parseLong(docDGI.getCodigoDGI())));
            idDoc.setCFESerie(configDocSend.getDocumentSerie().trim());



            IdDocFact idDoc = new IdDocFact();
            eFactEncabezado.setIdDoc(idDoc);
            idDoc.setTipoCFE(BigInteger.valueOf(Long.parseLong(docDGI.getCodigoDGI())));
            idDoc.setSerie(configDocSend.getDocumentSerie().trim());

            String cfeNumero = this.model.get_ValueAsString("DocumentNo").replaceAll("[^0-9]", "");
            cfeNumero = org.apache.commons.lang.StringUtils.leftPad(String.valueOf(cfeNumero), 7, "0");
            idDoc.setNro(new BigInteger(cfeNumero));

            this.defType.setVersion("1.0");

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

            */

        }
        catch (Exception e){
            throw new AdempiereException(e);
        }

        return message;
    }


}
