//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.18 at 02:38:53 PM UYT 
//


package dto.uy.gub.dgi.cfe;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for IdDoc_Rem_Exp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdDoc_Rem_Exp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoCFE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType">
 *               &lt;enumeration value="124"/>
 *               &lt;enumeration value="224"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Serie" type="{http://cfe.dgi.gub.uy}SerieType"/>
 *         &lt;element name="Nro" type="{http://cfe.dgi.gub.uy}NroCFEType"/>
 *         &lt;element name="FchEmis" type="{http://cfe.dgi.gub.uy}FechaType"/>
 *         &lt;element name="TipoTraslado" type="{http://cfe.dgi.gub.uy}TipoTrasladoType"/>
 *         &lt;element name="ClauVenta" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ModVenta" type="{http://cfe.dgi.gub.uy}ModVentaType"/>
 *         &lt;element name="ViaTransp" type="{http://cfe.dgi.gub.uy}ViaTranspType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdDoc_Rem_Exp", propOrder = {
    "tipoCFE",
    "serie",
    "nro",
    "fchEmis",
    "tipoTraslado",
    "clauVenta",
    "modVenta",
    "viaTransp"
})
public class IdDocRemExp {

    @XmlElement(name = "ns0:TipoCFE", required = true)
    protected BigInteger tipoCFE;
    @XmlElement(name = "ns0:Serie", required = true)
    protected String serie;
    @XmlElement(name = "ns0:Nro", required = true)
    protected BigInteger nro;
    @XmlElement(name = "ns0:FchEmis", required = true)
    protected XMLGregorianCalendar fchEmis;
    @XmlElement(name = "ns0:TipoTraslado", required = true)
    protected BigInteger tipoTraslado;
    @XmlElement(name = "ns0:ClauVenta")
    protected String clauVenta;
    @XmlElement(name = "ns0:ModVenta")
    protected int modVenta;
    @XmlElement(name = "ns0:ViaTransp")
    protected int viaTransp;

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
     * Gets the value of the tipoTraslado property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTipoTraslado() {
        return tipoTraslado;
    }

    /**
     * Sets the value of the tipoTraslado property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTipoTraslado(BigInteger value) {
        this.tipoTraslado = value;
    }

    /**
     * Gets the value of the clauVenta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClauVenta() {
        return clauVenta;
    }

    /**
     * Sets the value of the clauVenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClauVenta(String value) {
        this.clauVenta = value;
    }

    /**
     * Gets the value of the modVenta property.
     * 
     */
    public int getModVenta() {
        return modVenta;
    }

    /**
     * Sets the value of the modVenta property.
     * 
     */
    public void setModVenta(int value) {
        this.modVenta = value;
    }

    /**
     * Gets the value of the viaTransp property.
     * 
     */
    public int getViaTransp() {
        return viaTransp;
    }

    /**
     * Sets the value of the viaTransp property.
     * 
     */
    public void setViaTransp(int value) {
        this.viaTransp = value;
    }

}
