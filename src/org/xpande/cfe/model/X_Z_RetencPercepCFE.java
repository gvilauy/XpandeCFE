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

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;

/** Generated Model for Z_RetencPercepCFE
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_Z_RetencPercepCFE extends PO implements I_Z_RetencPercepCFE, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20200813L;

    /** Standard Constructor */
    public X_Z_RetencPercepCFE (Properties ctx, int Z_RetencPercepCFE_ID, String trxName)
    {
      super (ctx, Z_RetencPercepCFE_ID, trxName);
      /** if (Z_RetencPercepCFE_ID == 0)
        {
			setCodRetCFE (null);
			setValRetPercCFE (Env.ZERO);
			setZ_BandejaCFE_ID (0);
			setZ_RetencPercepCFE_ID (0);
        } */
    }

    /** Load Constructor */
    public X_Z_RetencPercepCFE (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_Z_RetencPercepCFE[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set CodRetCFE.
		@param CodRetCFE 
		Codigo de retención para CFE
	  */
	public void setCodRetCFE (String CodRetCFE)
	{
		set_Value (COLUMNNAME_CodRetCFE, CodRetCFE);
	}

	/** Get CodRetCFE.
		@return Codigo de retención para CFE
	  */
	public String getCodRetCFE () 
	{
		return (String)get_Value(COLUMNNAME_CodRetCFE);
	}

	/** Set Immutable Universally Unique Identifier.
		@param UUID 
		Immutable Universally Unique Identifier
	  */
	public void setUUID (String UUID)
	{
		set_Value (COLUMNNAME_UUID, UUID);
	}

	/** Get Immutable Universally Unique Identifier.
		@return Immutable Universally Unique Identifier
	  */
	public String getUUID () 
	{
		return (String)get_Value(COLUMNNAME_UUID);
	}

	/** Set ValRetPercCFE.
		@param ValRetPercCFE 
		Valor de retención o percepción en CFE
	  */
	public void setValRetPercCFE (BigDecimal ValRetPercCFE)
	{
		set_Value (COLUMNNAME_ValRetPercCFE, ValRetPercCFE);
	}

	/** Get ValRetPercCFE.
		@return Valor de retención o percepción en CFE
	  */
	public BigDecimal getValRetPercCFE () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ValRetPercCFE);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	public I_Z_BandejaCFE getZ_BandejaCFE() throws RuntimeException
    {
		return (I_Z_BandejaCFE)MTable.get(getCtx(), I_Z_BandejaCFE.Table_Name)
			.getPO(getZ_BandejaCFE_ID(), get_TrxName());	}

	/** Set Z_BandejaCFE ID.
		@param Z_BandejaCFE_ID Z_BandejaCFE ID	  */
	public void setZ_BandejaCFE_ID (int Z_BandejaCFE_ID)
	{
		if (Z_BandejaCFE_ID < 1) 
			set_Value (COLUMNNAME_Z_BandejaCFE_ID, null);
		else 
			set_Value (COLUMNNAME_Z_BandejaCFE_ID, Integer.valueOf(Z_BandejaCFE_ID));
	}

	/** Get Z_BandejaCFE ID.
		@return Z_BandejaCFE ID	  */
	public int getZ_BandejaCFE_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Z_BandejaCFE_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Z_RetencPercepCFE ID.
		@param Z_RetencPercepCFE_ID Z_RetencPercepCFE ID	  */
	public void setZ_RetencPercepCFE_ID (int Z_RetencPercepCFE_ID)
	{
		if (Z_RetencPercepCFE_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_Z_RetencPercepCFE_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_Z_RetencPercepCFE_ID, Integer.valueOf(Z_RetencPercepCFE_ID));
	}

	/** Get Z_RetencPercepCFE ID.
		@return Z_RetencPercepCFE ID	  */
	public int getZ_RetencPercepCFE_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Z_RetencPercepCFE_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}