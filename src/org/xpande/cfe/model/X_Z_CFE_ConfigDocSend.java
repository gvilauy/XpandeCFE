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

/** Generated Model for Z_CFE_ConfigDocSend
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_Z_CFE_ConfigDocSend extends PO implements I_Z_CFE_ConfigDocSend, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20170904L;

    /** Standard Constructor */
    public X_Z_CFE_ConfigDocSend (Properties ctx, int Z_CFE_ConfigDocSend_ID, String trxName)
    {
      super (ctx, Z_CFE_ConfigDocSend_ID, trxName);
      /** if (Z_CFE_ConfigDocSend_ID == 0)
        {
			setC_DocType_ID (0);
			setDocumentSerie (null);
			setDueDate (new Timestamp( System.currentTimeMillis() ));
			setEnProduccion (false);
// N
			setNumeroCAE (null);
			setNumeroDesde (0);
			setNumeroHasta (0);
			setZ_CFE_ConfigDocDGI_ID (0);
			setZ_CFE_ConfigDocSend_ID (0);
			setZ_CFE_Config_ID (0);
        } */
    }

    /** Load Constructor */
    public X_Z_CFE_ConfigDocSend (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_Z_CFE_ConfigDocSend[")
        .append(get_ID()).append("]");
      return sb.toString();
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

	/** Set DocumentSerie.
		@param DocumentSerie 
		Serie de un Documento
	  */
	public void setDocumentSerie (String DocumentSerie)
	{
		set_Value (COLUMNNAME_DocumentSerie, DocumentSerie);
	}

	/** Get DocumentSerie.
		@return Serie de un Documento
	  */
	public String getDocumentSerie () 
	{
		return (String)get_Value(COLUMNNAME_DocumentSerie);
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

	/** Set EnProduccion.
		@param EnProduccion 
		Si esta en producción o no
	  */
	public void setEnProduccion (boolean EnProduccion)
	{
		set_Value (COLUMNNAME_EnProduccion, Boolean.valueOf(EnProduccion));
	}

	/** Get EnProduccion.
		@return Si esta en producción o no
	  */
	public boolean isEnProduccion () 
	{
		Object oo = get_Value(COLUMNNAME_EnProduccion);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set NumeroCAE.
		@param NumeroCAE 
		Número CAE para envío electrónico de comprobantes a Impositiva
	  */
	public void setNumeroCAE (String NumeroCAE)
	{
		set_Value (COLUMNNAME_NumeroCAE, NumeroCAE);
	}

	/** Get NumeroCAE.
		@return Número CAE para envío electrónico de comprobantes a Impositiva
	  */
	public String getNumeroCAE () 
	{
		return (String)get_Value(COLUMNNAME_NumeroCAE);
	}

	/** Set NumeroDesde.
		@param NumeroDesde 
		Numero desde para Rango de Enteros
	  */
	public void setNumeroDesde (int NumeroDesde)
	{
		set_Value (COLUMNNAME_NumeroDesde, Integer.valueOf(NumeroDesde));
	}

	/** Get NumeroDesde.
		@return Numero desde para Rango de Enteros
	  */
	public int getNumeroDesde () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_NumeroDesde);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set NumeroHasta.
		@param NumeroHasta 
		Numero hasta para Rango de Enteros
	  */
	public void setNumeroHasta (int NumeroHasta)
	{
		set_Value (COLUMNNAME_NumeroHasta, Integer.valueOf(NumeroHasta));
	}

	/** Get NumeroHasta.
		@return Numero hasta para Rango de Enteros
	  */
	public int getNumeroHasta () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_NumeroHasta);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.xpande.cfe.model.I_Z_CFE_ConfigDocDGI getZ_CFE_ConfigDocDGI() throws RuntimeException
    {
		return (org.xpande.cfe.model.I_Z_CFE_ConfigDocDGI)MTable.get(getCtx(), org.xpande.cfe.model.I_Z_CFE_ConfigDocDGI.Table_Name)
			.getPO(getZ_CFE_ConfigDocDGI_ID(), get_TrxName());	}

	/** Set Z_CFE_ConfigDocDGI_ID.
		@param Z_CFE_ConfigDocDGI_ID Z_CFE_ConfigDocDGI_ID	  */
	public void setZ_CFE_ConfigDocDGI_ID (int Z_CFE_ConfigDocDGI_ID)
	{
		if (Z_CFE_ConfigDocDGI_ID < 1) 
			set_Value (COLUMNNAME_Z_CFE_ConfigDocDGI_ID, null);
		else 
			set_Value (COLUMNNAME_Z_CFE_ConfigDocDGI_ID, Integer.valueOf(Z_CFE_ConfigDocDGI_ID));
	}

	/** Get Z_CFE_ConfigDocDGI_ID.
		@return Z_CFE_ConfigDocDGI_ID	  */
	public int getZ_CFE_ConfigDocDGI_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Z_CFE_ConfigDocDGI_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Z_CFE_ConfigDocSend ID.
		@param Z_CFE_ConfigDocSend_ID Z_CFE_ConfigDocSend ID	  */
	public void setZ_CFE_ConfigDocSend_ID (int Z_CFE_ConfigDocSend_ID)
	{
		if (Z_CFE_ConfigDocSend_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_Z_CFE_ConfigDocSend_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_Z_CFE_ConfigDocSend_ID, Integer.valueOf(Z_CFE_ConfigDocSend_ID));
	}

	/** Get Z_CFE_ConfigDocSend ID.
		@return Z_CFE_ConfigDocSend ID	  */
	public int getZ_CFE_ConfigDocSend_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Z_CFE_ConfigDocSend_ID);
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