package org.xpande.cfe.utils;

import org.adempiere.exceptions.AdempiereException;
import org.compiere.model.MDocType;
import org.compiere.model.MInOut;
import org.compiere.model.MInvoice;
import org.compiere.model.PO;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.xpande.cfe.model.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;

/**
 * Clase para el proceso de facturación electrónica.
 * Product: Adempiere ERP & CRM Smart Business Solution. Localization : Uruguay - Xpande
 * Xpande. Created by Gabriel Vila on 10/30/18.
 */
public class ProcesadorCFE {

    private Properties ctx = null;
    private String trxName = null;
    private MZCFEConfig cfeConfig = null;

    /***
     * Constructor
     * @param ctx
     * @param trxName
     */
    public ProcesadorCFE(Properties ctx, String trxName) {
        this.ctx = ctx;
        this.trxName = trxName;
    }


    /***
     * Ejecuta proceso de genración y armado de modelos de CFE, y luego el envío a DGI.
     * Xpande. Created by Gabriel Vila on 10/30/18.
     * @param model
     * @param adOrgID
     * @param cDocTypeID
     * @return
     */
    public String executeCFE(PO model, int adOrgID, int cDocTypeID){

        String message = null;

        try{

            MDocType docType = new MDocType(this.ctx, cDocTypeID, null);

            // Instancio modelo para configuracion CFE activo. Si no tengo o no esta activo, no hago nada.
            this.cfeConfig = MZCFEConfig.getDefault(this.ctx, null);
            if ((this.cfeConfig == null) || (this.cfeConfig.get_ID() <= 0)){
                return null;
            }

            // Obtengo configuracion de envío de CFE para este documento, si no tengo no hago nada.
            MZCFEConfigDocSend configDocSend = this.cfeConfig.getConfigDocumentoCFE(adOrgID, docType.get_ID());
            if ((configDocSend == null) || (configDocSend.get_ID() <= 0)){
                return null;
            }

            MZCFEVendor cfeVendor = (MZCFEVendor) configDocSend.getZ_CFE_Vendor();
            if ((cfeVendor == null) || (cfeVendor.get_ID() <= 0)){
                return null;
            }

            // Manejador de CFE según proveedor.
            HandlerCFE handlerCFE = null;

            if (cfeVendor.getValue().equalsIgnoreCase("SISTECO")){
                handlerCFE = new HandlerCFESisteco(this.ctx, model, this.trxName, configDocSend);
            }
            else if (cfeVendor.getValue().equalsIgnoreCase("MIGRATE")){
                handlerCFE = new HandlerCFEMigrate(this.ctx, model, this.trxName, configDocSend);
            }

            // Según tipo de entidad, construyo modelos de CFE en el manejador.
            if (configDocSend.getTipoEntidadCFE().equalsIgnoreCase(X_Z_CFE_ConfigDocSend.TIPOENTIDADCFE_INVOICE)){
                message = handlerCFE.executeInvoice();
            }
            else if (configDocSend.getTipoEntidadCFE().equalsIgnoreCase(X_Z_CFE_ConfigDocSend.TIPOENTIDADCFE_INOUT)){
                message = handlerCFE.executeInOut();
            }
            else if (configDocSend.getTipoEntidadCFE().equalsIgnoreCase(X_Z_CFE_ConfigDocSend.TIPOENTIDADCFE_RESGUARDO)){
                message = handlerCFE.executeResguardo();
            }

            if (message != null) return message;

            // Instancia modelo de configuración para organización y proveedor de pos.
            MZCFEVendorOrg vendorOrg = cfeVendor.getOrgConfig(adOrgID);
            if ((vendorOrg == null) || (vendorOrg.get_ID() <= 0)){
                return "Falta Configuración de Organización para el Proveedor de CFE";
            }

            // Envía CFE segun modelos generados previamente
            message = handlerCFE.send(vendorOrg, cDocTypeID, model.get_ValueAsString("DocumentNo"));
            if (message != null) return message;

        }
        catch (Exception e){
            throw new AdempiereException(e);
        }

        return message;
    }


    /***
     * Metodo que obtiene y retorna fecha de vencimiento según termino de pago y fecha de documento.
     * Xpande. Created by Gabriel Vila on 11/22/18
     * @param ctx
     * @param paymentTermID
     * @param docDate
     * @param trxName
     * @return
     */
    public static Timestamp getPaymentTermDueDate(Properties ctx, int paymentTermID, Timestamp docDate, String trxName){

        Timestamp dueDate = docDate;

        String sql = "";
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try{
            sql = " select paymenttermduedate(" + paymentTermID + ",?)" ;

        	pstmt = DB.prepareStatement(sql, trxName);
        	pstmt.setTimestamp(1, docDate);
        	rs = pstmt.executeQuery();

        	if(rs.next()){
                dueDate = rs.getTimestamp(1);
        	}
        }
        catch (Exception e){
            throw new AdempiereException(e);
        }
        finally {
            DB.close(rs, pstmt);
        	rs = null; pstmt = null;
        }

        return dueDate;

    }

}
