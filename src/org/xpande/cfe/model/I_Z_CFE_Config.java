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

/** Generated Interface for Z_CFE_Config
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0
 */
public interface I_Z_CFE_Config 
{

    /** TableName=Z_CFE_Config */
    public static final String Table_Name = "Z_CFE_Config";

    /** AD_Table_ID=1000139 */
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

    /** Column name AD_EMailConfig_ID */
    public static final String COLUMNNAME_AD_EMailConfig_ID = "AD_EMailConfig_ID";

	/** Set EMail Configuration	  */
	public void setAD_EMailConfig_ID (int AD_EMailConfig_ID);

	/** Get EMail Configuration	  */
	public int getAD_EMailConfig_ID();

	public I_AD_EMailConfig getAD_EMailConfig() throws RuntimeException;

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

    /** Column name EMail */
    public static final String COLUMNNAME_EMail = "EMail";

	/** Set EMail Address.
	  * Electronic Mail Address
	  */
	public void setEMail (String EMail);

	/** Get EMail Address.
	  * Electronic Mail Address
	  */
	public String getEMail();

    /** Column name EMailUserPW */
    public static final String COLUMNNAME_EMailUserPW = "EMailUserPW";

	/** Set EMail User Password.
	  * Password of your email user id
	  */
	public void setEMailUserPW (String EMailUserPW);

	/** Get EMail User Password.
	  * Password of your email user id
	  */
	public String getEMailUserPW();

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

    /** Column name TaxBasico_ID */
    public static final String COLUMNNAME_TaxBasico_ID = "TaxBasico_ID";

	/** Set TaxBasico_ID.
	  * ID de Impuesto Básico por Defecto
	  */
	public void setTaxBasico_ID (int TaxBasico_ID);

	/** Get TaxBasico_ID.
	  * ID de Impuesto Básico por Defecto
	  */
	public int getTaxBasico_ID();

	public I_C_Tax getTaxBasico() throws RuntimeException;

    /** Column name TaxExento_ID */
    public static final String COLUMNNAME_TaxExento_ID = "TaxExento_ID";

	/** Set TaxExento_ID.
	  * ID de Impuesto Exento por Defecto
	  */
	public void setTaxExento_ID (int TaxExento_ID);

	/** Get TaxExento_ID.
	  * ID de Impuesto Exento por Defecto
	  */
	public int getTaxExento_ID();

	public I_C_Tax getTaxExento() throws RuntimeException;

    /** Column name TaxMinimo_ID */
    public static final String COLUMNNAME_TaxMinimo_ID = "TaxMinimo_ID";

	/** Set TaxMinimo_ID.
	  * ID de Impuesto Tasa Mínimo por Defecto
	  */
	public void setTaxMinimo_ID (int TaxMinimo_ID);

	/** Get TaxMinimo_ID.
	  * ID de Impuesto Tasa Mínimo por Defecto
	  */
	public int getTaxMinimo_ID();

	public I_C_Tax getTaxMinimo() throws RuntimeException;

    /** Column name TaxRedondeo_ID */
    public static final String COLUMNNAME_TaxRedondeo_ID = "TaxRedondeo_ID";

	/** Set TaxRedondeo_ID.
	  * ID de Tasa de Impuesto por defecto para Redondeo positivo
	  */
	public void setTaxRedondeo_ID (int TaxRedondeo_ID);

	/** Get TaxRedondeo_ID.
	  * ID de Tasa de Impuesto por defecto para Redondeo positivo
	  */
	public int getTaxRedondeo_ID();

	public I_C_Tax getTaxRedondeo() throws RuntimeException;

    /** Column name TaxRedondeoNeg_ID */
    public static final String COLUMNNAME_TaxRedondeoNeg_ID = "TaxRedondeoNeg_ID";

	/** Set TaxRedondeoNeg_ID.
	  * ID de Tasa de Impuesto por defecto para Redondeo negativo
	  */
	public void setTaxRedondeoNeg_ID (int TaxRedondeoNeg_ID);

	/** Get TaxRedondeoNeg_ID.
	  * ID de Tasa de Impuesto por defecto para Redondeo negativo
	  */
	public int getTaxRedondeoNeg_ID();

	public I_C_Tax getTaxRedondeoNeg() throws RuntimeException;

    /** Column name TopeLinFact */
    public static final String COLUMNNAME_TopeLinFact = "TopeLinFact";

	/** Set TopeLinFact.
	  * Tope lineas para eFacturas
	  */
	public void setTopeLinFact (int TopeLinFact);

	/** Get TopeLinFact.
	  * Tope lineas para eFacturas
	  */
	public int getTopeLinFact();

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

    /** Column name Z_CFE_Config_ID */
    public static final String COLUMNNAME_Z_CFE_Config_ID = "Z_CFE_Config_ID";

	/** Set Z_CFE_Config ID	  */
	public void setZ_CFE_Config_ID (int Z_CFE_Config_ID);

	/** Get Z_CFE_Config ID	  */
	public int getZ_CFE_Config_ID();
}
