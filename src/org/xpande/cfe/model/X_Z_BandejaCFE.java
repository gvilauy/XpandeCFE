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

/** Generated Model for Z_BandejaCFE
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_Z_BandejaCFE extends PO implements I_Z_BandejaCFE, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20200815L;

    /** Standard Constructor */
    public X_Z_BandejaCFE (Properties ctx, int Z_BandejaCFE_ID, String trxName)
    {
      super (ctx, Z_BandejaCFE_ID, trxName);
      /** if (Z_BandejaCFE_ID == 0)
        {
			setAddress1 (null);
			setCity (null);
			setCodSucursal (null);
			setDateDoc (new Timestamp( System.currentTimeMillis() ));
// @#Date@
			setDateInvoiced (new Timestamp( System.currentTimeMillis() ));
			setDateTrx (new Timestamp( System.currentTimeMillis() ));
			setFileName (null);
			setFormaPagoCFE (null);
			setMntPagar (Env.ZERO);
			setMntTotal (Env.ZERO);
			setName (null);
			setNumeroCFE (null);
			setRegionName (null);
			setRUCEmisor (null);
			setRutReceptor (null);
			setSerieCFE (null);
			setTipoCFE (null);
			setTpoMonedaCFE (null);
			setValue (null);
			setZ_BandejaCFE_ID (0);
        } */
    }

    /** Load Constructor */
    public X_Z_BandejaCFE (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_Z_BandejaCFE[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Address 1.
		@param Address1 
		Address line 1 for this location
	  */
	public void setAddress1 (String Address1)
	{
		set_Value (COLUMNNAME_Address1, Address1);
	}

	/** Get Address 1.
		@return Address line 1 for this location
	  */
	public String getAddress1 () 
	{
		return (String)get_Value(COLUMNNAME_Address1);
	}

	/** Set AdendaCFE.
		@param AdendaCFE 
		Texto de Adenda en CFE
	  */
	public void setAdendaCFE (String AdendaCFE)
	{
		set_Value (COLUMNNAME_AdendaCFE, AdendaCFE);
	}

	/** Get AdendaCFE.
		@return Texto de Adenda en CFE
	  */
	public String getAdendaCFE () 
	{
		return (String)get_Value(COLUMNNAME_AdendaCFE);
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

	public I_C_BPartner getC_BPartner() throws RuntimeException
    {
		return (I_C_BPartner)MTable.get(getCtx(), I_C_BPartner.Table_Name)
			.getPO(getC_BPartner_ID(), get_TrxName());	}

	/** Set Business Partner .
		@param C_BPartner_ID 
		Identifies a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID)
	{
		if (C_BPartner_ID < 1) 
			set_Value (COLUMNNAME_C_BPartner_ID, null);
		else 
			set_Value (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
	}

	/** Get Business Partner .
		@return Identifies a Business Partner
	  */
	public int getC_BPartner_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_BPartner_Location getC_BPartner_Location() throws RuntimeException
    {
		return (I_C_BPartner_Location)MTable.get(getCtx(), I_C_BPartner_Location.Table_Name)
			.getPO(getC_BPartner_Location_ID(), get_TrxName());	}

	/** Set Partner Location.
		@param C_BPartner_Location_ID 
		Identifies the (ship to) address for this Business Partner
	  */
	public void setC_BPartner_Location_ID (int C_BPartner_Location_ID)
	{
		if (C_BPartner_Location_ID < 1) 
			set_Value (COLUMNNAME_C_BPartner_Location_ID, null);
		else 
			set_Value (COLUMNNAME_C_BPartner_Location_ID, Integer.valueOf(C_BPartner_Location_ID));
	}

	/** Get Partner Location.
		@return Identifies the (ship to) address for this Business Partner
	  */
	public int getC_BPartner_Location_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_Location_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_Currency getC_Currency() throws RuntimeException
    {
		return (I_C_Currency)MTable.get(getCtx(), I_C_Currency.Table_Name)
			.getPO(getC_Currency_ID(), get_TrxName());	}

	/** Set Currency.
		@param C_Currency_ID 
		The Currency for this record
	  */
	public void setC_Currency_ID (int C_Currency_ID)
	{
		if (C_Currency_ID < 1) 
			set_Value (COLUMNNAME_C_Currency_ID, null);
		else 
			set_Value (COLUMNNAME_C_Currency_ID, Integer.valueOf(C_Currency_ID));
	}

	/** Get Currency.
		@return The Currency for this record
	  */
	public int getC_Currency_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Currency_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_DocType getC_DocTypeTarget() throws RuntimeException
    {
		return (I_C_DocType)MTable.get(getCtx(), I_C_DocType.Table_Name)
			.getPO(getC_DocTypeTarget_ID(), get_TrxName());	}

	/** Set Target Document Type.
		@param C_DocTypeTarget_ID 
		Target document type for conversing documents
	  */
	public void setC_DocTypeTarget_ID (int C_DocTypeTarget_ID)
	{
		if (C_DocTypeTarget_ID < 1) 
			set_Value (COLUMNNAME_C_DocTypeTarget_ID, null);
		else 
			set_Value (COLUMNNAME_C_DocTypeTarget_ID, Integer.valueOf(C_DocTypeTarget_ID));
	}

	/** Get Target Document Type.
		@return Target document type for conversing documents
	  */
	public int getC_DocTypeTarget_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_DocTypeTarget_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set City.
		@param City 
		Identifies a City
	  */
	public void setCity (String City)
	{
		set_Value (COLUMNNAME_City, City);
	}

	/** Get City.
		@return Identifies a City
	  */
	public String getCity () 
	{
		return (String)get_Value(COLUMNNAME_City);
	}

	/** Set CodSucursal.
		@param CodSucursal 
		Código de Sucursal
	  */
	public void setCodSucursal (String CodSucursal)
	{
		set_Value (COLUMNNAME_CodSucursal, CodSucursal);
	}

	/** Get CodSucursal.
		@return Código de Sucursal
	  */
	public String getCodSucursal () 
	{
		return (String)get_Value(COLUMNNAME_CodSucursal);
	}

	/** Set Document Date.
		@param DateDoc 
		Date of the Document
	  */
	public void setDateDoc (Timestamp DateDoc)
	{
		set_Value (COLUMNNAME_DateDoc, DateDoc);
	}

	/** Get Document Date.
		@return Date of the Document
	  */
	public Timestamp getDateDoc () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateDoc);
	}

	/** Set Date Invoiced.
		@param DateInvoiced 
		Date printed on Invoice
	  */
	public void setDateInvoiced (Timestamp DateInvoiced)
	{
		set_Value (COLUMNNAME_DateInvoiced, DateInvoiced);
	}

	/** Get Date Invoiced.
		@return Date printed on Invoice
	  */
	public Timestamp getDateInvoiced () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateInvoiced);
	}

	/** Set Transaction Date.
		@param DateTrx 
		Transaction Date
	  */
	public void setDateTrx (Timestamp DateTrx)
	{
		set_Value (COLUMNNAME_DateTrx, DateTrx);
	}

	/** Get Transaction Date.
		@return Transaction Date
	  */
	public Timestamp getDateTrx () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateTrx);
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

	/** Set EMail Address.
		@param EMail 
		Electronic Mail Address
	  */
	public void setEMail (String EMail)
	{
		set_Value (COLUMNNAME_EMail, EMail);
	}

	/** Get EMail Address.
		@return Electronic Mail Address
	  */
	public String getEMail () 
	{
		return (String)get_Value(COLUMNNAME_EMail);
	}

	/** Set File Name.
		@param FileName 
		Name of the local file or URL
	  */
	public void setFileName (String FileName)
	{
		set_Value (COLUMNNAME_FileName, FileName);
	}

	/** Get File Name.
		@return Name of the local file or URL
	  */
	public String getFileName () 
	{
		return (String)get_Value(COLUMNNAME_FileName);
	}

	/** Set FormaPagoCFE.
		@param FormaPagoCFE 
		Forma de Pago para CFE
	  */
	public void setFormaPagoCFE (String FormaPagoCFE)
	{
		set_Value (COLUMNNAME_FormaPagoCFE, FormaPagoCFE);
	}

	/** Get FormaPagoCFE.
		@return Forma de Pago para CFE
	  */
	public String getFormaPagoCFE () 
	{
		return (String)get_Value(COLUMNNAME_FormaPagoCFE);
	}

	/** Set Idemisor.
		@param Idemisor 
		ID Emisor en CFE
	  */
	public void setIdemisor (String Idemisor)
	{
		set_Value (COLUMNNAME_Idemisor, Idemisor);
	}

	/** Get Idemisor.
		@return ID Emisor en CFE
	  */
	public String getIdemisor () 
	{
		return (String)get_Value(COLUMNNAME_Idemisor);
	}

	/** Set IVATasaBasica.
		@param IVATasaBasica 
		Tasa IVA Basica CFE
	  */
	public void setIVATasaBasica (BigDecimal IVATasaBasica)
	{
		set_Value (COLUMNNAME_IVATasaBasica, IVATasaBasica);
	}

	/** Get IVATasaBasica.
		@return Tasa IVA Basica CFE
	  */
	public BigDecimal getIVATasaBasica () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_IVATasaBasica);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set IVATasaMin.
		@param IVATasaMin 
		Tasa IVA Minimo CFE
	  */
	public void setIVATasaMin (BigDecimal IVATasaMin)
	{
		set_Value (COLUMNNAME_IVATasaMin, IVATasaMin);
	}

	/** Get IVATasaMin.
		@return Tasa IVA Minimo CFE
	  */
	public BigDecimal getIVATasaMin () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_IVATasaMin);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set MntExpoyAsim.
		@param MntExpoyAsim 
		Monto Expo. y Asim. CFE
	  */
	public void setMntExpoyAsim (BigDecimal MntExpoyAsim)
	{
		set_Value (COLUMNNAME_MntExpoyAsim, MntExpoyAsim);
	}

	/** Get MntExpoyAsim.
		@return Monto Expo. y Asim. CFE
	  */
	public BigDecimal getMntExpoyAsim () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MntExpoyAsim);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set MntImpuestoPerc.
		@param MntImpuestoPerc 
		Monto impuesto percibido CFE
	  */
	public void setMntImpuestoPerc (BigDecimal MntImpuestoPerc)
	{
		set_Value (COLUMNNAME_MntImpuestoPerc, MntImpuestoPerc);
	}

	/** Get MntImpuestoPerc.
		@return Monto impuesto percibido CFE
	  */
	public BigDecimal getMntImpuestoPerc () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MntImpuestoPerc);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set MntIVaenSusp.
		@param MntIVaenSusp 
		Monto IVA en Suspenso CFE
	  */
	public void setMntIVaenSusp (BigDecimal MntIVaenSusp)
	{
		set_Value (COLUMNNAME_MntIVaenSusp, MntIVaenSusp);
	}

	/** Get MntIVaenSusp.
		@return Monto IVA en Suspenso CFE
	  */
	public BigDecimal getMntIVaenSusp () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MntIVaenSusp);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set MntIVAOtra.
		@param MntIVAOtra 
		Monto otros impuestos CFE
	  */
	public void setMntIVAOtra (BigDecimal MntIVAOtra)
	{
		set_Value (COLUMNNAME_MntIVAOtra, MntIVAOtra);
	}

	/** Get MntIVAOtra.
		@return Monto otros impuestos CFE
	  */
	public BigDecimal getMntIVAOtra () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MntIVAOtra);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set MntIVATasaBasica.
		@param MntIVATasaBasica 
		Monto Tasa IVA Basica CFE
	  */
	public void setMntIVATasaBasica (BigDecimal MntIVATasaBasica)
	{
		set_Value (COLUMNNAME_MntIVATasaBasica, MntIVATasaBasica);
	}

	/** Get MntIVATasaBasica.
		@return Monto Tasa IVA Basica CFE
	  */
	public BigDecimal getMntIVATasaBasica () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MntIVATasaBasica);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set MntIVATasaMin.
		@param MntIVATasaMin 
		Monto IVA Tasa Minimo CFE
	  */
	public void setMntIVATasaMin (BigDecimal MntIVATasaMin)
	{
		set_Value (COLUMNNAME_MntIVATasaMin, MntIVATasaMin);
	}

	/** Get MntIVATasaMin.
		@return Monto IVA Tasa Minimo CFE
	  */
	public BigDecimal getMntIVATasaMin () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MntIVATasaMin);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set MntNetoIVAOtra.
		@param MntNetoIVAOtra 
		Monto Neto otros impuestos CFE
	  */
	public void setMntNetoIVAOtra (BigDecimal MntNetoIVAOtra)
	{
		set_Value (COLUMNNAME_MntNetoIVAOtra, MntNetoIVAOtra);
	}

	/** Get MntNetoIVAOtra.
		@return Monto Neto otros impuestos CFE
	  */
	public BigDecimal getMntNetoIVAOtra () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MntNetoIVAOtra);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set MntNetoIVATasaBasica.
		@param MntNetoIVATasaBasica 
		Monto Neto IVA Basico CFE
	  */
	public void setMntNetoIVATasaBasica (BigDecimal MntNetoIVATasaBasica)
	{
		set_Value (COLUMNNAME_MntNetoIVATasaBasica, MntNetoIVATasaBasica);
	}

	/** Get MntNetoIVATasaBasica.
		@return Monto Neto IVA Basico CFE
	  */
	public BigDecimal getMntNetoIVATasaBasica () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MntNetoIVATasaBasica);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set MntNetoIvaTasaMin.
		@param MntNetoIvaTasaMin 
		Monto Neto IVA Tasa Mínima CFE
	  */
	public void setMntNetoIvaTasaMin (BigDecimal MntNetoIvaTasaMin)
	{
		set_Value (COLUMNNAME_MntNetoIvaTasaMin, MntNetoIvaTasaMin);
	}

	/** Get MntNetoIvaTasaMin.
		@return Monto Neto IVA Tasa Mínima CFE
	  */
	public BigDecimal getMntNetoIvaTasaMin () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MntNetoIvaTasaMin);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set MntNoGrv.
		@param MntNoGrv 
		Monto no gravado CFE
	  */
	public void setMntNoGrv (BigDecimal MntNoGrv)
	{
		set_Value (COLUMNNAME_MntNoGrv, MntNoGrv);
	}

	/** Get MntNoGrv.
		@return Monto no gravado CFE
	  */
	public BigDecimal getMntNoGrv () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MntNoGrv);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set MntPagar.
		@param MntPagar 
		Monto a pagar CFE
	  */
	public void setMntPagar (BigDecimal MntPagar)
	{
		set_Value (COLUMNNAME_MntPagar, MntPagar);
	}

	/** Get MntPagar.
		@return Monto a pagar CFE
	  */
	public BigDecimal getMntPagar () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MntPagar);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set MntTotal.
		@param MntTotal 
		Monto total CFE
	  */
	public void setMntTotal (BigDecimal MntTotal)
	{
		set_Value (COLUMNNAME_MntTotal, MntTotal);
	}

	/** Get MntTotal.
		@return Monto total CFE
	  */
	public BigDecimal getMntTotal () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MntTotal);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set MntTotCredFisc.
		@param MntTotCredFisc 
		Monto total crédito fiscal CFE
	  */
	public void setMntTotCredFisc (BigDecimal MntTotCredFisc)
	{
		set_Value (COLUMNNAME_MntTotCredFisc, MntTotCredFisc);
	}

	/** Get MntTotCredFisc.
		@return Monto total crédito fiscal CFE
	  */
	public BigDecimal getMntTotCredFisc () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MntTotCredFisc);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set MntTotRetenido.
		@param MntTotRetenido 
		Monto total retenido
	  */
	public void setMntTotRetenido (BigDecimal MntTotRetenido)
	{
		set_Value (COLUMNNAME_MntTotRetenido, MntTotRetenido);
	}

	/** Get MntTotRetenido.
		@return Monto total retenido
	  */
	public BigDecimal getMntTotRetenido () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MntTotRetenido);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set MontoNF.
		@param MontoNF 
		Monto NF CFE
	  */
	public void setMontoNF (BigDecimal MontoNF)
	{
		set_Value (COLUMNNAME_MontoNF, MontoNF);
	}

	/** Get MontoNF.
		@return Monto NF CFE
	  */
	public BigDecimal getMontoNF () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MontoNF);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	/** Set Name 2.
		@param Name2 
		Additional Name
	  */
	public void setName2 (String Name2)
	{
		set_Value (COLUMNNAME_Name2, Name2);
	}

	/** Get Name 2.
		@return Additional Name
	  */
	public String getName2 () 
	{
		return (String)get_Value(COLUMNNAME_Name2);
	}

	/** Set NomSucursal.
		@param NomSucursal 
		Nombre de Sucursal
	  */
	public void setNomSucursal (String NomSucursal)
	{
		set_Value (COLUMNNAME_NomSucursal, NomSucursal);
	}

	/** Get NomSucursal.
		@return Nombre de Sucursal
	  */
	public String getNomSucursal () 
	{
		return (String)get_Value(COLUMNNAME_NomSucursal);
	}

	/** Set NumeroCFE.
		@param NumeroCFE 
		Número de CFE
	  */
	public void setNumeroCFE (String NumeroCFE)
	{
		set_Value (COLUMNNAME_NumeroCFE, NumeroCFE);
	}

	/** Get NumeroCFE.
		@return Número de CFE
	  */
	public String getNumeroCFE () 
	{
		return (String)get_Value(COLUMNNAME_NumeroCFE);
	}

	/** Set Region.
		@param RegionName 
		Name of the Region
	  */
	public void setRegionName (String RegionName)
	{
		set_Value (COLUMNNAME_RegionName, RegionName);
	}

	/** Get Region.
		@return Name of the Region
	  */
	public String getRegionName () 
	{
		return (String)get_Value(COLUMNNAME_RegionName);
	}

	/** Set RUCEmisor.
		@param RUCEmisor 
		RUT Emisor en CFE
	  */
	public void setRUCEmisor (String RUCEmisor)
	{
		set_Value (COLUMNNAME_RUCEmisor, RUCEmisor);
	}

	/** Get RUCEmisor.
		@return RUT Emisor en CFE
	  */
	public String getRUCEmisor () 
	{
		return (String)get_Value(COLUMNNAME_RUCEmisor);
	}

	/** Set RutReceptor.
		@param RutReceptor 
		RUT del receptor en CFE
	  */
	public void setRutReceptor (String RutReceptor)
	{
		set_Value (COLUMNNAME_RutReceptor, RutReceptor);
	}

	/** Get RutReceptor.
		@return RUT del receptor en CFE
	  */
	public String getRutReceptor () 
	{
		return (String)get_Value(COLUMNNAME_RutReceptor);
	}

	/** Set SerieCFE.
		@param SerieCFE 
		Serie para CFE
	  */
	public void setSerieCFE (String SerieCFE)
	{
		set_Value (COLUMNNAME_SerieCFE, SerieCFE);
	}

	/** Get SerieCFE.
		@return Serie para CFE
	  */
	public String getSerieCFE () 
	{
		return (String)get_Value(COLUMNNAME_SerieCFE);
	}

	/** Set Subject.
		@param Subject 
		Email Message Subject
	  */
	public void setSubject (String Subject)
	{
		set_Value (COLUMNNAME_Subject, Subject);
	}

	/** Get Subject.
		@return Email Message Subject
	  */
	public String getSubject () 
	{
		return (String)get_Value(COLUMNNAME_Subject);
	}

	/** Set TipoCFE.
		@param TipoCFE 
		Tipo CFE para CFE
	  */
	public void setTipoCFE (String TipoCFE)
	{
		set_Value (COLUMNNAME_TipoCFE, TipoCFE);
	}

	/** Get TipoCFE.
		@return Tipo CFE para CFE
	  */
	public String getTipoCFE () 
	{
		return (String)get_Value(COLUMNNAME_TipoCFE);
	}

	/** Set TipoDocRecep.
		@param TipoDocRecep 
		Tipo de documento recepcionado en CFE
	  */
	public void setTipoDocRecep (int TipoDocRecep)
	{
		set_Value (COLUMNNAME_TipoDocRecep, Integer.valueOf(TipoDocRecep));
	}

	/** Get TipoDocRecep.
		@return Tipo de documento recepcionado en CFE
	  */
	public int getTipoDocRecep () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TipoDocRecep);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TpoCambioCFE.
		@param TpoCambioCFE 
		Tipo de cambio en CFE
	  */
	public void setTpoCambioCFE (BigDecimal TpoCambioCFE)
	{
		set_Value (COLUMNNAME_TpoCambioCFE, TpoCambioCFE);
	}

	/** Get TpoCambioCFE.
		@return Tipo de cambio en CFE
	  */
	public BigDecimal getTpoCambioCFE () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TpoCambioCFE);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set TpoMonedaCFE.
		@param TpoMonedaCFE 
		Tipo de moneda en CFE
	  */
	public void setTpoMonedaCFE (String TpoMonedaCFE)
	{
		set_Value (COLUMNNAME_TpoMonedaCFE, TpoMonedaCFE);
	}

	/** Get TpoMonedaCFE.
		@return Tipo de moneda en CFE
	  */
	public String getTpoMonedaCFE () 
	{
		return (String)get_Value(COLUMNNAME_TpoMonedaCFE);
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

	/** Set VersionCFE.
		@param VersionCFE 
		Versión de sistema CFE
	  */
	public void setVersionCFE (String VersionCFE)
	{
		set_Value (COLUMNNAME_VersionCFE, VersionCFE);
	}

	/** Get VersionCFE.
		@return Versión de sistema CFE
	  */
	public String getVersionCFE () 
	{
		return (String)get_Value(COLUMNNAME_VersionCFE);
	}

	/** Set Z_BandejaCFE ID.
		@param Z_BandejaCFE_ID Z_BandejaCFE ID	  */
	public void setZ_BandejaCFE_ID (int Z_BandejaCFE_ID)
	{
		if (Z_BandejaCFE_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_Z_BandejaCFE_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_Z_BandejaCFE_ID, Integer.valueOf(Z_BandejaCFE_ID));
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