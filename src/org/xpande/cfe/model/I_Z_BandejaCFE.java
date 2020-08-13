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
package org.xpande.cfe.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for Z_BandejaCFE
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0
 */
public interface I_Z_BandejaCFE 
{

    /** TableName=Z_BandejaCFE */
    public static final String Table_Name = "Z_BandejaCFE";

    /** AD_Table_ID=1000367 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name Address1 */
    public static final String COLUMNNAME_Address1 = "Address1";

	/** Set Address 1.
	  * Address line 1 for this location
	  */
	public void setAddress1 (String Address1);

	/** Get Address 1.
	  * Address line 1 for this location
	  */
	public String getAddress1();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within client
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name AD_OrgTrx_ID */
    public static final String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";

	/** Set Trx Organization.
	  * Performing or initiating organization
	  */
	public void setAD_OrgTrx_ID (int AD_OrgTrx_ID);

	/** Get Trx Organization.
	  * Performing or initiating organization
	  */
	public int getAD_OrgTrx_ID();

    /** Column name C_BPartner_ID */
    public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";

	/** Set Business Partner .
	  * Identifies a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID);

	/** Get Business Partner .
	  * Identifies a Business Partner
	  */
	public int getC_BPartner_ID();

	public I_C_BPartner getC_BPartner() throws RuntimeException;

    /** Column name C_BPartner_Location_ID */
    public static final String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";

	/** Set Partner Location.
	  * Identifies the (ship to) address for this Business Partner
	  */
	public void setC_BPartner_Location_ID (int C_BPartner_Location_ID);

	/** Get Partner Location.
	  * Identifies the (ship to) address for this Business Partner
	  */
	public int getC_BPartner_Location_ID();

	public I_C_BPartner_Location getC_BPartner_Location() throws RuntimeException;

    /** Column name C_Currency_ID */
    public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";

	/** Set Currency.
	  * The Currency for this record
	  */
	public void setC_Currency_ID (int C_Currency_ID);

	/** Get Currency.
	  * The Currency for this record
	  */
	public int getC_Currency_ID();

	public I_C_Currency getC_Currency() throws RuntimeException;

    /** Column name C_DocTypeTarget_ID */
    public static final String COLUMNNAME_C_DocTypeTarget_ID = "C_DocTypeTarget_ID";

	/** Set Target Document Type.
	  * Target document type for conversing documents
	  */
	public void setC_DocTypeTarget_ID (int C_DocTypeTarget_ID);

	/** Get Target Document Type.
	  * Target document type for conversing documents
	  */
	public int getC_DocTypeTarget_ID();

	public I_C_DocType getC_DocTypeTarget() throws RuntimeException;

    /** Column name City */
    public static final String COLUMNNAME_City = "City";

	/** Set City.
	  * Identifies a City
	  */
	public void setCity (String City);

	/** Get City.
	  * Identifies a City
	  */
	public String getCity();

    /** Column name CodSucursal */
    public static final String COLUMNNAME_CodSucursal = "CodSucursal";

	/** Set CodSucursal.
	  * Código de Sucursal
	  */
	public void setCodSucursal (String CodSucursal);

	/** Get CodSucursal.
	  * Código de Sucursal
	  */
	public String getCodSucursal();

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name DateDoc */
    public static final String COLUMNNAME_DateDoc = "DateDoc";

	/** Set Document Date.
	  * Date of the Document
	  */
	public void setDateDoc (Timestamp DateDoc);

	/** Get Document Date.
	  * Date of the Document
	  */
	public Timestamp getDateDoc();

    /** Column name DateInvoiced */
    public static final String COLUMNNAME_DateInvoiced = "DateInvoiced";

	/** Set Date Invoiced.
	  * Date printed on Invoice
	  */
	public void setDateInvoiced (Timestamp DateInvoiced);

	/** Get Date Invoiced.
	  * Date printed on Invoice
	  */
	public Timestamp getDateInvoiced();

    /** Column name DateTrx */
    public static final String COLUMNNAME_DateTrx = "DateTrx";

	/** Set Transaction Date.
	  * Transaction Date
	  */
	public void setDateTrx (Timestamp DateTrx);

	/** Get Transaction Date.
	  * Transaction Date
	  */
	public Timestamp getDateTrx();

    /** Column name DueDate */
    public static final String COLUMNNAME_DueDate = "DueDate";

	/** Set Due Date.
	  * Date when the payment is due
	  */
	public void setDueDate (Timestamp DueDate);

	/** Get Due Date.
	  * Date when the payment is due
	  */
	public Timestamp getDueDate();

    /** Column name FileName */
    public static final String COLUMNNAME_FileName = "FileName";

