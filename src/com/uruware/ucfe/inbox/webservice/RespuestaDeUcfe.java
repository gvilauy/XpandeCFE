
package com.uruware.ucfe.inbox.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RespuestaDeUcfe complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RespuestaDeUcfe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Adenda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CaeNroDesde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CaeNroHasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Certificado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CertificadoParaFirmarCfe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClaveCertificadoFirma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodComercio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodRta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodTerminal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoSeguridad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DatosQr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EstadoEnDgiCfeRecibido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EstadoSituacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Etiquetas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaFirma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaReq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HoraReq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdCae" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdReq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImagenQr" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="MensajeRta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroCfe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RangoDesde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RangoHasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RutEmisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Serie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoCfe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoMensaje" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Uuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VencimientoCae" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XmlCfeFirmado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespuestaDeUcfe", propOrder = {
    "adenda",
    "caeNroDesde",
    "caeNroHasta",
    "certificado",
    "certificadoParaFirmarCfe",
    "claveCertificadoFirma",
    "codComercio",
    "codRta",
    "codTerminal",
    "codigoSeguridad",
    "datosQr",
    "estadoEnDgiCfeRecibido",
    "estadoSituacion",
    "etiquetas",
    "fechaFirma",
    "fechaReq",
    "horaReq",
    "idCae",
    "idReq",
    "imagenQr",
    "mensajeRta",
    "numeroCfe",
    "rangoDesde",
    "rangoHasta",
    "rutEmisor",
    "serie",
    "tipoCfe",
    "tipoMensaje",
    "uuid",
    "vencimientoCae",
    "xmlCfeFirmado"
})
public class RespuestaDeUcfe {

