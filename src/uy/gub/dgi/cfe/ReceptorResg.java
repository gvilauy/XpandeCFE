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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Receptor_Resg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Receptor_Resg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoDocRecep" type="{http://cfe.dgi.gub.uy}DocType" minOccurs="0"/>
 *         &lt;element name="CodPaisRecep" type="{http://cfe.dgi.gub.uy}CodPaisType" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="DocRecep" type="{http://cfe.dgi.gub.uy}NroDocType" minOccurs="0"/>
 *           &lt;element name="DocRecepExt" minOccurs="0">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;maxLength value="20"/>
 *                 &lt;whiteSpace value="collapse"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="RznSocRecep" type="{http://cfe.dgi.gub.uy}RznSocType" minOccurs="0"/>
 *         &lt;element name="DirRecep" type="{http://cfe.dgi.gub.uy}DireccionType" minOccurs="0"/>
 *         &lt;element name="CiudadRecep" type="{http://cfe.dgi.gub.uy}CiudadType" minOccurs="0"/>
 *         &lt;element name="DeptoRecep" type="{http://cfe.dgi.gub.uy}DeptoType" minOccurs="0"/>
 *         &lt;element name="PaisRecep" type="{http://cfe.dgi.gub.uy}PaisDscType" minOccurs="0"/>
 *         &lt;element name="CP" type="{http://cfe.dgi.gub.uy}CodPostalType" minOccurs="0"/>
 *         &lt;element name="InfoAdicional" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="150"/>
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
@XmlType(name = "Receptor_Resg", propOrder = {
    "tipoDocRecep",
    "codPaisRecep",
    "docRecep",
    "docRecepExt",
    "rznSocRecep",
    "dirRecep",
    "ciudadRecep",
    "deptoRecep",
    "paisRecep",
    "cp",
    "infoAdicional"
})
public class ReceptorResg {

    @XmlElement(name = "ns0:TipoDocRecep")
    @XmlSchemaType(name = "positiveInteger")
    protected Integer tipoDocRecep;
    @XmlElement(name = "ns0:CodPaisRecep")
    protected String codPaisRecep;
    @XmlElement(name = "ns0:DocRecep")
    protected String docRecep;
    @XmlElement(name = "ns0:DocRecepExt")
    protected String docRecepExt;
    @XmlElement(name = "ns0:RznSocRecep")
    protected String rznSocRecep;
    @XmlElement(name = "ns0:DirRecep")
    protected String dirRecep;
    @XmlElement(name = "ns0:CiudadRecep")
    protected String ciudadRecep;
    @XmlElement(name = "ns0:DeptoRecep")
    protected String deptoRecep;
    @XmlElement(name = "ns0:PaisRecep")
    protected String paisRecep;
    @XmlElement(name = "ns0:CP")
    @XmlSchemaType(name = "integer")
    protected Integer cp;
    @XmlElement(name = "ns0:InfoAdicional")
    protected String infoAdicional;

    /**
     * Gets the value of the tipoDocRecep property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTipoDocRecep() {
        return tipoDocRecep;
    }

    /**
     * Sets the value of the tipoDocRecep property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTipoDocRecep(Integer value) {
        this.tipoDocRecep = value;
    }

    /**
     * Gets the value of the codPaisRecep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodPaisRecep() {
        return codPaisRecep;
    }

    /**
     * Sets the value of the codPaisRecep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodPaisRecep(String value) {
        this.codPaisRecep = value;
    }

    /**
     * Gets the value of the docRecep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocRecep() {
        return docRecep;
    }

    /**
     * Sets the value of the docRecep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocRecep(String value) {
        this.docRecep = value;
    }

    /**
     * Gets the value of the docRecepExt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocRecepExt() {
        return docRecepExt;
    }

    /**
     * Sets the value of the docRecepExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocRecepExt(String value) {
        this.docRecepExt = value;
    }

    /**
     * Gets the value of the rznSocRecep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRznSocRecep() {
        return rznSocRecep;
    }

    /**
     * Sets the value of the rznSocRecep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRznSocRecep(String value) {
        this.rznSocRecep = value;
    }

    /**
     * Gets the value of the dirRecep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirRecep() {
        return dirRecep;
    }

    /**
     * Sets the value of the dirRecep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirRecep(String value) {
        this.dirRecep = value;
    }

    /**
     * Gets the value of the ciudadRecep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudadRecep() {
        return ciudadRecep;
    }

    /**
     * Sets the value of the ciudadRecep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudadRecep(String value) {
        this.ciudadRecep = value;
    }

    /**
     * Gets the value of the deptoRecep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptoRecep() {
        return deptoRecep;
    }

    /**
     * Sets the value of the deptoRecep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptoRecep(String value) {
        this.deptoRecep = value;
    }

    /**
     * Gets the value of the paisRecep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisRecep() {
        return paisRecep;
    }

    /**
     * Sets the value of the paisRecep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisRecep(String value) {
        this.paisRecep = value;
    }

    /**
     * Gets the value of the cp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCP() {
        return cp;
    }

    /**
     * Sets the value of the cp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCP(Integer value) {
        this.cp = value;
    }

    /**
     * Gets the value of the infoAdicional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoAdicional() {
        return infoAdicional;
    }

    /**
     * Sets the value of the infoAdicional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoAdicional(String value) {
        this.infoAdicional = value;
    }

}
