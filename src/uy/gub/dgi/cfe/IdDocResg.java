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
 * <p>Java class for IdDoc_Resg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdDoc_Resg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoCFE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType">
 *               &lt;enumeration value="182"/>
 *               &lt;enumeration value="282"/>
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
 *         &lt;element name="FchValor" type="{http://cfe.dgi.gub.uy}FechaType" minOccurs="0"/>
 *         &lt;element name="InfoAdicionalDoc" type="{http://cfe.dgi.gub.uy}InfoAdicionalType" minOccurs="0"/>
 *         &lt;element name="SecProf" type="{http://cfe.dgi.gub.uy}SecProfType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdDoc_Resg", propOrder = {
    "tipoCFE",
    "serie",
    "nro",
    "nroInterno",
    "fchEmis",
    "fchValor",
    "infoAdicionalDoc",
    "secProf"
})
public class IdDocResg {

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
    @XmlElement(name = "FchValor")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fchValor;
    @XmlElement(name = "InfoAdicionalDoc")
    protected String infoAdicionalDoc;
    @XmlElement(name = "SecProf")
    protected BigInteger secProf;

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
     * Gets the value of the fchValor property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFchValor() {
        return fchValor;
    }

    /**
     * Sets the value of the fchValor property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFchValor(XMLGregorianCalendar value) {
        this.fchValor = value;
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

}
