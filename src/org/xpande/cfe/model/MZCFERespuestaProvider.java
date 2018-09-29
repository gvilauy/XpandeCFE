package org.xpande.cfe.model;

import java.sql.ResultSet;
import java.util.Properties;

/**
 * Modelo de respuesta de envío de CFE
 * Product: Adempiere ERP & CRM Smart Business Solution. Localization : Uruguay - Xpande
 * Xpande. Created by Gabriel Vila on 8/2/17.
 */
public class MZCFERespuestaProvider extends X_Z_CFE_RespuestaProvider {

    public MZCFERespuestaProvider(Properties ctx, int Z_CFE_RespuestaProvider_ID, String trxName) {
        super(ctx, Z_CFE_RespuestaProvider_ID, trxName);
    }

    public MZCFERespuestaProvider(Properties ctx, ResultSet rs, String trxName) {
        super(ctx, rs, trxName);
    }
}
