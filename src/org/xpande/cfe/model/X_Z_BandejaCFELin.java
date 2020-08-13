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

/** Generated Model for Z_BandejaCFELin
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_Z_BandejaCFELin extends PO implements I_Z_BandejaCFELin, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20200813L;

    /** Standard Constructor */
    public X_Z_BandejaCFELin (Properties ctx, int Z_BandejaCFELin_ID, String trxName)
    {
      super (ctx, Z_BandejaCFELin_ID, trxName);
      /** if (Z_BandejaCFELin_ID == 0)
        {
			setIndFactCFE (null);
			setMontoItem (Env.ZERO);
			setNomItemCFE (null);
			setPriceEntered (Env.ZERO);
			setQtyInvoiced (Env.ZERO);
			setUniMedCFE (null);
			setZ_BandejaCFE_ID (0);
			setZ_BandejaCFELin_ID (0);
        } */
    }

    /** Load Constructor */
    public X_Z_BandejaCFELin (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_Z_BandejaCFELin[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set CodItemCFE.
		@param CodItemCFE 
		Código de Item en CFE
	  */
	public void setCodItemCFE (String CodItemCFE)
	{
		set_Value (COLUMNNAME_CodItemCFE, CodItemCFE);
	}

	/** Get CodItemCFE.
		@return Código de Item en CFE
	  */
	public String getCodItemCFE () 
	{
		return (String)get_Value(COLUMNNAME_CodItemCFE);
	}

	public I_C_Tax getC_Tax() throws RuntimeException
    {
		return (I_C_Tax)MTable.get(getCtx(), I_C_Tax.Table_Name)
			.getPO(getC_Tax_ID(), get_TrxName());	}

	/** Set Tax.
		@param C_Tax_ID 
		Tax identifier
	  */
	public void setC_Tax_ID (int C_Tax_ID)
	{
		if (C_Tax_ID < 1) 
			set_Value (COLUMNNAME_C_Tax_ID, null);
		else 
			set_Value (COLUMNNAME_C_Tax_ID, Integer.valueOf(C_Tax_ID));
	}

	/** Get Tax.
		@return Tax identifier
	  */
	public int getC_Tax_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Tax_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set DescuentoMonto.
		@param DescuentoMonto 
		Descuento monto en CFE
	  */
	public void setDescuentoMonto (BigDecimal DescuentoMonto)
	{
		set_Value (COLUMNNAME_DescuentoMonto, DescuentoMonto);
	}

	/** Get DescuentoMonto.
		@return Descuento monto en CFE
	  */
	public BigDecimal getDescuentoMonto () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_DescuentoMonto);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set DescuentoPct.
		@param DescuentoPct 
		Porcentaje descuento en CFE
	  */
	public void setDescuentoPct (BigDecimal DescuentoPct)
	{
		set_Value (COLUMNNAME_DescuentoPct, DescuentoPct);
	}

	/** Get DescuentoPct.
		@return Porcentaje descuento en CFE
	  */
	public BigDecimal getDescuentoPct () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_DescuentoPct);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set DscItemCFE.
		@param DscItemCFE 
		Descripción de item en CFE
	  */
	public void setDscItemCFE (String DscItemCFE)
	{
		set_Value (COLUMNNAME_DscItemCFE, DscItemCFE);
	}

	/** Get DscItemCFE.
		@return Descripción de item en CFE
	  */
	public String getDscItemCFE () 
	{
		return (String)get_Value(COLUMNNAME_DscItemCFE);
	}

	/** Set IndAgenteRespCFE.
		@param IndAgenteRespCFE 
		Ind. de Agente Responsable en CFE
	  */
	public void setIndAgenteRespCFE (String IndAgenteRespCFE)
	{
		set_Value (COLUMNNAME_IndAgenteRespCFE, IndAgenteRespCFE);
	}

	/** Get IndAgenteRespCFE.
		@return Ind. de Agente Responsable en CFE
	  */
	public String getIndAgenteRespCFE () 
	{
		return (String)get_Value(COLUMNNAME_IndAgenteRespCFE);
	}

	/** Set IndFactCFE.
		@param IndFactCFE 
		Ind. de Factura en CFE
	  */
	public void setIndFactCFE (String IndFactCFE)
	{
		set_Value (COLUMNNAME_IndFactCFE, IndFactCFE);
	}

	/** Get IndFactCFE.
		@return Ind. de Factura en CFE
	  */
	public String getIndFactCFE () 
	{
		return (String)get_Value(COLUMNNAME_IndFactCFE);
	}

	/** Set MontoItem.
		@param MontoItem 
		Monto item en CFE
	  */
	public void setMontoItem (BigDecimal MontoItem)
	{
		set_Value (COLUMNNAME_MontoItem, MontoItem);
	}

	/** Get MontoItem.
		@return Monto item en CFE
	  */
	public BigDecimal getMontoItem () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MontoItem);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	public I_M_Product getM_Product() throws RuntimeException
    {
		return (I_M_Product)MTable.get(getCtx(), I_M_Product.Table_Name)
			.getPO(getM_Product_ID(), get_TrxName());	}

	/** Set Product.
		@param M_Product_ID 
		Product, Service, Item
	  */
	public void setM_Product_ID (int M_Product_ID)
	{
		if (M_Product_ID < 1) 
			set_Value (COLUMNNAME_M_Product_ID, null);
		else 
			set_Value (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
	}

	/** Get Product.
		@return Product, Service, Item
	  */
	public int getM_Product_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set NomItemCFE.
		@param NomItemCFE 
		Nombre de Item en CFE
	  */
	public void setNomItemCFE (String NomItemCFE)
	{
		set_Value (COLUMNNAME_NomItemCFE, NomItemCFE);
	}

	/** Get NomItemCFE.
		@return Nombre de Item en CFE
	  */
	public String getNomItemCFE () 
	{
		return (String)get_Value(COLUMNNAME_NomItemCFE);
	}

	/** Set NroLinDetCFE.
		@param NroLinDetCFE 
		Numero de linea de detalle en CFE
	  */
	public void setNroLinDetCFE (int NroLinDetCFE)
	{
		set_Value (COLUMNNAME_NroLinDetCFE, Integer.valueOf(NroLinDetCFE));
	}

	/** Get NroLinDetCFE.
		@return Numero de linea de detalle en CFE
	  */
	public int getNroLinDetCFE () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_NroLinDetCFE);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Price.
		@param PriceEntered 
		Price Entered - the price based on the selected/base UoM
	  */
	public void setPriceEntered (BigDecimal PriceEntered)
	{
		set_Value (COLUMNNAME_PriceEntered, PriceEntered);
	}

	/** Get Price.
		@return Price Entered - the price based on the selected/base UoM
	  */
	public BigDecimal getPriceEntered () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PriceEntered);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Quantity Invoiced.
		@param QtyInvoiced 
		Invoiced Quantity
	  */
	public void setQtyInvoiced (BigDecimal QtyInvoiced)
	{
		set_Value (COLUMNNAME_QtyInvoiced, QtyInvoiced);
	}

	/** Get Quantity Invoiced.
		@return Invoiced Quantity
	  */
	public BigDecimal getQtyInvoiced () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyInvoiced);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set RecargoMnt.
		@param RecargoMnt 
		Monto de Recargos en CFE
	  */
	public void setRecargoMnt (BigDecimal RecargoMnt)
	{
		set_Value (COLUMNNAME_RecargoMnt, RecargoMnt);
	}

	/** Get RecargoMnt.
		@return Monto de Recargos en CFE
	  */
	public BigDecimal getRecargoMnt () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_RecargoMnt);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set RecargoPct.
		@param RecargoPct 
		Porcentaje recargos en CFE
	  */
	public void setRecargoPct (BigDecimal RecargoPct)
	{
		set_Value (COLUMNNAME_RecargoPct, RecargoPct);
	}

	/** Get RecargoPct.
		@return Porcentaje recargos en CFE
	  */
	public BigDecimal getRecargoPct () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_RecargoPct);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set UniMedCFE.
		@param UniMedCFE 
		Unidad de Medida en CFE
	  */
	public void setUniMedCFE (String UniMedCFE)
	{
		set_Value (COLUMNNAME_UniMedCFE, UniMedCFE);
	}

	/** Get UniMedCFE.
		@return Unidad de Medida en CFE
	  */
	public String getUniMedCFE () 
	{
		return (String)get_Value(COLUMNNAME_UniMedCFE);
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

	/** Set Z_BandejaCFELin ID.
		@param Z_BandejaCFELin_ID Z_BandejaCFELin ID	  */
	public void setZ_BandejaCFELin_ID (int Z_BandejaCFELin_ID)
	{
		if (Z_BandejaCFELin_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_Z_BandejaCFELin_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_Z_BandejaCFELin_ID, Integer.valueOf(Z_BandejaCFELin_ID));
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
}