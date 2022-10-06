//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.23 a las 05:37:24 PM UTC 
//


package uy.gub.dgi.cfe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RechazoCFE_PartesType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RechazoCFE_PartesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Motivo"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *               &lt;enumeration value="E02"/&gt;
 *               &lt;enumeration value="E03"/&gt;
 *               &lt;enumeration value="E04"/&gt;
 *               &lt;enumeration value="E05"/&gt;
 *               &lt;enumeration value="E06"/&gt;
 *               &lt;enumeration value="E07"/&gt;
 *               &lt;enumeration value="E08"/&gt;
 *               &lt;enumeration value="E09"/&gt;
 *               &lt;enumeration value="E10"/&gt;
 *               &lt;enumeration value="E11"/&gt;
 *               &lt;enumeration value="E20"/&gt;
 *               &lt;enumeration value="E21"/&gt;
 *               &lt;enumeration value="E22"/&gt;
 *               &lt;enumeration value="E23"/&gt;
 *               &lt;enumeration value="E24"/&gt;
 *               &lt;enumeration value="E25"/&gt;
 *               &lt;enumeration value="E26"/&gt;
 *               &lt;enumeration value="E27"/&gt;
 *               &lt;enumeration value="E28"/&gt;
 *               &lt;enumeration value="E29"/&gt;
 *               &lt;enumeration value="E30"/&gt;
 *               &lt;enumeration value="E31"/&gt;
 *               &lt;enumeration value="E32"/&gt;
 *               &lt;enumeration value="E33"/&gt;
 *               &lt;enumeration value="E34"/&gt;
 *               &lt;enumeration value="E35"/&gt;
 *               &lt;enumeration value="E36"/&gt;
 *               &lt;enumeration value="E37"/&gt;
 *               &lt;enumeration value="E38"/&gt;
 *               &lt;enumeration value="E39"/&gt;
 *               &lt;enumeration value="E40"/&gt;
 *               &lt;enumeration value="E41"/&gt;
 *               &lt;enumeration value="E42"/&gt;
 *               &lt;enumeration value="E43"/&gt;
 *               &lt;enumeration value="E44"/&gt;
 *               &lt;enumeration value="E45"/&gt;
 *               &lt;enumeration value="E46"/&gt;
 *               &lt;enumeration value="E47"/&gt;
 *               &lt;enumeration value="E48"/&gt;
 *               &lt;enumeration value="E49"/&gt;
 *               &lt;enumeration value="E50"/&gt;
 *               &lt;enumeration value="E51"/&gt;
 *               &lt;enumeration value="E52"/&gt;
 *               &lt;enumeration value="E53"/&gt;
 *               &lt;enumeration value="E54"/&gt;
 *               &lt;enumeration value="E55"/&gt;
 *               &lt;enumeration value="E56"/&gt;
 *               &lt;enumeration value="E57"/&gt;
 *               &lt;enumeration value="E58"/&gt;
 *               &lt;enumeration value="E59"/&gt;
 *               &lt;enumeration value="E60"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Glosa"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://cfe.dgi.gub.uy}Glosa50Type"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Detalle" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="500"/&gt;
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
@XmlType(name = "RechazoCFE_PartesType", propOrder = {
    "motivo",
    "glosa",
    "detalle"
})
public class RechazoCFEPartesType {

    @XmlElement(name = "Motivo", required = true)
    protected String motivo;
    @XmlElement(name = "Glosa", required = true)
    protected String glosa;
    @XmlElement(name = "Detalle")
    protected String detalle;

    /**
     * Obtiene el valor de la propiedad motivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivo() {
        return motivo;
    }

    /**
     * Define el valor de la propiedad motivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivo(String value) {
        this.motivo = value;
    }

    /**
     * Obtiene el valor de la propiedad glosa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlosa() {
        return glosa;
    }

    /**
     * Define el valor de la propiedad glosa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlosa(String value) {
        this.glosa = value;
    }

    /**
     * Obtiene el valor de la propiedad detalle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetalle() {
        return detalle;
    }

    /**
     * Define el valor de la propiedad detalle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetalle(String value) {
        this.detalle = value;
    }

}
