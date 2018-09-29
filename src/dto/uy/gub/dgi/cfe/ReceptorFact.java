//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.18 at 02:38:53 PM UYT 
//


package dto.uy.gub.dgi.cfe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Receptor_Fact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Receptor_Fact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoDocRecep" type="{http://cfe.dgi.gub.uy}DocType"/>
 *         &lt;element name="CodPaisRecep" type="{http://cfe.dgi.gub.uy}CodPaisType"/>
 *         &lt;element name="DocRecep" type="{http://cfe.dgi.gub.uy}NroDocType"/>
 *         &lt;element name="RznSocRecep" type="{http://cfe.dgi.gub.uy}RznSocType"/>
 *         &lt;element name="DirRecep" type="{http://cfe.dgi.gub.uy}DireccionType"/>
 *         &lt;element name="CiudadRecep" type="{http://cfe.dgi.gub.uy}CiudadType"/>
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
 *         &lt;element name="LugarDestEnt" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CompraID" type="{http://cfe.dgi.gub.uy}CompraIDType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Receptor_Fact", propOrder = {
    "tipoDocRecep",
    "codPaisRecep",
    "docRecep",
    "rznSocRecep",
    "dirRecep",
    "ciudadRecep",
    "deptoRecep",
    "paisRecep",
    "cp",
    "infoAdicional",
    "lugarDestEnt",
    "compraID"
})
public class ReceptorFact {

    @XmlElement(name = "ns0:TipoDocRecep")
    protected int tipoDocRecep;
    @XmlElement(name = "ns0:CodPaisRecep", required = true)
    protected String codPaisRecep;
    @XmlElement(name = "ns0:DocRecep", required = true)
    protected String docRecep;
    @XmlElement(name = "ns0:RznSocRecep", required = true)
    protected String rznSocRecep;
    @XmlElement(name = "ns0:DirRecep", required = true)
    protected String dirRecep;
    @XmlElement(name = "ns0:CiudadRecep", required = true)
    protected String ciudadRecep;
    @XmlElement(name = "ns0:DeptoRecep")
    protected String deptoRecep;
    @XmlElement(name = "ns0:PaisRecep")
    protected String paisRecep;
    @XmlElement(name = "ns0:CP")
    protected Integer cp;
    @XmlElement(name = "ns0:InfoAdicional")
    protected String infoAdicional;
    @XmlElement(name = "ns0:LugarDestEnt")
    protected String lugarDestEnt;
    @XmlElement(name = "ns0:CompraID")
    protected String compraID;

    /**
     * Gets the value of the tipoDocRecep property.
     * 
     */
    public int getTipoDocRecep() {
        return tipoDocRecep;
    }

    /**
     * Sets the value of the tipoDocRecep property.
     * 
     */
    public void setTipoDocRecep(int value) {
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

    /**
     * Gets the value of the lugarDestEnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLugarDestEnt() {
        return lugarDestEnt;
    }

    /**
     * Sets the value of the lugarDestEnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLugarDestEnt(String value) {
        this.lugarDestEnt = value;
    }

    /**
     * Gets the value of the compraID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompraID() {
        return compraID;
    }

    /**
     * Sets the value of the compraID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompraID(String value) {
        this.compraID = value;
    }

}
