package org.xpande.cfe.model;

import java.sql.ResultSet;
import java.util.Properties;

/**
 * Modelo para proveedores de CFE.
 * Product: Adempiere ERP & CRM Smart Business Solution. Localization : Uruguay - Xpande
 * Xpande. Created by Gabriel Vila on 10/29/18.
 */
public class MZCFEVendor extends X_Z_CFE_Vendor {

    public MZCFEVendor(Properties ctx, int Z_CFE_Vendor_ID, String trxName) {
        super(ctx, Z_CFE_Vendor_ID, trxName);
    }

    public MZCFEVendor(Properties ctx, ResultSet rs, String trxName) {
        super(ctx, rs, trxName);
    }
}
