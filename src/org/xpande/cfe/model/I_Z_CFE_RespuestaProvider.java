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

/** Generated Interface for Z_CFE_RespuestaProvider
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0
 */
public interface I_Z_CFE_RespuestaProvider 
{

    /** TableName=Z_CFE_RespuestaProvider */
    public static final String Table_Name = "Z_CFE_RespuestaProvider";

    /** AD_Table_ID=1000100 */
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

    /** Column name AD_Table_ID */
    public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";

	/** Set Table.
	  * Database Table information
	  */
	public void setAD_Table_ID(int AD_Table_ID);

	/** Get Table.
	  * Database Table information
	  */
	public int getAD_Table_ID();

	public I_AD_Table getAD_Table() throws RuntimeException;

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

    /** Column name CFE_AnioResolucion */
    public static final String COLUMNNAME_CFE_AnioResolucion = "CFE_AnioResolucion";

	/** Set CFE_AnioResolucion.
	  * CFE_AnioResolucion
	  */
	public void setCFE_AnioResolucion(int CFE_AnioResolucion);

	/** Get CFE_AnioResolucion.
	  * CFE_AnioResolucion
	  */
	public int getCFE_AnioResolucion();

    /** Column name CFE_CAE_ID */
    public static final String COLUMNNAME_CFE_CAE_ID = "CFE_CAE_ID";

	/** Set CFE_CAE_ID.
	  * CFE_CAE_ID
	  */
	public void setCFE_CAE_ID(BigDecimal CFE_CAE_ID);

	/** Get CFE_CAE_ID.
	  * CFE_CAE_ID
	  */
	public BigDecimal getCFE_CAE_ID();

    /** Column name CFE_Descripcion */
    public static final String COLUMNNAME_CFE_Descripcion = "CFE_Descripcion";

	/** Set CFE_Descripcion.
	  * CFE_Descripcion
	  */
	public void setCFE_Descripcion(String CFE_Descripcion);

	/** Get CFE_Descripcion.
	  * CFE_Descripcion
	  */
	public String getCFE_Descripcion();

    /** Column name CFE_DigitoVerificador */
    public static final String COLUMNNAME_CFE_DigitoVerificador = "CFE_DigitoVerificador";

	/** Set CFE_DigitoVerificador	  */
	public void setCFE_DigitoVerificador(String CFE_DigitoVerificador);

	/** Get CFE_DigitoVerificador	  */
	public String getCFE_DigitoVerificador();

    /** Column name CFE_FechaFirma */
    public static final String COLUMNNAME_CFE_FechaFirma = "CFE_FechaFirma";

	/** Set CFE_FechaFirma.
	  * CFE_FechaFirma
	  */
	public void setCFE_FechaFirma(Timestamp CFE_FechaFirma);

	/** Get CFE_FechaFirma.
	  * CFE_FechaFirma
	  */
	public Timestamp getCFE_FechaFirma();

    /** Column name CFE_NroFinal_CAE */
    public static final String COLUMNNAME_CFE_NroFinal_CAE = "CFE_NroFinal_CAE";

	/** Set CFE_NroFinal_CAE.
	  * CFE_NroFinal_CAE
	  */
	public void setCFE_NroFinal_CAE(BigDecimal CFE_NroFinal_CAE);

	/** Get CFE_NroFinal_CAE.
	  * CFE_NroFinal_CAE
	  */
	public BigDecimal getCFE_NroFinal_CAE();

    /** Column name CFE_NroInicial_CAE */
    public static final String COLUMNNAME_CFE_NroInicial_CAE = "CFE_NroInicial_CAE";

	/** Set CFE_NroInicial_CAE.
	  * CFE_NroInicial_CAE
	  */
	public void setCFE_NroInicial_CAE(BigDecimal CFE_NroInicial_CAE);

	/** Get CFE_NroInicial_CAE.
	  * CFE_NroInicial_CAE
	  */
	public BigDecimal getCFE_NroInicial_CAE();

