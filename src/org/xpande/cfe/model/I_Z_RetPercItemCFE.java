/******************************************************************************
 * Product: ADempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 2006-2017 ADempiere Foundation, All Rights Reserved.         *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * or (at your option) any later version.										*
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * or via info@adempiere.net or http://www.adempiere.net/license.html         *
 *****************************************************************************/
package org.xpande.cfe.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for Z_RetPercItemCFE
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0
 */
public interface I_Z_RetPercItemCFE 
{

    /** TableName=Z_RetPercItemCFE */
    public static final String Table_Name = "Z_RetPercItemCFE";

    /** AD_Table_ID=1000370 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within client
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name CodRetCFE */
    public static final String COLUMNNAME_CodRetCFE = "CodRetCFE";

	/** Set CodRetCFE.
	  * Codigo de retención para CFE
	  */
	public void setCodRetCFE (String CodRetCFE);

	/** Get CodRetCFE.
	  * Codigo de retención para CFE
	  */
	public String getCodRetCFE();

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name InfoAdicionalRet */
    public static final String COLUMNNAME_InfoAdicionalRet = "InfoAdicionalRet";

	/** Set InfoAdicionalRet.
	  * Información adicional de la retención en CFE
	  */
	public void setInfoAdicionalRet (String InfoAdicionalRet);

	/** Get InfoAdicionalRet.
	  * Información adicional de la retención en CFE
	  */
	public String getInfoAdicionalRet();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name MntSujetoaRet */
    public static final String COLUMNNAME_MntSujetoaRet = "MntSujetoaRet";

	/** Set MntSujetoaRet.
	  * Monto sujeto a retención en CFE
	  */
	public void setMntSujetoaRet (BigDecimal MntSujetoaRet);

	/** Get MntSujetoaRet.
	  * Monto sujeto a retención en CFE
	  */
	public BigDecimal getMntSujetoaRet();

    /** Column name Rate */
    public static final String COLUMNNAME_Rate = "Rate";

	/** Set Rate.
	  * Rate or Tax or Exchange
	  */
	public void setRate (BigDecimal Rate);

	/** Get Rate.
	  * Rate or Tax or Exchange
	  */
	public BigDecimal getRate();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();

    /** Column name UUID */
    public static final String COLUMNNAME_UUID = "UUID";

	/** Set Immutable Universally Unique Identifier.
	  * Immutable Universally Unique Identifier
	  */
	public void setUUID (String UUID);

	/** Get Immutable Universally Unique Identifier.
	  * Immutable Universally Unique Identifier
	  */
	public String getUUID();

    /** Column name ValRetPercCFE */
    public static final String COLUMNNAME_ValRetPercCFE = "ValRetPercCFE";

	/** Set ValRetPercCFE.
	  * Valor de retención o percepción en CFE
	  */
	public void setValRetPercCFE (BigDecimal ValRetPercCFE);

	/** Get ValRetPercCFE.
	  * Valor de retención o percepción en CFE
	  */
	public BigDecimal getValRetPercCFE();

    /** Column name Z_BandejaCFELin_ID */
    public static final String COLUMNNAME_Z_BandejaCFELin_ID = "Z_BandejaCFELin_ID";

	/** Set Z_BandejaCFELin ID	  */
	public void setZ_BandejaCFELin_ID (int Z_BandejaCFELin_ID);

	/** Get Z_BandejaCFELin ID	  */
	public int getZ_BandejaCFELin_ID();

	public I_Z_BandejaCFELin getZ_BandejaCFELin() throws RuntimeException;

    /** Column name Z_RetPercItemCFE_ID */
    public static final String COLUMNNAME_Z_RetPercItemCFE_ID = "Z_RetPercItemCFE_ID";

	/** Set Z_RetPercItemCFE ID	  */
	public void setZ_RetPercItemCFE_ID (int Z_RetPercItemCFE_ID);

	/** Get Z_RetPercItemCFE ID	  */
	public int getZ_RetPercItemCFE_ID();
}
