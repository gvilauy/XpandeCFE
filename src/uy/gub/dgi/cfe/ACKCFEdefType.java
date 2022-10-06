//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.23 a las 05:28:39 PM UTC 
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
 * <p>Clase Java para ACKCFEdefType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ACKCFEdefType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Caratula"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RUCReceptor" type="{http://cfe.dgi.gub.uy}RUCType"/&gt;
 *                   &lt;element name="RUCEmisor" type="{http://cfe.dgi.gub.uy}RUCType"/&gt;
 *                   &lt;element name="IDRespuesta"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                         &lt;totalDigits value="10"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NomArch" type="{http://cfe.dgi.gub.uy}NomArchType"/&gt;
 *                   &lt;element name="FecHRecibido" type="{http://cfe.dgi.gub.uy}FechaHoraType"/&gt;
 *                   &lt;element name="IDEmisor" type="{http://cfe.dgi.gub.uy}IDRecEmiType"/&gt;
 *                   &lt;element name="IDReceptor" type="{http://cfe.dgi.gub.uy}IDRecEmiType"/&gt;
 *                   &lt;element name="CantenSobre"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                         &lt;totalDigits value="3"/&gt;
 *                         &lt;minInclusive value="0"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CantResponden"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                         &lt;totalDigits value="3"/&gt;
 *                         &lt;minInclusive value="0"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CantCFEAceptados" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                         &lt;totalDigits value="3"/&gt;
 *                         &lt;minInclusive value="0"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CantCFERechazados" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                         &lt;totalDigits value="3"/&gt;
 *                         &lt;minInclusive value="0"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CantCFCAceptados" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                         &lt;totalDigits value="3"/&gt;
 *                         &lt;minInclusive value="0"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CantCFCObservados" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                         &lt;totalDigits value="3"/&gt;
 *                         &lt;minInclusive value="0"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CantOtrosRechazados" minOccurs="0"&gt;
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
 *         &lt;element name="ACKCFE_Det" maxOccurs="250"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Nro_ordinal" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="TipoCFE" type="{http://cfe.dgi.gub.uy}CFEType" minOccurs="0"/&gt;
 *                   &lt;element name="Serie" type="{http://cfe.dgi.gub.uy}SerieType" minOccurs="0"/&gt;
 *                   &lt;element name="NroCFE" type="{http://cfe.dgi.gub.uy}NroCFEType" minOccurs="0"/&gt;
 *                   &lt;element name="FechaCFE" type="{http://cfe.dgi.gub.uy}FechaType" minOccurs="0"/&gt;
 *                   &lt;element name="TmstCFE" type="{http://cfe.dgi.gub.uy}FechaHoraType" minOccurs="0"/&gt;
 *                   &lt;element name="Estado"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}EstadoType"&gt;
 *                         &lt;enumeration value="AE"/&gt;
 *                         &lt;enumeration value="BE"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="MotivosRechazoCF" type="{http://cfe.dgi.gub.uy}RechazoCFE_PartesType" maxOccurs="10" minOccurs="0"/&gt;
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
@XmlType(name = "ACKCFEdefType", propOrder = {
    "caratula",
    "ackcfeDet",
    "signature"
})
public class ACKCFEdefType {

    @XmlElement(name = "Caratula", required = true)
    protected Caratula caratula;
    @XmlElement(name = "ACKCFE_Det", required = true)
    protected List<ACKCFEDet> ackcfeDet;
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
     * Gets the value of the ackcfeDet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ackcfeDet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getACKCFEDet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ACKCFEDet }
     * 
     * 
     */
    public List<ACKCFEDet> getACKCFEDet() {
        if (ackcfeDet == null) {
            ackcfeDet = new ArrayList<ACKCFEDet>();
        }
        return this.ackcfeDet;
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
     *         &lt;element name="Nro_ordinal" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="TipoCFE" type="{http://cfe.dgi.gub.uy}CFEType" minOccurs="0"/&gt;
     *         &lt;element name="Serie" type="{http://cfe.dgi.gub.uy}SerieType" minOccurs="0"/&gt;
     *         &lt;element name="NroCFE" type="{http://cfe.dgi.gub.uy}NroCFEType" minOccurs="0"/&gt;
     *         &lt;element name="FechaCFE" type="{http://cfe.dgi.gub.uy}FechaType" minOccurs="0"/&gt;
     *         &lt;element name="TmstCFE" type="{http://cfe.dgi.gub.uy}FechaHoraType" minOccurs="0"/&gt;
     *         &lt;element name="Estado"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}EstadoType"&gt;
     *               &lt;enumeration value="AE"/&gt;
     *               &lt;enumeration value="BE"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="MotivosRechazoCF" type="{http://cfe.dgi.gub.uy}RechazoCFE_PartesType" maxOccurs="10" minOccurs="0"/&gt;
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
        "nroOrdinal",
        "tipoCFE",
        "serie",
        "nroCFE",
        "fechaCFE",
        "tmstCFE",
        "estado",
        "motivosRechazoCF"
    })
    public static class ACKCFEDet {

        @XmlElement(name = "Nro_ordinal", required = true)
        protected BigInteger nroOrdinal;
        @XmlElement(name = "TipoCFE")
        protected BigInteger tipoCFE;
        @XmlElement(name = "Serie")
        protected String serie;
        @XmlElement(name = "NroCFE")
        protected BigInteger nroCFE;
        @XmlElement(name = "FechaCFE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar fechaCFE;
        @XmlElement(name = "TmstCFE")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar tmstCFE;
        @XmlElement(name = "Estado", required = true)
        protected String estado;
        @XmlElement(name = "MotivosRechazoCF")
        protected List<RechazoCFEPartesType> motivosRechazoCF;

        /**
         * Obtiene el valor de la propiedad nroOrdinal.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNroOrdinal() {
            return nroOrdinal;
        }

        /**
         * Define el valor de la propiedad nroOrdinal.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNroOrdinal(BigInteger value) {
            this.nroOrdinal = value;
        }

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
         * Obtiene el valor de la propiedad tmstCFE.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTmstCFE() {
            return tmstCFE;
        }

        /**
         * Define el valor de la propiedad tmstCFE.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTmstCFE(XMLGregorianCalendar value) {
            this.tmstCFE = value;
        }

        /**
         * Obtiene el valor de la propiedad estado.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEstado() {
            return estado;
        }

        /**
         * Define el valor de la propiedad estado.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEstado(String value) {
            this.estado = value;
        }

        /**
         * Gets the value of the motivosRechazoCF property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the motivosRechazoCF property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMotivosRechazoCF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RechazoCFEPartesType }
         * 
         * 
         */
        public List<RechazoCFEPartesType> getMotivosRechazoCF() {
            if (motivosRechazoCF == null) {
                motivosRechazoCF = new ArrayList<RechazoCFEPartesType>();
            }
            return this.motivosRechazoCF;
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
     *         &lt;element name="RUCReceptor" type="{http://cfe.dgi.gub.uy}RUCType"/&gt;
     *         &lt;element name="RUCEmisor" type="{http://cfe.dgi.gub.uy}RUCType"/&gt;
     *         &lt;element name="IDRespuesta"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *               &lt;totalDigits value="10"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="NomArch" type="{http://cfe.dgi.gub.uy}NomArchType"/&gt;
     *         &lt;element name="FecHRecibido" type="{http://cfe.dgi.gub.uy}FechaHoraType"/&gt;
     *         &lt;element name="IDEmisor" type="{http://cfe.dgi.gub.uy}IDRecEmiType"/&gt;
     *         &lt;element name="IDReceptor" type="{http://cfe.dgi.gub.uy}IDRecEmiType"/&gt;
     *         &lt;element name="CantenSobre"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *               &lt;totalDigits value="3"/&gt;
     *               &lt;minInclusive value="0"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CantResponden"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *               &lt;totalDigits value="3"/&gt;
     *               &lt;minInclusive value="0"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CantCFEAceptados" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *               &lt;totalDigits value="3"/&gt;
     *               &lt;minInclusive value="0"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CantCFERechazados" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *               &lt;totalDigits value="3"/&gt;
     *               &lt;minInclusive value="0"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CantCFCAceptados" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *               &lt;totalDigits value="3"/&gt;
     *               &lt;minInclusive value="0"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CantCFCObservados" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *               &lt;totalDigits value="3"/&gt;
     *               &lt;minInclusive value="0"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CantOtrosRechazados" minOccurs="0"&gt;
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
        "rucReceptor",
        "rucEmisor",
        "idRespuesta",
        "nomArch",
        "fecHRecibido",
        "idEmisor",
        "idReceptor",
        "cantenSobre",
        "cantResponden",
        "cantCFEAceptados",
        "cantCFERechazados",
        "cantCFCAceptados",
        "cantCFCObservados",
        "cantOtrosRechazados",
        "tmst"
    })
    public static class Caratula {

        @XmlElement(name = "RUCReceptor", required = true)
        protected String rucReceptor;
        @XmlElement(name = "RUCEmisor", required = true)
        protected String rucEmisor;
        @XmlElement(name = "IDRespuesta", required = true)
        protected BigInteger idRespuesta;
        @XmlElement(name = "NomArch", required = true)
        protected String nomArch;
        @XmlElement(name = "FecHRecibido", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar fecHRecibido;
        @XmlElement(name = "IDEmisor", required = true)
        protected BigInteger idEmisor;
        @XmlElement(name = "IDReceptor", required = true)
        protected BigInteger idReceptor;
        @XmlElement(name = "CantenSobre", required = true)
        protected BigInteger cantenSobre;
        @XmlElement(name = "CantResponden", required = true)
        protected BigInteger cantResponden;
        @XmlElement(name = "CantCFEAceptados")
        protected BigInteger cantCFEAceptados;
        @XmlElement(name = "CantCFERechazados")
        protected BigInteger cantCFERechazados;
        @XmlElement(name = "CantCFCAceptados")
        protected BigInteger cantCFCAceptados;
        @XmlElement(name = "CantCFCObservados")
        protected BigInteger cantCFCObservados;
        @XmlElement(name = "CantOtrosRechazados")
        protected BigInteger cantOtrosRechazados;
        @XmlElement(name = "Tmst", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar tmst;

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
         * Obtiene el valor de la propiedad idRespuesta.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getIDRespuesta() {
            return idRespuesta;
        }

        /**
         * Define el valor de la propiedad idRespuesta.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setIDRespuesta(BigInteger value) {
            this.idRespuesta = value;
        }

        /**
         * Obtiene el valor de la propiedad nomArch.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNomArch() {
            return nomArch;
        }

        /**
         * Define el valor de la propiedad nomArch.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNomArch(String value) {
            this.nomArch = value;
        }

        /**
         * Obtiene el valor de la propiedad fecHRecibido.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFecHRecibido() {
            return fecHRecibido;
        }

        /**
         * Define el valor de la propiedad fecHRecibido.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFecHRecibido(XMLGregorianCalendar value) {
            this.fecHRecibido = value;
        }

        /**
         * Obtiene el valor de la propiedad idEmisor.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getIDEmisor() {
            return idEmisor;
        }

        /**
         * Define el valor de la propiedad idEmisor.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setIDEmisor(BigInteger value) {
            this.idEmisor = value;
        }

        /**
         * Obtiene el valor de la propiedad idReceptor.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getIDReceptor() {
            return idReceptor;
        }

        /**
         * Define el valor de la propiedad idReceptor.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setIDReceptor(BigInteger value) {
            this.idReceptor = value;
        }

        /**
         * Obtiene el valor de la propiedad cantenSobre.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCantenSobre() {
            return cantenSobre;
        }

        /**
         * Define el valor de la propiedad cantenSobre.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCantenSobre(BigInteger value) {
            this.cantenSobre = value;
        }

        /**
         * Obtiene el valor de la propiedad cantResponden.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCantResponden() {
            return cantResponden;
        }

        /**
         * Define el valor de la propiedad cantResponden.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCantResponden(BigInteger value) {
            this.cantResponden = value;
        }

        /**
         * Obtiene el valor de la propiedad cantCFEAceptados.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCantCFEAceptados() {
            return cantCFEAceptados;
        }

        /**
         * Define el valor de la propiedad cantCFEAceptados.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCantCFEAceptados(BigInteger value) {
            this.cantCFEAceptados = value;
        }

        /**
         * Obtiene el valor de la propiedad cantCFERechazados.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCantCFERechazados() {
            return cantCFERechazados;
        }

        /**
         * Define el valor de la propiedad cantCFERechazados.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCantCFERechazados(BigInteger value) {
            this.cantCFERechazados = value;
        }

        /**
         * Obtiene el valor de la propiedad cantCFCAceptados.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCantCFCAceptados() {
            return cantCFCAceptados;
        }

        /**
         * Define el valor de la propiedad cantCFCAceptados.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCantCFCAceptados(BigInteger value) {
            this.cantCFCAceptados = value;
        }

        /**
         * Obtiene el valor de la propiedad cantCFCObservados.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCantCFCObservados() {
            return cantCFCObservados;
        }

        /**
         * Define el valor de la propiedad cantCFCObservados.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCantCFCObservados(BigInteger value) {
            this.cantCFCObservados = value;
        }

        /**
         * Obtiene el valor de la propiedad cantOtrosRechazados.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCantOtrosRechazados() {
            return cantOtrosRechazados;
        }

        /**
         * Define el valor de la propiedad cantOtrosRechazados.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCantOtrosRechazados(BigInteger value) {
            this.cantOtrosRechazados = value;
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

}
