//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.23 a las 05:37:24 PM UTC 
//


package uy.gub.dgi.cfe;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InfoRespOriType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InfoRespOriType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IDRespSobre" type="{http://cfe.dgi.gub.uy}IDRecEmiType"/&gt;
 *         &lt;element name="IDEmisorSobre" type="{http://cfe.dgi.gub.uy}IDRecEmiType"/&gt;
 *         &lt;element name="IDReceptorSobre" type="{http://cfe.dgi.gub.uy}IDRecEmiType"/&gt;
 *         &lt;element name="IDTokenSobre" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoRespOriType", propOrder = {
    "idRespSobre",
    "idEmisorSobre",
    "idReceptorSobre",
    "idTokenSobre"
})
public class InfoRespOriType {

    @XmlElement(name = "IDRespSobre", required = true)
    protected BigInteger idRespSobre;
    @XmlElement(name = "IDEmisorSobre", required = true)
    protected BigInteger idEmisorSobre;
    @XmlElement(name = "IDReceptorSobre", required = true)
    protected BigInteger idReceptorSobre;
    @XmlElement(name = "IDTokenSobre", required = true)
    protected byte[] idTokenSobre;

    /**
     * Obtiene el valor de la propiedad idRespSobre.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIDRespSobre() {
        return idRespSobre;
    }

    /**
     * Define el valor de la propiedad idRespSobre.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIDRespSobre(BigInteger value) {
        this.idRespSobre = value;
    }

    /**
     * Obtiene el valor de la propiedad idEmisorSobre.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIDEmisorSobre() {
        return idEmisorSobre;
    }

    /**
     * Define el valor de la propiedad idEmisorSobre.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIDEmisorSobre(BigInteger value) {
        this.idEmisorSobre = value;
    }

    /**
     * Obtiene el valor de la propiedad idReceptorSobre.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIDReceptorSobre() {
        return idReceptorSobre;
    }

    /**
     * Define el valor de la propiedad idReceptorSobre.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIDReceptorSobre(BigInteger value) {
        this.idReceptorSobre = value;
    }

    /**
     * Obtiene el valor de la propiedad idTokenSobre.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getIDTokenSobre() {
        return idTokenSobre;
    }

    /**
     * Define el valor de la propiedad idTokenSobre.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setIDTokenSobre(byte[] value) {
        this.idTokenSobre = value;
    }

}
