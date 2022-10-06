//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.23 a las 05:35:46 PM UTC 
//


package uy.gub.dgi.cfe;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RetPerc complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RetPerc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodRet" type="{http://cfe.dgi.gub.uy}CodRetType"/&gt;
 *         &lt;element name="Tasa" type="{http://cfe.dgi.gub.uy}PctType" minOccurs="0"/&gt;
 *         &lt;element name="MntSujetoaRet" type="{http://cfe.dgi.gub.uy}MontoType" minOccurs="0"/&gt;
 *         &lt;element name="InfoAdicionalRet" type="{http://cfe.dgi.gub.uy}InfoAdicionalType" minOccurs="0"/&gt;
 *         &lt;element name="ValRetPerc" type="{http://cfe.dgi.gub.uy}MontoType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetPerc", propOrder = {
    "codRet",
    "tasa",
    "mntSujetoaRet",
    "infoAdicionalRet",
    "valRetPerc"
})
public class RetPerc {

    @XmlElement(name = "CodRet", required = true)
    protected String codRet;
    @XmlElement(name = "Tasa")
    protected BigDecimal tasa;
    @XmlElement(name = "MntSujetoaRet")
    protected BigDecimal mntSujetoaRet;
    @XmlElement(name = "InfoAdicionalRet")
    protected String infoAdicionalRet;
    @XmlElement(name = "ValRetPerc", required = true)
    protected BigDecimal valRetPerc;

    /**
     * Obtiene el valor de la propiedad codRet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodRet() {
        return codRet;
    }

    /**
     * Define el valor de la propiedad codRet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodRet(String value) {
        this.codRet = value;
    }

    /**
     * Obtiene el valor de la propiedad tasa.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTasa() {
        return tasa;
    }

    /**
     * Define el valor de la propiedad tasa.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTasa(BigDecimal value) {
        this.tasa = value;
    }

    /**
     * Obtiene el valor de la propiedad mntSujetoaRet.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMntSujetoaRet() {
        return mntSujetoaRet;
    }

    /**
     * Define el valor de la propiedad mntSujetoaRet.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMntSujetoaRet(BigDecimal value) {
        this.mntSujetoaRet = value;
    }

    /**
     * Obtiene el valor de la propiedad infoAdicionalRet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoAdicionalRet() {
        return infoAdicionalRet;
    }

    /**
     * Define el valor de la propiedad infoAdicionalRet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoAdicionalRet(String value) {
        this.infoAdicionalRet = value;
    }

    /**
     * Obtiene el valor de la propiedad valRetPerc.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValRetPerc() {
        return valRetPerc;
    }

    /**
     * Define el valor de la propiedad valRetPerc.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValRetPerc(BigDecimal value) {
        this.valRetPerc = value;
    }

}
