//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.23 a las 05:35:46 PM UTC 
//


package uy.gub.dgi.cfe;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="Caratula"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RutReceptor" type="{http://cfe.dgi.gub.uy}RUCType"/&gt;
 *                   &lt;element name="RUCEmisor" type="{http://cfe.dgi.gub.uy}RUCType"/&gt;
 *                   &lt;element name="Idemisor"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                         &lt;totalDigits value="10"/&gt;
 *                         &lt;minInclusive value="0"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CantCFE"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                         &lt;minInclusive value="1"/&gt;
 *                         &lt;maxInclusive value="250"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Fecha" type="{http://cfe.dgi.gub.uy}FechaHoraType"/&gt;
 *                   &lt;element name="X509Certificate" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="version" use="required" fixed="1.0"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;maxLength value="3"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CFE_Adenda" type="{http://cfe.dgi.gub.uy}CFE_Empresas_Type" maxOccurs="250"/&gt;
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
@XmlType(name = "", propOrder = {
    "caratula",
    "cfeAdenda"
})
@XmlRootElement(name = "EnvioCFE_entreEmpresas")
public class EnvioCFEEntreEmpresas {

    @XmlElement(name = "Caratula", required = true)
    protected Caratula caratula;
    @XmlElement(name = "CFE_Adenda", required = true)
    protected List<CFEEmpresasType> cfeAdenda;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Obtiene el valor de la propiedad caratula.
     * 
     * @return
     *     possible object is
     *     {@link Caratula }
     *     
     */
    public Caratula getCaratula() {
        return caratula;
    }

    /**
     * Define el valor de la propiedad caratula.
     * 
     * @param value
     *     allowed object is
     *     {@link Caratula }
     *     
     */
    public void setCaratula(Caratula value) {
        this.caratula = value;
    }

    /**
     * Gets the value of the cfeAdenda property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cfeAdenda property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCFEAdenda().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CFEEmpresasType }
     * 
     * 
     */
    public List<CFEEmpresasType> getCFEAdenda() {
        if (cfeAdenda == null) {
            cfeAdenda = new ArrayList<CFEEmpresasType>();
        }
        return this.cfeAdenda;
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
     *         &lt;element name="RutReceptor" type="{http://cfe.dgi.gub.uy}RUCType"/&gt;
     *         &lt;element name="RUCEmisor" type="{http://cfe.dgi.gub.uy}RUCType"/&gt;
     *         &lt;element name="Idemisor"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *               &lt;totalDigits value="10"/&gt;
     *               &lt;minInclusive value="0"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CantCFE"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *               &lt;minInclusive value="1"/&gt;
     *               &lt;maxInclusive value="250"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Fecha" type="{http://cfe.dgi.gub.uy}FechaHoraType"/&gt;
     *         &lt;element name="X509Certificate" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
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
    @XmlType(name = "", propOrder = {
        "rutReceptor",
        "rucEmisor",
        "idemisor",
        "cantCFE",
        "fecha",
        "x509Certificate"
    })
    public static class Caratula {

        @XmlElement(name = "RutReceptor", required = true)
        protected String rutReceptor;
        @XmlElement(name = "RUCEmisor", required = true)
        protected String rucEmisor;
        @XmlElement(name = "Idemisor", required = true)
        protected BigInteger idemisor;
        @XmlElement(name = "CantCFE")
        protected int cantCFE;
        @XmlElement(name = "Fecha", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar fecha;
        @XmlElement(name = "X509Certificate", required = true)
        protected byte[] x509Certificate;
        @XmlAttribute(name = "version", required = true)
        protected String version;

        /**
         * Obtiene el valor de la propiedad rutReceptor.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRutReceptor() {
            return rutReceptor;
        }

        /**
         * Define el valor de la propiedad rutReceptor.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRutReceptor(String value) {
            this.rutReceptor = value;
        }

        /**
         * Obtiene el valor de la propiedad rucEmisor.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRUCEmisor() {
            return rucEmisor;
        }

        /**
         * Define el valor de la propiedad rucEmisor.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRUCEmisor(String value) {
            this.rucEmisor = value;
        }

        /**
         * Obtiene el valor de la propiedad idemisor.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getIdemisor() {
            return idemisor;
        }

        /**
         * Define el valor de la propiedad idemisor.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setIdemisor(BigInteger value) {
            this.idemisor = value;
        }

        /**
         * Obtiene el valor de la propiedad cantCFE.
         * 
         */
        public int getCantCFE() {
            return cantCFE;
        }

        /**
         * Define el valor de la propiedad cantCFE.
         * 
         */
        public void setCantCFE(int value) {
            this.cantCFE = value;
        }

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
         * Obtiene el valor de la propiedad x509Certificate.
         * 
         * @return
         *     possible object is
         *     byte[]
         */
        public byte[] getX509Certificate() {
            return x509Certificate;
        }

        /**
         * Define el valor de la propiedad x509Certificate.
         * 
         * @param value
         *     allowed object is
         *     byte[]
         */
        public void setX509Certificate(byte[] value) {
            this.x509Certificate = value;
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

    }

}