    @XmlElementRef(name = "Adenda", namespace = "http://www.uruware.com/ucfe/inbox/webservice", type = JAXBElement.class, required = false)
    protected JAXBElement<String> adenda;
    @XmlElementRef(name = "CaeNroDesde", namespace = "http://www.uruware.com/ucfe/inbox/webservice", type = JAXBElement.class, required = false)
    protected JAXBElement<String> caeNroDesde;
    @XmlElementRef(name = "CaeNroHasta", namespace = "http://www.uruware.com/ucfe/inbox/webservice", type = JAXBElement.class, required = false)
    protected JAXBElement<String> caeNroHasta;
    @XmlElementRef(name = "Certificado", namespace = "http://www.uruware.com/ucfe/inbox/webservice", type = JAXBElement.class, required = false)
    protected JAXBElement<String> certificado;
    @XmlElementRef(name = "CertificadoParaFirmarCfe", namespace = "http://www.uruware.com/ucfe/inbox/webservice", type = JAXBElement.class, required = false)
    protected JAXBElement<String> certificadoParaFirmarCfe;
    @XmlElementRef(name = "ClaveCertificadoFirma", namespace = "http://www.uruware.com/ucfe/inbox/webservice", type = JAXBElement.class, required = false)
    protected JAXBElement<String> claveCertificadoFirma;
    @XmlElementRef(name = "CodComercio", namespace = "http://www.uruware.com/ucfe/inbox/webservice", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codComercio;
    @XmlElementRef(name = "CodRta", namespace = "http://www.uruware.com/ucfe/inbox/webservice", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codRta;
    @XmlElementRef(name = "CodTerminal", namespace = "http://www.uruware.com/ucfe/inbox/webservice", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codTerminal;
    @XmlElementRef(name = "CodigoSeguridad", namespace = "http://www.uruware.com/ucfe/inbox/webservice", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoSeguridad;
    @XmlElementRef(name = "DatosQr", namespace = "http://www.uruware.com/ucfe/inbox/webservice", type = JAXBElement.class, required = false)
    protected JAXBElement<String> datosQr;
    @XmlElementRef(name = "EstadoEnDgiCfeRecibido", namespace = "http://www.uruware.com/ucfe/inbox/webservice", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estadoEnDgiCfeRecibido;
    @XmlElementRef(name = "EstadoSituacion", namespace = "http://www.uruware.com/ucfe/inbox/webservice", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estadoSituacion;
    @XmlElementRef(name = "Etiquetas", namespace = "http://www.uruware.com/ucfe/inbox/webservice", type = JAXBElement.class, required = false)
    protected JAXBElement<String> etiquetas;
    @XmlElementRef(name = "FechaFirma", namespace = "http://www.uruware.com/ucfe/inbox/webservice", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fechaFirma;
    @XmlElementRef(name = "FechaReq", namespace = "http://www.uruware.com/ucfe/inbox/webservice", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fechaReq;
    @XmlElementRef(name = "HoraReq", namespace = "http://www.uruware.com/ucfe/inbox/webservice", type = JAXBElement.class, required = false)
    protected JAXBElement<String> horaReq;
    @XmlElementRef(name = "IdCae", namespace = "http://www.uruware.com/ucfe/inbox/webservice", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idCae;
    @XmlElementRef(name = "IdReq", namespace = "http://www.uruware.com/ucfe/inbox/webservice", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idReq;
    @XmlElementRef(name = "ImagenQr", namespace = "http://www.uruware.com/ucfe/inbox/webservice", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> imagenQr;
    @XmlElementRef(name = "MensajeRta", namespace = "http://www.uruware.com/ucfe/inbox/webservice", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mensajeRta;
    @XmlElementRef(name = "NumeroCfe", namespace = "http://www.uruware.com/ucfe/inbox/webservice", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroCfe;
    @XmlElementRef(name = "RangoDesde", namespace = "http://www.uruware.com/ucfe/inbox/webservice", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rangoDesde;
    @XmlElementRef(name = "RangoHasta", namespace = "http://www.uruware.com/ucfe/inbox/webservice", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rangoHasta;
    @XmlElementRef(name = "RutEmisor", namespace = "http://www.uruware.com/ucfe/inbox/webservice", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rutEmisor;
    @XmlElementRef(name = "Serie", namespace = "http://www.uruware.com/ucfe/inbox/webservice", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serie;
    @XmlElementRef(name = "TipoCfe", namespace = "http://www.uruware.com/ucfe/inbox/webservice", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoCfe;
    @XmlElement(name = "TipoMensaje")
    protected Integer tipoMensaje;
    @XmlElementRef(name = "Uuid", namespace = "http://www.uruware.com/ucfe/inbox/webservice", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uuid;
    @XmlElementRef(name = "VencimientoCae", namespace = "http://www.uruware.com/ucfe/inbox/webservice", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vencimientoCae;
    @XmlElementRef(name = "XmlCfeFirmado", namespace = "http://www.uruware.com/ucfe/inbox/webservice", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xmlCfeFirmado;

    /**
     * Gets the value of the adenda property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdenda() {
        return adenda;
    }

    /**
     * Sets the value of the adenda property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdenda(JAXBElement<String> value) {
        this.adenda = value;
    }

    /**
     * Gets the value of the caeNroDesde property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCaeNroDesde() {
        return caeNroDesde;
    }

    /**
     * Sets the value of the caeNroDesde property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCaeNroDesde(JAXBElement<String> value) {
        this.caeNroDesde = value;
    }

    /**
     * Gets the value of the caeNroHasta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCaeNroHasta() {
        return caeNroHasta;
    }

    /**
     * Sets the value of the caeNroHasta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCaeNroHasta(JAXBElement<String> value) {
        this.caeNroHasta = value;
    }

    /**
     * Gets the value of the certificado property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCertificado() {
        return certificado;
    }

    /**
     * Sets the value of the certificado property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCertificado(JAXBElement<String> value) {
        this.certificado = value;
    }

    /**
     * Gets the value of the certificadoParaFirmarCfe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCertificadoParaFirmarCfe() {
        return certificadoParaFirmarCfe;
    }

    /**
     * Sets the value of the certificadoParaFirmarCfe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCertificadoParaFirmarCfe(JAXBElement<String> value) {
        this.certificadoParaFirmarCfe = value;
    }

    /**
     * Gets the value of the claveCertificadoFirma property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClaveCertificadoFirma() {
        return claveCertificadoFirma;
    }

    /**
     * Sets the value of the claveCertificadoFirma property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClaveCertificadoFirma(JAXBElement<String> value) {
        this.claveCertificadoFirma = value;
    }

    /**
     * Gets the value of the codComercio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodComercio() {
        return codComercio;
    }

    /**
     * Sets the value of the codComercio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodComercio(JAXBElement<String> value) {
        this.codComercio = value;
    }

    /**
     * Gets the value of the codRta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodRta() {
        return codRta;
    }

    /**
     * Sets the value of the codRta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodRta(JAXBElement<String> value) {
        this.codRta = value;
    }

    /**
     * Gets the value of the codTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodTerminal() {
        return codTerminal;
    }

    /**
     * Sets the value of the codTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodTerminal(JAXBElement<String> value) {
        this.codTerminal = value;
    }

    /**
     * Gets the value of the codigoSeguridad property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoSeguridad() {
        return codigoSeguridad;
    }

    /**
     * Sets the value of the codigoSeguridad property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoSeguridad(JAXBElement<String> value) {
        this.codigoSeguridad = value;
    }

    /**
     * Gets the value of the datosQr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDatosQr() {
        return datosQr;
    }

    /**
     * Sets the value of the datosQr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDatosQr(JAXBElement<String> value) {
        this.datosQr = value;
    }

    /**
     * Gets the value of the estadoEnDgiCfeRecibido property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstadoEnDgiCfeRecibido() {
        return estadoEnDgiCfeRecibido;
    }

    /**
     * Sets the value of the estadoEnDgiCfeRecibido property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstadoEnDgiCfeRecibido(JAXBElement<String> value) {
        this.estadoEnDgiCfeRecibido = value;
    }

    /**
     * Gets the value of the estadoSituacion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstadoSituacion() {
        return estadoSituacion;
    }

    /**
     * Sets the value of the estadoSituacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstadoSituacion(JAXBElement<String> value) {
        this.estadoSituacion = value;
    }

    /**
     * Gets the value of the etiquetas property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEtiquetas() {
        return etiquetas;
    }

    /**
     * Sets the value of the etiquetas property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEtiquetas(JAXBElement<String> value) {
        this.etiquetas = value;
    }

    /**
     * Gets the value of the fechaFirma property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFechaFirma() {
        return fechaFirma;
    }

    /**
     * Sets the value of the fechaFirma property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFechaFirma(JAXBElement<String> value) {
        this.fechaFirma = value;
    }

    /**
     * Gets the value of the fechaReq property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFechaReq() {
        return fechaReq;
    }

    /**
     * Sets the value of the fechaReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFechaReq(JAXBElement<String> value) {
        this.fechaReq = value;
    }

    /**
     * Gets the value of the horaReq property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHoraReq() {
        return horaReq;
    }

    /**
     * Sets the value of the horaReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHoraReq(JAXBElement<String> value) {
        this.horaReq = value;
    }

    /**
     * Gets the value of the idCae property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdCae() {
        return idCae;
    }

    /**
     * Sets the value of the idCae property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdCae(JAXBElement<String> value) {
        this.idCae = value;
    }

    /**
     * Gets the value of the idReq property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdReq() {
        return idReq;
    }

    /**
     * Sets the value of the idReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdReq(JAXBElement<String> value) {
        this.idReq = value;
    }

    /**
     * Gets the value of the imagenQr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getImagenQr() {
        return imagenQr;
    }

    /**
     * Sets the value of the imagenQr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setImagenQr(JAXBElement<byte[]> value) {
        this.imagenQr = value;
    }

    /**
     * Gets the value of the mensajeRta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMensajeRta() {
        return mensajeRta;
    }

    /**
     * Sets the value of the mensajeRta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMensajeRta(JAXBElement<String> value) {
        this.mensajeRta = value;
    }

    /**
     * Gets the value of the numeroCfe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroCfe() {
        return numeroCfe;
    }

    /**
     * Sets the value of the numeroCfe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroCfe(JAXBElement<String> value) {
        this.numeroCfe = value;
    }

    /**
     * Gets the value of the rangoDesde property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRangoDesde() {
        return rangoDesde;
    }

    /**
     * Sets the value of the rangoDesde property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRangoDesde(JAXBElement<String> value) {
        this.rangoDesde = value;
    }

    /**
     * Gets the value of the rangoHasta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRangoHasta() {
        return rangoHasta;
    }

    /**
     * Sets the value of the rangoHasta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRangoHasta(JAXBElement<String> value) {
        this.rangoHasta = value;
    }

    /**
     * Gets the value of the rutEmisor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRutEmisor() {
        return rutEmisor;
    }

    /**
     * Sets the value of the rutEmisor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRutEmisor(JAXBElement<String> value) {
        this.rutEmisor = value;
    }

    /**
     * Gets the value of the serie property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSerie() {
        return serie;
    }

    /**
     * Sets the value of the serie property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSerie(JAXBElement<String> value) {
        this.serie = value;
    }

    /**
     * Gets the value of the tipoCfe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoCfe() {
        return tipoCfe;
    }

    /**
     * Sets the value of the tipoCfe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoCfe(JAXBElement<String> value) {
        this.tipoCfe = value;
    }

    /**
     * Gets the value of the tipoMensaje property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTipoMensaje() {
        return tipoMensaje;
    }

    /**
     * Sets the value of the tipoMensaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTipoMensaje(Integer value) {
        this.tipoMensaje = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUuid(JAXBElement<String> value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the vencimientoCae property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVencimientoCae() {
        return vencimientoCae;
    }

    /**
     * Sets the value of the vencimientoCae property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVencimientoCae(JAXBElement<String> value) {
        this.vencimientoCae = value;
    }

    /**
     * Gets the value of the xmlCfeFirmado property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXmlCfeFirmado() {
        return xmlCfeFirmado;
    }

    /**
     * Sets the value of the xmlCfeFirmado property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXmlCfeFirmado(JAXBElement<String> value) {
        this.xmlCfeFirmado = value;
    }

}
