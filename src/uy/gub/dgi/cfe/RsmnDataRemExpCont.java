//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.11 at 02:07:01 PM UYT 
//


package uy.gub.dgi.cfe;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RsmnData_Rem_Exp_Cont complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RsmnData_Rem_Exp_Cont">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Montos" type="{http://cfe.dgi.gub.uy}Montos_Rem_Exp" minOccurs="0"/>
 *         &lt;element name="CantCFCEmi" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RsmnData_Rem_Exp_Cont", propOrder = {
    "montos",
    "cantCFCEmi"
})
public class RsmnDataRemExpCont {

    @XmlElement(name = "Montos")
    protected MontosRemExp montos;
    @XmlElement(name = "CantCFCEmi", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cantCFCEmi;

    /**
     * Gets the value of the montos property.
     * 
     * @return
     *     possible object is
     *     {@link MontosRemExp }
     *     
     */
    public MontosRemExp getMontos() {
        return montos;
    }

    /**
     * Sets the value of the montos property.
     * 
     * @param value
     *     allowed object is
     *     {@link MontosRemExp }
     *     
     */
    public void setMontos(MontosRemExp value) {
        this.montos = value;
    }

    /**
     * Gets the value of the cantCFCEmi property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCantCFCEmi() {
        return cantCFCEmi;
    }

    /**
     * Sets the value of the cantCFCEmi property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCantCFCEmi(BigInteger value) {
        this.cantCFCEmi = value;
    }

}