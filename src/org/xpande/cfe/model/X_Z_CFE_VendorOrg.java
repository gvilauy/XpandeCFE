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
/** Generated Model - DO NOT CHANGE */
package org.xpande.cfe.model;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for Z_CFE_VendorOrg
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_Z_CFE_VendorOrg extends PO implements I_Z_CFE_VendorOrg, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20181029L;

    /** Standard Constructor */
    public X_Z_CFE_VendorOrg (Properties ctx, int Z_CFE_VendorOrg_ID, String trxName)
    {
      super (ctx, Z_CFE_VendorOrg_ID, trxName);
      /** if (Z_CFE_VendorOrg_ID == 0)
        {
			setAD_OrgTrx_ID (0);
			setZ_CFE_Vendor_ID (0);
			setZ_CFE_VendorOrg_ID (0);
        } */
    }

    /** Load Constructor */
    public X_Z_CFE_VendorOrg (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_Z_CFE_VendorOrg[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Trx Organization.
		@param AD_OrgTrx_ID 
		Performing or initiating organization
	  */
	public void setAD_OrgTrx_ID (int AD_OrgTrx_ID)
	{
		if (AD_OrgTrx_ID < 1) 
			set_Value (COLUMNNAME_AD_OrgTrx_ID, null);
		else 
			set_Value (COLUMNNAME_AD_OrgTrx_ID, Integer.valueOf(AD_OrgTrx_ID));
	}

	/** Get Trx Organization.
		@return Performing or initiating organization
	  */
	public int getAD_OrgTrx_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_OrgTrx_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_Z_CFE_Vendor getZ_CFE_Vendor() throws RuntimeException
    {
		return (I_Z_CFE_Vendor)MTable.get(getCtx(), I_Z_CFE_Vendor.Table_Name)
			.getPO(getZ_CFE_Vendor_ID(), get_TrxName());	}

	/** Set Z_CFE_Vendor ID.
		@param Z_CFE_Vendor_ID Z_CFE_Vendor ID	  */
	public void setZ_CFE_Vendor_ID (int Z_CFE_Vendor_ID)
	{
		if (Z_CFE_Vendor_ID < 1) 
			set_Value (COLUMNNAME_Z_CFE_Vendor_ID, null);
		else 
			set_Value (COLUMNNAME_Z_CFE_Vendor_ID, Integer.valueOf(Z_CFE_Vendor_ID));
	}

	/** Get Z_CFE_Vendor ID.
		@return Z_CFE_Vendor ID	  */
	public int getZ_CFE_Vendor_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Z_CFE_Vendor_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Z_CFE_VendorOrg ID.
		@param Z_CFE_VendorOrg_ID Z_CFE_VendorOrg ID	  */
	public void setZ_CFE_VendorOrg_ID (int Z_CFE_VendorOrg_ID)
	{
		if (Z_CFE_VendorOrg_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_Z_CFE_VendorOrg_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_Z_CFE_VendorOrg_ID, Integer.valueOf(Z_CFE_VendorOrg_ID));
	}

	/** Get Z_CFE_VendorOrg ID.
		@return Z_CFE_VendorOrg ID	  */
	public int getZ_CFE_VendorOrg_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Z_CFE_VendorOrg_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}