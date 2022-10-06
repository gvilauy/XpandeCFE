//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.23 a las 05:29:48 PM UTC 
//


package uy.gub.dgi.cfe;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3._2000._09.xmldsig_.SignatureType;


/**
 * <p>Clase Java para CAEdefType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CAEdefType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TmstFrma" type="{http://cfe.dgi.gub.uy}FechaHoraType"/&gt;
 *         &lt;element name="DA"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RucE" type="{http://cfe.dgi.gub.uy}RUCType"/&gt;
 *                   &lt;element name="TCFE" type="{http://cfe.dgi.gub.uy}CFEType"/&gt;
 *                   &lt;element name="Serie" type="{http://cfe.dgi.gub.uy}SerieType"/&gt;
 *                   &lt;element name="DNro"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}NroCFEType"&gt;
 *                         &lt;minInclusive value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="HNro"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}NroCFEType"&gt;
 *                         &lt;minInclusive value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="NA"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                         &lt;totalDigits value="11"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FA" type="{http://cfe.dgi.gub.uy}FechaType"/&gt;
 *                   &lt;element name="FVD" type="{http://cfe.dgi.gub.uy}FechaType"/&gt;
 *                   &lt;element name="CAEEspecial" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                         &lt;totalDigits value="1"/&gt;
 *                         &lt;enumeration value="1"/&gt;
 *                         &lt;enumeration value="2"/&gt;
 *                         &lt;enumeration value="3"/&gt;
 *                         &lt;enumeration value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CausalCAEEsp" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                         &lt;totalDigits value="3"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="version" use="required" fixed="1.0"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="3"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CAEdefType", propOrder = {
    "tmstFrma",
    "da",
    "signature"
})
public class CAEdefType {

    @XmlElement(name = "TmstFrma", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tmstFrma;
    @XmlElement(name = "DA", required = true)
    protected DA da;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Obtiene el valor de la propiedad tmstFrma.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTmstFrma() {
        return tmstFrma;
    }

    /**
     * Define el valor de la propiedad tmstFrma.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTmstFrma(XMLGregorianCalendar value) {
        this.tmstFrma = value;
    }

    /**
     * Obtiene el valor de la propiedad da.
     * 
     * @return
     *     possible object is
     *     {@link DA }
     *     
     */
    public DA getDA() {
        return da;
    }

    /**
     * Define el valor de la propiedad da.
     * 
     * @param value
     *     allowed object is
     *     {@link DA }
     *     
     */
    public void setDA(DA value) {
        this.da = value;
    }

    /**
     * Obtiene el valor de la propiedad signature.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Define el valor de la propiedad signature.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "1.0";
        } else {
            return version;
        }
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
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
     *         &lt;element name="RucE" type="{http://cfe.dgi.gub.uy}RUCType"/&gt;
     *         &lt;element name="TCFE" type="{http://cfe.dgi.gub.uy}CFEType"/&gt;
     *         &lt;element name="Serie" type="{http://cfe.dgi.gub.uy}SerieType"/&gt;
     *         &lt;element name="DNro"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}NroCFEType"&gt;
     *               &lt;minInclusive value="1"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="HNro"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}NroCFEType"&gt;
     *               &lt;minInclusive value="1"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="NA"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *               &lt;totalDigits value="11"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="FA" type="{http://cfe.dgi.gub.uy}FechaType"/&gt;
     *         &lt;element name="FVD" type="{http://cfe.dgi.gub.uy}FechaType"/&gt;
     *         &lt;element name="CAEEspecial" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *               &lt;totalDigits value="1"/&gt;
     *               &lt;enumeration value="1"/&gt;
     *               &lt;enumeration value="2"/&gt;
     *               &lt;enumeration value="3"/&gt;
     *               &lt;enumeration value="4"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CausalCAEEsp" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *               &lt;totalDigits value="3"/&gt;
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
        "rucE",
        "tcfe",
        "serie",
        "dNro",
        "hNro",
        "ta",
        "na",
        "fa",
        "fvd",
        "caeEspecial",
        "causalCAEEsp"
    })
    public static class DA {

        @XmlElement(name = "RucE", required = true)
        protected String rucE;
        @XmlElement(name = "TCFE", required = true)
        protected BigInteger tcfe;
        @XmlElement(name = "Serie", required = true)
        protected String serie;
        @XmlElement(name = "DNro", required = true)
        protected BigInteger dNro;
        @XmlElement(name = "HNro", required = true)
        protected BigInteger hNro;
        @XmlElement(name = "TA", required = true)
        protected String ta;
        @XmlElement(name = "NA", required = true)
        protected BigInteger na;
        @XmlElement(name = "FA", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar fa;
        @XmlElement(name = "FVD", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar fvd;
        @XmlElement(name = "CAEEspecial")
        protected BigInteger caeEspecial;
        @XmlElement(name = "CausalCAEEsp")
        protected BigInteger causalCAEEsp;

        /**
         * Obtiene el valor de la propiedad rucE.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRucE() {
            return rucE;
        }

        /**
         * Define el valor de la propiedad rucE.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRucE(String value) {
            this.rucE = value;
        }

        /**
         * Obtiene el valor de la propiedad tcfe.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTCFE() {
            return tcfe;
        }

        /**
         * Define el valor de la propiedad tcfe.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTCFE(BigInteger value) {
            this.tcfe = value;
        }

        /**
         * Obtiene el valor de la propiedad serie.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSerie() {
            return serie;
        }

        /**
         * Define el valor de la propiedad serie.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSerie(String value) {
            this.serie = value;
        }

        /**
         * Obtiene el valor de la propiedad dNro.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDNro() {
            return dNro;
        }

        /**
         * Define el valor de la propiedad dNro.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDNro(BigInteger value) {
            this.dNro = value;
        }

        /**
         * Obtiene el valor de la propiedad hNro.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getHNro() {
            return hNro;
        }

        /**
         * Define el valor de la propiedad hNro.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setHNro(BigInteger value) {
            this.hNro = value;
        }

        /**
         * Obtiene el valor de la propiedad ta.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTA() {
            return ta;
        }

        /**
         * Define el valor de la propiedad ta.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTA(String value) {
            this.ta = value;
        }

        /**
         * Obtiene el valor de la propiedad na.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNA() {
            return na;
        }

        /**
         * Define el valor de la propiedad na.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNA(BigInteger value) {
            this.na = value;
        }

        /**
         * Obtiene el valor de la propiedad fa.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFA() {
            return fa;
        }

        /**
         * Define el valor de la propiedad fa.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFA(XMLGregorianCalendar value) {
            this.fa = value;
        }

        /**
         * Obtiene el valor de la propiedad fvd.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFVD() {
            return fvd;
        }

        /**
         * Define el valor de la propiedad fvd.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFVD(XMLGregorianCalendar value) {
            this.fvd = value;
        }

        /**
         * Obtiene el valor de la propiedad caeEspecial.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCAEEspecial() {
            return caeEspecial;
        }

        /**
         * Define el valor de la propiedad caeEspecial.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCAEEspecial(BigInteger value) {
            this.caeEspecial = value;
        }

        /**
         * Obtiene el valor de la propiedad causalCAEEsp.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCausalCAEEsp() {
            return causalCAEEsp;
        }

        /**
         * Define el valor de la propiedad causalCAEEsp.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCausalCAEEsp(BigInteger value) {
            this.causalCAEEsp = value;
        }

    }

}