	/** Set File Name.
	  * Name of the local file or URL
	  */
	public void setFileName (String FileName);

	/** Get File Name.
	  * Name of the local file or URL
	  */
	public String getFileName();

    /** Column name FormaPagoCFE */
    public static final String COLUMNNAME_FormaPagoCFE = "FormaPagoCFE";

	/** Set FormaPagoCFE.
	  * Forma de Pago para CFE
	  */
	public void setFormaPagoCFE (String FormaPagoCFE);

	/** Get FormaPagoCFE.
	  * Forma de Pago para CFE
	  */
	public String getFormaPagoCFE();

    /** Column name Idemisor */
    public static final String COLUMNNAME_Idemisor = "Idemisor";

	/** Set Idemisor.
	  * ID Emisor en CFE
	  */
	public void setIdemisor (String Idemisor);

	/** Get Idemisor.
	  * ID Emisor en CFE
	  */
	public String getIdemisor();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name IVATasaBasica */
    public static final String COLUMNNAME_IVATasaBasica = "IVATasaBasica";

	/** Set IVATasaBasica.
	  * Tasa IVA Basica CFE
	  */
	public void setIVATasaBasica (BigDecimal IVATasaBasica);

	/** Get IVATasaBasica.
	  * Tasa IVA Basica CFE
	  */
	public BigDecimal getIVATasaBasica();

    /** Column name IVATasaMin */
    public static final String COLUMNNAME_IVATasaMin = "IVATasaMin";

	/** Set IVATasaMin.
	  * Tasa IVA Minimo CFE
	  */
	public void setIVATasaMin (BigDecimal IVATasaMin);

	/** Get IVATasaMin.
	  * Tasa IVA Minimo CFE
	  */
	public BigDecimal getIVATasaMin();

    /** Column name MntExpoyAsim */
    public static final String COLUMNNAME_MntExpoyAsim = "MntExpoyAsim";

	/** Set MntExpoyAsim.
	  * Monto Expo. y Asim. CFE
	  */
	public void setMntExpoyAsim (BigDecimal MntExpoyAsim);

	/** Get MntExpoyAsim.
	  * Monto Expo. y Asim. CFE
	  */
	public BigDecimal getMntExpoyAsim();

    /** Column name MntImpuestoPerc */
    public static final String COLUMNNAME_MntImpuestoPerc = "MntImpuestoPerc";

	/** Set MntImpuestoPerc.
	  * Monto impuesto percibido CFE
	  */
	public void setMntImpuestoPerc (BigDecimal MntImpuestoPerc);

	/** Get MntImpuestoPerc.
	  * Monto impuesto percibido CFE
	  */
	public BigDecimal getMntImpuestoPerc();

    /** Column name MntIVaenSusp */
    public static final String COLUMNNAME_MntIVaenSusp = "MntIVaenSusp";

	/** Set MntIVaenSusp.
	  * Monto IVA en Suspenso CFE
	  */
	public void setMntIVaenSusp (BigDecimal MntIVaenSusp);

	/** Get MntIVaenSusp.
	  * Monto IVA en Suspenso CFE
	  */
	public BigDecimal getMntIVaenSusp();

    /** Column name MntIVAOtra */
    public static final String COLUMNNAME_MntIVAOtra = "MntIVAOtra";

	/** Set MntIVAOtra.
	  * Monto otros impuestos CFE
	  */
	public void setMntIVAOtra (BigDecimal MntIVAOtra);

	/** Get MntIVAOtra.
	  * Monto otros impuestos CFE
	  */
	public BigDecimal getMntIVAOtra();

    /** Column name MntIVATasaBasica */
    public static final String COLUMNNAME_MntIVATasaBasica = "MntIVATasaBasica";

	/** Set MntIVATasaBasica.
	  * Monto Tasa IVA Basica CFE
	  */
	public void setMntIVATasaBasica (BigDecimal MntIVATasaBasica);

	/** Get MntIVATasaBasica.
	  * Monto Tasa IVA Basica CFE
	  */
	public BigDecimal getMntIVATasaBasica();

    /** Column name MntIVATasaMin */
    public static final String COLUMNNAME_MntIVATasaMin = "MntIVATasaMin";

	/** Set MntIVATasaMin.
	  * Monto IVA Tasa Minimo CFE
	  */
	public void setMntIVATasaMin (BigDecimal MntIVATasaMin);

	/** Get MntIVATasaMin.
	  * Monto IVA Tasa Minimo CFE
	  */
	public BigDecimal getMntIVATasaMin();

    /** Column name MntNetoIVAOtra */
    public static final String COLUMNNAME_MntNetoIVAOtra = "MntNetoIVAOtra";

