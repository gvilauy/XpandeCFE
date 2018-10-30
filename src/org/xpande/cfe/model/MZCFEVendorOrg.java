package org.xpande.cfe.model;

import java.sql.ResultSet;
import java.util.Properties;

/**
 * Modelo para detalle de organizaciones que pertenecen a un determinado proveedor de CFE y sus atributos.
 * Product: Adempiere ERP & CRM Smart Business Solution. Localization : Uruguay - Xpande
 * Xpande. Created by Gabriel Vila on 10/29/18.
 */
public class MZCFEVendorOrg extends X_Z_CFE_VendorOrg {

    public MZCFEVendorOrg(Properties ctx, int Z_CFE_VendorOrg_ID, String trxName) {
        super(ctx, Z_CFE_VendorOrg_ID, trxName);
    }

    public MZCFEVendorOrg(Properties ctx, ResultSet rs, String trxName) {
        super(ctx, rs, trxName);
    }
}
