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

/** Generated Interface for Z_CFE_VendorOrg
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0
 */
public interface I_Z_CFE_VendorOrg 
{

    /** TableName=Z_CFE_VendorOrg */
    public static final String Table_Name = "Z_CFE_VendorOrg";

    /** AD_Table_ID=1000234 */
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
	public void setAD_Org_ID(int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name AD_OrgTrx_ID */
    public static final String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";

	/** Set Trx Organization.
	  * Performing or initiating organization
	  */
	public void setAD_OrgTrx_ID(int AD_OrgTrx_ID);

	/** Get Trx Organization.
	  * Performing or initiating organization
	  */
	public int getAD_OrgTrx_ID();

    /** Column name CFE_CodInteg */
    public static final String COLUMNNAME_CFE_CodInteg = "CFE_CodInteg";

	/** Set CFE_CodInteg.
	  * Código de integración para CFE
	  */
	public void setCFE_CodInteg(String CFE_CodInteg);

	/** Get CFE_CodInteg.
	  * Código de integración para CFE
	  */
	public String getCFE_CodInteg();

    /** Column name CFE_EmpCK */
    public static final String COLUMNNAME_CFE_EmpCK = "CFE_EmpCK";

	/** Set CFE_EmpCK.
	  * Clave de empresa para CFE
	  */
	public void setCFE_EmpCK(String CFE_EmpCK);

	/** Get CFE_EmpCK.
	  * Clave de empresa para CFE
	  */
	public String getCFE_EmpCK();

    /** Column name CFE_EmpPK */
    public static final String COLUMNNAME_CFE_EmpPK = "CFE_EmpPK";

	/** Set CFE_EmpPK.
	  * Clave de empresa de software para CFE
	  */
	public void setCFE_EmpPK(String CFE_EmpPK);

	/** Get CFE_EmpPK.
	  * Clave de empresa de software para CFE
	  */
	public String getCFE_EmpPK();

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

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive(boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name namespaceURL */
    public static final String COLUMNNAME_namespaceURL = "namespaceURL";

	/** Set namespaceURL.
	  * Atributo para comunicaciones con WS
	  */
	public void setnamespaceURL(String namespaceURL);

	/** Get namespaceURL.
	  * Atributo para comunicaciones con WS
	  */
	public String getnamespaceURL();

    /** Column name OperationName */
    public static final String COLUMNNAME_OperationName = "OperationName";

	/** Set OperationName.
	  * Atributo para comunicaciones por WS
	  */
	public void setOperationName(String OperationName);

	/** Get OperationName.
	  * Atributo para comunicaciones por WS
	  */
	public String getOperationName();

    /** Column name SOAPActionURI */
    public static final String COLUMNNAME_SOAPActionURI = "SOAPActionURI";

	/** Set SOAPActionURI.
	  * Atributo para comunicaciones con WS
	  */
	public void setSOAPActionURI(String SOAPActionURI);

	/** Get SOAPActionURI.
	  * Atributo para comunicaciones con WS
	  */
	public String getSOAPActionURI();

    /** Column name TargetEndpointAddress */
    public static final String COLUMNNAME_TargetEndpointAddress = "TargetEndpointAddress";

	/** Set TargetEndpointAddress.
	  * Atributo para comunnicación por WS
	  */
	public void setTargetEndpointAddress(String TargetEndpointAddress);

	/** Get TargetEndpointAddress.
	  * Atributo para comunnicación por WS
	  */
	public String getTargetEndpointAddress();

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
	public void setUUID(String UUID);

	/** Get Immutable Universally Unique Identifier.
	  * Immutable Universally Unique Identifier
	  */
	public String getUUID();

    /** Column name Z_CFE_Vendor_ID */
    public static final String COLUMNNAME_Z_CFE_Vendor_ID = "Z_CFE_Vendor_ID";

	/** Set Z_CFE_Vendor ID	  */
	public void setZ_CFE_Vendor_ID(int Z_CFE_Vendor_ID);

	/** Get Z_CFE_Vendor ID	  */
	public int getZ_CFE_Vendor_ID();

	public I_Z_CFE_Vendor getZ_CFE_Vendor() throws RuntimeException;

    /** Column name Z_CFE_VendorOrg_ID */
    public static final String COLUMNNAME_Z_CFE_VendorOrg_ID = "Z_CFE_VendorOrg_ID";

	/** Set Z_CFE_VendorOrg ID	  */
	public void setZ_CFE_VendorOrg_ID(int Z_CFE_VendorOrg_ID);

	/** Get Z_CFE_VendorOrg ID	  */
	public int getZ_CFE_VendorOrg_ID();
}