	/** Set MntNetoIVAOtra.
	  * Monto Neto otros impuestos CFE
	  */
	public void setMntNetoIVAOtra (BigDecimal MntNetoIVAOtra);

	/** Get MntNetoIVAOtra.
	  * Monto Neto otros impuestos CFE
	  */
	public BigDecimal getMntNetoIVAOtra();

    /** Column name MntNetoIVATasaBasica */
    public static final String COLUMNNAME_MntNetoIVATasaBasica = "MntNetoIVATasaBasica";

	/** Set MntNetoIVATasaBasica.
	  * Monto Neto IVA Basico CFE
	  */
	public void setMntNetoIVATasaBasica (BigDecimal MntNetoIVATasaBasica);

	/** Get MntNetoIVATasaBasica.
	  * Monto Neto IVA Basico CFE
	  */
	public BigDecimal getMntNetoIVATasaBasica();

    /** Column name MntNetoIvaTasaMin */
    public static final String COLUMNNAME_MntNetoIvaTasaMin = "MntNetoIvaTasaMin";

	/** Set MntNetoIvaTasaMin.
	  * Monto Neto IVA Tasa Mínima CFE
	  */
	public void setMntNetoIvaTasaMin (BigDecimal MntNetoIvaTasaMin);

	/** Get MntNetoIvaTasaMin.
	  * Monto Neto IVA Tasa Mínima CFE
	  */
	public BigDecimal getMntNetoIvaTasaMin();

    /** Column name MntNoGrv */
    public static final String COLUMNNAME_MntNoGrv = "MntNoGrv";

	/** Set MntNoGrv.
	  * Monto no gravado CFE
	  */
	public void setMntNoGrv (BigDecimal MntNoGrv);

	/** Get MntNoGrv.
	  * Monto no gravado CFE
	  */
	public BigDecimal getMntNoGrv();

    /** Column name MntPagar */
    public static final String COLUMNNAME_MntPagar = "MntPagar";

	/** Set MntPagar.
	  * Monto a pagar CFE
	  */
	public void setMntPagar (BigDecimal MntPagar);

	/** Get MntPagar.
	  * Monto a pagar CFE
	  */
	public BigDecimal getMntPagar();

    /** Column name MntTotal */
    public static final String COLUMNNAME_MntTotal = "MntTotal";

	/** Set MntTotal.
	  * Monto total CFE
	  */
	public void setMntTotal (BigDecimal MntTotal);

	/** Get MntTotal.
	  * Monto total CFE
	  */
	public BigDecimal getMntTotal();

    /** Column name MntTotCredFisc */
    public static final String COLUMNNAME_MntTotCredFisc = "MntTotCredFisc";

	/** Set MntTotCredFisc.
	  * Monto total crédito fiscal CFE
	  */
	public void setMntTotCredFisc (BigDecimal MntTotCredFisc);

	/** Get MntTotCredFisc.
	  * Monto total crédito fiscal CFE
	  */
	public BigDecimal getMntTotCredFisc();

    /** Column name MntTotRetenido */
    public static final String COLUMNNAME_MntTotRetenido = "MntTotRetenido";

	/** Set MntTotRetenido.
	  * Monto total retenido
	  */
	public void setMntTotRetenido (BigDecimal MntTotRetenido);

	/** Get MntTotRetenido.
	  * Monto total retenido
	  */
	public BigDecimal getMntTotRetenido();

    /** Column name MontoNF */
    public static final String COLUMNNAME_MontoNF = "MontoNF";

	/** Set MontoNF.
	  * Monto NF CFE
	  */
	public void setMontoNF (BigDecimal MontoNF);

	/** Get MontoNF.
	  * Monto NF CFE
	  */
	public BigDecimal getMontoNF();

    /** Column name Name */
    public static final String COLUMNNAME_Name = "Name";

	/** Set Name.
	  * Alphanumeric identifier of the entity
	  */
	public void setName (String Name);

	/** Get Name.
	  * Alphanumeric identifier of the entity
	  */
	public String getName();

    /** Column name Name2 */
    public static final String COLUMNNAME_Name2 = "Name2";

	/** Set Name 2.
	  * Additional Name
	  */
	public void setName2 (String Name2);

	/** Get Name 2.
	  * Additional Name
	  */
	public String getName2();

    /** Column name NomSucursal */
    public static final String COLUMNNAME_NomSucursal = "NomSucursal";

	/** Set NomSucursal.
	  * Nombre de Sucursal
	  */
	public void setNomSucursal (String NomSucursal);

	/** Get NomSucursal.
	  * Nombre de Sucursal
	  */
	public String getNomSucursal();

    /** Column name NumeroCFE */
    public static final String COLUMNNAME_NumeroCFE = "NumeroCFE";

