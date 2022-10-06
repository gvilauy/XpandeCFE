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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DscRcgGlobal complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DscRcgGlobal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DRG_Item" maxOccurs="20" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NroLinDR"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger"&gt;
 *                         &lt;maxInclusive value="20"/&gt;
 *                         &lt;minInclusive value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TpoMovDR"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="D"/&gt;
 *                         &lt;enumeration value="R"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TpoDR" type="{http://cfe.dgi.gub.uy}TipoDRType"/&gt;
 *                   &lt;element name="CodDR" type="{http://cfe.dgi.gub.uy}CodDescRecType" minOccurs="0"/&gt;
 *                   &lt;element name="GlosaDR"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}Glosa50Type"&gt;
 *                         &lt;maxLength value="50"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ValorDR" type="{http://cfe.dgi.gub.uy}Monto_admite_negType"/&gt;
 *                   &lt;element name="IndFactDR"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger"&gt;
 *                         &lt;enumeration value="1"/&gt;
 *                         &lt;enumeration value="2"/&gt;
 *                         &lt;enumeration value="3"/&gt;
 *                         &lt;enumeration value="4"/&gt;
 *                         &lt;enumeration value="6"/&gt;
 *                         &lt;enumeration value="7"/&gt;
 *                         &lt;enumeration value="10"/&gt;
 *                         &lt;enumeration value="11"/&gt;
 *                         &lt;enumeration value="12"/&gt;
 *                         &lt;enumeration value="13"/&gt;
 *                         &lt;enumeration value="14"/&gt;
 *                         &lt;enumeration value="15"/&gt;
 *                         &lt;enumeration value="16"/&gt;
 *                         &lt;enumeration value="17"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
@XmlType(name = "DscRcgGlobal", propOrder = {
    "drgItem"
})
public class DscRcgGlobal {

    @XmlElement(name = "DRG_Item")
    protected List<DRGItem> drgItem;

    /**
     * Gets the value of the drgItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the drgItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDRGItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DRGItem }
     * 
     * 
     */
    public List<DRGItem> getDRGItem() {
        if (drgItem == null) {
            drgItem = new ArrayList<DRGItem>();
        }
        return this.drgItem;
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
     *         &lt;element name="NroLinDR"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger"&gt;
     *               &lt;maxInclusive value="20"/&gt;
     *               &lt;minInclusive value="1"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TpoMovDR"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="D"/&gt;
     *               &lt;enumeration value="R"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TpoDR" type="{http://cfe.dgi.gub.uy}TipoDRType"/&gt;
     *         &lt;element name="CodDR" type="{http://cfe.dgi.gub.uy}CodDescRecType" minOccurs="0"/&gt;
     *         &lt;element name="GlosaDR"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}Glosa50Type"&gt;
     *               &lt;maxLength value="50"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ValorDR" type="{http://cfe.dgi.gub.uy}Monto_admite_negType"/&gt;
     *         &lt;element name="IndFactDR"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger"&gt;
     *               &lt;enumeration value="1"/&gt;
     *               &lt;enumeration value="2"/&gt;
     *               &lt;enumeration value="3"/&gt;
     *               &lt;enumeration value="4"/&gt;
     *               &lt;enumeration value="6"/&gt;
     *               &lt;enumeration value="7"/&gt;
     *               &lt;enumeration value="10"/&gt;
     *               &lt;enumeration value="11"/&gt;
     *               &lt;enumeration value="12"/&gt;
     *               &lt;enumeration value="13"/&gt;
     *               &lt;enumeration value="14"/&gt;
     *               &lt;enumeration value="15"/&gt;
     *               &lt;enumeration value="16"/&gt;
     *               &lt;enumeration value="17"/&gt;
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
        "nroLinDR",
        "tpoMovDR",
        "tpoDR",
        "codDR",
        "glosaDR",
        "valorDR",
        "indFactDR"
    })
    public static class DRGItem {

        @XmlElement(name = "NroLinDR")
        protected int nroLinDR;
        @XmlElement(name = "TpoMovDR", required = true)
        protected String tpoMovDR;
        @XmlElement(name = "TpoDR", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger tpoDR;
        @XmlElement(name = "CodDR")
        protected BigInteger codDR;
        @XmlElement(name = "GlosaDR", required = true)
        protected String glosaDR;
        @XmlElement(name = "ValorDR", required = true)
        protected BigDecimal valorDR;
        @XmlElement(name = "IndFactDR", required = true)
        protected BigInteger indFactDR;

        /**
         * Obtiene el valor de la propiedad nroLinDR.
         * 
         */
        public int getNroLinDR() {
            return nroLinDR;
        }

        /**
         * Define el valor de la propiedad nroLinDR.
         * 
         */
        public void setNroLinDR(int value) {
            this.nroLinDR = value;
        }

        /**
         * Obtiene el valor de la propiedad tpoMovDR.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTpoMovDR() {
            return tpoMovDR;
        }

        /**
         * Define el valor de la propiedad tpoMovDR.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTpoMovDR(String value) {
            this.tpoMovDR = value;
        }

        /**
         * Obtiene el valor de la propiedad tpoDR.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTpoDR() {
            return tpoDR;
        }

        /**
         * Define el valor de la propiedad tpoDR.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTpoDR(BigInteger value) {
            this.tpoDR = value;
        }

        /**
         * Obtiene el valor de la propiedad codDR.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCodDR() {
            return codDR;
        }

        /**
         * Define el valor de la propiedad codDR.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCodDR(BigInteger value) {
            this.codDR = value;
        }

        /**
         * Obtiene el valor de la propiedad glosaDR.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGlosaDR() {
            return glosaDR;
        }

        /**
         * Define el valor de la propiedad glosaDR.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGlosaDR(String value) {
            this.glosaDR = value;
        }

        /**
         * Obtiene el valor de la propiedad valorDR.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValorDR() {
            return valorDR;
        }

        /**
         * Define el valor de la propiedad valorDR.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValorDR(BigDecimal value) {
            this.valorDR = value;
        }

        /**
         * Obtiene el valor de la propiedad indFactDR.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getIndFactDR() {
            return indFactDR;
        }

        /**
         * Define el valor de la propiedad indFactDR.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setIndFactDR(BigInteger value) {
            this.indFactDR = value;
        }

    }

}
