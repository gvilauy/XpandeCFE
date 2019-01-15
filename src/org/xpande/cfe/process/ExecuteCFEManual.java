package org.xpande.cfe.process;

import org.adempiere.exceptions.AdempiereException;
import org.compiere.acct.Doc;
import org.compiere.acct.Doc_DDOrder;
import org.compiere.model.*;
import org.compiere.process.DocAction;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.xpande.cfe.utils.ProcesadorCFE;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Proceso para enviar manualmente un CFE para una determinada Invoice o Remito.
 * Product: Adempiere ERP & CRM Smart Business Solution. Localization : Uruguay - Xpande
 * Xpande. Created by Gabriel Vila on 1/15/19.
 */
public class ExecuteCFEManual extends SvrProcess {

    private int adOrgID = 0;
    private int cDocTypeID = 0;
    private String documentNoRef = "";

    @Override
    protected void prepare() {

        ProcessInfoParameter[] para = getParameter();

        for (int i = 0; i < para.length; i++){

            String name = para[i].getParameterName();

            if (name != null){
                if (para[i].getParameter() != null){
                    if (name.trim().equalsIgnoreCase("AD_Org_ID")){
                        this.adOrgID = ((BigDecimal)para[i].getParameter()).intValueExact();
                    }
                    else if (name.trim().equalsIgnoreCase("C_DocType_ID")){
                        this.cDocTypeID = ((BigDecimal)para[i].getParameter()).intValueExact();
                    }
                    else if (name.trim().equalsIgnoreCase("DocumentNoRef")){
                        this.documentNoRef = para[i].getParameter().toString().trim();
                    }
                }
            }
        }
    }

    @Override
    protected String doIt() throws Exception {

        MInvoice invoice = null;
        MInOut inOut = null;

        String message = null;

        try{

            MDocType docType = new MDocType(getCtx(), this.cDocTypeID, get_TrxName());
            if ((docType.getDocBaseType().equalsIgnoreCase(Doc.DOCTYPE_ARInvoice)) || (docType.getDocBaseType().equalsIgnoreCase(Doc.DOCTYPE_ARCredit))){

                String whereClause = X_C_Invoice.COLUMNNAME_AD_Org_ID + " =" + this.adOrgID +
                        " AND " + X_C_Invoice.COLUMNNAME_C_DocTypeTarget_ID + " =" + this.cDocTypeID +
                        " AND " + X_C_Invoice.COLUMNNAME_DocumentNo + " ='" + this.documentNoRef + "' " +
                        " AND " + X_C_Invoice.COLUMNNAME_DocStatus + " ='CO' " +
                        " AND " + X_C_Invoice.COLUMNNAME_IsSOTrx + " ='Y' ";

                int [] invoiceIDs = MInvoice.getAllIDs(I_C_Invoice.Table_Name, whereClause, get_TrxName());
                if (invoiceIDs.length <= 0){
                    return "@Error@ " + "No se obtuvo documento con ese número para procesar.";
                }
                invoice = new MInvoice(getCtx(), invoiceIDs[0], get_TrxName());

                ProcesadorCFE procesadorCFE = new ProcesadorCFE(getCtx(), get_TrxName());
                message = procesadorCFE.executeCFE(invoice, invoice.getAD_Org_ID(), invoice.getC_DocTypeTarget_ID());
                if (message != null){
                    return "@Error@ " + message;
                }

            }
            else if (docType.getDocBaseType().equalsIgnoreCase(Doc_DDOrder.DOCTYPE_MatShipment)){

                String whereClause = X_M_InOut.COLUMNNAME_AD_Org_ID + " =" + this.adOrgID +
                        " AND " + X_M_InOut.COLUMNNAME_C_DocType_ID + " =" + this.cDocTypeID +
                        " AND " + X_M_InOut.COLUMNNAME_DocumentNo + " ='" + this.documentNoRef + "' " +
                        " AND " + X_M_InOut.COLUMNNAME_DocStatus + " ='CO' " +
                        " AND " + X_M_InOut.COLUMNNAME_IsSOTrx + " ='Y' ";

                int [] inOutIDs = MInOut.getAllIDs(I_M_InOut.Table_Name, whereClause, get_TrxName());
                if (inOutIDs.length <= 0){
                    return "@Error@ " + "No se obtuvo documento con ese número para procesar.";
                }
                inOut = new MInOut(getCtx(), inOutIDs[0], get_TrxName());

                ProcesadorCFE procesadorCFE = new ProcesadorCFE(getCtx(), get_TrxName());
                message = procesadorCFE.executeCFE(inOut, inOut.getAD_Org_ID(), inOut.getC_DocType_ID());
                if (message != null){
                    return "@Error@ " + message;
                }
            }

        }
        catch (Exception e){
            throw new AdempiereException(e);
        }

        return "OK.";
    }
}
