package org.xpande.cfe.model;

import org.compiere.model.Query;

import java.sql.ResultSet;
import java.util.Properties;

/**
 * Modelo para configuracion de CFE
 * Product: Adempiere ERP & CRM Smart Business Solution. Localization : Uruguay - Xpande
 * Xpande. Created by Gabriel Vila on 9/4/17.
 */
public class MZCFEConfig extends X_Z_CFE_Config {

    public MZCFEConfig(Properties ctx, int Z_CFE_Config_ID, String trxName) {
        super(ctx, Z_CFE_Config_ID, trxName);
    }

    public MZCFEConfig(Properties ctx, ResultSet rs, String trxName) {
        super(ctx, rs, trxName);
    }


    /***
     * Obtiene modelo único de configuración de CFE.
     * Xpande. Created by Gabriel Vila on 9/4/17.
     * @param ctx
     * @param trxName
     * @return
     */
    public static MZCFEConfig getDefault(Properties ctx, String trxName){

        MZCFEConfig model = new Query(ctx, I_Z_CFE_Config.Table_Name, "", trxName).first();

        return model;
    }

}
