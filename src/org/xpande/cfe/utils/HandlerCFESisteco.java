package org.xpande.cfe.utils;

import dto.sisteco.SistecoConvertResponse;
import dto.sisteco.SistecoResponseDTO;
import uy.gub.dgi.cfe.*;
import org.adempiere.exceptions.AdempiereException;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;

import org.compiere.model.*;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.eevolution.model.X_C_TaxGroup;
import org.xpande.cfe.model.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Properties;

/**
 * Manejador de facturación electrónica con el proveedor SISTECO.
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

                // Obtengo deatos del encabezado
                message = this.setEncabezado_eFactura(docDGI, emisor, receptor, totales);
                if (message != null) return message;

                // Obtengo datos de las lineas
                message = this.setDetalleInvoice_eFactura();
                if (message != null) return message;

                // Si el Documento se corresponde con una nota de crédito o nota de débito, debo setear datos de las facturas referenciadas
                if ((docDGI.getValue().equalsIgnoreCase("E-FACTURA NC"))
                        || (docDGI.getValue().equalsIgnoreCase("E-FACTURA ND"))
                        || (docDGI.getValue().equalsIgnoreCase("E-FACTURA CTAAJE ND"))
                        || (docDGI.getValue().equalsIgnoreCase("E-FACTURA CTAAJE NC"))){

                    message = this.setReferencia_eFactura();
                    if (message != null) return message;
                }

                // Datos de CAE
                message = this.setCAE_eFactura();
                if (message != null) return message;

            }
            else if ((docDGI.getValue().equalsIgnoreCase("E-TICKET")) || (docDGI.getValue().equalsIgnoreCase("E-TICKET NC"))
                    || (docDGI.getValue().equalsIgnoreCase("E-TICKET ND")) || (docDGI.getValue().equalsIgnoreCase("E-TICKET CTAAJE"))
                    || (docDGI.getValue().equalsIgnoreCase("E-TICKET CTAAJE NC")) || (docDGI.getValue().equalsIgnoreCase("E-TICKET CTAAJE ND"))){

                // Obtengo datos del Receptor
                ReceptorTck receptor = this.setReceptor_eTicket();

                // Obtengo deatos del encabezado
                message = this.setEncabezado_eTicket(docDGI, emisor, receptor, totales);
                if (message != null) return message;

                // Obtengo datos de las lineas
                message = this.setDetalleInvoice_eTicket();
                if (message != null) return message;

                // Si el Documento se corresponde con una nota de crédito o nota de débito, debo setear datos de las facturas referenciadas
                if ((docDGI.getValue().equalsIgnoreCase("E-TICKET NC"))
                        || (docDGI.getValue().equalsIgnoreCase("E-TICKET ND"))
                        || (docDGI.getValue().equalsIgnoreCase("E-TICKET CTAAJE ND"))
                        || (docDGI.getValue().equalsIgnoreCase("E-TICKET CTAAJE NC"))){

                    message = this.setReferencia_eTicket();
                    if (message != null) return message;
                }

                // Datos de CAE
                message = this.setCAE_eTicket();
                if (message != null) return message;

            }

        }
        catch (Exception e){
            throw new AdempiereException(e);
        }

        return message;
    }


    /***
     * Setea datos del CAE para documentos de la familia eFactura.
     * Xpande. Created by Gabriel Vila on 11/1/18.
     * @return
     */
    private String setCAE_eFactura() {

        String message = null;

        try{

            CAEDataType caeDataType = new CAEDataType();
            this.defType.getEFact().setCAEData(caeDataType);

            caeDataType.setCAEID(new BigDecimal(this.configDocSend.getNumeroCAE()).toBigInteger());
            caeDataType.setDNro(new BigDecimal(this.configDocSend.getNumeroDesde()).toBigInteger());
            caeDataType.setHNro(new BigDecimal(this.configDocSend.getNumeroHasta()).toBigInteger());
            caeDataType.setFecVenc(TS_to_XmlGregorianCalendar_OnlyDate(this.configDocSend.getDueDate(), false));

        }
        catch (Exception e){
            throw new AdempiereException(e);
        }

        return message;

    }

    /***
     * Setea datos del CAE para documentos de la familia eTicket.
     * Xpande. Created by Gabriel Vila on 1/15/20.
     * @return
     */
    private String setCAE_eTicket() {

        String message = null;

        try{

            CAEDataType caeDataType = new CAEDataType();
            this.defType.getETck().setCAEData(caeDataType);

            caeDataType.setCAEID(new BigDecimal(this.configDocSend.getNumeroCAE()).toBigInteger());
            caeDataType.setDNro(new BigDecimal(this.configDocSend.getNumeroDesde()).toBigInteger());
            caeDataType.setHNro(new BigDecimal(this.configDocSend.getNumeroHasta()).toBigInteger());
            caeDataType.setFecVenc(TS_to_XmlGregorianCalendar_OnlyDate(this.configDocSend.getDueDate(), false));

        }
        catch (Exception e){
            throw new AdempiereException(e);
        }

        return message;

    }

    /***
     * Setea datos del CAE de un resguardo electrónico.
     * Xpande. Created by Gabriel Vila on 11/15/18.
     * @return
     */
    private String setCAE_Resguardo() {

        String message = null;

        try{

            CAEDataType caeDataType = new CAEDataType();
            this.defType.getEResg().setCAEData(caeDataType);

            caeDataType.setCAEID(new BigDecimal(this.configDocSend.getNumeroCAE()).toBigInteger());
            caeDataType.setDNro(new BigDecimal(this.configDocSend.getNumeroDesde()).toBigInteger());
            caeDataType.setHNro(new BigDecimal(this.configDocSend.getNumeroHasta()).toBigInteger());
            caeDataType.setFecVenc(TS_to_XmlGregorianCalendar_OnlyDate(this.configDocSend.getDueDate(), false));

        }
        catch (Exception e){
            throw new AdempiereException(e);
        }

        return message;

    }

    /***
     * Setea referencia de Nota de Credito y Débito de documentos de eFactura.
     * Xpande. Created by Gabriel Vila on 11/1/18.
     * @return
     */
    private String setReferencia_eFactura() {

        String sql = "";
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try{

            Referencia1 referenciasList = new Referencia1();
            this.defType.getEFact().setReferencia(referenciasList);

            // Intancio modelo de nota de credito
            MInvoice invoice = (MInvoice) this.model;

            // Si utilizo el campo texto manual para indicar REFERENCIA de Nota de Credito, envío este dato y salgo.
            if (invoice.get_ValueAsString("ReferenciaCFE") != null){
                String referenciaCFE = invoice.get_ValueAsString("ReferenciaCFE").trim();
                if (!referenciaCFE.equalsIgnoreCase("")){

                    if (referenciaCFE.length() > 90){
                        referenciaCFE = referenciaCFE.substring(0, 89);
                    }

                    Referencia1.Referencia referencia = new Referencia1.Referencia();
                    referenciasList.getReferencia().add(referencia);
                    referencia.setNroLinRef(1);
                    referencia.setIndGlobal(BigInteger.valueOf(1));
                    referencia.setRazonRef(referenciaCFE);

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

                Referencia1.Referencia referencia = new Referencia1.Referencia();
                referenciasList.getReferencia().add(referencia);

                referencia.setNroLinRef(contador);
                referencia.setTpoDocRef(BigInteger.valueOf(Long.parseLong(docDGI.getCodigoDGI())));
                referencia.setSerie(configDocRefSend.getDocumentSerie().trim());
                referencia.setIndGlobal(BigInteger.valueOf(1));

                String documentNo = rs.getString("documentno").trim();
                documentNo = documentNo.replaceAll("[^0-9]", "");
                documentNo = org.apache.commons.lang.StringUtils.leftPad(String.valueOf(documentNo), 7, "0");
                referencia.setNroCFERef(new BigInteger(documentNo));
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
     * Setea referencia de Nota de Credito y Débito de documentos de eTicket.
     * Xpande. Created by Gabriel Vila on 1/15/20.
     * @return
     */
    private String setReferencia_eTicket() {

        String sql = "";
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try{

            Referencia1 referenciasList = new Referencia1();
            this.defType.getETck().setReferencia(referenciasList);

            // Intancio modelo de nota de credito
            MInvoice invoice = (MInvoice) this.model;

            // Si utilizo el campo texto manual para indicar REFERENCIA de Nota de Credito, envío este dato y salgo.
            if (invoice.get_ValueAsString("ReferenciaCFE") != null){
                String referenciaCFE = invoice.get_ValueAsString("ReferenciaCFE").trim();
                if (!referenciaCFE.equalsIgnoreCase("")){

                    if (referenciaCFE.length() > 90){
                        referenciaCFE = referenciaCFE.substring(0, 89);
                    }

                    Referencia1.Referencia referencia = new Referencia1.Referencia();
                    referenciasList.getReferencia().add(referencia);
                    referencia.setNroLinRef(1);
                    referencia.setIndGlobal(BigInteger.valueOf(1));
                    referencia.setRazonRef(referenciaCFE);

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

                Referencia1.Referencia referencia = new Referencia1.Referencia();
                referenciasList.getReferencia().add(referencia);

                referencia.setNroLinRef(contador);
                referencia.setTpoDocRef(BigInteger.valueOf(Long.parseLong(docDGI.getCodigoDGI())));
                referencia.setSerie(configDocRefSend.getDocumentSerie().trim());
                referencia.setIndGlobal(BigInteger.valueOf(1));

                String documentNo = rs.getString("documentno").trim();
                documentNo = documentNo.replaceAll("[^0-9]", "");
                documentNo = org.apache.commons.lang.StringUtils.leftPad(String.valueOf(documentNo), 7, "0");
                referencia.setNroCFERef(new BigInteger(documentNo));
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

            this.defType.getEFact().setDetalle(new CFEDefType.EFact.Detalle());
            List<ItemDetFact> lineas = this.defType.getEFact().getDetalle().getItem();

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
                String codigoLinea ="", nombreLinea = "", descLinea = "";
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

                ItemDetFact detalleItem = new ItemDetFact();
                lineas.add(detalleItem);
                detalleItem.setNroLinDet(position++);
                ItemDetFact.CodItem codItem = null;

                // Codigo del producto
                if (codigoLinea != null) {
                    codItem = new ItemDetFact.CodItem();
                    codItem.setTpoCod("INT1");
                    codItem.setCod(codigoLinea);
                    detalleItem.getCodItem().add(codItem);
                }

                // Codigo de barras en caso de tenerlo en la linea de factura
                if (invoiceLine.get_ValueAsString("UPC") != null) {
                    codItem = new ItemDetFact.CodItem();
                    codItem.setTpoCod("EAN");
                    codItem.setCod(invoiceLine.get_ValueAsString("UPC"));
                    detalleItem.getCodItem().add(codItem);
                }

                MTax tax = (MTax) invoiceLine.getC_Tax();

                if (tax.getRate().compareTo(ivaMinimo.getRate()) == 0) {

                    detalleItem.setIndFact(BigInteger.valueOf(2));
                }
                else if (tax.getRate().compareTo(ivaBasico.getRate()) == 0) {

                    detalleItem.setIndFact(BigInteger.valueOf(3));
                }
                else if (tax.getRate().compareTo(Env.ZERO) == 0) {

                    detalleItem.setIndFact(BigInteger.valueOf(1));
                }
                else{
                    return "Tasa de impuesto en linea del Documento, no parametrizada para DGI";
                }

                detalleItem.setIndAgenteResp(null);
                detalleItem.setNomItem(nombreLinea);
                detalleItem.setDscItem(descLinea);
                detalleItem.setCantidad(invoiceLine.getQtyEntered());

                MUOM uom = (MUOM) invoiceLine.getC_UOM();
                detalleItem.setUniMed(uom.getUOMSymbol());

                BigDecimal precioUnitario = invoiceLine.getPriceEntered().setScale(6, RoundingMode.HALF_UP).abs();
                detalleItem.setPrecioUnitario(precioUnitario);
                detalleItem.setRecargoPct(Env.ZERO);
                detalleItem.setRecargoMnt(Env.ZERO);

                if (priceList.isTaxIncluded()) {
                    detalleItem.setMontoItem(invoiceLine.getLineTotalAmt().abs());
                }
                else {
                    detalleItem.setMontoItem(((BigDecimal) invoiceLine.get_Value("AmtSubtotal")).abs());
                }
            }

        }
        catch (Exception e){
            throw new AdempiereException(e);
        }

        return message;
    }

    /***
     * Obtiene y setea datos de lineas del Documento para eTickets.
     * Xpande. Created by Gabriel Vila on 1/15/20.
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

            this.defType.getETck().setDetalle(new CFEDefType.ETck.Detalle());
            List<ItemDetFact> lineas = this.defType.getETck().getDetalle().getItem();

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
                String codigoLinea ="", nombreLinea = "", descLinea = "";
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

                ItemDetFact detalleItem = new ItemDetFact();
                lineas.add(detalleItem);
                detalleItem.setNroLinDet(position++);
                ItemDetFact.CodItem codItem = null;

                // Codigo del producto
                if (codigoLinea != null) {
                    codItem = new ItemDetFact.CodItem();
                    codItem.setTpoCod("INT1");
                    codItem.setCod(codigoLinea);
                    detalleItem.getCodItem().add(codItem);
                }

                // Codigo de barras en caso de tenerlo en la linea de factura
                if (invoiceLine.get_ValueAsString("UPC") != null) {
                    codItem = new ItemDetFact.CodItem();
                    codItem.setTpoCod("EAN");
                    codItem.setCod(invoiceLine.get_ValueAsString("UPC"));
                    detalleItem.getCodItem().add(codItem);
                }

                MTax tax = (MTax) invoiceLine.getC_Tax();

                if (tax.getRate().compareTo(ivaMinimo.getRate()) == 0) {

                    detalleItem.setIndFact(BigInteger.valueOf(2));
                }
                else if (tax.getRate().compareTo(ivaBasico.getRate()) == 0) {

                    detalleItem.setIndFact(BigInteger.valueOf(3));
                }
                else if (tax.getRate().compareTo(Env.ZERO) == 0) {

                    detalleItem.setIndFact(BigInteger.valueOf(1));
                }
                else{
                    return "Tasa de impuesto en linea del Documento, no parametrizada para DGI";
                }

                detalleItem.setIndAgenteResp(null);
                detalleItem.setNomItem(nombreLinea);
                detalleItem.setDscItem(descLinea);
                detalleItem.setCantidad(invoiceLine.getQtyEntered());

                MUOM uom = (MUOM) invoiceLine.getC_UOM();
                detalleItem.setUniMed(uom.getUOMSymbol());

                BigDecimal precioUnitario = invoiceLine.getPriceEntered().setScale(6, RoundingMode.HALF_UP).abs();
                detalleItem.setPrecioUnitario(precioUnitario);
                detalleItem.setRecargoPct(Env.ZERO);
                detalleItem.setRecargoMnt(Env.ZERO);

                if (priceList.isTaxIncluded()) {
                    detalleItem.setMontoItem(invoiceLine.getLineTotalAmt().abs());
                }
                else {
                    detalleItem.setMontoItem(((BigDecimal) invoiceLine.get_Value("AmtSubtotal")).abs());
                }
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
                else if (tax.getRate().compareTo(ivaMinimo.getRate()) == 0){
                    totales.setMntNetoIvaTasaMin(totales.getMntNetoIvaTasaMin().add(amtSubtotal));
                    totales.setMntIVATasaMin(totales.getMntIVATasaMin().add(taxAmt));
                }
                else if (tax.getRate().compareTo(ivaBasico.getRate()) == 0){
                    totales.setMntNetoIVATasaBasica(totales.getMntNetoIVATasaBasica().add(amtSubtotal));
                    totales.setMntIVATasaBasica(totales.getMntIVATasaBasica().add(taxAmt));
                }
                else {
                    totales.setMntNetoIVAOtra(totales.getMntNetoIVAOtra().add(amtSubtotal));
                    totales.setMntIVAOtra(totales.getMntIVAOtra().add(taxAmt));
                }
                amtTotal = amtTotal.add(amtSubtotal).add(taxAmt);

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
     * Obtiene y setea información de Totales para el envío de CFE.
     * Xpande. Created by Gabriel Vila on 10/30/18.
     * @return
     */
    private TotalesResg setTotalesResguardo() {

        String sql = "";
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        TotalesResg totales = new TotalesResg();

        try{

            MDocType doc = new MDocType(this.ctx, this.model.get_ValueAsInt("C_DocType_ID"), null);

            // Instancio configurador de CFE
            MZCFEConfig cfeConfig = (MZCFEConfig) this.configDocSend.getZ_CFE_Config();

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
            totales.setMntTotRetenido(Env.ZERO);
            totales.setCantLinDet(0);

            BigDecimal amtTotal = Env.ZERO;
            List<TotalesResg.RetencPercep> listRetPerc = totales.getRetencPercep();

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

                TotalesResg.RetencPercep retPerc = new TotalesResg.RetencPercep();

                // Contra-Resguardo, doy vuelta el signo.
                if (doc.getDocBaseType().equalsIgnoreCase("RGC")) {
                    montoSum = montoSum.negate();
                }

                retPerc.setCodRet(codigo);
                retPerc.setValRetPerc(montoSum);

                amtTotal = amtTotal.add(montoSum);
                listRetPerc.add(retPerc);
            }

            totales.setMntTotRetenido(amtTotal);
            totales.setCantLinDet(listRetPerc.size());

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
    private String setEncabezado_Resguardo(MZCFEConfigDocDGI docDGI, Emisor emisor, ReceptorResg receptor, TotalesResg totales) {

        String message = null;

        try{

            CFEDefType.EResg eResguardo = new CFEDefType.EResg();
            CFEDefType.EResg.Encabezado eResgEncabezado = new CFEDefType.EResg.Encabezado();
            this.defType.setEResg(eResguardo);
            eResguardo.setEncabezado(eResgEncabezado);

            eResguardo.setTmstFirma(null);

            IdDocResg idDoc = new IdDocResg();
            eResgEncabezado.setIdDoc(idDoc);
            idDoc.setTipoCFE(BigInteger.valueOf(Long.parseLong(docDGI.getCodigoDGI())));
            idDoc.setSerie(configDocSend.getDocumentSerie().trim());

            String cfeNumero = this.model.get_ValueAsString("DocumentNo").replaceAll("[^0-9]", "");
            cfeNumero = org.apache.commons.lang.StringUtils.leftPad(String.valueOf(cfeNumero), 7, "0");
            idDoc.setNro(new BigInteger(cfeNumero));

            this.defType.setVersion("1.0");

            // Sisteco no requiere emisor.
            //eFactEncabezado.setEmisor(emisor);

            eResgEncabezado.setReceptor(receptor);
            eResgEncabezado.setTotales(totales);

            GregorianCalendar gcal = (GregorianCalendar) GregorianCalendar.getInstance();
            gcal.setTime((Timestamp)this.model.get_Value("DateDoc"));
            XMLGregorianCalendar xgCalDateDoc = DatatypeFactory.newInstance().newXMLGregorianCalendarDate(gcal.get(Calendar.YEAR),
                    gcal.get(Calendar.MONTH)+1, gcal.get(Calendar.DAY_OF_MONTH), DatatypeConstants.FIELD_UNDEFINED);
            idDoc.setFchEmis(xgCalDateDoc);

            // ADENDA
            this.empresasType.setAdenda(this.model.get_ValueAsString("Description"));

            // Firma
            this.defType.getEResg().setTmstFirma(null);

        }
        catch (Exception e){
            throw new AdempiereException(e);
        }

        return message;
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

            this.defType.getEResg().setDetalle(new CFEDefType.EResg.Detalle());
            List<ItemResg> itemResgList = this.defType.getEResg().getDetalle().getItem();

            sql = " select a.amtbase, a.amtretencion, ret.codigodgi " +
                    "from z_resguardosocioret a " +
                    "inner join z_retencionsocio ret on a.z_retencionsocio_id = ret.z_retencionsocio_id " +
                    "where z_resguardosocio_id = " + model.get_ID();

        	pstmt = DB.prepareStatement(sql, model.get_TrxName());
        	rs = pstmt.executeQuery();

        	int contador = 0;

        	while(rs.next()){

        	    contador++;

                ItemResg itemResg = new ItemResg();

                itemResg.setNroLinDet(contador);

                // Contra-Resguardo
                if (docType.getDocBaseType().equalsIgnoreCase("RGC")) {
                    itemResg.setIndFact(BigInteger.valueOf(9));
                }

                List<RetPercResg> listRetPercs = itemResg.getRetencPercep();
                RetPercResg retPersc = new RetPercResg();
                listRetPercs.add(retPersc);

                retPersc.setCodRet(rs.getString("codigodgi"));
                retPersc.setMntSujetoaRet(rs.getBigDecimal("amtbase").setScale(2, RoundingMode.HALF_UP));
                retPersc.setValRetPerc(rs.getBigDecimal("amtretencion").setScale(2, RoundingMode.HALF_UP));

                itemResgList.add(itemResg);
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
     * Obtiene y retorna información del Receptor para comprobantes CFE del tipo eFactura.
     * Xpande. Created by Gabriel Vila on 10/30/18.
     * @return
     */
    private ReceptorFact setReceptor_eFactura() {

        ReceptorFact receptor = new ReceptorFact();

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


    /***
     * Obtiene y retorna información del Receptor para comprobantes CFE del tipo eTicket.
     * Xpande. Created by Gabriel Vila on 1/15/20.
     * @return
     */
    private ReceptorTck setReceptor_eTicket() {

        ReceptorTck receptor = new ReceptorTck();

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

            // Si es un cliente con identificación (NO ES OTROS)
            if (tipoIdentificacion != 4){

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

            MZCFEConfigDocDGI docDGI = (MZCFEConfigDocDGI) this.configDocSend.getZ_CFE_ConfigDocDGI();
            if ((docDGI == null) || (docDGI.get_ID() <= 0)){
                return "Falta indicar documento de DGI para configuración de envío de este documento - organización - proveedor de CFE";
            }

            // Obtengo datos del Emisor
            Emisor emisor = this.setEmisor(this.configDocSend.getAD_OrgTrx_ID());

            // Obtengo totales
            TotalesResg totales = this.setTotalesResguardo();

            // Obtengo datos del Receptor
            ReceptorResg receptor = this.setReceptor_Resguardo();

            // Obtengo deatos del encabezado
            message = this.setEncabezado_Resguardo(docDGI, emisor, receptor, totales);
            if (message != null) return message;

            // Obtengo datos de las lineas
            message = this.setDetalle_Resguardo();
            if (message != null) return message;

            // Referencia cuando es Contra-Resguardo
            message = this.setReferencia_Resguardo();
            if (message != null) return message;

            // Datos de CAE
            message = this.setCAE_Resguardo();
            if (message != null) return message;

        }
        catch (Exception e){
            throw new AdempiereException(e);
        }

        return message;

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

            // Documento
            MDocType docType = new MDocType(this.ctx, model.get_ValueAsInt("C_DocType_ID"), null);

            // Si no es Contra-Resguardo, no hago nada.
            if (!docType.getDocBaseType().equalsIgnoreCase("RGC")) {
                return null;
            }

            Referencia1 referencias = new Referencia1();
            Referencia1.Referencia referencia = new Referencia1.Referencia();
            referencias.getReferencia().add(referencia);

            referencia.setNroLinRef(1);

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

        	    referencia.setSerie(this.configDocSend.getDocumentSerie());
                referencia.setFechaCFEref(TS_to_XmlGregorianCalendar_OnlyDate(rs.getTimestamp("datedoc"), false));

                String documentNo = rs.getString("documentno");
                documentNo = documentNo.replaceAll("[^0-9]", ""); // Expresión regular para quitar todo lo que no es número
                documentNo = org.apache.commons.lang.StringUtils.leftPad(String.valueOf(documentNo), 7, "0");

                referencia.setNroCFERef(new BigInteger(documentNo));
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
     * Setea información de Receptor de un Resguardo electrónico.
     * Xpande. Created by Gabriel Vila on 11/15/18
     * @return
     */
    private ReceptorResg setReceptor_Resguardo() {

        ReceptorResg receptor = new ReceptorResg();

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
    protected String
    send(MZCFEVendorOrg vendorOrg, int cDocType, String documentNo) throws Exception {

        String message = null;

        try {

            File file = File.createTempFile("SistecoXMLCFE", ".xml");
            file.deleteOnExit();
            JAXBContext jaxbContext = JAXBContext.newInstance(CFEEmpresasType.class);

            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(this.empresasType, file);

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String linea;
            String xml = "";
            while((linea=br.readLine())!=null) {
                xml += linea + "\n";
            }

            xml = xml
                    .replace("<CFE version=\"1.0\" xmlns:ns0=\"http://cfe.dgi.gub.uy\">", "<ns0:CFE version=\"1.0\">")
                    .replace("<CFE xmlns:ns0=\"http://cfe.dgi.gub.uy\" version=\"1.0\">", "<ns0:CFE version=\"1.0\">")
                    .replace("</CFE>","</ns0:CFE>")
                    .replace("<CFE_Adenda ", "<ns0:CFE_Adenda xmlns:ns0=\"http://cfe.dgi.gub.uy\"")
                    .replace("</CFE_Adenda>", "</ns0:CFE_Adenda>")
                    .replace(" xmlns:ns0=\"http://cfe.dgi.gub.uy\"xmlns:ns2=\"http://www.w3.org/2000/09/xmldsig#\"", " xmlns:ns0=\"http://cfe.dgi.gub.uy\" xmlns:ns2=\"http://www.w3.org/2000/09/xmldsig#\"")
                    .replace(" xmlns:ns0=\"http://cfe.dgi.gub.uy\"xmlns:ns2=\"http://www.w3.org/2001/04/xmlenc#\"", " xmlns:ns0=\"http://cfe.dgi.gub.uy\" xmlns:ns2=\"http://www.w3.org/2001/04/xmldsig#\"")
                    .replace("<Adenda", "<ns0:Adenda")
                    .replace("</Adenda>", "</ns0:Adenda>");

            PrintWriter pw = new PrintWriter(file);
            pw.println(xml);
            pw.close();

            Service service = new Service();

            Call call = (Call) service.createCall();
            call.setTargetEndpointAddress(new java.net.URL(vendorOrg.getTargetEndpointAddress()));
            call.setOperationName(new QName(vendorOrg.getnamespaceURL(), vendorOrg.getOperationName()));
            call.setSOAPActionURI(vendorOrg.getSOAPActionURI());
            call.addParameter(new QName("entrada"), XMLType.XSD_STRING, ParameterMode.IN);
            call.setReturnType(XMLType.XSD_STRING);

            String result = (String) call.invoke(vendorOrg.getnamespaceURL(), vendorOrg.getOperationName(), new Object[] { "<![CDATA[" + xml + "]]>" });

            result = result.replaceAll("^<!\\[CDATA\\[", "").replaceAll("]]>$", "");

            // Guardo la respuesta del proveedor de CFE
            File response = File.createTempFile("SistecoXMLCFEResponse", ".xml");
            response.deleteOnExit();
            FileWriter fichero = new FileWriter(response);
            PrintWriter pwResponse = new PrintWriter(fichero);
            pwResponse.print(result);
            pwResponse.close();

            SistecoResponseDTO cfeDtoSisteco = SistecoConvertResponse.getObjSistecoResponseDTO(result);

            // Si la respuesta contiene errores, lanzo una excepci�n
            if (cfeDtoSisteco.getStatus() != 0) {
                throw new AdempiereException("Error al enviar CFE : " + cfeDtoSisteco.getDescripcion());
            }


            MZCFERespuestaProvider cfeRespuesta = new MZCFERespuestaProvider(this.ctx, 0, this.trxName);
            cfeRespuesta.setAD_Table_ID(this.model.get_Table_ID());
            cfeRespuesta.setRecord_ID(this.model.get_ID());
            cfeRespuesta.setC_DocType_ID(cDocType);
            cfeRespuesta.setDocumentNoRef(documentNo);
            cfeRespuesta.setCFE_Status(String.valueOf(cfeDtoSisteco.getStatus()));
            cfeRespuesta.setCFE_Descripcion(cfeDtoSisteco.getDescripcion());
            if (cfeRespuesta.getCFE_Status().equalsIgnoreCase("0")){
                cfeRespuesta.setCFE_Tipo(BigDecimal.valueOf(cfeDtoSisteco.getTipoCFE()));
                cfeRespuesta.setCFE_Serie(cfeDtoSisteco.getSerie());
                cfeRespuesta.setCFE_Numero(cfeDtoSisteco.getMro());
                cfeRespuesta.setCFE_DigitoVerificador(cfeDtoSisteco.getDigestValue());
                cfeRespuesta.setCFE_Resolucion(String.valueOf(cfeDtoSisteco.getResolucion()));
                cfeRespuesta.setCFE_AnioResolucion(cfeDtoSisteco.getAnioResolucion());
                cfeRespuesta.setCFE_URL_DGI(cfeDtoSisteco.getUrlDocumentoDGI());
                cfeRespuesta.setCFE_CAE_ID(cfeDtoSisteco.getCaeId());
                cfeRespuesta.setCFE_NroInicial_CAE(cfeDtoSisteco.getdNro());
                cfeRespuesta.setCFE_NroFinal_CAE(cfeDtoSisteco.gethNro());
                cfeRespuesta.setAD_OrgTrx_ID(this.model.getAD_Org_ID());
                //cfeRespuesta.setCFE_Vencimiento_CAE(cfeDtoSisteco.getFecVenc());
                cfeRespuesta.setZ_CFE_Vendor_ID(this.configDocSend.getZ_CFE_Vendor_ID());
            }
            cfeRespuesta.saveEx();

        }
        catch (Exception e) {
            throw new AdempiereException(e);
        }


        return message;
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
            emisor.setCdgDGISucur(BigInteger.valueOf(1)); // 1 - Covadonga, 2 - Planeta.

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

            MInvoice invoice = (MInvoice) this.model;

            CFEDefType.EFact eFactura = new CFEDefType.EFact();
            CFEDefType.EFact.Encabezado eFactEncabezado = new CFEDefType.EFact.Encabezado();
            this.defType.setEFact(eFactura);
            eFactura.setEncabezado(eFactEncabezado);

            eFactura.setTmstFirma(TS_to_XmlGregorianCalendar_OnlyDate(invoice.getDateInvoiced(), true));
            eFactura.setTmstFirma(null);


            IdDocFact idDoc = new IdDocFact();
            eFactEncabezado.setIdDoc(idDoc);
            idDoc.setTipoCFE(BigInteger.valueOf(Long.parseLong(docDGI.getCodigoDGI())));
            idDoc.setSerie(configDocSend.getDocumentSerie().trim());

            String cfeNumero = this.model.get_ValueAsString("DocumentNo").replaceAll("[^0-9]", "");
            cfeNumero = org.apache.commons.lang.StringUtils.leftPad(String.valueOf(cfeNumero), 7, "0");
            idDoc.setNro(new BigInteger(cfeNumero));

            this.defType.setVersion("1.0");

            // Sisteco no requiere emisor.
            //eFactEncabezado.setEmisor(emisor);

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

            Timestamp dueDate = ProcesadorCFE.getPaymentTermDueDate(this.ctx, invoice.getC_PaymentTerm_ID(), invoice.getDateInvoiced(), null);
            if (dueDate != null) {
                GregorianCalendar gcalDue = (GregorianCalendar) GregorianCalendar.getInstance();
                gcalDue.setTime(dueDate);
                XMLGregorianCalendar xgCalDueDate = DatatypeFactory.newInstance().newXMLGregorianCalendarDate(gcalDue.get(Calendar.YEAR),
                        gcalDue.get(Calendar.MONTH)+1, gcalDue.get(Calendar.DAY_OF_MONTH),
                        DatatypeConstants.FIELD_UNDEFINED);
                idDoc.setFchVenc(xgCalDueDate);
            }

            // ADENDA
            this.empresasType.setAdenda(invoice.getDescription());

            // Firma
            this.defType.getEFact().setTmstFirma(null);

        }
        catch (Exception e){
            throw new AdempiereException(e);
        }

        return message;
    }

    private String setEncabezado_eTicket(MZCFEConfigDocDGI docDGI, Emisor emisor, ReceptorTck receptor, Totales totales) {

        String message = null;

        try{

            MInvoice invoice = (MInvoice) this.model;

            CFEDefType.ETck eTicket = new CFEDefType.ETck();
            CFEDefType.ETck.Encabezado eTicketEncabezado = new CFEDefType.ETck.Encabezado();
            this.defType.setETck(eTicket);
            eTicket.setEncabezado(eTicketEncabezado);

            eTicket.setTmstFirma(TS_to_XmlGregorianCalendar_OnlyDate(invoice.getDateInvoiced(), true));
            eTicket.setTmstFirma(null);

            IdDocTck idDoc = new IdDocTck();

            eTicketEncabezado.setIdDoc(idDoc);
            idDoc.setTipoCFE(BigInteger.valueOf(Long.parseLong(docDGI.getCodigoDGI())));
            idDoc.setSerie(configDocSend.getDocumentSerie().trim());

            String cfeNumero = this.model.get_ValueAsString("DocumentNo").replaceAll("[^0-9]", "");
            cfeNumero = org.apache.commons.lang.StringUtils.leftPad(String.valueOf(cfeNumero), 7, "0");
            idDoc.setNro(new BigInteger(cfeNumero));

            this.defType.setVersion("1.0");

            // Sisteco no requiere emisor.
            //eFactEncabezado.setEmisor(emisor);

            eTicketEncabezado.setReceptor(receptor);
            eTicketEncabezado.setTotales(totales);

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

            Timestamp dueDate = ProcesadorCFE.getPaymentTermDueDate(this.ctx, invoice.getC_PaymentTerm_ID(), invoice.getDateInvoiced(), null);
            if (dueDate != null) {
                GregorianCalendar gcalDue = (GregorianCalendar) GregorianCalendar.getInstance();
                gcalDue.setTime(dueDate);
                XMLGregorianCalendar xgCalDueDate = DatatypeFactory.newInstance().newXMLGregorianCalendarDate(gcalDue.get(Calendar.YEAR),
                        gcalDue.get(Calendar.MONTH)+1, gcalDue.get(Calendar.DAY_OF_MONTH),
                        DatatypeConstants.FIELD_UNDEFINED);
                idDoc.setFchVenc(xgCalDueDate);
            }

            // ADENDA
            this.empresasType.setAdenda(invoice.getDescription());

            // Firma
            this.defType.getETck().setTmstFirma(null);

        }
        catch (Exception e){
            throw new AdempiereException(e);
        }

        return message;
    }


    private XMLGregorianCalendar TS_to_XmlGregorianCalendar_OnlyDate(Timestamp timestamp, boolean withTime) {
        try {
            GregorianCalendar cal = (GregorianCalendar) GregorianCalendar.getInstance();
            cal.setTime(timestamp);
            XMLGregorianCalendar xgcal;
            if (!withTime){
                xgcal = DatatypeFactory.newInstance().newXMLGregorianCalendarDate(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DAY_OF_MONTH), DatatypeConstants.FIELD_UNDEFINED);
            } else {
                xgcal = DatatypeFactory.newInstance().newXMLGregorianCalendarDate(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DAY_OF_MONTH), DatatypeConstants.FIELD_UNDEFINED );
                xgcal.setHour(cal.get(Calendar.HOUR_OF_DAY));
                xgcal.setMinute(cal.get(Calendar.MINUTE));
                xgcal.setSecond(cal.get(Calendar.SECOND));
                xgcal.setMillisecond(cal.get(Calendar.MILLISECOND));
                xgcal.setTimezone(-3*60); // GTM -3 en minutos

            }
            return xgcal;
        } catch (DatatypeConfigurationException e) {
            throw new AdempiereException(e);
        }
    }

}
