package org.xpande.cfe.model;

import java.sql.ResultSet;
import java.util.Properties;

/**
 * Modelo para emails no procesados en el proceso de Bandeja CFE.
 * Product: Adempiere ERP & CRM Smart Business Solution. Localization : Uruguay - Xpande
 * Xpande. Created by Gabriel Vila on 8/16/20.
 */
public class MZBandejaCFEError extends X_Z_BandejaCFEError {

    public MZBandejaCFEError(Properties ctx, int Z_BandejaCFEError_ID, String trxName) {
        super(ctx, Z_BandejaCFEError_ID, trxName);
    }

    public MZBandejaCFEError(Properties ctx, ResultSet rs, String trxName) {
        super(ctx, rs, trxName);
    }
}
