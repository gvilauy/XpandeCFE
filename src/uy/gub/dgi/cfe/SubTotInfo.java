//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.23 a las 05:35:46 PM UTC 
//


package uy.gub.dgi.cfe;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SubTotInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SubTotInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="STI_Item" maxOccurs="20" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NroSTI"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger"&gt;
 *                         &lt;minInclusive value="1"/&gt;
 *                         &lt;maxInclusive value="20"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="GlosaSTI"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}Glosa40Type"&gt;
 *                         &lt;maxLength value="40"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="OrdenSTI" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger"&gt;
 *                         &lt;maxInclusive value="99"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ValSubtotSTI" type="{http://cfe.dgi.gub.uy}Monto_admite_negType"/&gt;
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
@XmlType(name = "SubTotInfo", propOrder = {
    "stiItem"
})
public class SubTotInfo {

    @XmlElement(name = "STI_Item")
    protected List<STIItem> stiItem;

    /**
     * Gets the value of the stiItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stiItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSTIItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STIItem }
     * 
     * 
     */
    public List<STIItem> getSTIItem() {
        if (stiItem == null) {
            stiItem = new ArrayList<STIItem>();
        }
        return this.stiItem;
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
     *         &lt;element name="NroSTI"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger"&gt;
     *               &lt;minInclusive value="1"/&gt;
     *               &lt;maxInclusive value="20"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="GlosaSTI"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}Glosa40Type"&gt;
     *               &lt;maxLength value="40"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="OrdenSTI" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger"&gt;
     *               &lt;maxInclusive value="99"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ValSubtotSTI" type="{http://cfe.dgi.gub.uy}Monto_admite_negType"/&gt;
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
        "nroSTI",
        "glosaSTI",
        "ordenSTI",
        "valSubtotSTI"
    })
    public static class STIItem {

        @XmlElement(name = "NroSTI")
        protected int nroSTI;
        @XmlElement(name = "GlosaSTI", required = true)
        protected String glosaSTI;
        @XmlElement(name = "OrdenSTI")
        protected Integer ordenSTI;
        @XmlElement(name = "ValSubtotSTI", required = true)
        protected BigDecimal valSubtotSTI;

        /**
         * Obtiene el valor de la propiedad nroSTI.
         * 
         */
        public int getNroSTI() {
            return nroSTI;
        }

        /**
         * Define el valor de la propiedad nroSTI.
         * 
         */
        public void setNroSTI(int value) {
            this.nroSTI = value;
        }

        /**
         * Obtiene el valor de la propiedad glosaSTI.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGlosaSTI() {
            return glosaSTI;
        }

        /**
         * Define el valor de la propiedad glosaSTI.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGlosaSTI(String value) {
            this.glosaSTI = value;
        }

        /**
         * Obtiene el valor de la propiedad ordenSTI.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getOrdenSTI() {
            return ordenSTI;
        }

        /**
         * Define el valor de la propiedad ordenSTI.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setOrdenSTI(Integer value) {
            this.ordenSTI = value;
        }

        /**
         * Obtiene el valor de la propiedad valSubtotSTI.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValSubtotSTI() {
            return valSubtotSTI;
        }

        /**
         * Define el valor de la propiedad valSubtotSTI.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValSubtotSTI(BigDecimal value) {
            this.valSubtotSTI = value;
        }

    }

}
