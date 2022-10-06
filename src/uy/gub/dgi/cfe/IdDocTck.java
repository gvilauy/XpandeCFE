//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.23 a las 05:35:46 PM UTC 
//


package uy.gub.dgi.cfe;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para IdDoc_Tck complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IdDoc_Tck"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TipoCFE"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
 *               &lt;enumeration value="101"/&gt;
 *               &lt;enumeration value="102"/&gt;
 *               &lt;enumeration value="103"/&gt;
 *               &lt;enumeration value="131"/&gt;
 *               &lt;enumeration value="132"/&gt;
 *               &lt;enumeration value="133"/&gt;
 *               &lt;enumeration value="201"/&gt;
 *               &lt;enumeration value="202"/&gt;
 *               &lt;enumeration value="203"/&gt;
 *               &lt;enumeration value="231"/&gt;
 *               &lt;enumeration value="232"/&gt;
 *               &lt;enumeration value="233"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Serie" type="{http://cfe.dgi.gub.uy}SerieType"/&gt;
 *         &lt;element name="Nro" type="{http://cfe.dgi.gub.uy}NroCFEType"/&gt;
 *         &lt;element name="NroInterno" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FchEmis" type="{http://cfe.dgi.gub.uy}FechaType"/&gt;
 *         &lt;element name="PeriodoDesde" type="{http://cfe.dgi.gub.uy}Fecha_d2000_Type" minOccurs="0"/&gt;
 *         &lt;element name="PeriodoHasta" type="{http://cfe.dgi.gub.uy}Fecha_d2000_Type" minOccurs="0"/&gt;
 *         &lt;element name="MntBruto" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;enumeration value="1"/&gt;
 *               &lt;enumeration value="2"/&gt;
 *               &lt;enumeration value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FmaPago"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger"&gt;
 *               &lt;enumeration value="1"/&gt;
 *               &lt;enumeration value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FchVenc" type="{http://cfe.dgi.gub.uy}Fecha_d2000_Type" minOccurs="0"/&gt;
 *         &lt;element name="ModVenta" type="{http://cfe.dgi.gub.uy}ModVentaType" minOccurs="0"/&gt;
 *         &lt;element name="InfoAdicionalDoc" type="{http://cfe.dgi.gub.uy}InfoAdicionalType" minOccurs="0"/&gt;
 *         &lt;element name="IVAalDia" type="{http://cfe.dgi.gub.uy}IndIVAalDiaType" minOccurs="0"/&gt;
 *         &lt;element name="SecProf" type="{http://cfe.dgi.gub.uy}SecProfType" minOccurs="0"/&gt;
 *         &lt;element name="IndPagCta3ros" type="{http://cfe.dgi.gub.uy}IndPagCta3rosType" minOccurs="0"/&gt;
 *         &lt;element name="IndCobPropia" type="{http://cfe.dgi.gub.uy}IndCobPropiaType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdDoc_Tck", propOrder = {
    "tipoCFE",
    "serie",
    "nro",
    "nroInterno",
    "fchEmis",
    "periodoDesde",
    "periodoHasta",
    "mntBruto",
    "fmaPago",
    "fchVenc",
    "modVenta",
    "infoAdicionalDoc",
    "ivAalDia",
    "secProf",
    "indPagCta3Ros",
    "indCobPropia"
})
public class IdDocTck {

    @XmlElement(name = "TipoCFE", required = true)
    protected BigInteger tipoCFE;
    @XmlElement(name = "Serie", required = true)
    protected String serie;
    @XmlElement(name = "Nro", required = true)
    protected BigInteger nro;
    @XmlElement(name = "NroInterno")
    protected String nroInterno;
    @XmlElement(name = "FchEmis", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fchEmis;
    @XmlElement(name = "PeriodoDesde")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar periodoDesde;
    @XmlElement(name = "PeriodoHasta")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar periodoHasta;
    @XmlElement(name = "MntBruto")
    protected BigInteger mntBruto;
    @XmlElement(name = "FmaPago", required = true)
    protected BigInteger fmaPago;
    @XmlElement(name = "FchVenc")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fchVenc;
    @XmlElement(name = "ModVenta")
    protected Integer modVenta;
    @XmlElement(name = "InfoAdicionalDoc")
    protected String infoAdicionalDoc;
    @XmlElement(name = "IVAalDia")
    protected BigInteger ivAalDia;
    @XmlElement(name = "SecProf")
    protected BigInteger secProf;
    @XmlElement(name = "IndPagCta3ros")
    protected BigInteger indPagCta3Ros;
    @XmlElement(name = "IndCobPropia")
    protected BigInteger indCobPropia;

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
     * Obtiene el valor de la propiedad nro.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNro() {
        return nro;
    }

    /**
     * Define el valor de la propiedad nro.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNro(BigInteger value) {
        this.nro = value;
    }

    /**
     * Obtiene el valor de la propiedad nroInterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroInterno() {
        return nroInterno;
    }

    /**
     * Define el valor de la propiedad nroInterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroInterno(String value) {
        this.nroInterno = value;
    }

    /**
     * Obtiene el valor de la propiedad fchEmis.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFchEmis() {
        return fchEmis;
    }

    /**
     * Define el valor de la propiedad fchEmis.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFchEmis(XMLGregorianCalendar value) {
        this.fchEmis = value;
    }

    /**
     * Obtiene el valor de la propiedad periodoDesde.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPeriodoDesde() {
        return periodoDesde;
    }

    /**
     * Define el valor de la propiedad periodoDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPeriodoDesde(XMLGregorianCalendar value) {
        this.periodoDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad periodoHasta.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPeriodoHasta() {
        return periodoHasta;
    }

    /**
     * Define el valor de la propiedad periodoHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPeriodoHasta(XMLGregorianCalendar value) {
        this.periodoHasta = value;
    }

    /**
     * Obtiene el valor de la propiedad mntBruto.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMntBruto() {
        return mntBruto;
    }

    /**
     * Define el valor de la propiedad mntBruto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMntBruto(BigInteger value) {
        this.mntBruto = value;
    }

    /**
     * Obtiene el valor de la propiedad fmaPago.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFmaPago() {
        return fmaPago;
    }

    /**
     * Define el valor de la propiedad fmaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFmaPago(BigInteger value) {
        this.fmaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad fchVenc.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFchVenc() {
        return fchVenc;
    }

    /**
     * Define el valor de la propiedad fchVenc.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFchVenc(XMLGregorianCalendar value) {
        this.fchVenc = value;
    }

    /**
     * Obtiene el valor de la propiedad modVenta.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getModVenta() {
        return modVenta;
    }

    /**
     * Define el valor de la propiedad modVenta.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setModVenta(Integer value) {
        this.modVenta = value;
    }

    /**
     * Obtiene el valor de la propiedad infoAdicionalDoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoAdicionalDoc() {
        return infoAdicionalDoc;
    }

    /**
     * Define el valor de la propiedad infoAdicionalDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoAdicionalDoc(String value) {
        this.infoAdicionalDoc = value;
    }

    /**
     * Obtiene el valor de la propiedad ivAalDia.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIVAalDia() {
        return ivAalDia;
    }

    /**
     * Define el valor de la propiedad ivAalDia.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIVAalDia(BigInteger value) {
        this.ivAalDia = value;
    }

    /**
     * Obtiene el valor de la propiedad secProf.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSecProf() {
        return secProf;
    }

    /**
     * Define el valor de la propiedad secProf.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSecProf(BigInteger value) {
        this.secProf = value;
    }

    /**
     * Obtiene el valor de la propiedad indPagCta3Ros.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIndPagCta3Ros() {
        return indPagCta3Ros;
    }

    /**
     * Define el valor de la propiedad indPagCta3Ros.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIndPagCta3Ros(BigInteger value) {
        this.indPagCta3Ros = value;
    }

    /**
     * Obtiene el valor de la propiedad indCobPropia.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIndCobPropia() {
        return indCobPropia;
    }

    /**
     * Define el valor de la propiedad indCobPropia.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIndCobPropia(BigInteger value) {
        this.indCobPropia = value;
    }

}
