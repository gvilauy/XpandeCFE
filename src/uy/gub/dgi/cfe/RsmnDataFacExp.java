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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RsmnData_Fac_Exp complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RsmnData_Fac_Exp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Montos" type="{http://cfe.dgi.gub.uy}Montos_FExp" minOccurs="0"/&gt;
 *         &lt;element name="CantDocsUtil" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="CantDocsAnulados" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="CantDocsEmi" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="RngDocsUtil" type="{http://cfe.dgi.gub.uy}RngDocsUtil" minOccurs="0"/&gt;
 *         &lt;element name="RngDocsAnulados" type="{http://cfe.dgi.gub.uy}RngDocsAnulados" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RsmnData_Fac_Exp", propOrder = {
    "montos",
    "cantDocsUtil",
    "cantDocsAnulados",
    "cantDocsEmi",
    "rngDocsUtil",
    "rngDocsAnulados"
})
public class RsmnDataFacExp {

    @XmlElement(name = "Montos")
    protected MontosFExp montos;
    @XmlElement(name = "CantDocsUtil", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cantDocsUtil;
    @XmlElement(name = "CantDocsAnulados")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cantDocsAnulados;
    @XmlElement(name = "CantDocsEmi")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cantDocsEmi;
    @XmlElement(name = "RngDocsUtil")
    protected RngDocsUtil rngDocsUtil;
    @XmlElement(name = "RngDocsAnulados")
    protected RngDocsAnulados rngDocsAnulados;

    /**
     * Obtiene el valor de la propiedad montos.
     * 
     * @return
     *     possible object is
     *     {@link MontosFExp }
     *     
     */
    public MontosFExp getMontos() {
        return montos;
    }

    /**
     * Define el valor de la propiedad montos.
     * 
     * @param value
     *     allowed object is
     *     {@link MontosFExp }
     *     
     */
    public void setMontos(MontosFExp value) {
        this.montos = value;
    }

    /**
     * Obtiene el valor de la propiedad cantDocsUtil.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCantDocsUtil() {
        return cantDocsUtil;
    }

    /**
     * Define el valor de la propiedad cantDocsUtil.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCantDocsUtil(BigInteger value) {
        this.cantDocsUtil = value;
    }

    /**
     * Obtiene el valor de la propiedad cantDocsAnulados.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCantDocsAnulados() {
        return cantDocsAnulados;
    }

    /**
     * Define el valor de la propiedad cantDocsAnulados.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCantDocsAnulados(BigInteger value) {
        this.cantDocsAnulados = value;
    }

    /**
     * Obtiene el valor de la propiedad cantDocsEmi.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCantDocsEmi() {
        return cantDocsEmi;
    }

    /**
     * Define el valor de la propiedad cantDocsEmi.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCantDocsEmi(BigInteger value) {
        this.cantDocsEmi = value;
    }

    /**
     * Obtiene el valor de la propiedad rngDocsUtil.
     * 
     * @return
     *     possible object is
     *     {@link RngDocsUtil }
     *     
     */
    public RngDocsUtil getRngDocsUtil() {
        return rngDocsUtil;
    }

    /**
     * Define el valor de la propiedad rngDocsUtil.
     * 
     * @param value
     *     allowed object is
     *     {@link RngDocsUtil }
     *     
     */
    public void setRngDocsUtil(RngDocsUtil value) {
        this.rngDocsUtil = value;
    }

    /**
     * Obtiene el valor de la propiedad rngDocsAnulados.
     * 
     * @return
     *     possible object is
     *     {@link RngDocsAnulados }
     *     
     */
    public RngDocsAnulados getRngDocsAnulados() {
        return rngDocsAnulados;
    }

    /**
     * Define el valor de la propiedad rngDocsAnulados.
     * 
     * @param value
     *     allowed object is
     *     {@link RngDocsAnulados }
     *     
     */
    public void setRngDocsAnulados(RngDocsAnulados value) {
        this.rngDocsAnulados = value;
    }

}
