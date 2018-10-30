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

/** Generated Model for Z_CFE_Config
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_Z_CFE_Config extends PO implements I_Z_CFE_Config, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20181030L;

    /** Standard Constructor */
    public X_Z_CFE_Config (Properties ctx, int Z_CFE_Config_ID, String trxName)
    {
      super (ctx, Z_CFE_Config_ID, trxName);
      /** if (Z_CFE_Config_ID == 0)
        {
			setValue (null);
			setZ_CFE_Config_ID (0);
        } */
    }

    /** Load Constructor */
    public X_Z_CFE_Config (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_Z_CFE_Config[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set TaxBasico_ID.
		@param TaxBasico_ID 
		ID de Impuesto Básico por Defecto
	  */
	public void setTaxBasico_ID (int TaxBasico_ID)
	{
		if (TaxBasico_ID < 1) 
			set_Value (COLUMNNAME_TaxBasico_ID, null);
		else 
			set_Value (COLUMNNAME_TaxBasico_ID, Integer.valueOf(TaxBasico_ID));
	}

	/** Get TaxBasico_ID.
		@return ID de Impuesto Básico por Defecto
	  */
	public int getTaxBasico_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TaxBasico_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TaxMinimo_ID.
		@param TaxMinimo_ID 
		ID de Impuesto Tasa Mínimo por Defecto
	  */
	public void setTaxMinimo_ID (int TaxMinimo_ID)
	{
		if (TaxMinimo_ID < 1) 
			set_Value (COLUMNNAME_TaxMinimo_ID, null);
		else 
			set_Value (COLUMNNAME_TaxMinimo_ID, Integer.valueOf(TaxMinimo_ID));
	}

	/** Get TaxMinimo_ID.
		@return ID de Impuesto Tasa Mínimo por Defecto
	  */
	public int getTaxMinimo_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TaxMinimo_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set Z_CFE_Config ID.
		@param Z_CFE_Config_ID Z_CFE_Config ID	  */
	public void setZ_CFE_Config_ID (int Z_CFE_Config_ID)
	{
		if (Z_CFE_Config_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_Z_CFE_Config_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_Z_CFE_Config_ID, Integer.valueOf(Z_CFE_Config_ID));
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