	/** Set NumeroCFE.
	  * Número de CFE
	  */
	public void setNumeroCFE (String NumeroCFE);

	/** Get NumeroCFE.
	  * Número de CFE
	  */
	public String getNumeroCFE();

    /** Column name RegionName */
    public static final String COLUMNNAME_RegionName = "RegionName";

	/** Set Region.
	  * Name of the Region
	  */
	public void setRegionName (String RegionName);

	/** Get Region.
	  * Name of the Region
	  */
	public String getRegionName();

    /** Column name RUCEmisor */
    public static final String COLUMNNAME_RUCEmisor = "RUCEmisor";

	/** Set RUCEmisor.
	  * RUT Emisor en CFE
	  */
	public void setRUCEmisor (String RUCEmisor);

	/** Get RUCEmisor.
	  * RUT Emisor en CFE
	  */
	public String getRUCEmisor();

    /** Column name RutReceptor */
    public static final String COLUMNNAME_RutReceptor = "RutReceptor";

	/** Set RutReceptor.
	  * RUT del receptor en CFE
	  */
	public void setRutReceptor (String RutReceptor);

	/** Get RutReceptor.
	  * RUT del receptor en CFE
	  */
	public String getRutReceptor();

    /** Column name SerieCFE */
    public static final String COLUMNNAME_SerieCFE = "SerieCFE";

	/** Set SerieCFE.
	  * Serie para CFE
	  */
	public void setSerieCFE (String SerieCFE);

	/** Get SerieCFE.
	  * Serie para CFE
	  */
	public String getSerieCFE();

    /** Column name TipoCFE */
    public static final String COLUMNNAME_TipoCFE = "TipoCFE";

	/** Set TipoCFE.
	  * Tipo CFE para CFE
	  */
	public void setTipoCFE (String TipoCFE);

	/** Get TipoCFE.
	  * Tipo CFE para CFE
	  */
	public String getTipoCFE();

    /** Column name TipoDocRecep */
    public static final String COLUMNNAME_TipoDocRecep = "TipoDocRecep";

	/** Set TipoDocRecep.
	  * Tipo de documento recepcionado en CFE
	  */
	public void setTipoDocRecep (int TipoDocRecep);

	/** Get TipoDocRecep.
	  * Tipo de documento recepcionado en CFE
	  */
	public int getTipoDocRecep();

    /** Column name TpoCambioCFE */
    public static final String COLUMNNAME_TpoCambioCFE = "TpoCambioCFE";

	/** Set TpoCambioCFE.
	  * Tipo de cambio en CFE
	  */
	public void setTpoCambioCFE (BigDecimal TpoCambioCFE);

	/** Get TpoCambioCFE.
	  * Tipo de cambio en CFE
	  */
	public BigDecimal getTpoCambioCFE();

    /** Column name TpoMonedaCFE */
    public static final String COLUMNNAME_TpoMonedaCFE = "TpoMonedaCFE";

	/** Set TpoMonedaCFE.
	  * Tipo de moneda en CFE
	  */
	public void setTpoMonedaCFE (String TpoMonedaCFE);

	/** Get TpoMonedaCFE.
	  * Tipo de moneda en CFE
	  */
	public String getTpoMonedaCFE();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();

    /** Column name UUID */
    public static final String COLUMNNAME_UUID = "UUID";

	/** Set Immutable Universally Unique Identifier.
	  * Immutable Universally Unique Identifier
	  */
	public void setUUID (String UUID);

	/** Get Immutable Universally Unique Identifier.
	  * Immutable Universally Unique Identifier
	  */
	public String getUUID();

    /** Column name Value */
    public static final String COLUMNNAME_Value = "Value";

	/** Set Search Key.
	  * Search key for the record in the format required - must be unique
	  */
	public void setValue (String Value);

	/** Get Search Key.
	  * Search key for the record in the format required - must be unique
	  */
	public String getValue();

    /** Column name VersionCFE */
    public static final String COLUMNNAME_VersionCFE = "VersionCFE";

	/** Set VersionCFE.
	  * Versión de sistema CFE
	  */
	public void setVersionCFE (String VersionCFE);

	/** Get VersionCFE.
	  * Versión de sistema CFE
	  */
	public String getVersionCFE();

    /** Column name Z_BandejaCFE_ID */
    public static final String COLUMNNAME_Z_BandejaCFE_ID = "Z_BandejaCFE_ID";

	/** Set Z_BandejaCFE ID	  */
	public void setZ_BandejaCFE_ID (int Z_BandejaCFE_ID);

	/** Get Z_BandejaCFE ID	  */
	public int getZ_BandejaCFE_ID();
}
