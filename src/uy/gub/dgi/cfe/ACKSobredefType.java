//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.23 a las 05:29:35 PM UTC 
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
 * <p>Clase Java para ACKSobredefType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ACKSobredefType"&gt;
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
 *                   &lt;element name="CantidadCFE"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                         &lt;totalDigits value="3"/&gt;
 *                         &lt;minInclusive value="0"/&gt;
 *                         &lt;maxInclusive value="250"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Tmst" type="{http://cfe.dgi.gub.uy}FechaHoraType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Detalle"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Estado" type="{http://cfe.dgi.gub.uy}EstadoACKSobreType"/&gt;
 *                   &lt;element name="MotivosRechazo" type="{http://cfe.dgi.gub.uy}RechazoSobreType" maxOccurs="30" minOccurs="0"/&gt;
 *                   &lt;element name="ParamConsulta" type="{http://cfe.dgi.gub.uy}ParamConsultaType" minOccurs="0"/&gt;
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
     * Obtiene el valor de la propiedad detalle.
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
     * Define el valor de la propiedad detalle.
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
     *         &lt;element name="CantidadCFE"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *               &lt;totalDigits value="3"/&gt;
     *               &lt;minInclusive value="0"/&gt;
     *               &lt;maxInclusive value="250"/&gt;
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
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar fecHRecibido;
        @XmlElement(name = "IDEmisor", required = true)
        protected BigInteger idEmisor;
        @XmlElement(name = "IDReceptor", required = true)
        protected BigInteger idReceptor;
        @XmlElement(name = "CantidadCFE")
        protected int cantidadCFE;
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
         * Obtiene el valor de la propiedad cantidadCFE.
         * 
         */
        public int getCantidadCFE() {
            return cantidadCFE;
        }

        /**
         * Define el valor de la propiedad cantidadCFE.
         * 
         */
        public void setCantidadCFE(int value) {
            this.cantidadCFE = value;
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
     *         &lt;element name="Estado" type="{http://cfe.dgi.gub.uy}EstadoACKSobreType"/&gt;
     *         &lt;element name="MotivosRechazo" type="{http://cfe.dgi.gub.uy}RechazoSobreType" maxOccurs="30" minOccurs="0"/&gt;
     *         &lt;element name="ParamConsulta" type="{http://cfe.dgi.gub.uy}ParamConsultaType" minOccurs="0"/&gt;
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
        "estado",
        "motivosRechazo",
        "paramConsulta"
    })
    public static class Detalle {

        @XmlElement(name = "Estado", required = true)
        @XmlSchemaType(name = "string")
        protected EstadoACKSobreType estado;
        @XmlElement(name = "MotivosRechazo")
        protected List<RechazoSobreType> motivosRechazo;
        @XmlElement(name = "ParamConsulta")
        protected ParamConsultaType paramConsulta;

        /**
         * Obtiene el valor de la propiedad estado.
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
         * Define el valor de la propiedad estado.
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
         * Obtiene el valor de la propiedad paramConsulta.
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
         * Define el valor de la propiedad paramConsulta.
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
