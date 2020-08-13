package org.xpande.cfe.model;

import java.sql.ResultSet;
import java.util.Properties;

/**
 * Product: Adempiere ERP & CRM Smart Business Solution. Localization : Uruguay - Xpande
 * Xpande. Created by Gabriel Vila on 8/13/20.
 */
public class MZBandejaCFECAE extends X_Z_BandejaCFECAE {

    public MZBandejaCFECAE(Properties ctx, int Z_BandejaCFECAE_ID, String trxName) {
        super(ctx, Z_BandejaCFECAE_ID, trxName);
    }

    public MZBandejaCFECAE(Properties ctx, ResultSet rs, String trxName) {
        super(ctx, rs, trxName);
    }
}
