//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.11 at 02:06:34 PM UYT 
//


package uy.gub.dgi.cfe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3._2001._04.xmlenc_.EncryptedDataType;


/**
 * <p>Java class for Compl_FiscalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Compl_FiscalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Compl_Fiscal_Data" type="{http://cfe.dgi.gub.uy}Compl_Fiscal_DataType"/>
 *         &lt;element ref="{http://www.w3.org/2001/04/xmlenc#}EncryptedData"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Compl_FiscalType", propOrder = {
    "complFiscalData",
    "encryptedData"
})
public class ComplFiscalType {

    @XmlElement(name = "ns0:Compl_Fiscal_Data")
    protected ComplFiscalDataType complFiscalData;
    @XmlElement(name = "ns0:EncryptedData", namespace = "http://www.w3.org/2001/04/xmlenc#")
    protected EncryptedDataType encryptedData;

    /**
     * Gets the value of the complFiscalData property.
     * 
     * @return
     *     possible object is
     *     {@link ComplFiscalDataType }
     *     
     */
    public ComplFiscalDataType getComplFiscalData() {
        return complFiscalData;
    }

    /**
     * Sets the value of the complFiscalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplFiscalDataType }
     *     
     */
    public void setComplFiscalData(ComplFiscalDataType value) {
        this.complFiscalData = value;
    }

    /**
     * Gets the value of the encryptedData property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptedDataType }
     *     
     */
    public EncryptedDataType getEncryptedData() {
        return encryptedData;
    }

    /**
     * Sets the value of the encryptedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptedDataType }
     *     
     */
    public void setEncryptedData(EncryptedDataType value) {
        this.encryptedData = value;
    }

}
