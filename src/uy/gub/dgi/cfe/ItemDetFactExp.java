//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.23 a las 05:35:46 PM UTC 
//


package uy.gub.dgi.cfe;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Item_Det_Fact_Exp complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Item_Det_Fact_Exp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NroLinDet"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://cfe.dgi.gub.uy}LineasDetType"&gt;
 *               &lt;maxInclusive value="700"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CodItem" maxOccurs="5" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TpoCod"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="10"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Cod"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="35"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IndFact"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger"&gt;
 *               &lt;totalDigits value="2"/&gt;
 *               &lt;fractionDigits value="0"/&gt;
 *               &lt;enumeration value="5"/&gt;
 *               &lt;enumeration value="6"/&gt;
 *               &lt;enumeration value="7"/&gt;
 *               &lt;enumeration value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NomItem"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="80"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NCM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DscItem" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Cantidad" type="{http://cfe.dgi.gub.uy}Cant_admite_negType"/&gt;
 *         &lt;element name="UniMed"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PrecioUnitario" type="{http://cfe.dgi.gub.uy}PrecioUnitarioType"/&gt;
 *         &lt;element name="DescuentoPct" type="{http://cfe.dgi.gub.uy}PctType" minOccurs="0"/&gt;
 *         &lt;element name="DescuentoMonto" type="{http://cfe.dgi.gub.uy}Monto_admite_negType" minOccurs="0"/&gt;
 *         &lt;element name="SubDescuento" maxOccurs="5" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DescTipo"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}TipoDRType"&gt;
 *                         &lt;totalDigits value="1"/&gt;
 *                         &lt;fractionDigits value="0"/&gt;
 *                         &lt;enumeration value="1"/&gt;
 *                         &lt;enumeration value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="DescVal" type="{http://cfe.dgi.gub.uy}Monto_admite_negType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RecargoPct" type="{http://cfe.dgi.gub.uy}PctType" minOccurs="0"/&gt;
 *         &lt;element name="RecargoMnt" type="{http://cfe.dgi.gub.uy}Monto_admite_negType" minOccurs="0"/&gt;
 *         &lt;element name="SubRecargo" maxOccurs="5" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RecargoTipo"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}TipoDRType"&gt;
 *                         &lt;totalDigits value="1"/&gt;
 *                         &lt;fractionDigits value="0"/&gt;
 *                         &lt;enumeration value="1"/&gt;
 *                         &lt;enumeration value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RecargoVal" type="{http://cfe.dgi.gub.uy}Monto_admite_negType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MontoItem" type="{http://cfe.dgi.gub.uy}Monto_admite_negType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Item_Det_Fact_Exp", propOrder = {
    "nroLinDet",
    "codItem",
    "indFact",
    "nomItem",
    "ncm",
    "dscItem",
    "cantidad",
    "uniMed",
    "precioUnitario",
    "descuentoPct",
    "descuentoMonto",
    "subDescuento",
    "recargoPct",
    "recargoMnt",
    "subRecargo",
    "montoItem"
})
public class ItemDetFactExp {

    @XmlElement(name = "NroLinDet")
    protected int nroLinDet;
    @XmlElement(name = "CodItem")
    protected List<CodItem> codItem;
    @XmlElement(name = "IndFact", required = true)
    protected BigInteger indFact;
    @XmlElement(name = "NomItem", required = true)
    protected String nomItem;
    @XmlElement(name = "NCM")
    protected String ncm;
    @XmlElement(name = "DscItem")
    protected String dscItem;
    @XmlElement(name = "Cantidad", required = true)
    protected BigDecimal cantidad;
    @XmlElement(name = "UniMed", required = true)
    protected String uniMed;
    @XmlElement(name = "PrecioUnitario", required = true)
    protected BigDecimal precioUnitario;
    @XmlElement(name = "DescuentoPct")
    protected BigDecimal descuentoPct;
    @XmlElement(name = "DescuentoMonto")
    protected BigDecimal descuentoMonto;
    @XmlElement(name = "SubDescuento")
    protected List<SubDescuento> subDescuento;
    @XmlElement(name = "RecargoPct")
    protected BigDecimal recargoPct;
    @XmlElement(name = "RecargoMnt")
    protected BigDecimal recargoMnt;
    @XmlElement(name = "SubRecargo")
    protected List<SubRecargo> subRecargo;
    @XmlElement(name = "MontoItem", required = true)
    protected BigDecimal montoItem;

    /**
     * Obtiene el valor de la propiedad nroLinDet.
     * 
     */
    public int getNroLinDet() {
        return nroLinDet;
    }

    /**
     * Define el valor de la propiedad nroLinDet.
     * 
     */
    public void setNroLinDet(int value) {
        this.nroLinDet = value;
    }

    /**
     * Gets the value of the codItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodItem }
     * 
     * 
     */
    public List<CodItem> getCodItem() {
        if (codItem == null) {
            codItem = new ArrayList<CodItem>();
        }
        return this.codItem;
    }

    /**
     * Obtiene el valor de la propiedad indFact.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIndFact() {
        return indFact;
    }

    /**
     * Define el valor de la propiedad indFact.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIndFact(BigInteger value) {
        this.indFact = value;
    }

    /**
     * Obtiene el valor de la propiedad nomItem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomItem() {
        return nomItem;
    }

    /**
     * Define el valor de la propiedad nomItem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomItem(String value) {
        this.nomItem = value;
    }

    /**
     * Obtiene el valor de la propiedad ncm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCM() {
        return ncm;
    }

    /**
     * Define el valor de la propiedad ncm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNCM(String value) {
        this.ncm = value;
    }

    /**
     * Obtiene el valor de la propiedad dscItem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDscItem() {
        return dscItem;
    }

    /**
     * Define el valor de la propiedad dscItem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDscItem(String value) {
        this.dscItem = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCantidad(BigDecimal value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad uniMed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniMed() {
        return uniMed;
    }

    /**
     * Define el valor de la propiedad uniMed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniMed(String value) {
        this.uniMed = value;
    }

    /**
     * Obtiene el valor de la propiedad precioUnitario.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * Define el valor de la propiedad precioUnitario.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrecioUnitario(BigDecimal value) {
        this.precioUnitario = value;
    }

    /**
     * Obtiene el valor de la propiedad descuentoPct.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDescuentoPct() {
        return descuentoPct;
    }

    /**
     * Define el valor de la propiedad descuentoPct.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDescuentoPct(BigDecimal value) {
        this.descuentoPct = value;
    }

    /**
     * Obtiene el valor de la propiedad descuentoMonto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDescuentoMonto() {
        return descuentoMonto;
    }

    /**
     * Define el valor de la propiedad descuentoMonto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDescuentoMonto(BigDecimal value) {
        this.descuentoMonto = value;
    }

    /**
     * Gets the value of the subDescuento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subDescuento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubDescuento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubDescuento }
     * 
     * 
     */
    public List<SubDescuento> getSubDescuento() {
        if (subDescuento == null) {
            subDescuento = new ArrayList<SubDescuento>();
        }
        return this.subDescuento;
    }

    /**
     * Obtiene el valor de la propiedad recargoPct.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRecargoPct() {
        return recargoPct;
    }

    /**
     * Define el valor de la propiedad recargoPct.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRecargoPct(BigDecimal value) {
        this.recargoPct = value;
    }

    /**
     * Obtiene el valor de la propiedad recargoMnt.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRecargoMnt() {
        return recargoMnt;
    }

    /**
     * Define el valor de la propiedad recargoMnt.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRecargoMnt(BigDecimal value) {
        this.recargoMnt = value;
    }

    /**
     * Gets the value of the subRecargo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subRecargo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubRecargo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubRecargo }
     * 
     * 
     */
    public List<SubRecargo> getSubRecargo() {
        if (subRecargo == null) {
            subRecargo = new ArrayList<SubRecargo>();
        }
        return this.subRecargo;
    }

    /**
     * Obtiene el valor de la propiedad montoItem.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoItem() {
        return montoItem;
    }

    /**
     * Define el valor de la propiedad montoItem.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoItem(BigDecimal value) {
        this.montoItem = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="TpoCod"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="10"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Cod"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="35"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tpoCod",
        "cod"
    })
    public static class CodItem {

        @XmlElement(name = "TpoCod", required = true)
        protected String tpoCod;
        @XmlElement(name = "Cod", required = true)
        protected String cod;

        /**
         * Obtiene el valor de la propiedad tpoCod.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTpoCod() {
            return tpoCod;
        }

        /**
         * Define el valor de la propiedad tpoCod.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTpoCod(String value) {
            this.tpoCod = value;
        }

        /**
         * Obtiene el valor de la propiedad cod.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCod() {
            return cod;
        }

        /**
         * Define el valor de la propiedad cod.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCod(String value) {
            this.cod = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="DescTipo"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}TipoDRType"&gt;
     *               &lt;totalDigits value="1"/&gt;
     *               &lt;fractionDigits value="0"/&gt;
     *               &lt;enumeration value="1"/&gt;
     *               &lt;enumeration value="2"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="DescVal" type="{http://cfe.dgi.gub.uy}Monto_admite_negType"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "descTipo",
        "descVal"
    })
    public static class SubDescuento {

        @XmlElement(name = "DescTipo", required = true)
        protected BigInteger descTipo;
        @XmlElement(name = "DescVal", required = true)
        protected BigDecimal descVal;

        /**
         * Obtiene el valor de la propiedad descTipo.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDescTipo() {
            return descTipo;
        }

        /**
         * Define el valor de la propiedad descTipo.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDescTipo(BigInteger value) {
            this.descTipo = value;
        }

        /**
         * Obtiene el valor de la propiedad descVal.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDescVal() {
            return descVal;
        }

        /**
         * Define el valor de la propiedad descVal.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDescVal(BigDecimal value) {
            this.descVal = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="RecargoTipo"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}TipoDRType"&gt;
     *               &lt;totalDigits value="1"/&gt;
     *               &lt;fractionDigits value="0"/&gt;
     *               &lt;enumeration value="1"/&gt;
     *               &lt;enumeration value="2"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RecargoVal" type="{http://cfe.dgi.gub.uy}Monto_admite_negType"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "recargoTipo",
        "recargoVal"
    })
    public static class SubRecargo {

        @XmlElement(name = "RecargoTipo", required = true)
        protected BigInteger recargoTipo;
        @XmlElement(name = "RecargoVal", required = true)
        protected BigDecimal recargoVal;

        /**
         * Obtiene el valor de la propiedad recargoTipo.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRecargoTipo() {
            return recargoTipo;
        }

        /**
         * Define el valor de la propiedad recargoTipo.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRecargoTipo(BigInteger value) {
            this.recargoTipo = value;
        }

        /**
         * Obtiene el valor de la propiedad recargoVal.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getRecargoVal() {
            return recargoVal;
        }

        /**
         * Define el valor de la propiedad recargoVal.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setRecargoVal(BigDecimal value) {
            this.recargoVal = value;
        }

    }

}
