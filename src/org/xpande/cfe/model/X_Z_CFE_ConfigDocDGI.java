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

/** Generated Model for Z_CFE_ConfigDocDGI
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_Z_CFE_ConfigDocDGI extends PO implements I_Z_CFE_ConfigDocDGI, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20170904L;

    /** Standard Constructor */
    public X_Z_CFE_ConfigDocDGI (Properties ctx, int Z_CFE_ConfigDocDGI_ID, String trxName)
    {
      super (ctx, Z_CFE_ConfigDocDGI_ID, trxName);
      /** if (Z_CFE_ConfigDocDGI_ID == 0)
        {
			setCodigoDGI (null);
			setName (null);
			setValue (null);
			setZ_CFE_ConfigDocDGI_ID (0);
			setZ_CFE_Config_ID (0);
        } */
    }

    /** Load Constructor */
    public X_Z_CFE_ConfigDocDGI (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_Z_CFE_ConfigDocDGI[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set CodigoDGI.
		@param CodigoDGI 
		Código DGI de determinado comprobante
	  */
	public void setCodigoDGI (String CodigoDGI)
	{
		set_Value (COLUMNNAME_CodigoDGI, CodigoDGI);
	}

	/** Get CodigoDGI.
		@return Código DGI de determinado comprobante
	  */
	public String getCodigoDGI () 
	{
		return (String)get_Value(COLUMNNAME_CodigoDGI);
	}

	/** Set Description.
		@param Description 
		Optional short description of the record
	  */
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription () 
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	/** Set Name.
		@param Name 
		Alphanumeric identifier of the entity
	  */
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName () 
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

	/** Set Search Key.
		@param Value 
		Search key for the record in the format required - must be unique
	  */
	public void setValue (String Value)
	{
		set_Value (COLUMNNAME_Value, Value);
	}

	/** Get Search Key.
		@return Search key for the record in the format required - must be unique
	  */
	public String getValue () 
	{
		return (String)get_Value(COLUMNNAME_Value);
	}

	/** Set Z_CFE_ConfigDoc ID.
		@param Z_CFE_ConfigDocDGI_ID Z_CFE_ConfigDoc ID	  */
	public void setZ_CFE_ConfigDocDGI_ID (int Z_CFE_ConfigDocDGI_ID)
	{
		if (Z_CFE_ConfigDocDGI_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_Z_CFE_ConfigDocDGI_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_Z_CFE_ConfigDocDGI_ID, Integer.valueOf(Z_CFE_ConfigDocDGI_ID));
	}

	/** Get Z_CFE_ConfigDoc ID.
		@return Z_CFE_ConfigDoc ID	  */
	public int getZ_CFE_ConfigDocDGI_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Z_CFE_ConfigDocDGI_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.xpande.cfe.model.I_Z_CFE_Config getZ_CFE_Config() throws RuntimeException
    {
		return (org.xpande.cfe.model.I_Z_CFE_Config)MTable.get(getCtx(), org.xpande.cfe.model.I_Z_CFE_Config.Table_Name)
			.getPO(getZ_CFE_Config_ID(), get_TrxName());	}

	/** Set Z_CFE_Config ID.
		@param Z_CFE_Config_ID Z_CFE_Config ID	  */
	public void setZ_CFE_Config_ID (int Z_CFE_Config_ID)
	{
		if (Z_CFE_Config_ID < 1) 
			set_Value (COLUMNNAME_Z_CFE_Config_ID, null);
		else 
			set_Value (COLUMNNAME_Z_CFE_Config_ID, Integer.valueOf(Z_CFE_Config_ID));
	}

	/** Get Z_CFE_Config ID.
		@return Z_CFE_Config ID	  */
	public int getZ_CFE_Config_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Z_CFE_Config_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}