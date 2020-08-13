package org.xpande.cfe.model;

import java.sql.ResultSet;
import java.util.Properties;

/**
 * Modelo para cabezal de CFE recibido
 * Product: Adempiere ERP & CRM Smart Business Solution. Localization : Uruguay - Xpande
 * Xpande. Created by Gabriel Vila on 8/13/20.
 */
public class MZBandejaCFE extends X_Z_BandejaCFE {

    public MZBandejaCFE(Properties ctx, int Z_BandejaCFE_ID, String trxName) {
        super(ctx, Z_BandejaCFE_ID, trxName);
    }

    public MZBandejaCFE(Properties ctx, ResultSet rs, String trxName) {
        super(ctx, rs, trxName);
    }
}
