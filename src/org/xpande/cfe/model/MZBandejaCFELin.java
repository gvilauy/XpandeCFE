package org.xpande.cfe.model;

import java.sql.ResultSet;
import java.util.Properties;

/**
 * Modelo para linea de comprobante redibido en CFE.
 * Product: Adempiere ERP & CRM Smart Business Solution. Localization : Uruguay - Xpande
 * Xpande. Created by Gabriel Vila on 8/13/20.
 */
public class MZBandejaCFELin extends X_Z_BandejaCFELin {

    public MZBandejaCFELin(Properties ctx, int Z_BandejaCFELin_ID, String trxName) {
        super(ctx, Z_BandejaCFELin_ID, trxName);
    }

    public MZBandejaCFELin(Properties ctx, ResultSet rs, String trxName) {
        super(ctx, rs, trxName);
    }
}
