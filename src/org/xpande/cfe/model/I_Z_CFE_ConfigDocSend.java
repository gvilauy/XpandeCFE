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

/** Generated Interface for Z_CFE_ConfigDocSend
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0
 */
public interface I_Z_CFE_ConfigDocSend 
{

    /** TableName=Z_CFE_ConfigDocSend */
    public static final String Table_Name = "Z_CFE_ConfigDocSend";

    /** AD_Table_ID=1000141 */
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

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within client
	  */
	public void setAD_Org_ID(int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name C_DocType_ID */
    public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";

	/** Set Document Type.
	  * Document type or rules
	  */
	public void setC_DocType_ID(int C_DocType_ID);

	/** Get Document Type.
	  * Document type or rules
	  */
	public int getC_DocType_ID();

	public I_C_DocType getC_DocType() throws RuntimeException;

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

    /** Column name Description */
    public static final String COLUMNNAME_Description = "Description";

	/** Set Description.
	  * Optional short description of the record
	  */
	public void setDescription(String Description);

	/** Get Description.
	  * Optional short description of the record
	  */
	public String getDescription();

    /** Column name DocumentSerie */
    public static final String COLUMNNAME_DocumentSerie = "DocumentSerie";

	/** Set DocumentSerie.
	  * Serie de un Documento
	  */
	public void setDocumentSerie(String DocumentSerie);

	/** Get DocumentSerie.
	  * Serie de un Documento
	  */
	public String getDocumentSerie();

    /** Column name DueDate */
    public static final String COLUMNNAME_DueDate = "DueDate";

	/** Set Due Date.
	  * Date when the payment is due
	  */
	public void setDueDate(Timestamp DueDate);

	/** Get Due Date.
	  * Date when the payment is due
	  */
	public Timestamp getDueDate();

    /** Column name EnProduccion */
    public static final String COLUMNNAME_EnProduccion = "EnProduccion";

	/** Set EnProduccion.
	  * Si esta en producción o no
	  */
	public void setEnProduccion(boolean EnProduccion);

	/** Get EnProduccion.
	  * Si esta en producción o no
	  */
	public boolean isEnProduccion();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive(boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name NumeroCAE */
    public static final String COLUMNNAME_NumeroCAE = "NumeroCAE";

	/** Set NumeroCAE.
	  * Número CAE para envío electrónico de comprobantes a Impositiva
	  */
	public void setNumeroCAE(String NumeroCAE);

	/** Get NumeroCAE.
	  * Número CAE para envío electrónico de comprobantes a Impositiva
	  */
	public String getNumeroCAE();

    /** Column name NumeroDesde */
    public static final String COLUMNNAME_NumeroDesde = "NumeroDesde";

	/** Set NumeroDesde.
	  * Numero desde para Rango de Enteros
	  */
	public void setNumeroDesde(int NumeroDesde);

	/** Get NumeroDesde.
	  * Numero desde para Rango de Enteros
	  */
	public int getNumeroDesde();

    /** Column name NumeroHasta */
    public static final String COLUMNNAME_NumeroHasta = "NumeroHasta";

	/** Set NumeroHasta.
	  * Numero hasta para Rango de Enteros
	  */
	public void setNumeroHasta(int NumeroHasta);

	/** Get NumeroHasta.
	  * Numero hasta para Rango de Enteros
	  */
	public int getNumeroHasta();

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

    /** Column name Z_CFE_ConfigDocDGI_ID */
    public static final String COLUMNNAME_Z_CFE_ConfigDocDGI_ID = "Z_CFE_ConfigDocDGI_ID";

	/** Set Z_CFE_ConfigDocDGI_ID	  */
	public void setZ_CFE_ConfigDocDGI_ID(int Z_CFE_ConfigDocDGI_ID);

	/** Get Z_CFE_ConfigDocDGI_ID	  */
	public int getZ_CFE_ConfigDocDGI_ID();

	public I_Z_CFE_ConfigDocDGI getZ_CFE_ConfigDocDGI() throws RuntimeException;

    /** Column name Z_CFE_ConfigDocSend_ID */
    public static final String COLUMNNAME_Z_CFE_ConfigDocSend_ID = "Z_CFE_ConfigDocSend_ID";

	/** Set Z_CFE_ConfigDocSend ID	  */
	public void setZ_CFE_ConfigDocSend_ID(int Z_CFE_ConfigDocSend_ID);

	/** Get Z_CFE_ConfigDocSend ID	  */
	public int getZ_CFE_ConfigDocSend_ID();

    /** Column name Z_CFE_Config_ID */
    public static final String COLUMNNAME_Z_CFE_Config_ID = "Z_CFE_Config_ID";

	/** Set Z_CFE_Config ID	  */
	public void setZ_CFE_Config_ID(int Z_CFE_Config_ID);

	/** Get Z_CFE_Config ID	  */
	public int getZ_CFE_Config_ID();

	public I_Z_CFE_Config getZ_CFE_Config() throws RuntimeException;

    /** Column name Z_CFE_VendorOrg_ID */
    public static final String COLUMNNAME_Z_CFE_VendorOrg_ID = "Z_CFE_VendorOrg_ID";

	/** Set Z_CFE_VendorOrg ID	  */
	public void setZ_CFE_VendorOrg_ID(int Z_CFE_VendorOrg_ID);

	/** Get Z_CFE_VendorOrg ID	  */
	public int getZ_CFE_VendorOrg_ID();

	public I_Z_CFE_VendorOrg getZ_CFE_VendorOrg() throws RuntimeException;
}
