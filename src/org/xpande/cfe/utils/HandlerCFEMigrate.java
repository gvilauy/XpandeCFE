package org.xpande.cfe.utils;

import org.compiere.model.PO;
import org.xpande.cfe.model.MZCFEConfigDocSend;
import org.xpande.cfe.model.MZCFEVendorOrg;

import java.util.Properties;

/**
 * Product: Adempiere ERP & CRM Smart Business Solution. Localization : Uruguay - Xpande
 * Xpande. Created by Gabriel Vila on 10/30/18.
 */
public class HandlerCFEMigrate extends HandlerCFE {

    public HandlerCFEMigrate(Properties ctx, PO model, String trxName, MZCFEConfigDocSend configDocSend) {
        super(ctx, model, trxName, configDocSend);
    }

    @Override
    protected String executeInvoice() throws Exception {
        return null;
    }

    @Override
    protected String executeResguardo() throws Exception {
        return null;
    }

    @Override
    protected String executeInOut() throws Exception {
        return null;
    }

    @Override
    protected String send(MZCFEVendorOrg vendorOrg) throws Exception {
        return null;
    }
}
