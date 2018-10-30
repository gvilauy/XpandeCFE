package org.xpande.cfe.model;

import org.compiere.model.Query;

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

    /***
     * Obtiene y retorna modelo de configuración para este proveedor de CFE y una determinada organización.
     * Xpande. Created by Gabriel Vila on 10/30/18.
     * @param adOrgID
     * @return
     */
    public MZCFEVendorOrg getOrgConfig(int adOrgID) {

        String whereClause = X_Z_CFE_VendorOrg.COLUMNNAME_Z_CFE_Vendor_ID + " =" + this.get_ID() +
                " AND " + X_Z_CFE_VendorOrg.COLUMNNAME_AD_OrgTrx_ID + " =" + adOrgID;

        MZCFEVendorOrg model = new Query(getCtx(), I_Z_CFE_VendorOrg.Table_Name, whereClause, get_TrxName()).setOnlyActiveRecords(true).first();

        return model;
    }

}
