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

/** Generated Interface for Z_BandejaCFELin
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0
 */
public interface I_Z_BandejaCFELin 
{

    /** TableName=Z_BandejaCFELin */
    public static final String Table_Name = "Z_BandejaCFELin";

    /** AD_Table_ID=1000369 */
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
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name CodItemCFE */
    public static final String COLUMNNAME_CodItemCFE = "CodItemCFE";

	/** Set CodItemCFE.
	  * Código de Item en CFE
	  */
	public void setCodItemCFE (String CodItemCFE);

	/** Get CodItemCFE.
	  * Código de Item en CFE
	  */
	public String getCodItemCFE();

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

    /** Column name C_Tax_ID */
    public static final String COLUMNNAME_C_Tax_ID = "C_Tax_ID";

	/** Set Tax.
	  * Tax identifier
	  */
	public void setC_Tax_ID (int C_Tax_ID);

	/** Get Tax.
	  * Tax identifier
	  */
	public int getC_Tax_ID();

	public I_C_Tax getC_Tax() throws RuntimeException;

    /** Column name DescuentoMonto */
    public static final String COLUMNNAME_DescuentoMonto = "DescuentoMonto";

	/** Set DescuentoMonto.
	  * Descuento monto en CFE
	  */
	public void setDescuentoMonto (BigDecimal DescuentoMonto);

	/** Get DescuentoMonto.
	  * Descuento monto en CFE
	  */
	public BigDecimal getDescuentoMonto();

    /** Column name DescuentoPct */
    public static final String COLUMNNAME_DescuentoPct = "DescuentoPct";

	/** Set DescuentoPct.
	  * Porcentaje descuento en CFE
	  */
	public void setDescuentoPct (BigDecimal DescuentoPct);

	/** Get DescuentoPct.
	  * Porcentaje descuento en CFE
	  */
	public BigDecimal getDescuentoPct();

    /** Column name DscItemCFE */
    public static final String COLUMNNAME_DscItemCFE = "DscItemCFE";

	/** Set DscItemCFE.
	  * Descripción de item en CFE
	  */
	public void setDscItemCFE (String DscItemCFE);

	/** Get DscItemCFE.
	  * Descripción de item en CFE
	  */
	public String getDscItemCFE();

    /** Column name IndAgenteRespCFE */
    public static final String COLUMNNAME_IndAgenteRespCFE = "IndAgenteRespCFE";

	/** Set IndAgenteRespCFE.
	  * Ind. de Agente Responsable en CFE
	  */
	public void setIndAgenteRespCFE (String IndAgenteRespCFE);

	/** Get IndAgenteRespCFE.
	  * Ind. de Agente Responsable en CFE
	  */
	public String getIndAgenteRespCFE();

    /** Column name IndFactCFE */
    public static final String COLUMNNAME_IndFactCFE = "IndFactCFE";

	/** Set IndFactCFE.
	  * Ind. de Factura en CFE
	  */
	public void setIndFactCFE (String IndFactCFE);

	/** Get IndFactCFE.
	  * Ind. de Factura en CFE
	  */
	public String getIndFactCFE();

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

    /** Column name MontoItem */
    public static final String COLUMNNAME_MontoItem = "MontoItem";

	/** Set MontoItem.
	  * Monto item en CFE
	  */
	public void setMontoItem (BigDecimal MontoItem);

	/** Get MontoItem.
	  * Monto item en CFE
	  */
	public BigDecimal getMontoItem();

    /** Column name M_Product_ID */
    public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";

	/** Set Product.
	  * Product, Service, Item
	  */
	public void setM_Product_ID (int M_Product_ID);

	/** Get Product.
	  * Product, Service, Item
	  */
	public int getM_Product_ID();

	public I_M_Product getM_Product() throws RuntimeException;

    /** Column name NomItemCFE */
    public static final String COLUMNNAME_NomItemCFE = "NomItemCFE";

	/** Set NomItemCFE.
	  * Nombre de Item en CFE
	  */
	public void setNomItemCFE (String NomItemCFE);

	/** Get NomItemCFE.
	  * Nombre de Item en CFE
	  */
	public String getNomItemCFE();

    /** Column name NroLinDetCFE */
    public static final String COLUMNNAME_NroLinDetCFE = "NroLinDetCFE";

	/** Set NroLinDetCFE.
	  * Numero de linea de detalle en CFE
	  */
	public void setNroLinDetCFE (int NroLinDetCFE);

	/** Get NroLinDetCFE.
	  * Numero de linea de detalle en CFE
	  */
	public int getNroLinDetCFE();

    /** Column name PriceEntered */
    public static final String COLUMNNAME_PriceEntered = "PriceEntered";

	/** Set Price.
	  * Price Entered - the price based on the selected/base UoM
	  */
	public void setPriceEntered (BigDecimal PriceEntered);

	/** Get Price.
	  * Price Entered - the price based on the selected/base UoM
	  */
	public BigDecimal getPriceEntered();

    /** Column name QtyInvoiced */
    public static final String COLUMNNAME_QtyInvoiced = "QtyInvoiced";

	/** Set Quantity Invoiced.
	  * Invoiced Quantity
	  */
	public void setQtyInvoiced (BigDecimal QtyInvoiced);

	/** Get Quantity Invoiced.
	  * Invoiced Quantity
	  */
	public BigDecimal getQtyInvoiced();

    /** Column name RecargoMnt */
    public static final String COLUMNNAME_RecargoMnt = "RecargoMnt";

	/** Set RecargoMnt.
	  * Monto de Recargos en CFE
	  */
	public void setRecargoMnt (BigDecimal RecargoMnt);

	/** Get RecargoMnt.
	  * Monto de Recargos en CFE
	  */
	public BigDecimal getRecargoMnt();

    /** Column name RecargoPct */
    public static final String COLUMNNAME_RecargoPct = "RecargoPct";

	/** Set RecargoPct.
	  * Porcentaje recargos en CFE
	  */
	public void setRecargoPct (BigDecimal RecargoPct);

	/** Get RecargoPct.
	  * Porcentaje recargos en CFE
	  */
	public BigDecimal getRecargoPct();

    /** Column name UniMedCFE */
    public static final String COLUMNNAME_UniMedCFE = "UniMedCFE";

	/** Set UniMedCFE.
	  * Unidad de Medida en CFE
	  */
	public void setUniMedCFE (String UniMedCFE);

	/** Get UniMedCFE.
	  * Unidad de Medida en CFE
	  */
	public String getUniMedCFE();

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

    /** Column name Z_BandejaCFE_ID */
    public static final String COLUMNNAME_Z_BandejaCFE_ID = "Z_BandejaCFE_ID";

	/** Set Z_BandejaCFE ID	  */
	public void setZ_BandejaCFE_ID (int Z_BandejaCFE_ID);

	/** Get Z_BandejaCFE ID	  */
	public int getZ_BandejaCFE_ID();

	public I_Z_BandejaCFE getZ_BandejaCFE() throws RuntimeException;

    /** Column name Z_BandejaCFELin_ID */
    public static final String COLUMNNAME_Z_BandejaCFELin_ID = "Z_BandejaCFELin_ID";

	/** Set Z_BandejaCFELin ID	  */
	public void setZ_BandejaCFELin_ID (int Z_BandejaCFELin_ID);

	/** Get Z_BandejaCFELin ID	  */
	public int getZ_BandejaCFELin_ID();
}
