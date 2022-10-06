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
 * <p>Clase Java para Totales_Boleta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Totales_Boleta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TpoMoneda" type="{http://cfe.dgi.gub.uy}TipMonType"/&gt;
 *         &lt;element name="TpoCambio" type="{http://cfe.dgi.gub.uy}TipCambioType" minOccurs="0"/&gt;
 *         &lt;element name="MntNoGrv" type="{http://cfe.dgi.gub.uy}MontoType" minOccurs="0"/&gt;
 *         &lt;element name="MntIVaenSusp" type="{http://cfe.dgi.gub.uy}MontoType" minOccurs="0"/&gt;
 *         &lt;element name="MntTotal" type="{http://cfe.dgi.gub.uy}MontoType"/&gt;
 *         &lt;element name="MntTotRetenido" type="{http://cfe.dgi.gub.uy}Monto_admite_negType" minOccurs="0"/&gt;
 *         &lt;element name="CantLinDet"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://cfe.dgi.gub.uy}LineasDetType"&gt;
 *               &lt;totalDigits value="3"/&gt;
 *               &lt;fractionDigits value="0"/&gt;
 *               &lt;maxInclusive value="700"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RetencPercep" maxOccurs="20" minOccurs="0"&gt;
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
 *         &lt;element name="MontoNF" type="{http://cfe.dgi.gub.uy}Monto_admite_negType" minOccurs="0"/&gt;
 *         &lt;element name="MntPagar" type="{http://cfe.dgi.gub.uy}Monto_admite_negType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Totales_Boleta", propOrder = {
    "tpoMoneda",
    "tpoCambio",
    "mntNoGrv",
    "mntIVaenSusp",
    "mntTotal",
    "mntTotRetenido",
    "cantLinDet",
    "retencPercep",
    "montoNF",
    "mntPagar"
})
public class TotalesBoleta {

    @XmlElement(name = "TpoMoneda", required = true)
    @XmlSchemaType(name = "string")
    protected TipMonType tpoMoneda;
    @XmlElement(name = "TpoCambio")
    protected BigDecimal tpoCambio;
    @XmlElement(name = "MntNoGrv")
    protected BigDecimal mntNoGrv;
    @XmlElement(name = "MntIVaenSusp")
    protected BigDecimal mntIVaenSusp;
    @XmlElement(name = "MntTotal", required = true)
    protected BigDecimal mntTotal;
    @XmlElement(name = "MntTotRetenido")
    protected BigDecimal mntTotRetenido;
    @XmlElement(name = "CantLinDet")
    protected int cantLinDet;
    @XmlElement(name = "RetencPercep")
    protected List<RetencPercep> retencPercep;
    @XmlElement(name = "MontoNF")
    protected BigDecimal montoNF;
    @XmlElement(name = "MntPagar", required = true)
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
     * Obtiene el valor de la propiedad mntNoGrv.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMntNoGrv() {
        return mntNoGrv;
    }

    /**
     * Define el valor de la propiedad mntNoGrv.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMntNoGrv(BigDecimal value) {
        this.mntNoGrv = value;
    }

    /**
     * Obtiene el valor de la propiedad mntIVaenSusp.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMntIVaenSusp() {
        return mntIVaenSusp;
    }

    /**
     * Define el valor de la propiedad mntIVaenSusp.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMntIVaenSusp(BigDecimal value) {
        this.mntIVaenSusp = value;
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
     * Obtiene el valor de la propiedad montoNF.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoNF() {
        return montoNF;
    }

    /**
     * Define el valor de la propiedad montoNF.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoNF(BigDecimal value) {
        this.montoNF = value;
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
