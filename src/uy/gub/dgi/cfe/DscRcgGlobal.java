//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.11 at 02:06:34 PM UYT 
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
 * <p>Java class for DscRcgGlobal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DscRcgGlobal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DRG_Item" maxOccurs="20" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NroLinDR">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *                         &lt;maxInclusive value="20"/>
 *                         &lt;minInclusive value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TpoMovDR">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="D"/>
 *                         &lt;enumeration value="R"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TpoDR" type="{http://cfe.dgi.gub.uy}TipoDRType"/>
 *                   &lt;element name="CodDR" type="{http://cfe.dgi.gub.uy}CodDescRecType" minOccurs="0"/>
 *                   &lt;element name="GlosaDR">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}Glosa50Type">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ValorDR" type="{http://cfe.dgi.gub.uy}Monto_admite_negType"/>
 *                   &lt;element name="IndFactDR">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *                         &lt;enumeration value="1"/>
 *                         &lt;enumeration value="1"/>
 *                         &lt;enumeration value="2"/>
 *                         &lt;enumeration value="3"/>
 *                         &lt;enumeration value="4"/>
 *                         &lt;enumeration value="6"/>
 *                         &lt;enumeration value="7"/>
 *                         &lt;enumeration value="10"/>
 *                         &lt;enumeration value="11"/>
 *                         &lt;enumeration value="12"/>
 *                         &lt;enumeration value="13"/>
 *                         &lt;enumeration value="14"/>
 *                         &lt;enumeration value="15"/>
 *                         &lt;enumeration value="16"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DscRcgGlobal", propOrder = {
    "drgItem"
})
public class DscRcgGlobal {

    @XmlElement(name = "ns0:DRG_Item")
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="NroLinDR">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
     *               &lt;maxInclusive value="20"/>
     *               &lt;minInclusive value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TpoMovDR">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="D"/>
     *               &lt;enumeration value="R"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TpoDR" type="{http://cfe.dgi.gub.uy}TipoDRType"/>
     *         &lt;element name="CodDR" type="{http://cfe.dgi.gub.uy}CodDescRecType" minOccurs="0"/>
     *         &lt;element name="GlosaDR">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}Glosa50Type">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ValorDR" type="{http://cfe.dgi.gub.uy}Monto_admite_negType"/>
     *         &lt;element name="IndFactDR">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
     *               &lt;enumeration value="1"/>
     *               &lt;enumeration value="1"/>
     *               &lt;enumeration value="2"/>
     *               &lt;enumeration value="3"/>
     *               &lt;enumeration value="4"/>
     *               &lt;enumeration value="6"/>
     *               &lt;enumeration value="7"/>
     *               &lt;enumeration value="10"/>
     *               &lt;enumeration value="11"/>
     *               &lt;enumeration value="12"/>
     *               &lt;enumeration value="13"/>
     *               &lt;enumeration value="14"/>
     *               &lt;enumeration value="15"/>
     *               &lt;enumeration value="16"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
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

        @XmlElement(name = "ns0:NroLinDR")
        protected int nroLinDR;
        @XmlElement(name = "ns0:TpoMovDR", required = true)
        protected String tpoMovDR;
        @XmlElement(name = "ns0:TpoDR", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger tpoDR;
        @XmlElement(name = "ns0:CodDR")
        protected BigInteger codDR;
        @XmlElement(name = "ns0:GlosaDR", required = true)
        protected String glosaDR;
        @XmlElement(name = "ns0:ValorDR", required = true)
        protected BigDecimal valorDR;
        @XmlElement(name = "ns0:IndFactDR", required = true)
        protected BigInteger indFactDR;

        /**
         * Gets the value of the nroLinDR property.
         * 
         */
        public int getNroLinDR() {
            return nroLinDR;
        }

        /**
         * Sets the value of the nroLinDR property.
         * 
         */
        public void setNroLinDR(int value) {
            this.nroLinDR = value;
        }

        /**
         * Gets the value of the tpoMovDR property.
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
         * Sets the value of the tpoMovDR property.
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
         * Gets the value of the tpoDR property.
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
         * Sets the value of the tpoDR property.
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
         * Gets the value of the codDR property.
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
         * Sets the value of the codDR property.
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
         * Gets the value of the glosaDR property.
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
         * Sets the value of the glosaDR property.
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
         * Gets the value of the valorDR property.
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
         * Sets the value of the valorDR property.
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
         * Gets the value of the indFactDR property.
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
         * Sets the value of the indFactDR property.
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
