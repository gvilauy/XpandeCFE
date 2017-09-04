package org.xpande.cfe.model;

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
}
