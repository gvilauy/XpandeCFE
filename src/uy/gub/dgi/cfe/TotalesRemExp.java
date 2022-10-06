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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Totales_Rem_Exp complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Totales_Rem_Exp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TpoMoneda" type="{http://cfe.dgi.gub.uy}TipMonType"/&gt;
 *         &lt;element name="TpoCambio" type="{http://cfe.dgi.gub.uy}TipCambioType" minOccurs="0"/&gt;
 *         &lt;element name="MntExpoyAsim" type="{http://cfe.dgi.gub.uy}Monto_admite_negType"/&gt;
 *         &lt;element name="MntTotal" type="{http://cfe.dgi.gub.uy}Monto_admite_negType"/&gt;
 *         &lt;element name="CantLinDet"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://cfe.dgi.gub.uy}LineasDetType"&gt;
 *               &lt;totalDigits value="3"/&gt;
 *               &lt;fractionDigits value="0"/&gt;
 *               &lt;maxInclusive value="700"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MntPagar" type="{http://cfe.dgi.gub.uy}Monto_admite_negType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Totales_Rem_Exp", propOrder = {
    "tpoMoneda",
    "tpoCambio",
    "mntExpoyAsim",
    "mntTotal",
    "cantLinDet",
    "mntPagar"
})
public class TotalesRemExp {

    @XmlElement(name = "TpoMoneda", required = true)
    @XmlSchemaType(name = "string")
    protected TipMonType tpoMoneda;
    @XmlElement(name = "TpoCambio")
    protected BigDecimal tpoCambio;
    @XmlElement(name = "MntExpoyAsim", required = true)
    protected BigDecimal mntExpoyAsim;
    @XmlElement(name = "MntTotal", required = true)
    protected BigDecimal mntTotal;
    @XmlElement(name = "CantLinDet")
    protected int cantLinDet;
    @XmlElement(name = "MntPagar")
    protected BigDecimal mntPagar;

    /**
     * Obtiene el valor de la propiedad tpoMoneda.
     * 
     * @return
     *     possible object is
     *     {@link TipMonType }
     *     
     */
    public TipMonType getTpoMoneda() {
        return tpoMoneda;
    }

    /**
     * Define el valor de la propiedad tpoMoneda.
     * 
     * @param value
     *     allowed object is
     *     {@link TipMonType }
     *     
     */
    public void setTpoMoneda(TipMonType value) {
        this.tpoMoneda = value;
    }

    /**
     * Obtiene el valor de la propiedad tpoCambio.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTpoCambio() {
        return tpoCambio;
    }

    /**
     * Define el valor de la propiedad tpoCambio.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTpoCambio(BigDecimal value) {
        this.tpoCambio = value;
    }

    /**
     * Obtiene el valor de la propiedad mntExpoyAsim.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMntExpoyAsim() {
        return mntExpoyAsim;
    }

    /**
     * Define el valor de la propiedad mntExpoyAsim.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMntExpoyAsim(BigDecimal value) {
        this.mntExpoyAsim = value;
    }

    /**
     * Obtiene el valor de la propiedad mntTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMntTotal() {
        return mntTotal;
    }

    /**
     * Define el valor de la propiedad mntTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMntTotal(BigDecimal value) {
        this.mntTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad cantLinDet.
     * 
     */
    public int getCantLinDet() {
        return cantLinDet;
    }

    /**
     * Define el valor de la propiedad cantLinDet.
     * 
     */
    public void setCantLinDet(int value) {
        this.cantLinDet = value;
    }

    /**
     * Obtiene el valor de la propiedad mntPagar.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMntPagar() {
        return mntPagar;
    }

    /**
     * Define el valor de la propiedad mntPagar.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMntPagar(BigDecimal value) {
        this.mntPagar = value;
    }

}
