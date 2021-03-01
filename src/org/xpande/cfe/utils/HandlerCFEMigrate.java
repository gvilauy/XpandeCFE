package org.xpande.cfe.utils;

import dto.migrate.*;
import dto.migrate.CFEInvoiCyType.Emisor;
import dto.migrate.CFEInvoiCyType.Receptor;
import dto.migrate.CFEInvoiCyType.Totales;
import dto.migrate.ListaCFERetornoType.CFE.Erros.ErrosItem;

import org.adempiere.exceptions.AdempiereException;
import org.compiere.model.*;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.eevolution.model.X_C_TaxGroup;
import org.xpande.cfe.model.*;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.xml.sax.InputSource;
import org.xpande.core.utils.CurrencyUtils;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.*;

/**
 * Manejador de facturación electrónica con el proveedor MIGRATE.
 * Product: Adempiere ERP & CRM Smart Business Solution. Localization : Uruguay - Xpande
 * Xpande. Created by Gabriel Vila on 10/30/18.
 */
public class HandlerCFEMigrate extends HandlerCFE {

    private List<CFEInvoiCyType> cfeInvoiCyTypes;
    private CFEInvoiCyType cfeInvoiCyType;
    private EnvioCFE envioCFE;


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
        this.cfeInvoiCyType = new CFEInvoiCyType();
        this.cfeInvoiCyTypes.add(cfeInvoiCyType);
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
            Receptor receptor = this.setReceptorInvoice();

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
                message = this.setDetalleInvoice_eFactura();
                if (message != null) return message;

