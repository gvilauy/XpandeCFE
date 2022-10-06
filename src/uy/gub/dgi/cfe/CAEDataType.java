//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.23 a las 05:35:46 PM UTC 
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
 * <p>Clase Java para CAEDataType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CAEDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CAE_ID"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;totalDigits value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DNro"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *               &lt;totalDigits value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HNro"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;totalDigits value="7"/&gt;
 *               &lt;minInclusive value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FecVenc" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="CAEEspecial" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;totalDigits value="1"/&gt;
 *               &lt;enumeration value="1"/&gt;
 *               &lt;enumeration value="2"/&gt;
 *               &lt;enumeration value="3"/&gt;
 *               &lt;enumeration value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CausalCAEEsp" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;totalDigits value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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

    @XmlElement(name = "CAE_ID", required = true)
    protected BigInteger caeid;
    @XmlElement(name = "DNro", required = true)
    protected BigInteger dNro;
    @XmlElement(name = "HNro", required = true)
    protected BigInteger hNro;
    @XmlElement(name = "FecVenc", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fecVenc;
    @XmlElement(name = "CAEEspecial")
    protected BigInteger caeEspecial;
    @XmlElement(name = "CausalCAEEsp")
    protected BigInteger causalCAEEsp;

    /**
     * Obtiene el valor de la propiedad caeid.
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
     * Define el valor de la propiedad caeid.
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
     * Obtiene el valor de la propiedad dNro.
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
     * Define el valor de la propiedad dNro.
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
     * Obtiene el valor de la propiedad hNro.
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
     * Define el valor de la propiedad hNro.
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
     * Obtiene el valor de la propiedad fecVenc.
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
     * Define el valor de la propiedad fecVenc.
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
     * Obtiene el valor de la propiedad caeEspecial.
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
     * Define el valor de la propiedad caeEspecial.
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
     * Obtiene el valor de la propiedad causalCAEEsp.
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
     * Define el valor de la propiedad causalCAEEsp.
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
