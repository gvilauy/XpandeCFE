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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para Referencia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Referencia"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Referencia" maxOccurs="40" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NroLinRef"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}LineasInfoRef"&gt;
 *                         &lt;maxInclusive value="40"/&gt;
 *                         &lt;minInclusive value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IndGlobal" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"&gt;
 *                         &lt;totalDigits value="1"/&gt;
 *                         &lt;enumeration value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TpoDocRef" type="{http://cfe.dgi.gub.uy}CFEType" minOccurs="0"/&gt;
 *                   &lt;element name="Serie" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NroCFERef" type="{http://cfe.dgi.gub.uy}NroCFEType" minOccurs="0"/&gt;
 *                   &lt;element name="RazonRef" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="90"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FechaCFEref" type="{http://cfe.dgi.gub.uy}FechaType" minOccurs="0"/&gt;
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
@XmlType(name = "Referencia", propOrder = {
    "referencia"
})
public class Referencia1 {

    @XmlElement(name = "Referencia")
    protected List<Referencia> referencia;

    /**
     * Gets the value of the referencia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referencia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferencia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Referencia1 .Referencia }
     * 
     * 
     */
    public List<Referencia> getReferencia() {
        if (referencia == null) {
            referencia = new ArrayList<Referencia>();
        }
        return this.referencia;
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
     *         &lt;element name="NroLinRef"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}LineasInfoRef"&gt;
     *               &lt;maxInclusive value="40"/&gt;
     *               &lt;minInclusive value="1"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="IndGlobal" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"&gt;
     *               &lt;totalDigits value="1"/&gt;
     *               &lt;enumeration value="1"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TpoDocRef" type="{http://cfe.dgi.gub.uy}CFEType" minOccurs="0"/&gt;
     *         &lt;element name="Serie" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="2"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="NroCFERef" type="{http://cfe.dgi.gub.uy}NroCFEType" minOccurs="0"/&gt;
     *         &lt;element name="RazonRef" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="90"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="FechaCFEref" type="{http://cfe.dgi.gub.uy}FechaType" minOccurs="0"/&gt;
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
        "nroLinRef",
        "indGlobal",
        "tpoDocRef",
        "serie",
        "nroCFERef",
        "razonRef",
        "fechaCFEref"
    })
    public static class Referencia {

        @XmlElement(name = "NroLinRef")
        protected int nroLinRef;
        @XmlElement(name = "IndGlobal")
        protected BigInteger indGlobal;
        @XmlElement(name = "TpoDocRef")
        protected BigInteger tpoDocRef;
        @XmlElement(name = "Serie")
        protected String serie;
        @XmlElement(name = "NroCFERef")
        protected BigInteger nroCFERef;
        @XmlElement(name = "RazonRef")
        protected String razonRef;
        @XmlElement(name = "FechaCFEref")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar fechaCFEref;

        /**
         * Obtiene el valor de la propiedad nroLinRef.
         * 
         */
        public int getNroLinRef() {
            return nroLinRef;
        }

        /**
         * Define el valor de la propiedad nroLinRef.
         * 
         */
        public void setNroLinRef(int value) {
            this.nroLinRef = value;
        }

        /**
         * Obtiene el valor de la propiedad indGlobal.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getIndGlobal() {
            return indGlobal;
        }

        /**
         * Define el valor de la propiedad indGlobal.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setIndGlobal(BigInteger value) {
            this.indGlobal = value;
        }

        /**
         * Obtiene el valor de la propiedad tpoDocRef.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTpoDocRef() {
            return tpoDocRef;
        }

        /**
         * Define el valor de la propiedad tpoDocRef.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTpoDocRef(BigInteger value) {
            this.tpoDocRef = value;
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
         * Obtiene el valor de la propiedad nroCFERef.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNroCFERef() {
            return nroCFERef;
        }

        /**
         * Define el valor de la propiedad nroCFERef.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNroCFERef(BigInteger value) {
            this.nroCFERef = value;
        }

        /**
         * Obtiene el valor de la propiedad razonRef.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRazonRef() {
            return razonRef;
        }

        /**
         * Define el valor de la propiedad razonRef.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRazonRef(String value) {
            this.razonRef = value;
        }

        /**
         * Obtiene el valor de la propiedad fechaCFEref.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFechaCFEref() {
            return fechaCFEref;
        }

        /**
         * Define el valor de la propiedad fechaCFEref.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFechaCFEref(XMLGregorianCalendar value) {
            this.fechaCFEref = value;
        }

    }

}
