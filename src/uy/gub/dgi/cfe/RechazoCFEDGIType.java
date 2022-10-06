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
 * <p>Clase Java para RechazoCFE_DGIType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RechazoCFE_DGIType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Motivo"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *               &lt;enumeration value="E01"/&gt;
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
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Glosa"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://cfe.dgi.gub.uy}Glosa50Type"&gt;
 *               &lt;enumeration value="Tipo y Nº de CFE ya fue reportado como anulado"/&gt;
 *               &lt;enumeration value="Tipo y Nº de CFE ya existe en los registros"/&gt;
 *               &lt;enumeration value="Tipo y Nº de CFE no se corresponden con el CAE"/&gt;
 *               &lt;enumeration value="Firma electrónica no es válida"/&gt;
 *               &lt;enumeration value="No cumple validaciones de Formato comprobantes"/&gt;
 *               &lt;enumeration value="Importe informado en el CFE excede la cantidad de dígitos habituales"/&gt;
 *               &lt;enumeration value="Fecha Firma de CFE no se corresponde con fecha CAE"/&gt;
 *               &lt;enumeration value="No coincide RUC de CFE y Complemento Fiscal"/&gt;
 *               &lt;enumeration value="RUC emisor y/o tipo de CFE no se corresponden con el CAE"/&gt;
 *               &lt;enumeration value="Tipo de cambio no válido"/&gt;
 *               &lt;enumeration value="Tipo de CAE especial del CFE no se corresponde con el CAE"/&gt;
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
@XmlType(name = "RechazoCFE_DGIType", propOrder = {
    "motivo",
    "glosa",
    "detalle"
})
public class RechazoCFEDGIType {

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
