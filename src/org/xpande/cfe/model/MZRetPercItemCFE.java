package org.xpande.cfe.model;

import java.sql.ResultSet;
import java.util.Properties;

/**
 * Product: Adempiere ERP & CRM Smart Business Solution. Localization : Uruguay - Xpande
 * Xpande. Created by Gabriel Vila on 8/13/20.
 */
public class MZRetPercItemCFE extends X_Z_RetPercItemCFE {

    public MZRetPercItemCFE(Properties ctx, int Z_RetPercItemCFE_ID, String trxName) {
        super(ctx, Z_RetPercItemCFE_ID, trxName);
    }

    public MZRetPercItemCFE(Properties ctx, ResultSet rs, String trxName) {
        super(ctx, rs, trxName);
    }
}
