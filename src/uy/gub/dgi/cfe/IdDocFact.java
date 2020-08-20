//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.11 at 02:06:34 PM UYT 
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
 * <p>Java class for IdDoc_Fact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdDoc_Fact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoCFE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType">
 *               &lt;enumeration value="111"/>
 *               &lt;enumeration value="112"/>
 *               &lt;enumeration value="113"/>
 *               &lt;enumeration value="141"/>
 *               &lt;enumeration value="142"/>
 *               &lt;enumeration value="143"/>
 *               &lt;enumeration value="211"/>
 *               &lt;enumeration value="212"/>
 *               &lt;enumeration value="213"/>
 *               &lt;enumeration value="241"/>
 *               &lt;enumeration value="242"/>
 *               &lt;enumeration value="243"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Serie" type="{http://cfe.dgi.gub.uy}SerieType"/>
 *         &lt;element name="Nro" type="{http://cfe.dgi.gub.uy}NroCFEType"/>
 *         &lt;element name="NroInterno" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FchEmis" type="{http://cfe.dgi.gub.uy}FechaType"/>
 *         &lt;element name="PeriodoDesde" type="{http://cfe.dgi.gub.uy}Fecha_d2000_Type" minOccurs="0"/>
 *         &lt;element name="PeriodoHasta" type="{http://cfe.dgi.gub.uy}Fecha_d2000_Type" minOccurs="0"/>
 *         &lt;element name="MntBruto" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FmaPago">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FchVenc" type="{http://cfe.dgi.gub.uy}Fecha_d2000_Type" minOccurs="0"/>
 *         &lt;element name="InfoAdicionalDoc" type="{http://cfe.dgi.gub.uy}InfoAdicionalType" minOccurs="0"/>
 *         &lt;element name="IVAalDia" type="{http://cfe.dgi.gub.uy}IndIVAalDiaType" minOccurs="0"/>
 *         &lt;element name="SecProf" type="{http://cfe.dgi.gub.uy}SecProfType" minOccurs="0"/>
 *         &lt;element name="IndPagCta3ros" type="{http://cfe.dgi.gub.uy}IndPagCta3rosType" minOccurs="0"/>
 *         &lt;element name="IndCobPropia" type="{http://cfe.dgi.gub.uy}IndCobPropiaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdDoc_Fact", propOrder = {
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
    "infoAdicionalDoc",
    "ivAalDia",
    "secProf",
    "indPagCta3Ros",
    "indCobPropia"
})
public class IdDocFact {

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
     * Gets the value of the tipoCFE property.
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
     * Sets the value of the tipoCFE property.
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
     * Gets the value of the serie property.
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
     * Sets the value of the serie property.
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
     * Gets the value of the nro property.
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
     * Sets the value of the nro property.
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
     * Gets the value of the nroInterno property.
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
     * Sets the value of the nroInterno property.
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
     * Gets the value of the fchEmis property.
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
     * Sets the value of the fchEmis property.
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
     * Gets the value of the periodoDesde property.
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
     * Sets the value of the periodoDesde property.
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
     * Gets the value of the periodoHasta property.
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
     * Sets the value of the periodoHasta property.
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
     * Gets the value of the mntBruto property.
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
     * Sets the value of the mntBruto property.
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
     * Gets the value of the fmaPago property.
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
     * Sets the value of the fmaPago property.
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
     * Gets the value of the fchVenc property.
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
     * Sets the value of the fchVenc property.
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
     * Gets the value of the infoAdicionalDoc property.
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
     * Sets the value of the infoAdicionalDoc property.
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
     * Gets the value of the ivAalDia property.
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
     * Sets the value of the ivAalDia property.
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
     * Gets the value of the secProf property.
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
     * Sets the value of the secProf property.
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
     * Gets the value of the indPagCta3Ros property.
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
     * Sets the value of the indPagCta3Ros property.
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
     * Gets the value of the indCobPropia property.
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
     * Sets the value of the indCobPropia property.
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
