package org.xpande.cfe.model;

import org.compiere.model.Query;

import java.sql.ResultSet;
import java.util.Properties;

/**
 * Modelo de documento del sistema que se envía a Impositiva.
 * Product: Adempiere ERP & CRM Smart Business Solution. Localization : Uruguay - Xpande
 * Xpande. Created by Gabriel Vila on 9/4/17.
 */
public class MZCFEConfigDocSend extends X_Z_CFE_ConfigDocSend {

    public MZCFEConfigDocSend(Properties ctx, int Z_CFE_ConfigDocSend_ID, String trxName) {
        super(ctx, Z_CFE_ConfigDocSend_ID, trxName);
    }

    public MZCFEConfigDocSend(Properties ctx, ResultSet rs, String trxName) {
        super(ctx, rs, trxName);
    }


    /***
     * Obtiene y retorna modelo segun config de doc. dgi y organización recibidos.
     * Xpande. Created by Gabriel Vila on 8/14/20.
     * @param ctx
     * @param cfeConfigDocDgiID
     * @param adOrgID
     * @param trxName
     * @return
     */
    public static MZCFEConfigDocSend getByDgiOrg(Properties ctx, int cfeConfigDocDgiID, int adOrgID, String trxName){

        String whereClause = X_Z_CFE_ConfigDocSend.COLUMNNAME_Z_CFE_ConfigDocDGI_ID + " =" + cfeConfigDocDgiID +
                " AND " + X_Z_CFE_ConfigDocSend.COLUMNNAME_AD_OrgTrx_ID + " =" + adOrgID;

        MZCFEConfigDocSend model = new Query(ctx, I_Z_CFE_ConfigDocSend.Table_Name, whereClause, trxName).first();

        return model;
    }

}
