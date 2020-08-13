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
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for Z_BandejaCFECAE
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_Z_BandejaCFECAE extends PO implements I_Z_BandejaCFECAE, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20200813L;

    /** Standard Constructor */
    public X_Z_BandejaCFECAE (Properties ctx, int Z_BandejaCFECAE_ID, String trxName)
    {
      super (ctx, Z_BandejaCFECAE_ID, trxName);
      /** if (Z_BandejaCFECAE_ID == 0)
        {
			setCAE_ID (null);
			setDNroCFE (0);
			setDueDate (new Timestamp( System.currentTimeMillis() ));
			setHNroCFE (0);
			setZ_BandejaCFECAE_ID (0);
			setZ_BandejaCFE_ID (0);
        } */
    }

    /** Load Constructor */
    public X_Z_BandejaCFECAE (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_Z_BandejaCFECAE[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set CAE_ID.
		@param CAE_ID 
		ID de CAE en CFE
	  */
	public void setCAE_ID (String CAE_ID)
	{
		set_Value (COLUMNNAME_CAE_ID, CAE_ID);
	}

	/** Get CAE_ID.
		@return ID de CAE en CFE
	  */
	public String getCAE_ID () 
	{
		return (String)get_Value(COLUMNNAME_CAE_ID);
	}

	/** Set DNroCFE.
		@param DNroCFE 
		Desde numero de CAE en CFE
	  */
	public void setDNroCFE (int DNroCFE)
	{
		set_Value (COLUMNNAME_DNroCFE, Integer.valueOf(DNroCFE));
	}

	/** Get DNroCFE.
		@return Desde numero de CAE en CFE
	  */
	public int getDNroCFE () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_DNroCFE);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Due Date.
		@param DueDate 
		Date when the payment is due
	  */
	public void setDueDate (Timestamp DueDate)
	{
		set_Value (COLUMNNAME_DueDate, DueDate);
	}

	/** Get Due Date.
		@return Date when the payment is due
	  */
	public Timestamp getDueDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DueDate);
	}

	/** Set HNroCFE.
		@param HNroCFE 
		Hasta número de CAE en CFE
	  */
	public void setHNroCFE (int HNroCFE)
	{
		set_Value (COLUMNNAME_HNroCFE, Integer.valueOf(HNroCFE));
	}

	/** Get HNroCFE.
		@return Hasta número de CAE en CFE
	  */
	public int getHNroCFE () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HNroCFE);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set Z_BandejaCFECAE ID.
		@param Z_BandejaCFECAE_ID Z_BandejaCFECAE ID	  */
	public void setZ_BandejaCFECAE_ID (int Z_BandejaCFECAE_ID)
	{
		if (Z_BandejaCFECAE_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_Z_BandejaCFECAE_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_Z_BandejaCFECAE_ID, Integer.valueOf(Z_BandejaCFECAE_ID));
	}

	/** Get Z_BandejaCFECAE ID.
		@return Z_BandejaCFECAE ID	  */
	public int getZ_BandejaCFECAE_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Z_BandejaCFECAE_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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
}