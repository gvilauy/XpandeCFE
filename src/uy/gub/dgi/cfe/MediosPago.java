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
 * <p>Clase Java para MediosPago complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MediosPago"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MedioPago" maxOccurs="40" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NroLinMP"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}LineasMP"&gt;
 *                         &lt;minInclusive value="1"/&gt;
 *                         &lt;maxInclusive value="40"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CodMP" type="{http://cfe.dgi.gub.uy}MedioPagoType" minOccurs="0"/&gt;
 *                   &lt;element name="GlosaMP" type="{http://cfe.dgi.gub.uy}Glosa50Type"/&gt;
 *                   &lt;element name="OrdenMP" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                         &lt;totalDigits value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ValorPago" type="{http://cfe.dgi.gub.uy}Monto_admite_negType"/&gt;
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
@XmlType(name = "MediosPago", propOrder = {
    "medioPago"
})
public class MediosPago {

    @XmlElement(name = "MedioPago")
    protected List<MedioPago> medioPago;

    /**
     * Gets the value of the medioPago property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the medioPago property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedioPago().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MedioPago }
     * 
     * 
     */
    public List<MedioPago> getMedioPago() {
        if (medioPago == null) {
            medioPago = new ArrayList<MedioPago>();
        }
        return this.medioPago;
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
     *         &lt;element name="NroLinMP"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}LineasMP"&gt;
     *               &lt;minInclusive value="1"/&gt;
     *               &lt;maxInclusive value="40"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CodMP" type="{http://cfe.dgi.gub.uy}MedioPagoType" minOccurs="0"/&gt;
     *         &lt;element name="GlosaMP" type="{http://cfe.dgi.gub.uy}Glosa50Type"/&gt;
     *         &lt;element name="OrdenMP" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *               &lt;totalDigits value="2"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ValorPago" type="{http://cfe.dgi.gub.uy}Monto_admite_negType"/&gt;
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
        "nroLinMP",
        "codMP",
        "glosaMP",
        "ordenMP",
        "valorPago"
    })
    public static class MedioPago {

        @XmlElement(name = "NroLinMP")
        protected int nroLinMP;
        @XmlElement(name = "CodMP")
        protected BigInteger codMP;
        @XmlElement(name = "GlosaMP", required = true)
        protected String glosaMP;
        @XmlElement(name = "OrdenMP")
        protected BigInteger ordenMP;
        @XmlElement(name = "ValorPago", required = true)
        protected BigDecimal valorPago;

        /**
         * Obtiene el valor de la propiedad nroLinMP.
         * 
         */
        public int getNroLinMP() {
            return nroLinMP;
        }

        /**
         * Define el valor de la propiedad nroLinMP.
         * 
         */
        public void setNroLinMP(int value) {
            this.nroLinMP = value;
        }

        /**
         * Obtiene el valor de la propiedad codMP.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCodMP() {
            return codMP;
        }

        /**
         * Define el valor de la propiedad codMP.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCodMP(BigInteger value) {
            this.codMP = value;
        }

        /**
         * Obtiene el valor de la propiedad glosaMP.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGlosaMP() {
            return glosaMP;
        }

        /**
         * Define el valor de la propiedad glosaMP.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGlosaMP(String value) {
            this.glosaMP = value;
        }

        /**
         * Obtiene el valor de la propiedad ordenMP.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOrdenMP() {
            return ordenMP;
        }

        /**
         * Define el valor de la propiedad ordenMP.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOrdenMP(BigInteger value) {
            this.ordenMP = value;
        }

        /**
         * Obtiene el valor de la propiedad valorPago.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValorPago() {
            return valorPago;
        }

        /**
         * Define el valor de la propiedad valorPago.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValorPago(BigDecimal value) {
            this.valorPago = value;
        }

    }

}
