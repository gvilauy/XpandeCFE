package org.xpande.cfe.model;

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
}
