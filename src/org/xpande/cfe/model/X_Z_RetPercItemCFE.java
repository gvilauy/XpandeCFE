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

/** Generated Model for Z_RetPercItemCFE
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_Z_RetPercItemCFE extends PO implements I_Z_RetPercItemCFE, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20200813L;

    /** Standard Constructor */
    public X_Z_RetPercItemCFE (Properties ctx, int Z_RetPercItemCFE_ID, String trxName)
    {
      super (ctx, Z_RetPercItemCFE_ID, trxName);
      /** if (Z_RetPercItemCFE_ID == 0)
        {
			setValRetPercCFE (Env.ZERO);
			setZ_BandejaCFELin_ID (0);
			setZ_RetPercItemCFE_ID (0);
        } */
    }

    /** Load Constructor */
    public X_Z_RetPercItemCFE (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_Z_RetPercItemCFE[")
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

	/** Set InfoAdicionalRet.
		@param InfoAdicionalRet 
		Información adicional de la retención en CFE
	  */
	public void setInfoAdicionalRet (String InfoAdicionalRet)
	{
		set_Value (COLUMNNAME_InfoAdicionalRet, InfoAdicionalRet);
	}

	/** Get InfoAdicionalRet.
		@return Información adicional de la retención en CFE
	  */
	public String getInfoAdicionalRet () 
	{
		return (String)get_Value(COLUMNNAME_InfoAdicionalRet);
	}

	/** Set MntSujetoaRet.
		@param MntSujetoaRet 
		Monto sujeto a retención en CFE
	  */
	public void setMntSujetoaRet (BigDecimal MntSujetoaRet)
	{
		set_Value (COLUMNNAME_MntSujetoaRet, MntSujetoaRet);
	}

	/** Get MntSujetoaRet.
		@return Monto sujeto a retención en CFE
	  */
	public BigDecimal getMntSujetoaRet () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MntSujetoaRet);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Rate.
		@param Rate 
		Rate or Tax or Exchange
	  */
	public void setRate (BigDecimal Rate)
	{
		set_Value (COLUMNNAME_Rate, Rate);
	}

	/** Get Rate.
		@return Rate or Tax or Exchange
	  */
	public BigDecimal getRate () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Rate);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	public I_Z_BandejaCFELin getZ_BandejaCFELin() throws RuntimeException
    {
		return (I_Z_BandejaCFELin)MTable.get(getCtx(), I_Z_BandejaCFELin.Table_Name)
			.getPO(getZ_BandejaCFELin_ID(), get_TrxName());	}

	/** Set Z_BandejaCFELin ID.
		@param Z_BandejaCFELin_ID Z_BandejaCFELin ID	  */
	public void setZ_BandejaCFELin_ID (int Z_BandejaCFELin_ID)
	{
		if (Z_BandejaCFELin_ID < 1) 
			set_Value (COLUMNNAME_Z_BandejaCFELin_ID, null);
		else 
			set_Value (COLUMNNAME_Z_BandejaCFELin_ID, Integer.valueOf(Z_BandejaCFELin_ID));
	}

	/** Get Z_BandejaCFELin ID.
		@return Z_BandejaCFELin ID	  */
	public int getZ_BandejaCFELin_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Z_BandejaCFELin_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Z_RetPercItemCFE ID.
		@param Z_RetPercItemCFE_ID Z_RetPercItemCFE ID	  */
	public void setZ_RetPercItemCFE_ID (int Z_RetPercItemCFE_ID)
	{
		if (Z_RetPercItemCFE_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_Z_RetPercItemCFE_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_Z_RetPercItemCFE_ID, Integer.valueOf(Z_RetPercItemCFE_ID));
	}

	/** Get Z_RetPercItemCFE ID.
		@return Z_RetPercItemCFE ID	  */
	public int getZ_RetPercItemCFE_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Z_RetPercItemCFE_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}