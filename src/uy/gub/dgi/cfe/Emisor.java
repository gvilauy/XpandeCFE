//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.23 a las 05:35:46 PM UTC 
//


package uy.gub.dgi.cfe;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Emisor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Emisor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RUCEmisor" type="{http://cfe.dgi.gub.uy}RUCType"/&gt;
 *         &lt;element name="RznSoc" type="{http://cfe.dgi.gub.uy}RznSocType"/&gt;
 *         &lt;element name="NomComercial" type="{http://cfe.dgi.gub.uy}NomComercialType" minOccurs="0"/&gt;
 *         &lt;element name="GiroEmis" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="60"/&gt;
 *               &lt;minLength value="0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Telefono" maxOccurs="2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://cfe.dgi.gub.uy}FonoType"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CorreoEmisor" type="{http://cfe.dgi.gub.uy}MailType" minOccurs="0"/&gt;
 *         &lt;element name="EmiSucursal" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CdgDGISucur"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;totalDigits value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DomFiscal"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="70"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Ciudad" type="{http://cfe.dgi.gub.uy}CiudadType"/&gt;
 *         &lt;element name="Departamento" type="{http://cfe.dgi.gub.uy}DeptoType"/&gt;
 *         &lt;element name="InfoAdicionalEmisor" type="{http://cfe.dgi.gub.uy}InfoAdicionalType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Emisor", propOrder = {
    "rucEmisor",
    "rznSoc",
    "nomComercial",
    "giroEmis",
    "telefono",
    "correoEmisor",
    "emiSucursal",
    "cdgDGISucur",
    "domFiscal",
    "ciudad",
    "departamento",
    "infoAdicionalEmisor"
})
public class Emisor {

    @XmlElement(name = "RUCEmisor", required = true)
    protected String rucEmisor;
    @XmlElement(name = "RznSoc", required = true)
    protected String rznSoc;
    @XmlElement(name = "NomComercial")
    protected String nomComercial;
    @XmlElement(name = "GiroEmis")
    protected String giroEmis;
    @XmlElement(name = "Telefono")
    protected List<String> telefono;
    @XmlElement(name = "CorreoEmisor")
    protected String correoEmisor;
    @XmlElement(name = "EmiSucursal")
    protected String emiSucursal;
    @XmlElement(name = "CdgDGISucur", required = true)
    protected BigInteger cdgDGISucur;
    @XmlElement(name = "DomFiscal", required = true)
    protected String domFiscal;
    @XmlElement(name = "Ciudad", required = true)
    protected String ciudad;
    @XmlElement(name = "Departamento", required = true)
    protected String departamento;
    @XmlElement(name = "InfoAdicionalEmisor")
    protected String infoAdicionalEmisor;

    /**
     * Obtiene el valor de la propiedad rucEmisor.
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
     * Define el valor de la propiedad rucEmisor.
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
     * Obtiene el valor de la propiedad rznSoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRznSoc() {
        return rznSoc;
    }

    /**
     * Define el valor de la propiedad rznSoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRznSoc(String value) {
        this.rznSoc = value;
    }

    /**
     * Obtiene el valor de la propiedad nomComercial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomComercial() {
        return nomComercial;
    }

    /**
     * Define el valor de la propiedad nomComercial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomComercial(String value) {
        this.nomComercial = value;
    }

    /**
     * Obtiene el valor de la propiedad giroEmis.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiroEmis() {
        return giroEmis;
    }

    /**
     * Define el valor de la propiedad giroEmis.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiroEmis(String value) {
        this.giroEmis = value;
    }

    /**
     * Gets the value of the telefono property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telefono property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelefono().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTelefono() {
        if (telefono == null) {
            telefono = new ArrayList<String>();
        }
        return this.telefono;
    }

    /**
     * Obtiene el valor de la propiedad correoEmisor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreoEmisor() {
        return correoEmisor;
    }

    /**
     * Define el valor de la propiedad correoEmisor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreoEmisor(String value) {
        this.correoEmisor = value;
    }

    /**
     * Obtiene el valor de la propiedad emiSucursal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmiSucursal() {
        return emiSucursal;
    }

    /**
     * Define el valor de la propiedad emiSucursal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmiSucursal(String value) {
        this.emiSucursal = value;
    }

    /**
     * Obtiene el valor de la propiedad cdgDGISucur.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCdgDGISucur() {
        return cdgDGISucur;
    }

    /**
     * Define el valor de la propiedad cdgDGISucur.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCdgDGISucur(BigInteger value) {
        this.cdgDGISucur = value;
    }

    /**
     * Obtiene el valor de la propiedad domFiscal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomFiscal() {
        return domFiscal;
    }

    /**
     * Define el valor de la propiedad domFiscal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomFiscal(String value) {
        this.domFiscal = value;
    }

    /**
     * Obtiene el valor de la propiedad ciudad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Define el valor de la propiedad ciudad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudad(String value) {
        this.ciudad = value;
    }

    /**
     * Obtiene el valor de la propiedad departamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * Define el valor de la propiedad departamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartamento(String value) {
        this.departamento = value;
    }

    /**
     * Obtiene el valor de la propiedad infoAdicionalEmisor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoAdicionalEmisor() {
        return infoAdicionalEmisor;
    }

    /**
     * Define el valor de la propiedad infoAdicionalEmisor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoAdicionalEmisor(String value) {
        this.infoAdicionalEmisor = value;
    }

}
