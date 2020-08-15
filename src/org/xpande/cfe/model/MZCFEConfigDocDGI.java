package org.xpande.cfe.model;

import org.compiere.model.Query;

import java.sql.ResultSet;
import java.util.Properties;

/**
 * Modelo de tipo de comprobante electrónico de Impositiva.
 * Product: Adempiere ERP & CRM Smart Business Solution. Localization : Uruguay - Xpande
 * Xpande. Created by Gabriel Vila on 9/4/17.
 */
public class MZCFEConfigDocDGI extends X_Z_CFE_ConfigDocDGI {

    public MZCFEConfigDocDGI(Properties ctx, int Z_CFE_ConfigDocDGI_ID, String trxName) {
        super(ctx, Z_CFE_ConfigDocDGI_ID, trxName);
    }

    public MZCFEConfigDocDGI(Properties ctx, ResultSet rs, String trxName) {
        super(ctx, rs, trxName);
    }


    /***
     * Obtiene y retorna modelo según código de DGI recibido.
     * Xpande. Created by Gabriel Vila on 8/14/20.
     * @param ctx
     * @param codigoDGI
     * @param trxName
     * @return
     */
    public static MZCFEConfigDocDGI getByCodigoDGI(Properties ctx, String codigoDGI, String trxName){

        String whereClause = X_Z_CFE_ConfigDocDGI.COLUMNNAME_CodigoDGI + " ='" + codigoDGI + "'";

        MZCFEConfigDocDGI model = new Query(ctx, I_Z_CFE_ConfigDocDGI.Table_Name, whereClause, trxName).first();

        return model;
    }

}
