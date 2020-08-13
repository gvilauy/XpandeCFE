package org.xpande.cfe.model;

import java.sql.ResultSet;
import java.util.Properties;

/**
 * Product: Adempiere ERP & CRM Smart Business Solution. Localization : Uruguay - Xpande
 * Xpande. Created by Gabriel Vila on 8/13/20.
 */
public class MZRetencPercepCFE extends X_Z_RetencPercepCFE {

    public MZRetencPercepCFE(Properties ctx, int Z_RetencPercepCFE_ID, String trxName) {
        super(ctx, Z_RetencPercepCFE_ID, trxName);
    }

    public MZRetencPercepCFE(Properties ctx, ResultSet rs, String trxName) {
        super(ctx, rs, trxName);
    }
}