    /** Column name CFE_Numero */
    public static final String COLUMNNAME_CFE_Numero = "CFE_Numero";

	/** Set CFE_Numero.
	  * CFE_Numero
	  */
	public void setCFE_Numero(BigDecimal CFE_Numero);

	/** Get CFE_Numero.
	  * CFE_Numero
	  */
	public BigDecimal getCFE_Numero();

    /** Column name CFE_Resolucion */
    public static final String COLUMNNAME_CFE_Resolucion = "CFE_Resolucion";

	/** Set CFE_Resolucion.
	  * CFE_Resolucion
	  */
	public void setCFE_Resolucion(String CFE_Resolucion);

	/** Get CFE_Resolucion.
	  * CFE_Resolucion
	  */
	public String getCFE_Resolucion();

    /** Column name CFE_Serie */
    public static final String COLUMNNAME_CFE_Serie = "CFE_Serie";

	/** Set CFE_Serie.
	  * CFE_Serie
	  */
	public void setCFE_Serie(String CFE_Serie);

	/** Get CFE_Serie.
	  * CFE_Serie
	  */
	public String getCFE_Serie();

    /** Column name CFE_Status */
    public static final String COLUMNNAME_CFE_Status = "CFE_Status";

	/** Set CFE_Status.
	  * CFE_Status
	  */
	public void setCFE_Status(String CFE_Status);

	/** Get CFE_Status.
	  * CFE_Status
	  */
	public String getCFE_Status();

    /** Column name CFE_Tipo */
    public static final String COLUMNNAME_CFE_Tipo = "CFE_Tipo";

	/** Set CFE_Tipo.
	  * CFE_Tipo
	  */
	public void setCFE_Tipo(BigDecimal CFE_Tipo);

	/** Get CFE_Tipo.
	  * CFE_Tipo
	  */
	public BigDecimal getCFE_Tipo();

    /** Column name CFE_URL_DGI */
    public static final String COLUMNNAME_CFE_URL_DGI = "CFE_URL_DGI";

	/** Set CFE_URL_DGI.
	  * CFE_URL_DGI
	  */
	public void setCFE_URL_DGI(String CFE_URL_DGI);

	/** Get CFE_URL_DGI.
	  * CFE_URL_DGI
	  */
	public String getCFE_URL_DGI();

    /** Column name CFE_Vencimiento_CAE */
    public static final String COLUMNNAME_CFE_Vencimiento_CAE = "CFE_Vencimiento_CAE";

	/** Set CFE_Vencimiento_CAE.
	  * CFE_Vencimiento_CAE
	  */
	public void setCFE_Vencimiento_CAE(Timestamp CFE_Vencimiento_CAE);

	/** Get CFE_Vencimiento_CAE.
	  * CFE_Vencimiento_CAE
	  */
	public Timestamp getCFE_Vencimiento_CAE();

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

    /** Column name DocumentNoRef */
    public static final String COLUMNNAME_DocumentNoRef = "DocumentNoRef";

	/** Set DocumentNoRef.
	  * Numero de documento referenciado
	  */
	public void setDocumentNoRef(String DocumentNoRef);

	/** Get DocumentNoRef.
	  * Numero de documento referenciado
	  */
	public String getDocumentNoRef();

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

    /** Column name Record_ID */
    public static final String COLUMNNAME_Record_ID = "Record_ID";

	/** Set Record ID.
	  * Direct internal record ID
	  */
	public void setRecord_ID(int Record_ID);

	/** Get Record ID.
	  * Direct internal record ID
	  */
	public int getRecord_ID();

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

    /** Column name Z_CFE_RespuestaProvider_ID */
    public static final String COLUMNNAME_Z_CFE_RespuestaProvider_ID = "Z_CFE_RespuestaProvider_ID";

	/** Set Z_CFE_RespuestaProvider ID	  */
	public void setZ_CFE_RespuestaProvider_ID(int Z_CFE_RespuestaProvider_ID);

	/** Get Z_CFE_RespuestaProvider ID	  */
	public int getZ_CFE_RespuestaProvider_ID();
}
