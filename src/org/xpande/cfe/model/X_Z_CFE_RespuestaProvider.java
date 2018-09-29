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
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;

/** Generated Model for Z_CFE_RespuestaProvider
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_Z_CFE_RespuestaProvider extends PO implements I_Z_CFE_RespuestaProvider, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20170802L;

    /** Standard Constructor */
    public X_Z_CFE_RespuestaProvider (Properties ctx, int Z_CFE_RespuestaProvider_ID, String trxName)
    {
      super (ctx, Z_CFE_RespuestaProvider_ID, trxName);
      /** if (Z_CFE_RespuestaProvider_ID == 0)
        {
			setAD_Table_ID (0);
			setRecord_ID (0);
			setZ_CFE_RespuestaProvider_ID (0);
        } */
    }

    /** Load Constructor */
    public X_Z_CFE_RespuestaProvider (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_Z_CFE_RespuestaProvider[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public I_AD_Table getAD_Table() throws RuntimeException
    {
		return (I_AD_Table)MTable.get(getCtx(), I_AD_Table.Table_Name)
			.getPO(getAD_Table_ID(), get_TrxName());	}

	/** Set Table.
		@param AD_Table_ID 
		Database Table information
	  */
	public void setAD_Table_ID (int AD_Table_ID)
	{
		if (AD_Table_ID < 1) 
			set_Value (COLUMNNAME_AD_Table_ID, null);
		else 
			set_Value (COLUMNNAME_AD_Table_ID, Integer.valueOf(AD_Table_ID));
	}

	/** Get Table.
		@return Database Table information
	  */
	public int getAD_Table_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Table_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_DocType getC_DocType() throws RuntimeException
    {
		return (I_C_DocType)MTable.get(getCtx(), I_C_DocType.Table_Name)
			.getPO(getC_DocType_ID(), get_TrxName());	}

	/** Set Document Type.
		@param C_DocType_ID 
		Document type or rules
	  */
	public void setC_DocType_ID (int C_DocType_ID)
	{
		if (C_DocType_ID < 0) 
			set_Value (COLUMNNAME_C_DocType_ID, null);
		else 
			set_Value (COLUMNNAME_C_DocType_ID, Integer.valueOf(C_DocType_ID));
	}

	/** Get Document Type.
		@return Document type or rules
	  */
	public int getC_DocType_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_DocType_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set CFE_AnioResolucion.
		@param CFE_AnioResolucion 
		CFE_AnioResolucion
	  */
	public void setCFE_AnioResolucion (int CFE_AnioResolucion)
	{
		set_Value (COLUMNNAME_CFE_AnioResolucion, Integer.valueOf(CFE_AnioResolucion));
	}

	/** Get CFE_AnioResolucion.
		@return CFE_AnioResolucion
	  */
	public int getCFE_AnioResolucion () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_CFE_AnioResolucion);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set CFE_CAE_ID.
		@param CFE_CAE_ID 
		CFE_CAE_ID
	  */
	public void setCFE_CAE_ID (BigDecimal CFE_CAE_ID)
	{
		set_Value (COLUMNNAME_CFE_CAE_ID, CFE_CAE_ID);
	}

	/** Get CFE_CAE_ID.
		@return CFE_CAE_ID
	  */
	public BigDecimal getCFE_CAE_ID () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CFE_CAE_ID);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CFE_Descripcion.
		@param CFE_Descripcion 
		CFE_Descripcion
	  */
	public void setCFE_Descripcion (String CFE_Descripcion)
	{
		set_Value (COLUMNNAME_CFE_Descripcion, CFE_Descripcion);
	}

	/** Get CFE_Descripcion.
		@return CFE_Descripcion
	  */
	public String getCFE_Descripcion () 
	{
		return (String)get_Value(COLUMNNAME_CFE_Descripcion);
	}

	/** Set CFE_DigitoVerificador.
		@param CFE_DigitoVerificador CFE_DigitoVerificador	  */
	public void setCFE_DigitoVerificador (String CFE_DigitoVerificador)
	{
		set_Value (COLUMNNAME_CFE_DigitoVerificador, CFE_DigitoVerificador);
	}

	/** Get CFE_DigitoVerificador.
		@return CFE_DigitoVerificador	  */
	public String getCFE_DigitoVerificador () 
	{
		return (String)get_Value(COLUMNNAME_CFE_DigitoVerificador);
	}

	/** Set CFE_FechaFirma.
		@param CFE_FechaFirma 
		CFE_FechaFirma
	  */
	public void setCFE_FechaFirma (Timestamp CFE_FechaFirma)
	{
		set_Value (COLUMNNAME_CFE_FechaFirma, CFE_FechaFirma);
	}

	/** Get CFE_FechaFirma.
		@return CFE_FechaFirma
	  */
	public Timestamp getCFE_FechaFirma () 
	{
		return (Timestamp)get_Value(COLUMNNAME_CFE_FechaFirma);
	}

	/** Set CFE_NroFinal_CAE.
		@param CFE_NroFinal_CAE 
		CFE_NroFinal_CAE
	  */
	public void setCFE_NroFinal_CAE (BigDecimal CFE_NroFinal_CAE)
	{
		set_Value (COLUMNNAME_CFE_NroFinal_CAE, CFE_NroFinal_CAE);
	}

	/** Get CFE_NroFinal_CAE.
		@return CFE_NroFinal_CAE
	  */
	public BigDecimal getCFE_NroFinal_CAE () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CFE_NroFinal_CAE);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CFE_NroInicial_CAE.
		@param CFE_NroInicial_CAE 
		CFE_NroInicial_CAE
	  */
	public void setCFE_NroInicial_CAE (BigDecimal CFE_NroInicial_CAE)
	{
		set_Value (COLUMNNAME_CFE_NroInicial_CAE, CFE_NroInicial_CAE);
	}

	/** Get CFE_NroInicial_CAE.
		@return CFE_NroInicial_CAE
	  */
	public BigDecimal getCFE_NroInicial_CAE () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CFE_NroInicial_CAE);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CFE_Numero.
		@param CFE_Numero 
		CFE_Numero
	  */
	public void setCFE_Numero (BigDecimal CFE_Numero)
	{
		set_Value (COLUMNNAME_CFE_Numero, CFE_Numero);
	}

	/** Get CFE_Numero.
		@return CFE_Numero
	  */
	public BigDecimal getCFE_Numero () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CFE_Numero);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CFE_Resolucion.
		@param CFE_Resolucion 
		CFE_Resolucion
	  */
	public void setCFE_Resolucion (String CFE_Resolucion)
	{
		set_Value (COLUMNNAME_CFE_Resolucion, CFE_Resolucion);
	}

	/** Get CFE_Resolucion.
		@return CFE_Resolucion
	  */
	public String getCFE_Resolucion () 
	{
		return (String)get_Value(COLUMNNAME_CFE_Resolucion);
	}

	/** Set CFE_Serie.
		@param CFE_Serie 
		CFE_Serie
	  */
	public void setCFE_Serie (String CFE_Serie)
	{
		set_Value (COLUMNNAME_CFE_Serie, CFE_Serie);
	}

	/** Get CFE_Serie.
		@return CFE_Serie
	  */
	public String getCFE_Serie () 
	{
		return (String)get_Value(COLUMNNAME_CFE_Serie);
	}

	/** Set CFE_Status.
		@param CFE_Status 
		CFE_Status
	  */
	public void setCFE_Status (String CFE_Status)
	{
		set_Value (COLUMNNAME_CFE_Status, CFE_Status);
	}

	/** Get CFE_Status.
		@return CFE_Status
	  */
	public String getCFE_Status () 
	{
		return (String)get_Value(COLUMNNAME_CFE_Status);
	}

	/** Set CFE_Tipo.
		@param CFE_Tipo 
		CFE_Tipo
	  */
	public void setCFE_Tipo (BigDecimal CFE_Tipo)
	{
		set_Value (COLUMNNAME_CFE_Tipo, CFE_Tipo);
	}

	/** Get CFE_Tipo.
		@return CFE_Tipo
	  */
	public BigDecimal getCFE_Tipo () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CFE_Tipo);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CFE_URL_DGI.
		@param CFE_URL_DGI 
		CFE_URL_DGI
	  */
	public void setCFE_URL_DGI (String CFE_URL_DGI)
	{
		set_Value (COLUMNNAME_CFE_URL_DGI, CFE_URL_DGI);
	}

	/** Get CFE_URL_DGI.
		@return CFE_URL_DGI
	  */
	public String getCFE_URL_DGI () 
	{
		return (String)get_Value(COLUMNNAME_CFE_URL_DGI);
	}

	/** Set CFE_Vencimiento_CAE.
		@param CFE_Vencimiento_CAE 
		CFE_Vencimiento_CAE
	  */
	public void setCFE_Vencimiento_CAE (Timestamp CFE_Vencimiento_CAE)
	{
		set_Value (COLUMNNAME_CFE_Vencimiento_CAE, CFE_Vencimiento_CAE);
	}

	/** Get CFE_Vencimiento_CAE.
		@return CFE_Vencimiento_CAE
	  */
	public Timestamp getCFE_Vencimiento_CAE () 
	{
		return (Timestamp)get_Value(COLUMNNAME_CFE_Vencimiento_CAE);
	}

	/** Set DocumentNoRef.
		@param DocumentNoRef 
		Numero de documento referenciado
	  */
	public void setDocumentNoRef (String DocumentNoRef)
	{
		set_Value (COLUMNNAME_DocumentNoRef, DocumentNoRef);
	}

	/** Get DocumentNoRef.
		@return Numero de documento referenciado
	  */
	public String getDocumentNoRef () 
	{
		return (String)get_Value(COLUMNNAME_DocumentNoRef);
	}

	/** Set Record ID.
		@param Record_ID 
		Direct internal record ID
	  */
	public void setRecord_ID (int Record_ID)
	{
		if (Record_ID < 0) 
			set_Value (COLUMNNAME_Record_ID, null);
		else 
			set_Value (COLUMNNAME_Record_ID, Integer.valueOf(Record_ID));
	}

	/** Get Record ID.
		@return Direct internal record ID
	  */
	public int getRecord_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Record_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Z_CFE_RespuestaProvider ID.
		@param Z_CFE_RespuestaProvider_ID Z_CFE_RespuestaProvider ID	  */
	public void setZ_CFE_RespuestaProvider_ID (int Z_CFE_RespuestaProvider_ID)
	{
		if (Z_CFE_RespuestaProvider_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_Z_CFE_RespuestaProvider_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_Z_CFE_RespuestaProvider_ID, Integer.valueOf(Z_CFE_RespuestaProvider_ID));
	}

	/** Get Z_CFE_RespuestaProvider ID.
		@return Z_CFE_RespuestaProvider ID	  */
	public int getZ_CFE_RespuestaProvider_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Z_CFE_RespuestaProvider_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}