                // Si el Documento se corresponde con una nota de crédito o nota de débito, debo setear datos de las facturas referenciadas
                this.cfeInvoiCyType.setReferencia(new CFEInvoiCyType.Referencia());
                if ((docDGI.getValue().equalsIgnoreCase("E-FACTURA NC")) || (docDGI.getValue().equalsIgnoreCase("E-FACTURA CTAAJE NC"))
                            || (docDGI.getValue().equalsIgnoreCase("E-FACTURA ND")) || (docDGI.getValue().equalsIgnoreCase("E-FACTURA CTAAJE ND"))){

                    message = this.setReferencia_eFactura();
                    if (message != null) return message;

                }

            }
            else if ((docDGI.getValue().equalsIgnoreCase("E-TICKET")) || (docDGI.getValue().equalsIgnoreCase("E-TICKET NC"))
                    || (docDGI.getValue().equalsIgnoreCase("E-TICKET ND")) || (docDGI.getValue().equalsIgnoreCase("E-TICKET CTAAJE"))
                    || (docDGI.getValue().equalsIgnoreCase("E-TICKET CTAAJE NC")) || (docDGI.getValue().equalsIgnoreCase("E-TICKET CTAAJE ND"))){

                // Obtengo deatos del encabezado
                message = this.setEncabezado_eTicket(docDGI, emisor, receptor, totales);
                if (message != null) return message;

                // Obtengo datos de las lineas
                message = this.setDetalleInvoice_eTicket();
                if (message != null) return message;

                // Si el Documento se corresponde con una nota de crédito o nota de débito, debo setear datos de las facturas referenciadas
                this.cfeInvoiCyType.setReferencia(new CFEInvoiCyType.Referencia());
                if ((docDGI.getValue().equalsIgnoreCase("E-TICKET NC")) || (docDGI.getValue().equalsIgnoreCase("E-TICKET CTAAJE NC"))
                        || (docDGI.getValue().equalsIgnoreCase("E-TICKET ND")) || (docDGI.getValue().equalsIgnoreCase("E-TICKET CTAAJE ND"))){

                    message = this.setReferencia_eTicket();
                    if (message != null) return message;

                }

                // Datos para Complemento Fiscal en Ventas por Cuenta Ajena
                if ((docDGI.getValue().equalsIgnoreCase("E-TICKET CTAAJE"))
                        || (docDGI.getValue().equalsIgnoreCase("E-TICKET CTAAJE NC"))
                        || (docDGI.getValue().equalsIgnoreCase("E-TICKET CTAAJE ND"))){

                    CFEInvoiCyType.Mandante mandante = new CFEInvoiCyType.Mandante();
                    this.cfeInvoiCyType.setMandante(mandante);

                    this.setComplementoFiscal_eTicket(mandante);
                }

            }

        }
        catch (Exception e){
            throw new AdempiereException(e);
        }

        return null;

    }


    /***
     * Setea información específica para venta por cuenta ajena.
     * Xpande. Created by Gabriel Vila on 11/17/18.
     * @param mandante
     * @return
     */
    private String setComplementoFiscal_eTicket(CFEInvoiCyType.Mandante mandante){

        String message = null;

        try {

            MInvoice invoice = (MInvoice) this.model;
            MBPartner partner = (MBPartner) invoice.getC_BPartner();

            if ((partner.getTaxID() == null) || (partner.getTaxID().trim().equalsIgnoreCase(""))){
                return "El Socio de Negocio no tiene definido el Número de Identificación";
            }

            int tipoIdentificacion = 4;
            X_C_TaxGroup taxGroup = (X_C_TaxGroup) partner.getC_TaxGroup();
            if (taxGroup.getValue() != null){
                if (taxGroup.getValue().equalsIgnoreCase("RUT")){
                    tipoIdentificacion = 2;
                }
                else if (taxGroup.getValue().equalsIgnoreCase("CI")){
                    tipoIdentificacion = 3;
                }
                else{
                    tipoIdentificacion = 2;
                }
            }
            mandante.setMndTipDoc(tipoIdentificacion);
            mandante.setMndNroDocumento(partner.getTaxID().trim());
            mandante.setMndRazSocial(partner.getName().trim());
            mandante.setMndEncriptar(SNType.N); /* No se encripta la informaci�n del Mandante */

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
            mandante.setMndCodPais(country.getCountryCode());

        }
        catch (Exception e) {
            message = e.getMessage();
        }

        return message;
    }


    /***
     * Setea referencia de Nota de Credito de documentos de eFactura.
     * Xpande. Created by Gabriel Vila on 11/1/18.
     * @return
     */
    private String setReferencia_eFactura() {

        String message = null;

        String sql = "";
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try{

            List<CFEInvoiCyType.Referencia.ReferenciaItem> refItems = this.cfeInvoiCyType.getReferencia().getReferenciaItem();

            // Intancio modelo de nota de credito
            MInvoice invoice = (MInvoice) this.model;

            // Si utilizo el campo texto manual para indicar REFERENCIA de Nota de Credito, envío este dato y salgo.
            if (invoice.get_ValueAsString("ReferenciaCFE") != null){
                String referenciaCFE = invoice.get_ValueAsString("ReferenciaCFE").trim();
                if (!referenciaCFE.equalsIgnoreCase("")){

                    if (referenciaCFE.length() > 90){
                        referenciaCFE = referenciaCFE.substring(0, 89);
                    }

                    CFEInvoiCyType.Referencia.ReferenciaItem refItem = new CFEInvoiCyType.Referencia.ReferenciaItem();
                    refItems.add(refItem);

                    refItem.setRefNroLinRef(1);
                    refItem.setRefIndGlobal(BigInteger.valueOf(1));
                    refItem.setRefRazonRef(referenciaCFE);

                    return null;
                }
            }


            // Busco referencia de facturas en las lineas de esta nota de credito
            sql = " select distinct inv.c_invoice_id, inv.c_doctypetarget_id, inv.documentno " +
                    " from c_invoiceline linv " +
                    " inner join c_invoice inv on linv.c_invoice_id = inv.c_invoice_id " +
                    " where linv.c_invoiceline_id in " +
                    " (select ref_invoiceline_id from c_invoiceline " +
                    " where c_invoice_id =" + model.get_ID() +
                    " and ref_invoiceline_id > 0)";

            pstmt = DB.prepareStatement(sql, this.trxName);
            rs = pstmt.executeQuery();

            int contador = 0;

            while(rs.next()){

                contador++;

                MDocType docRef = new MDocType(this.ctx, rs.getInt("c_doctypetarget_id"), null);

                // Obtengo configuracion de envío de CFE para documento referenciado, si no tengo aviso.
                MZCFEConfigDocSend configDocRefSend = ((MZCFEConfig) this.configDocSend.getZ_CFE_Config()).getConfigDocumentoCFE(model.getAD_Org_ID(), docRef.get_ID());
                if ((configDocRefSend == null) || (configDocRefSend.get_ID() <= 0)){
                    return "No se obtuvo codigo DGI para documento : " + docRef.getName();
                }
                MZCFEConfigDocDGI docDGI = (MZCFEConfigDocDGI) configDocRefSend.getZ_CFE_ConfigDocDGI();


                CFEInvoiCyType.Referencia.ReferenciaItem refItem = new CFEInvoiCyType.Referencia.ReferenciaItem();
                refItems.add(refItem);

                refItem.setRefNroLinRef(contador);
                refItem.setRefTpoDocRef(BigInteger.valueOf(Long.parseLong(docDGI.getCodigoDGI())));
                refItem.setRefSerie(configDocRefSend.getDocumentSerie().trim());
                refItem.setRefIndGlobal(BigInteger.valueOf(1));

                String documentNo = rs.getString("documentno").trim();
                documentNo = documentNo.replaceAll("[^0-9]", "");
                documentNo = org.apache.commons.lang.StringUtils.leftPad(String.valueOf(documentNo), 7, "0");
                refItem.setRefNroCFERef(new BigInteger(documentNo));
            }

        }
        catch (Exception e){
            throw new AdempiereException(e);
        }
        finally {
            DB.close(rs, pstmt);
            rs = null; pstmt = null;
        }

        return message;
    }



    /***
     * Setea referencia de Nota de Credito de documentos de eFactura.
     * Xpande. Created by Gabriel Vila on 11/1/18.
     * @return
     */
    private String setReferencia_eTicket() {

        String message = null;

        String sql = "";
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try{

            List<CFEInvoiCyType.Referencia.ReferenciaItem> refItems = this.cfeInvoiCyType.getReferencia().getReferenciaItem();

            // Intancio modelo de nota de credito
            MInvoice invoice = (MInvoice) this.model;

            // Si utilizo el campo texto manual para indicar REFERENCIA de Nota de Credito, envío este dato y salgo.
            if (invoice.get_ValueAsString("ReferenciaCFE") != null){
                String referenciaCFE = invoice.get_ValueAsString("ReferenciaCFE").trim();
                if (!referenciaCFE.equalsIgnoreCase("")){

                    if (referenciaCFE.length() > 90){
                        referenciaCFE = referenciaCFE.substring(0, 89);
                    }

                    CFEInvoiCyType.Referencia.ReferenciaItem refItem = new CFEInvoiCyType.Referencia.ReferenciaItem();
                    refItems.add(refItem);

                    refItem.setRefNroLinRef(1);
                    refItem.setRefIndGlobal(BigInteger.valueOf(1));
                    refItem.setRefRazonRef(referenciaCFE);

                    return message;
                }
            }

            // Busco referencia de facturas en tabla
            sql = " select C_Invoice_To_ID from Z_InvoiceRef where C_Invoice_ID =" + this.model.get_ID();

            pstmt = DB.prepareStatement(sql, this.trxName);
            rs = pstmt.executeQuery();

            int contador = 0;

            while(rs.next()){

                contador++;

                MInvoice invoiceRef = new MInvoice(this.ctx, rs.getInt("C_Invoice_To_ID"), this.trxName);
                MDocType docRef = (MDocType) invoiceRef.getC_DocTypeTarget();

                // Obtengo configuracion de envío de CFE para documento referenciado, si no tengo aviso.
                MZCFEConfigDocSend configDocRefSend = ((MZCFEConfig) this.configDocSend.getZ_CFE_Config()).getConfigDocumentoCFE(invoiceRef.getAD_Org_ID(), docRef.get_ID());
                if ((configDocRefSend == null) || (configDocRefSend.get_ID() <= 0)){
                    return "No se obtuvo codigo DGI para documento : " + docRef.getName();
                }
                MZCFEConfigDocDGI docDGI = (MZCFEConfigDocDGI) configDocRefSend.getZ_CFE_ConfigDocDGI();


                CFEInvoiCyType.Referencia.ReferenciaItem refItem = new CFEInvoiCyType.Referencia.ReferenciaItem();
                refItems.add(refItem);

                refItem.setRefNroLinRef(contador);
                refItem.setRefTpoDocRef(BigInteger.valueOf(Long.parseLong(docDGI.getCodigoDGI())));
                refItem.setRefSerie(configDocRefSend.getDocumentSerie().trim());
                refItem.setRefIndGlobal(BigInteger.valueOf(1));

                String documentNo = invoiceRef.getDocumentNo().replaceAll("[^0-9]", "");
                documentNo = org.apache.commons.lang.StringUtils.leftPad(String.valueOf(documentNo), 7, "0");
                refItem.setRefNroCFERef(new BigInteger(documentNo));
            }

        }
        catch (Exception e){
            throw new AdempiereException(e);
        }
        finally {
            DB.close(rs, pstmt);
            rs = null; pstmt = null;
        }

        return message;
    }



    /***
     * Obtiene y setea datos de lineas del Documento.
     * Xpande. Created by Gabriel Vila on 11/1/18.
     * @return
     */
    private String setDetalleInvoice_eFactura() {

        String message = null;

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

            this.cfeInvoiCyType.setDetalle(new CFEInvoiCyType.Detalle());
            List<CFEInvoiCyType.Detalle.Item> items = cfeInvoiCyType.getDetalle().getItem();

            // Instancio modelo de cabezal de invoice
            MInvoice invoice = (MInvoice) this.model;

            // Instancio modelo de Lista de Precios
            MPriceList priceList = (MPriceList) invoice.getM_PriceList();
            if ((priceList == null) || (priceList.get_ID() <= 0)){
                return "Falta indicar Lista de Precios del Documento";
            }

            int position = 1;

            // Obtengo y recorro lineas de factura
            MInvoiceLine[] invoiceLines = invoice.getLines(true);
            for (int i = 0; i < invoiceLines.length; i++) {

                MInvoiceLine invoiceLine = invoiceLines[i];

                // Datos del producto o cargo utilizado en esta linea
                String codigoLinea = null, nombreLinea = "", descLinea = "";
                if (invoiceLine.getM_Product_ID() > 0){
                    MProduct product = (MProduct) invoiceLine.getM_Product();
                    codigoLinea = product.getValue();
                    nombreLinea = product.getName();
                    descLinea = product.getDescription();
                }
                else if (invoiceLine.getC_Charge_ID() > 0){
                    MCharge charge = (MCharge) invoiceLine.getC_Charge();
                    codigoLinea = String.valueOf(charge.get_ID());
                    nombreLinea = charge.getName();
                    descLinea = charge.getDescription();
                }
                else {
                    return "Falta indicar Producto o Cargo en una de las lineas del Documento.";
                }

                CFEInvoiCyType.Detalle.Item item = new CFEInvoiCyType.Detalle.Item();
                items.add(item);

                CFEInvoiCyType.Detalle.Item.CodItem codItem = new CFEInvoiCyType.Detalle.Item.CodItem();
                item.setCodItem(codItem);

                // Codigo del producto
                if (codigoLinea != null) {
                    CFEInvoiCyType.Detalle.Item.CodItem.CodItemItem codItemItem = new CFEInvoiCyType.Detalle.Item.CodItem.CodItemItem();
                    codItemItem.setIteCodiTpoCod("INT1");
                    codItemItem.setIteCodiCod(codigoLinea);
                    codItem.getCodItemItem().add(codItemItem);
                }

                // Codigo de barras en caso de tenerlo en la linea de factura
                if (invoiceLine.get_ValueAsString("UPC") != null) {
                    String upc = invoiceLine.get_ValueAsString("UPC").trim();
                    if (!upc.equalsIgnoreCase("")){
                        CFEInvoiCyType.Detalle.Item.CodItem.CodItemItem codItemItem = new CFEInvoiCyType.Detalle.Item.CodItem.CodItemItem();
                        codItemItem.setIteCodiTpoCod("EAN");
                        codItemItem.setIteCodiCod(upc);
                        codItem.getCodItemItem().add(codItemItem);
                    }
                }

                MTax tax = (MTax) invoiceLine.getC_Tax();
                String codigoImpuestoDGI = tax.get_ValueAsString("CodigoIVA");
                if ((codigoImpuestoDGI != null) && (!codigoImpuestoDGI.trim().equalsIgnoreCase(""))){
                    int codIVA = Integer.valueOf(codigoImpuestoDGI).intValue();
                    item.setIteIndFact(codIVA);
                }
                else{
                    if (tax.getRate().compareTo(ivaMinimo.getRate()) == 0) {
                        item.setIteIndFact(2);
                    }
                    else if (tax.getRate().compareTo(ivaBasico.getRate()) == 0) {
                        item.setIteIndFact(3);
                    }
                    else if (tax.getRate().compareTo(Env.ZERO) == 0) {
                        item.setIteIndFact(1);
                    }
                    else{
                        return "Tasa de impuesto en linea del Documento, no parametrizada para DGI";
                    }
                }

                item.setIteIndAgenteResp(null);
                item.setIteNomItem(nombreLinea);
                item.setIteDscItem(descLinea);
                item.setIteCantidad(invoiceLine.getQtyEntered());

                MUOM uom = (MUOM) invoiceLine.getC_UOM();
                item.setIteUniMed(uom.getUOMSymbol());

                BigDecimal precioUnitario = invoiceLine.getPriceEntered().setScale(6, RoundingMode.HALF_UP).abs();
                item.setItePrecioUnitario(precioUnitario);
                item.setIteRecargoPct(Env.ZERO);
                item.setIteRecargoMnt(Env.ZERO);
                item.setIteDescuentoPct(Env.ZERO);
                item.setIteDescuentoMonto(Env.ZERO);

                // Si tengo precio unitario cero y no tengo codigo de impuesto 8 o 5, avisso con error.
                if (item.getItePrecioUnitario().compareTo(Env.ZERO) == 0){
                    if ((item.getIteIndFact() != 5) && (item.getIteIndFact() != 8)){
                        return "No es posible indicar Precio Unitario igual a Cero, si el Indicador de Impuesto no es 8 o 5.";
                    }
                }

                if (priceList.isTaxIncluded()) {
                    item.setIteMontoItem(invoiceLine.getLineTotalAmt().abs());
                }
                else {
                    item.setIteMontoItem(((BigDecimal) invoiceLine.get_Value("AmtSubtotal")).abs());
                }
            }

            // Si tengo redondeo en el cabezal, lo informo com linea de redondeo
            BigDecimal amtRounding = (BigDecimal) invoice.get_Value("AmtRounding");

            if (amtRounding == null) amtRounding = Env.ZERO;
            if (amtRounding.compareTo(Env.ZERO) != 0){
                // Cargo dol redondeo
                MCharge charge = (MCharge) invoice.getC_Charge();
                if ((charge == null) || (charge.get_ID() <= 0)){
                    return "Falta indicar Cargo por Redondeo en este comprobante.";
                }

                String codigoLinea = null, nombreLinea = null, descLinea = null;
                codigoLinea = String.valueOf(charge.get_ID());
                nombreLinea = charge.getName();
                descLinea = charge.getName();

                CFEInvoiCyType.Detalle.Item item = new CFEInvoiCyType.Detalle.Item();
                items.add(item);

                CFEInvoiCyType.Detalle.Item.CodItem codItem = new CFEInvoiCyType.Detalle.Item.CodItem();
                item.setCodItem(codItem);

                // Codigo del producto
                if (codigoLinea != null) {
                    CFEInvoiCyType.Detalle.Item.CodItem.CodItemItem codItemItem = new CFEInvoiCyType.Detalle.Item.CodItem.CodItemItem();
                    codItemItem.setIteCodiTpoCod("INT1");
                    codItemItem.setIteCodiCod(codigoLinea);
                    codItem.getCodItemItem().add(codItemItem);
                }

                MTax tax = null;
                if (amtRounding.compareTo(Env.ZERO) >= 0){
                    tax = (MTax) cfeConfig.getTaxRedondeo();
                    if ((tax == null) || (tax.get_ID() <= 0)){
                        return "Falta indicar Impuesto para Redondeo positivo";
                    }
                }
                else {
                    tax = (MTax) cfeConfig.getTaxRedondeoNeg();
                    if ((tax == null) || (tax.get_ID() <= 0)){
                        return "Falta indicar Impuesto para Redondeo negativo";
                    }
                    // Doy vuelta signo del redondeo porque DGI no acepta montos negativos
                    amtRounding = amtRounding.negate();
                }

                String codigoImpuestoDGI = tax.get_ValueAsString("CodigoIVA");
                if ((codigoImpuestoDGI != null) && (!codigoImpuestoDGI.trim().equalsIgnoreCase(""))){
                    int codIVA = Integer.valueOf(codigoImpuestoDGI).intValue();
                    item.setIteIndFact(codIVA);
                }
                else{
                    return "Tasa de impuesto en linea del Documento, no parametrizada para DGI";
                }

                item.setIteIndAgenteResp(null);
                item.setIteNomItem(nombreLinea);
                item.setIteDscItem(descLinea);
                item.setIteCantidad(Env.ONE);

                MUOM uom = new MUOM(ctx, 100, null);
                item.setIteUniMed(uom.getUOMSymbol());
                item.setItePrecioUnitario(amtRounding);
                item.setIteRecargoPct(Env.ZERO);
                item.setIteRecargoMnt(Env.ZERO);
                item.setIteDescuentoPct(Env.ZERO);
                item.setIteDescuentoMonto(Env.ZERO);
                item.setIteMontoItem(amtRounding);

                // Si tengo precio unitario cero y no tengo codigo de impuesto 8 o 5, avisso con error.
                if (item.getItePrecioUnitario().compareTo(Env.ZERO) == 0){
                    if ((item.getIteIndFact() != 5) && (item.getIteIndFact() != 8)){
                        return "No es posible indicar Precio Unitario igual a Cero, si el Indicador de Impuesto no es 8 o 5.";
                    }
                }
            }
        }
        catch (Exception e){
            throw new AdempiereException(e);
        }

        return null;
    }


    /***
     * Obtiene y setea datos de lineas del Documento.
     * Xpande. Created by Gabriel Vila on 11/1/18.
     * @return
     */
    private String setDetalleInvoice_eTicket() {

        String message = null;

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

            this.cfeInvoiCyType.setDetalle(new CFEInvoiCyType.Detalle());
            List<CFEInvoiCyType.Detalle.Item> items = cfeInvoiCyType.getDetalle().getItem();

            // Instancio modelo de cabezal de invoice
            MInvoice invoice = (MInvoice) this.model;

            // Instancio modelo de Lista de Precios
            MPriceList priceList = (MPriceList) invoice.getM_PriceList();
            if ((priceList == null) || (priceList.get_ID() <= 0)){
                return "Falta indicar Lista de Precios del Documento";
            }

            int position = 1;

            // Obtengo y recorro lineas de factura
            MInvoiceLine[] invoiceLines = invoice.getLines(true);
            for (int i = 0; i < invoiceLines.length; i++) {

                MInvoiceLine invoiceLine = invoiceLines[i];

                // Datos del producto o cargo utilizado en esta linea
                String codigoLinea = null, nombreLinea = "", descLinea = "";
                if (invoiceLine.getM_Product_ID() > 0){
                    MProduct product = (MProduct) invoiceLine.getM_Product();
                    codigoLinea = product.getValue();
                    nombreLinea = product.getName();
                    descLinea = product.getDescription();
                }
                else if (invoiceLine.getC_Charge_ID() > 0){
                    MCharge charge = (MCharge) invoiceLine.getC_Charge();
                    codigoLinea = String.valueOf(charge.get_ID());
                    nombreLinea = charge.getName();
                    descLinea = charge.getDescription();
                }
                else {
                    return "Falta indicar Producto o Cargo en una de las lineas del Documento.";
                }

                CFEInvoiCyType.Detalle.Item item = new CFEInvoiCyType.Detalle.Item();
                items.add(item);

                CFEInvoiCyType.Detalle.Item.CodItem codItem = new CFEInvoiCyType.Detalle.Item.CodItem();
                item.setCodItem(codItem);

                // Codigo del producto
                if (codigoLinea != null) {
                    CFEInvoiCyType.Detalle.Item.CodItem.CodItemItem codItemItem = new CFEInvoiCyType.Detalle.Item.CodItem.CodItemItem();
                    codItemItem.setIteCodiTpoCod("INT1");
                    codItemItem.setIteCodiCod(codigoLinea);
                    codItem.getCodItemItem().add(codItemItem);
                }

                // Codigo de barras en caso de tenerlo en la linea de factura
                if (invoiceLine.get_ValueAsString("UPC") != null) {
                    String upc = invoiceLine.get_ValueAsString("UPC").trim();
                    if (!upc.equalsIgnoreCase("")){
                        CFEInvoiCyType.Detalle.Item.CodItem.CodItemItem codItemItem = new CFEInvoiCyType.Detalle.Item.CodItem.CodItemItem();
                        codItemItem.setIteCodiTpoCod("EAN");
                        codItemItem.setIteCodiCod(upc);
                        codItem.getCodItemItem().add(codItemItem);
                    }
                }

                MTax tax = (MTax) invoiceLine.getC_Tax();
                String codigoImpuestoDGI = tax.get_ValueAsString("CodigoIVA");
                if ((codigoImpuestoDGI != null) && (!codigoImpuestoDGI.trim().equalsIgnoreCase(""))){
                    int codIVA = Integer.valueOf(codigoImpuestoDGI).intValue();
                    item.setIteIndFact(codIVA);
                }
                else{
                    if (tax.getRate().compareTo(ivaMinimo.getRate()) == 0) {
                        item.setIteIndFact(2);
                    }
                    else if (tax.getRate().compareTo(ivaBasico.getRate()) == 0) {
                        item.setIteIndFact(3);
                    }
                    else if (tax.getRate().compareTo(Env.ZERO) == 0) {
                        item.setIteIndFact(1);
                    }
                    else{
                        return "Tasa de impuesto en linea del Documento, no parametrizada para DGI";
                    }
                }

                item.setIteIndAgenteResp(null);
                item.setIteNomItem(nombreLinea);
                item.setIteDscItem(descLinea);
                item.setIteCantidad(invoiceLine.getQtyEntered());

                MUOM uom = (MUOM) invoiceLine.getC_UOM();
                item.setIteUniMed(uom.getUOMSymbol());

                BigDecimal precioUnitario = invoiceLine.getPriceEntered().setScale(6, RoundingMode.HALF_UP).abs();
                item.setItePrecioUnitario(precioUnitario);
                item.setIteRecargoPct(Env.ZERO);
                item.setIteRecargoMnt(Env.ZERO);
                item.setIteDescuentoPct(Env.ZERO);
                item.setIteDescuentoMonto(Env.ZERO);

                // Si tengo precio unitario cero y no tengo codigo de impuesto 8 o 5, avisso con error.
                if (item.getItePrecioUnitario().compareTo(Env.ZERO) == 0){
                    if ((item.getIteIndFact() != 5) && (item.getIteIndFact() != 8)){
                        return "No es posible indicar Precio Unitario igual a Cero, si el Indicador de Impuesto no es 8 o 5.";
                    }
                }

                if (priceList.isTaxIncluded()) {
                    item.setIteMontoItem(invoiceLine.getLineTotalAmt().abs());
                }
                else {
                    item.setIteMontoItem(((BigDecimal) invoiceLine.get_Value("AmtSubtotal")).abs());
                }
            }

        }
        catch (Exception e){
            throw new AdempiereException(e);
        }

        return null;
    }

    /***
     * Carga modelos para envío de CFE correspondiente a Resguardo.
     * Xpande. Created by Gabriel Vila on 9/8/20.
     * @return
     * @throws Exception
     */
    @Override
    protected String executeResguardo() throws Exception {

        String message = null;

        try{

            MZCFEConfigDocDGI docDGI = (MZCFEConfigDocDGI) this.configDocSend.getZ_CFE_ConfigDocDGI();
            if ((docDGI == null) || (docDGI.get_ID() <= 0)){
                return "Falta indicar documento de DGI para configuración de envío de este documento - organización - proveedor de CFE";
            }

            // Obtengo datos del Emisor
            Emisor emisor = this.setEmisor(this.configDocSend.getAD_OrgTrx_ID());

            // Obtengo datos del Receptor
            Receptor receptor = this.setReceptorResguardo();

            // Obtengo totales
            Totales totales = this.setTotalesResguardo();

            // Obtengo deatos del encabezado
            message = this.setEncabezado_Resguardo(docDGI, emisor, receptor, totales);
            if (message != null) return message;

            // Obtengo datos de las lineas
            message = this.setDetalle_Resguardo();
            if (message != null) return message;

            // Referencia cuando es Contra-Resguardo
            this.cfeInvoiCyType.setReferencia(new CFEInvoiCyType.Referencia());
            message = this.setReferencia_Resguardo();
            if (message != null) return message;

        }
        catch (Exception e){
            throw new AdempiereException(e);
        }

        return null;
    }

    @Override
    protected String executeInOut() throws Exception {
        return null;
    }

    @Override
    protected String send(MZCFEVendorOrg vendorOrg, int cDocType, String documentNo) throws Exception {

        String message = null;
        String xmlRespuesta = "";

        try {

            File cfeFile = File.createTempFile("CFETag", ".xml");
            cfeFile.deleteOnExit();
            JAXBContext jaxbContextCfe = JAXBContext.newInstance(CFEInvoiCyCollectionType.class);
            Marshaller jaxbMarshallerCfe = jaxbContextCfe.createMarshaller();
            jaxbMarshallerCfe.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, false);
            jaxbMarshallerCfe.marshal(this.envioCFE.getCFE(), cfeFile);
            FileReader frCfe = new FileReader(cfeFile);
            BufferedReader brCfe = new BufferedReader(frCfe);

            String lineaCfe;
            String xmlCfe = "";
            while((lineaCfe=brCfe.readLine())!=null) {
                xmlCfe += lineaCfe;
            }

            xmlCfe = vendorOrg.getCFE_EmpCK() +
                    xmlCfe.replace("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>", "")
                            .replace(" xmlns=\"http://www.invoicy.com.uy/\"", "");;

            String hashXmlCfe = md5Encrypt(xmlCfe);

            // Encabezado
            EncabezadoEnvioType encEnvioType= new EncabezadoEnvioType();
            this.envioCFE.setEncabezado(encEnvioType);
            encEnvioType.setEmpCK(hashXmlCfe);
            encEnvioType.setEmpPK(vendorOrg.getCFE_EmpPK());
            encEnvioType.setEmpCodigo(vendorOrg.getCFE_CodInteg());

            File file = File.createTempFile("InvoicyXML", ".xml");
            file.deleteOnExit();
            JAXBContext jaxbContext = JAXBContext.newInstance(EnvioCFE.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, false);
            jaxbMarshaller.marshal(this.envioCFE, file);

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String linea;
            String xml = "";
            while((linea=br.readLine())!=null) {
                xml += linea;
            }
            xml = xml.replace(" xmlns=\"http://www.invoicy.com.uy/\"", "");

            PrintWriter pw = new PrintWriter(file);
            pw.println(xml);
            pw.close();

            Service service = new Service();
            Call call = (Call) service.createCall();
            call.setTargetEndpointAddress(new java.net.URL(vendorOrg.getTargetEndpointAddress()));
            call.setOperationName(vendorOrg.getOperationName());
            call.setSOAPActionURI(vendorOrg.getSOAPActionURI());
            call.addParameter(new QName("Gx", "Xmlrecepcao"), XMLType.XSD_STRING, ParameterMode.IN);
            call.setReturnType(XMLType.XSD_STRING);

            String result = (String) call.invoke(new Object[] { xml });
            File response = File.createTempFile("InvoicyXMLResponse", ".xml");
            response.deleteOnExit();
            FileWriter fichero = new FileWriter(response);
            PrintWriter pwRes = new PrintWriter(fichero);
            pwRes.print(result);
            pwRes.close();

            xmlRespuesta = result;

            // Obtengo objerto retorno
            EnvioCFERetorno cfeRetorno = new EnvioCFERetorno();
            xmlRespuesta = xmlRespuesta.replace("<?xml version=\"1.0\" encoding=\"utf-8\"?>", "");

            SAXBuilder builder = new SAXBuilder();
            Document document = (Document) builder.build( new InputSource( new StringReader(xmlRespuesta)));
            Element rootNode = document.getRootElement();
            EncabezadoRetornoCFEType encRetCfeType = new EncabezadoRetornoCFEType();
            cfeRetorno.setEncabezado(encRetCfeType);

            Element cabElement = rootNode.getChild("Encabezado");
            encRetCfeType.setEmpCodigo(cabElement.getChildText("EmpCodigo"));
            encRetCfeType.setMsgDsc(cabElement.getChildText("MsgDesc"));
            encRetCfeType.setNroLinRetorno(getBigIntegerVal(cabElement, "NroLinRetorno"));
            encRetCfeType.setMsgCod(getIntegerVal(cabElement, "MsgCod"));

            ListaCFERetornoType cfeRetornoTypes = new ListaCFERetornoType();
            cfeRetorno.setListaCFE(cfeRetornoTypes);

            loadCfeResponses(rootNode.getChild("ListaCFE").getChildren(), cfeRetornoTypes);


            if (cfeRetorno.getListaCFE() != null){

                List<ListaCFERetornoType.CFE> listaCfeRet = cfeRetorno.getListaCFE().getCFE();
                for (ListaCFERetornoType.CFE cfeRet : listaCfeRet) {

                    if (cfeRet.getCFEStatus().intValue() == 3) {
                        String errDescRet = "";
                        if (cfeRet.getErros() != null && cfeRet.getErros().getErrosItem() != null) {
                            ArrayList<ErrosItem> invoicyErrorDescriptions = (ArrayList<ErrosItem>) cfeRet.getErros().getErrosItem();
                            for (ListaCFERetornoType.CFE.Erros.ErrosItem err : invoicyErrorDescriptions) {
                                errDescRet += " - " + err.getCFEErrCod() + "_" + err.getCFEErrDesc();
                            }
                        }
                        throw new AdempiereException("CFE Rechazado: " + errDescRet);
                    }

                    MZCFERespuestaProvider cfeRespuesta = new MZCFERespuestaProvider(this.ctx, 0, this.trxName);
                    cfeRespuesta.setAD_Table_ID(model.get_Table_ID());
                    cfeRespuesta.setRecord_ID(model.get_ID());
                    cfeRespuesta.setC_DocType_ID(model.get_ValueAsInt("C_DocType_ID"));
                    cfeRespuesta.setDocumentNoRef(model.get_ValueAsString("DocumentNo"));

                    cfeRespuesta.setCFE_Status(cfeRet.getCFEStatus().toString());
                    cfeRespuesta.setCFE_Descripcion(cfeRet.getCFEMsgDsc());
                    cfeRespuesta.setCFE_Tipo(new BigDecimal(cfeRet.getCFETipo().intValue()));
                    cfeRespuesta.setCFE_Serie(cfeRet.getCFESerie());
                    cfeRespuesta.setCFE_Numero(new BigDecimal(cfeRet.getCFENro().intValue()));
                    cfeRespuesta.setCFE_Resolucion(cfeRet.getCFEEstadoAcuse().toString());
                    cfeRespuesta.setCFE_URL_DGI(cfeRet.getCFEQrCode());
                    cfeRespuesta.setCFE_DigitoVerificador(cfeRet.getCFECodigoSeguridad());

                    // Datos CAE
                    if (cfeRet.getCFEDatosAvanzados() != null){

                        if (cfeRet.getCFEDatosAvanzados().getCFECAEFchVenc() != null){
                            Timestamp fechaVencCAE = new Timestamp(cfeRet.getCFEDatosAvanzados().getCFECAEFchVenc().toGregorianCalendar().getTimeInMillis());
                            cfeRespuesta.setCFE_Vencimiento_CAE(fechaVencCAE);
                        }
                        else {
                            cfeRespuesta.setCFE_Vencimiento_CAE(this.configDocSend.getDueDate());
                        }

                        if (cfeRet.getCFEDatosAvanzados().getCFECAEId() != null){
                            if (cfeRet.getCFEDatosAvanzados().getCFECAEId() > 0){
                                cfeRespuesta.setCFE_CAE_ID(Long.toString(cfeRet.getCFEDatosAvanzados().getCFECAEId()));
                            }
                            else {
                                cfeRespuesta.setCFE_CAE_ID(this.configDocSend.getNumeroCAE());
                            }
                        }
                        else{
                            cfeRespuesta.setCFE_CAE_ID(this.configDocSend.getNumeroCAE());
                        }

                        if (cfeRet.getCFEDatosAvanzados().getAnoResAutorizadora() != null){
                            cfeRespuesta.setCFE_AnioResolucion(cfeRet.getCFEDatosAvanzados().getAnoResAutorizadora().intValueExact());
                        }

                        if (cfeRet.getCFEDatosAvanzados().getCFECAENroIni() != null){
                            cfeRespuesta.setCFE_NroInicial_CAE(new BigDecimal(cfeRet.getCFEDatosAvanzados().getCFECAENroIni().intValue()));
                        }
                        else{
                            cfeRespuesta.setCFE_NroInicial_CAE(new BigDecimal(this.configDocSend.getNumeroDesde()));
                        }

                        if (cfeRet.getCFEDatosAvanzados().getCFECAENroFin() != null){
                            cfeRespuesta.setCFE_NroFinal_CAE(new BigDecimal(cfeRet.getCFEDatosAvanzados().getCFECAENroFin().intValue()));
                        }
                        else{
                            cfeRespuesta.setCFE_NroFinal_CAE(new BigDecimal(this.configDocSend.getNumeroHasta()));
                        }
                    }

                    cfeRespuesta.saveEx();
                }

            }
        }
        catch (Exception e) {
            throw new AdempiereException(e);
        }

        return null;
    }


    /***
     * Encriptación de texto.
     * Xpande. Created by Gabriel Vila on 11/17/18.
     * @param input
     * @return
     */
    public static String md5Encrypt(String input) {

        String md5 = "";
        java.security.MessageDigest md;

        try {
            md = java.security.MessageDigest.getInstance("MD5");
            java.math.BigInteger hash = new java.math.BigInteger(1, md.digest(input.getBytes("utf-8")));
            md5 = hash.toString(16);

            while (md5.length() < 32) {
                md5 = '0' + md5;
            }

        }
        catch (Exception e) {
            throw new AdempiereException(e);
        }

        return md5;
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
            totales.setTotMntIVaenSusp(Env.ZERO);
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
            BigDecimal amtTotalaPagar = Env.ZERO;

            // Recorro lineas para cargar totales
            MInvoice invoice = (MInvoice) this.model;
            MInvoiceLine[] invoiceLines = ((MInvoice) this.model).getLines(true);
            for (int i = 0; i < invoiceLines.length; i++){

                boolean sumarTotal = true;

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

                // Indicar de Impuesto
                String indFactCFE = tax.get_ValueAsString("CodigoIVA");
                if ((indFactCFE == null) || (indFactCFE.trim().equalsIgnoreCase(""))){
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
                }
                else{
                    // NO GRAVADO
                    if (indFactCFE.equalsIgnoreCase("1")){
                        totales.setTotMntNoGrv(totales.getTotMntNoGrv().add(amtSubtotal));
                    }
                    // IVA MINIMO
                    else if (indFactCFE.equalsIgnoreCase("2")){
                        totales.setTotMntNetoIvaTasaMin(totales.getTotMntNetoIvaTasaMin().add(amtSubtotal));
                        totales.setTotMntIVATasaMin(totales.getTotMntIVATasaMin().add(taxAmt));
                    }
                    // IVA BASICO
                    else if (indFactCFE.equalsIgnoreCase("3")){
                        totales.setTotMntNetoIVATasaBasica(totales.getTotMntNetoIVATasaBasica().add(amtSubtotal));
                        totales.setTotMntIVATasaBasica(totales.getTotMntIVATasaBasica().add(taxAmt));
                    }
                    // IVA PERCIBIDO
                    else if (indFactCFE.equalsIgnoreCase("11")){
                        totales.setTotMntImpuestoPerc(totales.getTotMntImpuestoPerc().add(amtSubtotal));
                    }
                    // IVA EN SUSPENSO
                    else if (indFactCFE.equalsIgnoreCase("12")){
                        totales.setTotMntIVaenSusp(totales.getTotMntIVaenSusp().add(amtSubtotal));
                    }
                    // NO FACTURABLE
                    else if (indFactCFE.equalsIgnoreCase("6")){
                        totales.setTotMontoNF(totales.getTotMontoNF().add(amtSubtotal));
                        sumarTotal = false;
                    }
                    else {
                        totales.setTotMntNetoIVAOtra(totales.getTotMntNetoIVAOtra().add(amtSubtotal));
                        totales.setTotMntIVAOtra(totales.getTotMntIVAOtra().add(taxAmt));
                    }
                }

                if (sumarTotal){
                    amtTotal = amtTotal.add(amtSubtotal).add(taxAmt);
                }
                amtTotalaPagar = amtTotalaPagar.add(amtSubtotal).add(taxAmt);
            }

            BigDecimal amtRounding = (BigDecimal) invoice.get_Value("AmtRounding");
            if (amtRounding == null) amtRounding = Env.ZERO;

            totales.setTotIVATasaMin(ivaMinimo.getRate().setScale(3));
            totales.setTotIVATasaBasica(ivaBasico.getRate().setScale(3));
            totales.setTotMntTotal(amtTotal);
            totales.setTotMntPagar(amtTotalaPagar.add(amtRounding));

            // Redondeo
            if (amtRounding.compareTo(Env.ZERO) != 0){
                totales.setTotMontoNF(totales.getTotMontoNF().add(amtRounding));
            }

            // Datos de Descuentos y Recargos Generales
            this.cfeInvoiCyType.setDscRcgGlobal(new CFEInvoiCyType.DscRcgGlobal());
            List<CFEInvoiCyType.DscRcgGlobal.DRGItem> drgItems = cfeInvoiCyType.getDscRcgGlobal().getDRGItem();

        }
        catch (Exception e){
            throw new AdempiereException(e);
        }

        return totales;
    }

    /***
     * Obtiene y retorna información del Receptor para comprobantes CFE del tipo Resguardo.
     * Xpande. Created by Gabriel Vila on 10/30/18.
     * @return
     */
    private Receptor setReceptorResguardo() {

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

            //receptor.setRcpTipoDocRecep(tipoIdentificacion);

            // Si es un cliente con identificación (NO ES OTROS)
            if (tipoIdentificacion != 4){

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
        }
        catch (Exception e){
            throw new AdempiereException(e);
        }

        return receptor;
    }

    /***
     * Obtiene y retorna información del Receptor para comprobantes CFE.
     * Xpande. Created by Gabriel Vila on 10/30/18.
     * @return
     */
    private Receptor setReceptorInvoice() {

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

            boolean pasaTopeUnidadIndexada = false;
            MCurrency currency = MCurrency.get(ctx, "UNI");
            if ((currency != null) && (currency.get_ID() > 0)){
                MInvoice invoice = (MInvoice) this.model;

                BigDecimal rateUni = CurrencyUtils.getCurrencyRate(ctx, invoice.getAD_Client_ID(), 0, currency.get_ID(),
                        142, 114, invoice.getDateInvoiced(), null);
                if (rateUni == null) rateUni = Env.ZERO;
                if (rateUni.compareTo(Env.ZERO) > 0){
                    BigDecimal amtInvoice = invoice.getGrandTotal();
                    if (invoice.getC_Currency_ID() != 142){
                        BigDecimal rateInv = CurrencyUtils.getCurrencyRate(ctx, invoice.getAD_Client_ID(), 0, invoice.getC_Currency_ID(),
                                142, 114, invoice.getDateInvoiced(), null);
                        if (rateInv == null) rateInv = Env.ZERO;
                        if (rateInv.compareTo(Env.ZERO) > 0){
                            amtInvoice = invoice.getGrandTotal().multiply(rateInv).setScale(2, RoundingMode.HALF_UP);
                        }
                    }
                    BigDecimal amtTope = new BigDecimal(10000).multiply(rateUni).setScale(2, RoundingMode.HALF_UP);

                    if (amtInvoice.compareTo(amtTope) > 0){
                        pasaTopeUnidadIndexada = true;
                    }
                }
            }

            // Si es un cliente con identificación (NO ES OTROS) o se pasa del monto tope en unidades indexadas
            if ((tipoIdentificacion != 4) || (pasaTopeUnidadIndexada)){

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
        }
        catch (Exception e){
            throw new AdempiereException(e);
        }

        return receptor;
    }

    /***
     * Obtiene y setea información del Encabezado de documentos correspondientes a eFacturas para envío de CFE.
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
            MInvoice invoice = (MInvoice) this.model;

            // Emisor, receptor y totales
            this.cfeInvoiCyType.setEmisor(emisor);
            this.cfeInvoiCyType.setReceptor(receptor);
            this.cfeInvoiCyType.setTotales(totales);

            CFEInvoiCyType.IdDoc idDoc = new CFEInvoiCyType.IdDoc();
            this.cfeInvoiCyType.setIdDoc(idDoc);
            idDoc.setCFETipoCFE(BigInteger.valueOf(Long.parseLong(docDGI.getCodigoDGI())));
            idDoc.setCFESerie(configDocSend.getDocumentSerie().trim());

            String adendaCFE = invoice.get_ValueAsString("AdendaCFE");
            if ((adendaCFE == null) || (adendaCFE.trim().equalsIgnoreCase(""))){
                adendaCFE = invoice.getDescription();
            }
            if (adendaCFE != null){
                if (!adendaCFE.trim().equalsIgnoreCase("")){
                    idDoc.setCFEAdenda(adendaCFE.trim());
                }
            }

            String cfeNumero = invoice.getDocumentNo().replaceAll("[^0-9]", "");
            cfeNumero = org.apache.commons.lang.StringUtils.leftPad(String.valueOf(cfeNumero), 7, "0");
            idDoc.setCFENro(new BigInteger(cfeNumero));

            GregorianCalendar gcal = (GregorianCalendar) GregorianCalendar.getInstance();
            gcal.setTime(invoice.getDateInvoiced());
            XMLGregorianCalendar xgCalDateInvoiced = DatatypeFactory.newInstance().newXMLGregorianCalendarDate(gcal.get(Calendar.YEAR),
                    gcal.get(Calendar.MONTH)+1, gcal.get(Calendar.DAY_OF_MONTH), DatatypeConstants.FIELD_UNDEFINED);
            idDoc.setCFEFchEmis(xgCalDateInvoiced);

            idDoc.setCFEMntBruto(new BigInteger("0"));
            MPriceList priceList = new MPriceList(this.ctx, invoice.getM_PriceList_ID(), null);
            if (priceList != null && priceList.isTaxIncluded()) {
                idDoc.setCFEMntBruto(new BigInteger("1"));
            }

            idDoc.setCFEFmaPago(BigInteger.valueOf(2)); // 2 = Credito, 1 = Contado
            String formaPago = invoice.get_ValueAsString("TipoFormaPago");
            if (formaPago != null ){
                if (formaPago.trim().equalsIgnoreCase("CONTADO")){
                    idDoc.setCFEFmaPago(BigInteger.valueOf(1));
                }
            }

            /*
            String payRuleType = invoice.getPaymentRule();
            if (payRuleType != null){
                if ((payRuleType.equalsIgnoreCase(X_C_Invoice.PAYMENTRULE_Cash)) || (payRuleType.equalsIgnoreCase(X_C_Invoice.PAYMENTRULE_DirectDeposit))
                        || (payRuleType.equalsIgnoreCase(X_C_Invoice.PAYMENTRULE_DirectDebit))) {

                    idDoc.setCFEFmaPago(BigInteger.valueOf(1)); // 2 = Credito, 1 = Contado
                }
            }
            */

            Timestamp dueDate = ProcesadorCFE.getPaymentTermDueDate(this.ctx, invoice.getC_PaymentTerm_ID(), invoice.getDateInvoiced(), null);
            if (dueDate != null) {
                GregorianCalendar gcalDue = (GregorianCalendar) GregorianCalendar.getInstance();
                gcalDue.setTime(dueDate);
                XMLGregorianCalendar xgCalDueDate = DatatypeFactory.newInstance().newXMLGregorianCalendarDate(gcalDue.get(Calendar.YEAR),
                        gcalDue.get(Calendar.MONTH)+1, gcalDue.get(Calendar.DAY_OF_MONTH),
                        DatatypeConstants.FIELD_UNDEFINED);
                idDoc.setCFEFchVenc(xgCalDueDate);
            }

            // Datos de Subtotales (por ahora no proceso esta info)
            this.cfeInvoiCyType.setSubTotInfo(new CFEInvoiCyType.SubTotInfo());

            // Datos de Medios de Pago (por ahora no proceso esta info)
            this.cfeInvoiCyType.setMediosPago(new CFEInvoiCyType.MediosPago());

        }
        catch (Exception e){
            throw new AdempiereException(e);
        }

        return message;
    }



    /***
     * Obtiene y setea información del Encabezado de documentos correspondientes a eTickets para envío de CFE.
     * Xpande. Created by Gabriel Vila on 10/30/18.
     * @param docDGI
     * @param emisor
     * @param receptor
     * @param totales
     * @return
     */
    private String setEncabezado_eTicket(MZCFEConfigDocDGI docDGI, Emisor emisor, Receptor receptor, Totales totales) {

        String message = null;

        try{

            MInvoice invoice = (MInvoice) this.model;

            // Emisor, receptor y totales
            this.cfeInvoiCyType.setEmisor(emisor);
            this.cfeInvoiCyType.setReceptor(receptor);
            this.cfeInvoiCyType.setTotales(totales);

            CFEInvoiCyType.IdDoc idDoc = new CFEInvoiCyType.IdDoc();
            this.cfeInvoiCyType.setIdDoc(idDoc);
            idDoc.setCFETipoCFE(BigInteger.valueOf(Long.parseLong(docDGI.getCodigoDGI())));
            idDoc.setCFESerie(configDocSend.getDocumentSerie().trim());

            String adendaCFE = invoice.get_ValueAsString("AdendaCFE");
            if ((adendaCFE == null) || (adendaCFE.trim().equalsIgnoreCase(""))){
                adendaCFE = invoice.getDescription();
            }
            if (adendaCFE != null){
                if (!adendaCFE.trim().equalsIgnoreCase("")){
                    idDoc.setCFEAdenda(adendaCFE.trim());
                }
            }

            String cfeNumero = invoice.getDocumentNo().replaceAll("[^0-9]", "");
            cfeNumero = org.apache.commons.lang.StringUtils.leftPad(String.valueOf(cfeNumero), 7, "0");
            idDoc.setCFENro(new BigInteger(cfeNumero));

            GregorianCalendar gcal = (GregorianCalendar) GregorianCalendar.getInstance();
            gcal.setTime(invoice.getDateInvoiced());
            XMLGregorianCalendar xgCalDateInvoiced = DatatypeFactory.newInstance().newXMLGregorianCalendarDate(gcal.get(Calendar.YEAR),
                    gcal.get(Calendar.MONTH)+1, gcal.get(Calendar.DAY_OF_MONTH), DatatypeConstants.FIELD_UNDEFINED);
            idDoc.setCFEFchEmis(xgCalDateInvoiced);

            idDoc.setCFEMntBruto(new BigInteger("0"));
            MPriceList priceList = new MPriceList(this.ctx, invoice.getM_PriceList_ID(), null);
            if (priceList != null && priceList.isTaxIncluded()) {
                idDoc.setCFEMntBruto(new BigInteger("1"));
            }

            idDoc.setCFEFmaPago(BigInteger.valueOf(2)); // 2 = Credito, 1 = Contado
            String formaPago = invoice.get_ValueAsString("TipoFormaPago");
            if (formaPago != null ){
                if (formaPago.trim().equalsIgnoreCase("CONTADO")){
                    idDoc.setCFEFmaPago(BigInteger.valueOf(1));
                }
            }

            String payRuleType = invoice.getPaymentRule();
            if (payRuleType != null){
                if ((payRuleType.equalsIgnoreCase(X_C_Invoice.PAYMENTRULE_Cash)) || (payRuleType.equalsIgnoreCase(X_C_Invoice.PAYMENTRULE_DirectDeposit))
                        || (payRuleType.equalsIgnoreCase(X_C_Invoice.PAYMENTRULE_DirectDebit))) {

                    idDoc.setCFEFmaPago(BigInteger.valueOf(1)); // 2 = Credito, 1 = Contado
                }
            }

            Timestamp dueDate = ProcesadorCFE.getPaymentTermDueDate(this.ctx, invoice.getC_PaymentTerm_ID(), invoice.getDateInvoiced(), null);
            if (dueDate != null) {
                GregorianCalendar gcalDue = (GregorianCalendar) GregorianCalendar.getInstance();
                gcalDue.setTime(dueDate);
                XMLGregorianCalendar xgCalDueDate = DatatypeFactory.newInstance().newXMLGregorianCalendarDate(gcalDue.get(Calendar.YEAR),
                        gcalDue.get(Calendar.MONTH)+1, gcalDue.get(Calendar.DAY_OF_MONTH),
                        DatatypeConstants.FIELD_UNDEFINED);
                idDoc.setCFEFchVenc(xgCalDueDate);
            }

            // Datos de Subtotales (por ahora no proceso esta info)
            this.cfeInvoiCyType.setSubTotInfo(new CFEInvoiCyType.SubTotInfo());

            // Datos de Medios de Pago (por ahora no proceso esta info)
            this.cfeInvoiCyType.setMediosPago(new CFEInvoiCyType.MediosPago());

        }
        catch (Exception e){
            throw new AdempiereException(e);
        }

        return message;
    }


    private static Integer getIntegerVal(Element element, String name) {
        String val = element.getChildText(name);
        Integer ret = null;
        try {
            ret = Integer.valueOf(val);
        } catch (Exception e) {
            ret = null;
        }

        return ret;
    }

    private static BigInteger getBigIntegerVal(Element element, String name) {
        String val = element.getChildText(name);
        BigInteger ret = null;
        try {
            ret = BigInteger.valueOf(Integer.valueOf(val));
        } catch (Exception e) {
            ret = null;
        }
        return ret;
    }

    private static String getStringVal(Element element, String name) {
        return element.getChildText(name);
    }

    private static BigDecimal getBigDecimalVal(Element element, String name) {
        String val = element.getChildText(name);
        BigDecimal ret = null;
        try {
            ret = BigDecimal.valueOf(Integer.valueOf(val));
        } catch (Exception e) {
            ret = null;
        }
        return ret;
    }

    private static Integer getIntegerVal(Element element, String name, Integer defaultValue) {
        Integer ret = getIntegerVal(element, name);
        return ret != null ? ret : defaultValue;
    }

    private static Long getLongVal(Element element, String name) {
        String val = element.getChildText(name);
        Long ret = null;
        try {
            ret = Long.valueOf(val);
        } catch (Exception e) {
            ret = null;
        }

        return ret;
    }

    private static XMLGregorianCalendar getXMLGregorianCalendar(Element element, String name) {

        try {
            GregorianCalendar gcal = new GregorianCalendar();
            XMLGregorianCalendar xgcal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);

            xgcal = DatatypeFactory.newInstance().newXMLGregorianCalendar(element.getChildText(name));

            return xgcal;
        } catch (Exception e) { }


        return null;
    }

    private static void loadCfeResponses(List<Element> cfeResponses, ListaCFERetornoType objCfeResponses) {

        try{

            for (Element cfeResponse : cfeResponses) {
                ListaCFERetornoType.CFE objCfeResponse = new ListaCFERetornoType.CFE();
                objCfeResponses.getCFE().add(objCfeResponse);

                objCfeResponse.setCFETipo(getBigIntegerVal(cfeResponse, "CFETipo"));
                objCfeResponse.setCFESerie(getStringVal(cfeResponse, "CFESerie"));
                objCfeResponse.setCFENro(getBigIntegerVal(cfeResponse, "CFENro"));
                objCfeResponse.setCFEStatus(getBigIntegerVal(cfeResponse, "CFEStatus"));
                objCfeResponse.setCFEEstadoAcuse(getBigIntegerVal(cfeResponse, "CFEEstadoAcuse"));
                objCfeResponse.setCFEMsgCod(getIntegerVal(cfeResponse, "CFEMsgCod"));
                objCfeResponse.setCFEMsgDsc(getStringVal(cfeResponse, "CFEMsgDsc"));
                objCfeResponse.setCFERepImpressa(getStringVal(cfeResponse, "CFERepImpressa"));
                objCfeResponse.setCFENumReferencia(getBigIntegerVal(cfeResponse, "CFENumReferencia"));
                objCfeResponse.setCFECodigoSeguridad(getStringVal(cfeResponse, "CFECodigoSeguridad"));
                objCfeResponse.setCFEQrCode(getStringVal(cfeResponse, "CFEQrCode"));

                ListaCFERetornoType.CFE.CFEDatosAvanzados objCfeDatosAvanzados = new ListaCFERetornoType.CFE.CFEDatosAvanzados();
                objCfeResponse.setCFEDatosAvanzados(objCfeDatosAvanzados);
                Element cfeDatosAvanzados = cfeResponse.getChild("CFEDatosAvanzados");

                if (cfeDatosAvanzados != null) {
                    objCfeDatosAvanzados.setCFEHASH(getStringVal(cfeDatosAvanzados, "CFEHASH"));
                    objCfeDatosAvanzados.setCFEFchHorFirma(getXMLGregorianCalendar(cfeDatosAvanzados, "CFEFchHorFirma"));
                    objCfeDatosAvanzados.setCFECAEId(getLongVal(cfeDatosAvanzados, "CFECAEId"));
                    objCfeDatosAvanzados.setCFECAENroIni(getBigIntegerVal(cfeDatosAvanzados, "CFECAENroIni"));
                    objCfeDatosAvanzados.setCFECAENroFin(getBigIntegerVal(cfeDatosAvanzados, "CFECAENroFin"));
                    objCfeDatosAvanzados.setCFECAEFchVenc(getXMLGregorianCalendar(cfeDatosAvanzados, "CFECAEFchVenc"));
                    objCfeDatosAvanzados.setCFERUTEmisor(getStringVal(cfeDatosAvanzados, "CFERUTEmisor"));
                    objCfeDatosAvanzados.setCFETotMntPagar(getBigDecimalVal(cfeDatosAvanzados, "CFETotMntPagar"));
                    objCfeDatosAvanzados.setNumResAutorizadora(getBigIntegerVal(cfeDatosAvanzados, "NumResAutorizadora"));
                    objCfeDatosAvanzados.setAnoResAutorizadora(getBigIntegerVal(cfeDatosAvanzados, "AnoResAutorizadora"));
                    objCfeDatosAvanzados.setDireccionInvoiCyWeb(getStringVal(cfeDatosAvanzados, "DireccionInvoiCyWeb"));
                    objCfeDatosAvanzados.setCodBarAbtPrimera(getStringVal(cfeDatosAvanzados, "CodBarAbtPrimera"));
                    objCfeDatosAvanzados.setCodBarAbtSegunda(getStringVal(cfeDatosAvanzados, "CodBarAbtSegunda"));
                }


                objCfeResponse.setErros(new ListaCFERetornoType.CFE.Erros());
                List<ErrosItem> objCfeErros = objCfeResponse.getErros().getErrosItem();
                for (Element cfeErros : cfeResponse.getChild("Erros").getChildren()) {
                    ErrosItem objErrosItem = new ErrosItem();
                    objCfeErros.add(objErrosItem);
                    objErrosItem.setCFEErrCod(getIntegerVal(cfeErros, "CFEErrCod", 0));
                    objErrosItem.setCFEErrDesc(getStringVal(cfeErros, "CFEErrDesc"));
                }
            }

        }
        catch (Exception e){
            throw new AdempiereException(e);
        }

    }

    /***
     * Obtiene y setea información de Totales para el envío de CFE.
     * Xpande. Created by Gabriel Vila on 9/8/20.
     * @return
     */
    private Totales setTotalesResguardo() {

        String sql = "";
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        Totales totales = new Totales();

        try{

            MDocType doc = new MDocType(this.ctx, this.model.get_ValueAsInt("C_DocType_ID"), null);

            // Instancio configurador de CFE
            MZCFEConfig cfeConfig = (MZCFEConfig) this.configDocSend.getZ_CFE_Config();

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
            totales.setTotMntIVaenSusp(Env.ZERO);
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

            Totales.RetencPercepTot retencPercepTot = new CFEInvoiCyType.Totales.RetencPercepTot();
            totales.setRetencPercepTot(retencPercepTot);

            sql = " SELECT ret.Z_RetencionSocio_ID, ret.codigodgi, ret.emitiedgi, SUM(resl.amtretencion) total"
                    + " FROM Z_ResguardoSocio res"
                    + " INNER JOIN Z_ResguardoSocioRet resl ON res.Z_ResguardoSocio_ID = resl.Z_ResguardoSocio_ID"
                    + " INNER JOIN Z_RetencionSocio ret ON resl.Z_RetencionSocio_ID = ret.Z_RetencionSocio_ID"
                    + " WHERE res.Z_ResguardoSocio_ID = " + this.model.get_ID()
                    + " GROUP BY ret.Z_RetencionSocio_ID, ret.codigodgi, ret.emitiedgi";

            pstmt = DB.prepareStatement(sql, this.trxName);
            rs = pstmt.executeQuery();

            while(rs.next()){

                boolean isDgi = rs.getString("emitieDGI").equalsIgnoreCase("Y") ? true : false;;
                String codigo = rs.getString("codigodgi");
                BigDecimal montoSum = rs.getBigDecimal("total");

                if (montoSum != null) {
                    montoSum = montoSum.setScale(2, RoundingMode.HALF_UP);
                }

                Totales.RetencPercepTot.RetencPercepTotItem retencPercepTotItem = new CFEInvoiCyType.Totales.RetencPercepTot.RetencPercepTotItem();
                retencPercepTot.getRetencPercepTotItem().add(retencPercepTotItem);

                // Contra-Resguardo, doy vuelta el signo.
                if (doc.getDocBaseType().equalsIgnoreCase("RGC")) {
                    montoSum = montoSum.negate();
                }

                retencPercepTotItem.setRetPercCodRet(codigo);
                retencPercepTotItem.setRetPercValRetPerc(montoSum);
                amtTotal = amtTotal.add(montoSum);
            }
            totales.setTotMntTotRetenido(amtTotal);
        }
        catch (Exception e){
            throw new AdempiereException(e);
        }
        finally {
            DB.close(rs, pstmt);
            rs = null; pstmt = null;
        }

        return totales;
    }

    /***
     * Setea datos del cabezal de un resguardo electrónico.
     * @param docDGI
     * @param emisor
     * @param receptor
     * @param totales
     * @return
     */
    private String setEncabezado_Resguardo(MZCFEConfigDocDGI docDGI, Emisor emisor, Receptor receptor, Totales totales) {

        String message = null;

        try{
            // Emisor, receptor y totales
            this.cfeInvoiCyType.setEmisor(emisor);
            this.cfeInvoiCyType.setReceptor(receptor);
            this.cfeInvoiCyType.setTotales(totales);

            CFEInvoiCyType.IdDoc idDoc = new CFEInvoiCyType.IdDoc();
            this.cfeInvoiCyType.setIdDoc(idDoc);
            idDoc.setCFETipoCFE(BigInteger.valueOf(Long.parseLong(docDGI.getCodigoDGI())));
            idDoc.setCFESerie(configDocSend.getDocumentSerie().trim());

            String description = model.get_ValueAsString("Description");
            if (description != null){
                if (!description.trim().equalsIgnoreCase("")){
                    idDoc.setCFEAdenda(description.trim());
                }
            }

            String cfeNumero = model.get_ValueAsString("DocumentNo").replaceAll("[^0-9]", "");
            cfeNumero = org.apache.commons.lang.StringUtils.leftPad(String.valueOf(cfeNumero), 7, "0");
            idDoc.setCFENro(new BigInteger(cfeNumero));

            Timestamp fechaDoc = (Timestamp) model.get_Value("DateDoc");
            GregorianCalendar gcal = (GregorianCalendar) GregorianCalendar.getInstance();
            gcal.setTime(fechaDoc);
            XMLGregorianCalendar xgCalDateDoc = DatatypeFactory.newInstance().newXMLGregorianCalendarDate(gcal.get(Calendar.YEAR),
                    gcal.get(Calendar.MONTH)+1, gcal.get(Calendar.DAY_OF_MONTH), DatatypeConstants.FIELD_UNDEFINED);
            idDoc.setCFEFchEmis(xgCalDateDoc);

        }
        catch (Exception e){
            throw new AdempiereException(e);
        }

        return null;
    }

    /***
     * Obtiene y setea detalle de un resguardo electrónico.
     * Xpande. Created by Gabriel Vila on 11/15/18
     * @return
     */
    private String setDetalle_Resguardo() {

        String message = null;

        String sql = "";
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try{
            // Documento
            MDocType docType = new MDocType(this.ctx, model.get_ValueAsInt("C_DocType_ID"), null);

            // Instancio configurador de CFE
            MZCFEConfig cfeConfig = (MZCFEConfig) this.configDocSend.getZ_CFE_Config();

            this.cfeInvoiCyType.setDetalle(new CFEInvoiCyType.Detalle());
            List<CFEInvoiCyType.Detalle.Item> items = cfeInvoiCyType.getDetalle().getItem();

            sql = " select a.amtbase, a.amtretencion, ret.codigodgi " +
                    "from z_resguardosocioret a " +
                    "inner join z_retencionsocio ret on a.z_retencionsocio_id = ret.z_retencionsocio_id " +
                    "where z_resguardosocio_id = " + model.get_ID();

            pstmt = DB.prepareStatement(sql, model.get_TrxName());
            rs = pstmt.executeQuery();

            int contador = 0;

            while(rs.next()){

                contador++;

                CFEInvoiCyType.Detalle.Item item = new CFEInvoiCyType.Detalle.Item();
                items.add(item);
                CFEInvoiCyType.Detalle.Item.CodItem codItem = new CFEInvoiCyType.Detalle.Item.CodItem();
                item.setCodItem(codItem);

                // Contra-Resguardo
                if (docType.getDocBaseType().equalsIgnoreCase("RGC")) {
                    item.setIteIndFact(9);
                }

                CFEInvoiCyType.Detalle.Item.RetencPercep.RetencPercepItem retencPercepItem = new CFEInvoiCyType.Detalle.Item.RetencPercep.RetencPercepItem();
                if (item.getRetencPercep() == null) {
                    item.setRetencPercep(new CFEInvoiCyType.Detalle.Item.RetencPercep());
                }
                item.getRetencPercep().getRetencPercepItem().add(retencPercepItem);

                retencPercepItem.setIteRetPercCodRet(rs.getString("codigodgi"));
                retencPercepItem.setIteRetPercMntSujetoaRet(rs.getBigDecimal("amtbase").setScale(2, RoundingMode.HALF_UP));
                retencPercepItem.setIteRetPercValRetPerc(rs.getBigDecimal("amtretencion").setScale(2, RoundingMode.HALF_UP));
                retencPercepItem.setIteRetPerc(RetPerc.R);
            }
        }
        catch (Exception e){
            throw new AdempiereException(e);
        }
        finally {
            DB.close(rs, pstmt);
            rs = null; pstmt = null;
        }

        return null;
    }

    /***
     * Setea información de referencia de un contra-resguardo electrónico.
     * Xpande. Created by Gabriel Vila on 11/15/18
     * @return
     */
    private String setReferencia_Resguardo() {

        String sql = "";
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try{

            List<CFEInvoiCyType.Referencia.ReferenciaItem> refItems = this.cfeInvoiCyType.getReferencia().getReferenciaItem();

            // Documento
            MDocType docType = new MDocType(this.ctx, model.get_ValueAsInt("C_DocType_ID"), null);

            // Si no es Contra-Resguardo, no hago nada.
            if (!docType.getDocBaseType().equalsIgnoreCase("RGC")) {
                return null;
            }

            int resguardoID = this.model.get_ValueAsInt("Z_ResguardoSocio_Ref_ID");

            if (resguardoID <= 0){
                return "No se pudo obtener resguardo referenciado por este contra-resguardo.";
            }

            sql = " select documentno, datedoc " +
                    "from z_resguardosocio " +
                    "where z_resguardosocio_id =" + resguardoID;

            pstmt = DB.prepareStatement(sql, this.trxName);
            rs = pstmt.executeQuery();

            if (rs.next()){

                CFEInvoiCyType.Referencia.ReferenciaItem refItem = new CFEInvoiCyType.Referencia.ReferenciaItem();
                refItems.add(refItem);

                refItem.setRefNroLinRef(1);
                refItem.setRefSerie(this.configDocSend.getDocumentSerie());
                refItem.setRefIndGlobal(BigInteger.valueOf(1));

                String documentNo = rs.getString("documentno").trim();
                documentNo = documentNo.replaceAll("[^0-9]", "");
                documentNo = org.apache.commons.lang.StringUtils.leftPad(String.valueOf(documentNo), 7, "0");
                refItem.setRefNroCFERef(new BigInteger(documentNo));
            }

        }
        catch (Exception e){
            throw new AdempiereException(e);
        }
        finally {
            DB.close(rs, pstmt);
            rs = null; pstmt = null;
        }

        return null;
    }

}
