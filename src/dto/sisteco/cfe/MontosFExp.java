//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.11 at 02:07:01 PM UYT 
//


package dto.sisteco.cfe;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for Montos_FExp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Montos_FExp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Mnts_FExp_Item" maxOccurs="1000">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Fecha" type="{http://cfe.dgi.gub.uy}FechaType"/>
 *                   &lt;element name="CodSuc" type="{http://cfe.dgi.gub.uy}CodSucType"/>
 *                   &lt;element name="IndPagCta3ros" type="{http://cfe.dgi.gub.uy}IndPagCta3rosType" minOccurs="0"/>
 *                   &lt;element name="TotMntExpyAsim" type="{http://cfe.dgi.gub.uy}MontoType" minOccurs="0"/>
 *                   &lt;element name="TotMntTotal" type="{http://cfe.dgi.gub.uy}MontoType"/>
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
@XmlType(name = "Montos_FExp", propOrder = {
    "mntsFExpItem"
})
public class MontosFExp {

    @XmlElement(name = "Mnts_FExp_Item", required = true)
    protected List<MntsFExpItem> mntsFExpItem;

    /**
     * Gets the value of the mntsFExpItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mntsFExpItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMntsFExpItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MntsFExpItem }
     * 
     * 
     */
    public List<MntsFExpItem> getMntsFExpItem() {
        if (mntsFExpItem == null) {
            mntsFExpItem = new ArrayList<MntsFExpItem>();
        }
        return this.mntsFExpItem;
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
     *         &lt;element name="Fecha" type="{http://cfe.dgi.gub.uy}FechaType"/>
     *         &lt;element name="CodSuc" type="{http://cfe.dgi.gub.uy}CodSucType"/>
     *         &lt;element name="IndPagCta3ros" type="{http://cfe.dgi.gub.uy}IndPagCta3rosType" minOccurs="0"/>
     *         &lt;element name="TotMntExpyAsim" type="{http://cfe.dgi.gub.uy}MontoType" minOccurs="0"/>
     *         &lt;element name="TotMntTotal" type="{http://cfe.dgi.gub.uy}MontoType"/>
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
        "fecha",
        "codSuc",
        "indPagCta3Ros",
        "totMntExpyAsim",
        "totMntTotal"
    })
    public static class MntsFExpItem {

        @XmlElement(name = "Fecha", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar fecha;
        @XmlElement(name = "CodSuc", required = true)
        protected BigInteger codSuc;
        @XmlElement(name = "IndPagCta3ros")
        protected BigInteger indPagCta3Ros;
        @XmlElement(name = "TotMntExpyAsim")
        protected BigDecimal totMntExpyAsim;
        @XmlElement(name = "TotMntTotal", required = true)
        protected BigDecimal totMntTotal;

        /**
         * Gets the value of the fecha property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFecha() {
            return fecha;
        }

        /**
         * Sets the value of the fecha property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFecha(XMLGregorianCalendar value) {
            this.fecha = value;
        }

        /**
         * Gets the value of the codSuc property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCodSuc() {
            return codSuc;
        }

        /**
         * Sets the value of the codSuc property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCodSuc(BigInteger value) {
            this.codSuc = value;
        }

        /**
         * Gets the value of the indPagCta3Ros property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getIndPagCta3Ros() {
            return indPagCta3Ros;
        }

        /**
         * Sets the value of the indPagCta3Ros property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setIndPagCta3Ros(BigInteger value) {
            this.indPagCta3Ros = value;
        }

        /**
         * Gets the value of the totMntExpyAsim property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotMntExpyAsim() {
            return totMntExpyAsim;
        }

        /**
         * Sets the value of the totMntExpyAsim property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotMntExpyAsim(BigDecimal value) {
            this.totMntExpyAsim = value;
        }

        /**
         * Gets the value of the totMntTotal property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotMntTotal() {
            return totMntTotal;
        }

        /**
         * Sets the value of the totMntTotal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotMntTotal(BigDecimal value) {
            this.totMntTotal = value;
        }

    }

}
