package org.xpande.cfe.utils;

import org.compiere.model.PO;
import org.xpande.cfe.model.MZCFEConfigDocSend;
import org.xpande.cfe.model.MZCFEVendorOrg;

import java.util.Properties;

/**
 * Product: Adempiere ERP & CRM Smart Business Solution. Localization : Uruguay - Xpande
 * Xpande. Created by Gabriel Vila on 10/30/18.
 */
public abstract class HandlerCFE {

    protected Properties ctx = null;
    protected String trxName = null;
    protected PO model = null;
    protected MZCFEConfigDocSend configDocSend = null;

    public HandlerCFE(Properties ctx, PO model, String trxName, MZCFEConfigDocSend configDocSend) {
        this.ctx = ctx;
        this.trxName = trxName;
        this.model = model;
        this.configDocSend = configDocSend;
    }

    abstract protected String executeInvoice() throws Exception;
    abstract protected String executeResguardo() throws Exception;
    abstract protected String executeInOut() throws Exception;
    abstract protected String send(MZCFEVendorOrg vendorOrg) throws Exception;

}
