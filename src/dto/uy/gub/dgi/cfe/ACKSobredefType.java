//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.18 at 02:32:19 PM UYT 
//


package dto.uy.gub.dgi.cfe;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import dto.org.w3._2000._09.xmldsig.SignatureType;


/**
 * <p>Java class for ACKSobredefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACKSobredefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Caratula">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RUCReceptor" type="{http://cfe.dgi.gub.uy}RUCType"/>
 *                   &lt;element name="RUCEmisor" type="{http://cfe.dgi.gub.uy}RUCType"/>
 *                   &lt;element name="IDRespuesta">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;totalDigits value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="NomArch" type="{http://cfe.dgi.gub.uy}NomArchType"/>
 *                   &lt;element name="FecHRecibido" type="{http://cfe.dgi.gub.uy}FechaHoraType"/>
 *                   &lt;element name="IDEmisor" type="{http://cfe.dgi.gub.uy}IDRecEmiType"/>
 *                   &lt;element name="IDReceptor" type="{http://cfe.dgi.gub.uy}IDRecEmiType"/>
 *                   &lt;element name="CantidadCFE">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;totalDigits value="3"/>
 *                         &lt;minInclusive value="1"/>
 *                         &lt;maxInclusive value="250"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Tmst" type="{http://cfe.dgi.gub.uy}FechaHoraType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Detalle">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Estado" type="{http://cfe.dgi.gub.uy}EstadoACKSobreType"/>
 *                   &lt;element name="MotivosRechazo" type="{http://cfe.dgi.gub.uy}RechazoSobreType" maxOccurs="30" minOccurs="0"/>
 *                   &lt;element name="ParamConsulta" type="{http://cfe.dgi.gub.uy}ParamConsultaType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" fixed="1.0">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="3"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACKSobredefType", propOrder = {
    "caratula",
    "detalle",
    "signature"
})
public class ACKSobredefType {

    @XmlElement(name = "Caratula", required = true)
    protected Caratula caratula;
    @XmlElement(name = "Detalle", required = true)
    protected Detalle detalle;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the caratula property.
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
     * Sets the value of the caratula property.
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
     * Gets the value of the detalle property.
     * 
     * @return
     *     possible object is
     *     {@link Detalle }
     *     
     */
    public Detalle getDetalle() {
        return detalle;
    }

    /**
     * Sets the value of the detalle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Detalle }
     *     
     */
    public void setDetalle(Detalle value) {
        this.detalle = value;
    }

    /**
     * Gets the value of the signature property.
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
     * Sets the value of the signature property.
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
     * Gets the value of the version property.
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
     * Sets the value of the version property.
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="RUCReceptor" type="{http://cfe.dgi.gub.uy}RUCType"/>
     *         &lt;element name="RUCEmisor" type="{http://cfe.dgi.gub.uy}RUCType"/>
     *         &lt;element name="IDRespuesta">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;totalDigits value="10"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="NomArch" type="{http://cfe.dgi.gub.uy}NomArchType"/>
     *         &lt;element name="FecHRecibido" type="{http://cfe.dgi.gub.uy}FechaHoraType"/>
     *         &lt;element name="IDEmisor" type="{http://cfe.dgi.gub.uy}IDRecEmiType"/>
     *         &lt;element name="IDReceptor" type="{http://cfe.dgi.gub.uy}IDRecEmiType"/>
     *         &lt;element name="CantidadCFE">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;totalDigits value="3"/>
     *               &lt;minInclusive value="1"/>
     *               &lt;maxInclusive value="250"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Tmst" type="{http://cfe.dgi.gub.uy}FechaHoraType"/>
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
        "rucReceptor",
        "rucEmisor",
        "idRespuesta",
        "nomArch",
        "fecHRecibido",
        "idEmisor",
        "idReceptor",
        "cantidadCFE",
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
        protected XMLGregorianCalendar fecHRecibido;
        @XmlElement(name = "IDEmisor", required = true)
        protected BigInteger idEmisor;
        @XmlElement(name = "IDReceptor", required = true)
        protected BigInteger idReceptor;
        @XmlElement(name = "CantidadCFE")
        protected int cantidadCFE;
        @XmlElement(name = "Tmst", required = true)
        protected XMLGregorianCalendar tmst;

        /**
         * Gets the value of the rucReceptor property.
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
         * Sets the value of the rucReceptor property.
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
         * Gets the value of the rucEmisor property.
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
         * Sets the value of the rucEmisor property.
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
         * Gets the value of the idRespuesta property.
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
         * Sets the value of the idRespuesta property.
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
         * Gets the value of the nomArch property.
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
         * Sets the value of the nomArch property.
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
         * Gets the value of the fecHRecibido property.
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
         * Sets the value of the fecHRecibido property.
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
         * Gets the value of the idEmisor property.
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
         * Sets the value of the idEmisor property.
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
         * Gets the value of the idReceptor property.
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
         * Sets the value of the idReceptor property.
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
         * Gets the value of the cantidadCFE property.
         * 
         */
        public int getCantidadCFE() {
            return cantidadCFE;
        }

        /**
         * Sets the value of the cantidadCFE property.
         * 
         */
        public void setCantidadCFE(int value) {
            this.cantidadCFE = value;
        }

        /**
         * Gets the value of the tmst property.
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
         * Sets the value of the tmst property.
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Estado" type="{http://cfe.dgi.gub.uy}EstadoACKSobreType"/>
     *         &lt;element name="MotivosRechazo" type="{http://cfe.dgi.gub.uy}RechazoSobreType" maxOccurs="30" minOccurs="0"/>
     *         &lt;element name="ParamConsulta" type="{http://cfe.dgi.gub.uy}ParamConsultaType" minOccurs="0"/>
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
        "estado",
        "motivosRechazo",
        "paramConsulta"
    })
    public static class Detalle {

        @XmlElement(name = "Estado", required = true)
        protected EstadoACKSobreType estado;
        @XmlElement(name = "MotivosRechazo")
        protected List<RechazoSobreType> motivosRechazo;
        @XmlElement(name = "ParamConsulta")
        protected ParamConsultaType paramConsulta;

        /**
         * Gets the value of the estado property.
         * 
         * @return
         *     possible object is
         *     {@link EstadoACKSobreType }
         *     
         */
        public EstadoACKSobreType getEstado() {
            return estado;
        }

        /**
         * Sets the value of the estado property.
         * 
         * @param value
         *     allowed object is
         *     {@link EstadoACKSobreType }
         *     
         */
        public void setEstado(EstadoACKSobreType value) {
            this.estado = value;
        }

        /**
         * Gets the value of the motivosRechazo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the motivosRechazo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMotivosRechazo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RechazoSobreType }
         * 
         * 
         */
        public List<RechazoSobreType> getMotivosRechazo() {
            if (motivosRechazo == null) {
                motivosRechazo = new ArrayList<RechazoSobreType>();
            }
            return this.motivosRechazo;
        }

        /**
         * Gets the value of the paramConsulta property.
         * 
         * @return
         *     possible object is
         *     {@link ParamConsultaType }
         *     
         */
        public ParamConsultaType getParamConsulta() {
            return paramConsulta;
        }

        /**
         * Sets the value of the paramConsulta property.
         * 
         * @param value
         *     allowed object is
         *     {@link ParamConsultaType }
         *     
         */
        public void setParamConsulta(ParamConsultaType value) {
            this.paramConsulta = value;
        }

    }

}
