//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.11 at 02:06:34 PM UYT 
//


package uy.gub.dgi.cfe;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for CFE_Empresas_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CFE_Empresas_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CFE" type="{http://cfe.dgi.gub.uy}CFEDefType"/>
 *         &lt;element name="Adenda" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "CFE_Adenda")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CFE_Empresas_Type", propOrder = {
    "cfe",
    "adenda"
})
public class CFEEmpresasType {

    @XmlElement(name = "ns0:CFE", required = true)
    protected CFEDefType cfe;
    @XmlElement(name = "ns0:Adenda")
    protected Object adenda;

    /**
     * Gets the value of the cfe property.
     * 
     * @return
     *     possible object is
     *     {@link CFEDefType }
     *     
     */
    public CFEDefType getCFE() {
        return cfe;
    }

    /**
     * Sets the value of the cfe property.
     * 
     * @param value
     *     allowed object is
     *     {@link CFEDefType }
     *     
     */
    public void setCFE(CFEDefType value) {
        this.cfe = value;
    }

    /**
     * Gets the value of the adenda property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAdenda() {
        return adenda;
    }

    /**
     * Sets the value of the adenda property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAdenda(Object value) {
        this.adenda = value;
    }

}
