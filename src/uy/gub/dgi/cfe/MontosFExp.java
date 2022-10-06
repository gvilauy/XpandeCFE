//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.23 a las 05:37:24 PM UTC 
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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para Montos_FExp complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Montos_FExp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mnts_FExp_Item" maxOccurs="1000"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Fecha" type="{http://cfe.dgi.gub.uy}FechaType"/&gt;
 *                   &lt;element name="CodSuc" type="{http://cfe.dgi.gub.uy}CodSucType"/&gt;
 *                   &lt;element name="IndPagCta3ros" type="{http://cfe.dgi.gub.uy}IndPagCta3rosType" minOccurs="0"/&gt;
 *                   &lt;element name="TotMntExpyAsim" type="{http://cfe.dgi.gub.uy}MontoType" minOccurs="0"/&gt;
 *                   &lt;element name="TotMntTotal" type="{http://cfe.dgi.gub.uy}MontoType"/&gt;
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
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Fecha" type="{http://cfe.dgi.gub.uy}FechaType"/&gt;
     *         &lt;element name="CodSuc" type="{http://cfe.dgi.gub.uy}CodSucType"/&gt;
     *         &lt;element name="IndPagCta3ros" type="{http://cfe.dgi.gub.uy}IndPagCta3rosType" minOccurs="0"/&gt;
     *         &lt;element name="TotMntExpyAsim" type="{http://cfe.dgi.gub.uy}MontoType" minOccurs="0"/&gt;
     *         &lt;element name="TotMntTotal" type="{http://cfe.dgi.gub.uy}MontoType"/&gt;
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
         * Obtiene el valor de la propiedad fecha.
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
         * Define el valor de la propiedad fecha.
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
         * Obtiene el valor de la propiedad codSuc.
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
         * Define el valor de la propiedad codSuc.
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
         * Obtiene el valor de la propiedad indPagCta3Ros.
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
         * Define el valor de la propiedad indPagCta3Ros.
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
         * Obtiene el valor de la propiedad totMntExpyAsim.
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
         * Define el valor de la propiedad totMntExpyAsim.
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
         * Obtiene el valor de la propiedad totMntTotal.
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
         * Define el valor de la propiedad totMntTotal.
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
