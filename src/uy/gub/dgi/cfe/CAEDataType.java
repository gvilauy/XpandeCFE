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
 * Referencia al CAE
 * 
 * <p>Java class for CAEDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CAEDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CAE_ID">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;totalDigits value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DNro">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="1"/>
 *               &lt;totalDigits value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HNro">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;totalDigits value="7"/>
 *               &lt;minInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FecVenc" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="CAEEspecial" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;totalDigits value="1"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *               &lt;enumeration value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CausalCAEEsp" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CAEDataType", propOrder = {
    "caeid",
    "dNro",
    "hNro",
    "fecVenc",
    "caeEspecial",
    "causalCAEEsp"
})
public class CAEDataType {

    @XmlElement(name = "ns0:CAE_ID", required = true)
    protected BigInteger caeid;
    @XmlElement(name = "ns0:DNro", required = true)
    protected BigInteger dNro;
    @XmlElement(name = "ns0:HNro", required = true)
    protected BigInteger hNro;
    @XmlElement(name = "ns0:FecVenc", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fecVenc;
    @XmlElement(name = "ns0:CAEEspecial")
    protected BigInteger caeEspecial;
    @XmlElement(name = "ns0:CausalCAEEsp")
    protected BigInteger causalCAEEsp;

    /**
     * Gets the value of the caeid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCAEID() {
        return caeid;
    }

    /**
     * Sets the value of the caeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCAEID(BigInteger value) {
        this.caeid = value;
    }

    /**
     * Gets the value of the dNro property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDNro() {
        return dNro;
    }

    /**
     * Sets the value of the dNro property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDNro(BigInteger value) {
        this.dNro = value;
    }

    /**
     * Gets the value of the hNro property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHNro() {
        return hNro;
    }

    /**
     * Sets the value of the hNro property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHNro(BigInteger value) {
        this.hNro = value;
    }

    /**
     * Gets the value of the fecVenc property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecVenc() {
        return fecVenc;
    }

    /**
     * Sets the value of the fecVenc property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecVenc(XMLGregorianCalendar value) {
        this.fecVenc = value;
    }

    /**
     * Gets the value of the caeEspecial property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCAEEspecial() {
        return caeEspecial;
    }

    /**
     * Sets the value of the caeEspecial property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCAEEspecial(BigInteger value) {
        this.caeEspecial = value;
    }

    /**
     * Gets the value of the causalCAEEsp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCausalCAEEsp() {
        return causalCAEEsp;
    }

    /**
     * Sets the value of the causalCAEEsp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCausalCAEEsp(BigInteger value) {
        this.causalCAEEsp = value;
    }

}
