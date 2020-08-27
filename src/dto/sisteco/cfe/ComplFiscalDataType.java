//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.11 at 02:06:34 PM UYT 
//


package dto.sisteco.cfe;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for Compl_Fiscal_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Compl_Fiscal_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RUCEmisor" type="{http://cfe.dgi.gub.uy}RUCType"/>
 *         &lt;element name="TipoDocMdte" type="{http://cfe.dgi.gub.uy}DocTypemasNIE"/>
 *         &lt;element name="Pais" type="{http://cfe.dgi.gub.uy}CodPaisType"/>
 *         &lt;element name="DocMdte">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NombreMdte" type="{http://cfe.dgi.gub.uy}RznSocType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Compl_Fiscal_DataType", propOrder = {
    "rucEmisor",
    "tipoDocMdte",
    "pais",
    "docMdte",
    "nombreMdte"
})
public class ComplFiscalDataType {

    @XmlElement(name = "ns0:RUCEmisor", required = true)
    protected String rucEmisor;
    @XmlElement(name = "ns0:TipoDocMdte")
    @XmlSchemaType(name = "positiveInteger")
    protected int tipoDocMdte;
    @XmlElement(name = "ns0:Pais", required = true)
    protected String pais;
    @XmlElement(name = "ns0:DocMdte", required = true)
    protected String docMdte;
    @XmlElement(name = "ns0:NombreMdte", required = true)
    protected String nombreMdte;

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
     * Gets the value of the tipoDocMdte property.
     * 
     */
    public int getTipoDocMdte() {
        return tipoDocMdte;
    }

    /**
     * Sets the value of the tipoDocMdte property.
     * 
     */
    public void setTipoDocMdte(int value) {
        this.tipoDocMdte = value;
    }

    /**
     * Gets the value of the pais property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPais() {
        return pais;
    }

    /**
     * Sets the value of the pais property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPais(String value) {
        this.pais = value;
    }

    /**
     * Gets the value of the docMdte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocMdte() {
        return docMdte;
    }

    /**
     * Sets the value of the docMdte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocMdte(String value) {
        this.docMdte = value;
    }

    /**
     * Gets the value of the nombreMdte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreMdte() {
        return nombreMdte;
    }

    /**
     * Sets the value of the nombreMdte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreMdte(String value) {
        this.nombreMdte = value;
    }

}