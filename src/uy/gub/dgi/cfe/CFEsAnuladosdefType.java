//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.23 a las 05:32:20 PM UTC 
//


package uy.gub.dgi.cfe;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3._2000._09.xmldsig_.SignatureType;


/**
 * <p>Clase Java para CFEsAnuladosdefType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CFEsAnuladosdefType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Caratula"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RUCEmisor" type="{http://cfe.dgi.gub.uy}RUCType"/&gt;
 *                   &lt;element name="RUCReceptor" type="{http://cfe.dgi.gub.uy}RUCType"/&gt;
 *                   &lt;element name="IDComunicacion" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                         &lt;totalDigits value="10"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CantCFEAnulados"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                         &lt;totalDigits value="3"/&gt;
 *                         &lt;minInclusive value="0"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Tmst" type="{http://cfe.dgi.gub.uy}FechaHoraType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CFEAnulado" maxOccurs="250"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoCFE" type="{http://cfe.dgi.gub.uy}CFEType"/&gt;
 *                   &lt;element name="Serie" type="{http://cfe.dgi.gub.uy}SerieType"/&gt;
 *                   &lt;element name="NroCFE" type="{http://cfe.dgi.gub.uy}NroCFEType"/&gt;
 *                   &lt;element name="FechaCFE" type="{http://cfe.dgi.gub.uy}FechaType"/&gt;
 *                   &lt;element name="Motivo_Cod"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;length value="2"/&gt;
 *                         &lt;enumeration value="RD"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Motivo_Glosa"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="40"/&gt;
 *                         &lt;enumeration value="Comprobante anulado por rechazo de DGI"/&gt;
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
@XmlType(name = "CFEsAnuladosdefType", propOrder = {
    "caratula",
    "cfeAnulado",
    "signature"
})
public class CFEsAnuladosdefType {

    @XmlElement(name = "Caratula", required = true)
    protected Caratula caratula;
    @XmlElement(name = "CFEAnulado", required = true)
    protected List<CFEAnulado> cfeAnulado;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;
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
     * Gets the value of the cfeAnulado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cfeAnulado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCFEAnulado().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CFEAnulado }
     * 
     * 
     */
    public List<CFEAnulado> getCFEAnulado() {
        if (cfeAnulado == null) {
            cfeAnulado = new ArrayList<CFEAnulado>();
        }
        return this.cfeAnulado;
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
     *         &lt;element name="RUCEmisor" type="{http://cfe.dgi.gub.uy}RUCType"/&gt;
     *         &lt;element name="RUCReceptor" type="{http://cfe.dgi.gub.uy}RUCType"/&gt;
     *         &lt;element name="IDComunicacion" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *               &lt;totalDigits value="10"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CantCFEAnulados"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *               &lt;totalDigits value="3"/&gt;
     *               &lt;minInclusive value="0"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Tmst" type="{http://cfe.dgi.gub.uy}FechaHoraType"/&gt;
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
        "rucEmisor",
        "rucReceptor",
        "idComunicacion",
        "cantCFEAnulados",
        "tmst"
    })
    public static class Caratula {

        @XmlElement(name = "RUCEmisor", required = true)
        protected String rucEmisor;
        @XmlElement(name = "RUCReceptor", required = true)
        protected String rucReceptor;
        @XmlElement(name = "IDComunicacion")
        protected BigInteger idComunicacion;
        @XmlElement(name = "CantCFEAnulados", required = true)
        protected BigInteger cantCFEAnulados;
        @XmlElement(name = "Tmst", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar tmst;

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
         * Obtiene el valor de la propiedad rucReceptor.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRUCReceptor() {
            return rucReceptor;
        }

        /**
         * Define el valor de la propiedad rucReceptor.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRUCReceptor(String value) {
            this.rucReceptor = value;
        }

        /**
         * Obtiene el valor de la propiedad idComunicacion.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getIDComunicacion() {
            return idComunicacion;
        }

        /**
         * Define el valor de la propiedad idComunicacion.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setIDComunicacion(BigInteger value) {
            this.idComunicacion = value;
        }

        /**
         * Obtiene el valor de la propiedad cantCFEAnulados.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCantCFEAnulados() {
            return cantCFEAnulados;
        }

        /**
         * Define el valor de la propiedad cantCFEAnulados.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCantCFEAnulados(BigInteger value) {
            this.cantCFEAnulados = value;
        }

        /**
         * Obtiene el valor de la propiedad tmst.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTmst() {
            return tmst;
        }

        /**
         * Define el valor de la propiedad tmst.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTmst(XMLGregorianCalendar value) {
            this.tmst = value;
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
     *         &lt;element name="TipoCFE" type="{http://cfe.dgi.gub.uy}CFEType"/&gt;
     *         &lt;element name="Serie" type="{http://cfe.dgi.gub.uy}SerieType"/&gt;
     *         &lt;element name="NroCFE" type="{http://cfe.dgi.gub.uy}NroCFEType"/&gt;
     *         &lt;element name="FechaCFE" type="{http://cfe.dgi.gub.uy}FechaType"/&gt;
     *         &lt;element name="Motivo_Cod"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;length value="2"/&gt;
     *               &lt;enumeration value="RD"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Motivo_Glosa"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="40"/&gt;
     *               &lt;enumeration value="Comprobante anulado por rechazo de DGI"/&gt;
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
        "tipoCFE",
        "serie",
        "nroCFE",
        "fechaCFE",
        "motivoCod",
        "motivoGlosa"
    })
    public static class CFEAnulado {

        @XmlElement(name = "TipoCFE", required = true)
        protected BigInteger tipoCFE;
        @XmlElement(name = "Serie", required = true)
        protected String serie;
        @XmlElement(name = "NroCFE", required = true)
        protected BigInteger nroCFE;
        @XmlElement(name = "FechaCFE", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar fechaCFE;
        @XmlElement(name = "Motivo_Cod", required = true)
        protected String motivoCod;
        @XmlElement(name = "Motivo_Glosa", required = true)
        protected String motivoGlosa;

        /**
         * Obtiene el valor de la propiedad tipoCFE.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTipoCFE() {
            return tipoCFE;
        }

        /**
         * Define el valor de la propiedad tipoCFE.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTipoCFE(BigInteger value) {
            this.tipoCFE = value;
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
         * Obtiene el valor de la propiedad nroCFE.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNroCFE() {
            return nroCFE;
        }

        /**
         * Define el valor de la propiedad nroCFE.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNroCFE(BigInteger value) {
            this.nroCFE = value;
        }

        /**
         * Obtiene el valor de la propiedad fechaCFE.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFechaCFE() {
            return fechaCFE;
        }

        /**
         * Define el valor de la propiedad fechaCFE.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFechaCFE(XMLGregorianCalendar value) {
            this.fechaCFE = value;
        }

        /**
         * Obtiene el valor de la propiedad motivoCod.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMotivoCod() {
            return motivoCod;
        }

        /**
         * Define el valor de la propiedad motivoCod.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMotivoCod(String value) {
            this.motivoCod = value;
        }

        /**
         * Obtiene el valor de la propiedad motivoGlosa.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMotivoGlosa() {
            return motivoGlosa;
        }

        /**
         * Define el valor de la propiedad motivoGlosa.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMotivoGlosa(String value) {
            this.motivoGlosa = value;
        }

    }

}
