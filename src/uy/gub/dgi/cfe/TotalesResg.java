//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.23 a las 05:35:46 PM UTC 
//


package uy.gub.dgi.cfe;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Totales_Resg complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Totales_Resg"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TpoMoneda" type="{http://cfe.dgi.gub.uy}TipMonType"/&gt;
 *         &lt;element name="TpoCambio" type="{http://cfe.dgi.gub.uy}TipCambioType" minOccurs="0"/&gt;
 *         &lt;element name="MntTotRetenido" type="{http://cfe.dgi.gub.uy}Monto_admite_negType"/&gt;
 *         &lt;element name="MntTotCredFisc" type="{http://cfe.dgi.gub.uy}Monto_admite_negType" minOccurs="0"/&gt;
 *         &lt;element name="CantLinDet"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://cfe.dgi.gub.uy}LineasDetType"&gt;
 *               &lt;totalDigits value="3"/&gt;
 *               &lt;fractionDigits value="0"/&gt;
 *               &lt;maxInclusive value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RetencPercep" maxOccurs="20"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CodRet" type="{http://cfe.dgi.gub.uy}CodRetType"/&gt;
 *                   &lt;element name="ValRetPerc" type="{http://cfe.dgi.gub.uy}Monto_admite_negType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
@XmlType(name = "Totales_Resg", propOrder = {
    "tpoMoneda",
    "tpoCambio",
    "mntTotRetenido",
    "mntTotCredFisc",
    "cantLinDet",
    "retencPercep"
})
public class TotalesResg {

    @XmlElement(name = "TpoMoneda", required = true)
    @XmlSchemaType(name = "string")
    protected TipMonType tpoMoneda;
    @XmlElement(name = "TpoCambio")
    protected BigDecimal tpoCambio;
    @XmlElement(name = "MntTotRetenido", required = true)
    protected BigDecimal mntTotRetenido;
    @XmlElement(name = "MntTotCredFisc")
    protected BigDecimal mntTotCredFisc;
    @XmlElement(name = "CantLinDet")
    protected int cantLinDet;
    @XmlElement(name = "RetencPercep", required = true)
    protected List<RetencPercep> retencPercep;

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
     * Obtiene el valor de la propiedad mntTotRetenido.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMntTotRetenido() {
        return mntTotRetenido;
    }

    /**
     * Define el valor de la propiedad mntTotRetenido.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMntTotRetenido(BigDecimal value) {
        this.mntTotRetenido = value;
    }

    /**
     * Obtiene el valor de la propiedad mntTotCredFisc.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMntTotCredFisc() {
        return mntTotCredFisc;
    }

    /**
     * Define el valor de la propiedad mntTotCredFisc.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMntTotCredFisc(BigDecimal value) {
        this.mntTotCredFisc = value;
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
     * Gets the value of the retencPercep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retencPercep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetencPercep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetencPercep }
     * 
     * 
     */
    public List<RetencPercep> getRetencPercep() {
        if (retencPercep == null) {
            retencPercep = new ArrayList<RetencPercep>();
        }
        return this.retencPercep;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CodRet" type="{http://cfe.dgi.gub.uy}CodRetType"/&gt;
     *         &lt;element name="ValRetPerc" type="{http://cfe.dgi.gub.uy}Monto_admite_negType"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "codRet",
        "valRetPerc"
    })
    public static class RetencPercep {

        @XmlElement(name = "CodRet", required = true)
        protected String codRet;
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

}
