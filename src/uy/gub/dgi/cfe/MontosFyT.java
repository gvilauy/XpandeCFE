//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.23 a las 05:37:24 PM UTC 
//


package uy.gub.dgi.cfe;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para Montos_FyT complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Montos_FyT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mnts_FyT_Item" maxOccurs="2000"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Fecha" type="{http://cfe.dgi.gub.uy}FechaType"/&gt;
 *                   &lt;element name="CodSuc" type="{http://cfe.dgi.gub.uy}CodSucType"/&gt;
 *                   &lt;element name="IndPagCta3ros" type="{http://cfe.dgi.gub.uy}IndPagCta3rosType" minOccurs="0"/&gt;
 *                   &lt;element name="TotMntNoGrv" type="{http://cfe.dgi.gub.uy}MontoType" minOccurs="0"/&gt;
 *                   &lt;element name="TotMntExpyAsim" type="{http://cfe.dgi.gub.uy}MontoType" minOccurs="0"/&gt;
 *                   &lt;element name="TotMntImpPerc" type="{http://cfe.dgi.gub.uy}MontoType" minOccurs="0"/&gt;
 *                   &lt;element name="TotMntIVAenSusp" type="{http://cfe.dgi.gub.uy}MontoType" minOccurs="0"/&gt;
 *                   &lt;element name="TotMntIVATasaMin" type="{http://cfe.dgi.gub.uy}MontoType" minOccurs="0"/&gt;
 *                   &lt;element name="TotMntIVATasaBas" type="{http://cfe.dgi.gub.uy}MontoType" minOccurs="0"/&gt;
 *                   &lt;element name="TotMntIVAOtra" type="{http://cfe.dgi.gub.uy}MontoType" minOccurs="0"/&gt;
 *                   &lt;element name="MntIVATasaMin" type="{http://cfe.dgi.gub.uy}MontoType" minOccurs="0"/&gt;
 *                   &lt;element name="MntIVATasaBas" type="{http://cfe.dgi.gub.uy}MontoType" minOccurs="0"/&gt;
 *                   &lt;element name="MntIVAOtra" type="{http://cfe.dgi.gub.uy}MontoType" minOccurs="0"/&gt;
 *                   &lt;element name="IVATasaMin" type="{http://cfe.dgi.gub.uy}TasaIVAType" minOccurs="0"/&gt;
 *                   &lt;element name="IVATasaBas" type="{http://cfe.dgi.gub.uy}TasaIVAType" minOccurs="0"/&gt;
 *                   &lt;element name="TotMntTotal" type="{http://cfe.dgi.gub.uy}MontoType"/&gt;
 *                   &lt;element name="TotMntRetenido" type="{http://cfe.dgi.gub.uy}Monto_admite_negType" minOccurs="0"/&gt;
 *                   &lt;element name="TotMntCredFisc" type="{http://cfe.dgi.gub.uy}Monto_admite_negType" minOccurs="0"/&gt;
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
@XmlType(name = "Montos_FyT", propOrder = {
    "mntsFyTItem"
})
public class MontosFyT {

    @XmlElement(name = "Mnts_FyT_Item", required = true)
    protected List<MntsFyTItem> mntsFyTItem;

    /**
     * Gets the value of the mntsFyTItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mntsFyTItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMntsFyTItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MntsFyTItem }
     * 
     * 
     */
    public List<MntsFyTItem> getMntsFyTItem() {
        if (mntsFyTItem == null) {
            mntsFyTItem = new ArrayList<MntsFyTItem>();
        }
        return this.mntsFyTItem;
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
     *         &lt;element name="Fecha" type="{http://cfe.dgi.gub.uy}FechaType"/&gt;
     *         &lt;element name="CodSuc" type="{http://cfe.dgi.gub.uy}CodSucType"/&gt;
     *         &lt;element name="IndPagCta3ros" type="{http://cfe.dgi.gub.uy}IndPagCta3rosType" minOccurs="0"/&gt;
     *         &lt;element name="TotMntNoGrv" type="{http://cfe.dgi.gub.uy}MontoType" minOccurs="0"/&gt;
     *         &lt;element name="TotMntExpyAsim" type="{http://cfe.dgi.gub.uy}MontoType" minOccurs="0"/&gt;
     *         &lt;element name="TotMntImpPerc" type="{http://cfe.dgi.gub.uy}MontoType" minOccurs="0"/&gt;
     *         &lt;element name="TotMntIVAenSusp" type="{http://cfe.dgi.gub.uy}MontoType" minOccurs="0"/&gt;
     *         &lt;element name="TotMntIVATasaMin" type="{http://cfe.dgi.gub.uy}MontoType" minOccurs="0"/&gt;
     *         &lt;element name="TotMntIVATasaBas" type="{http://cfe.dgi.gub.uy}MontoType" minOccurs="0"/&gt;
     *         &lt;element name="TotMntIVAOtra" type="{http://cfe.dgi.gub.uy}MontoType" minOccurs="0"/&gt;
     *         &lt;element name="MntIVATasaMin" type="{http://cfe.dgi.gub.uy}MontoType" minOccurs="0"/&gt;
     *         &lt;element name="MntIVATasaBas" type="{http://cfe.dgi.gub.uy}MontoType" minOccurs="0"/&gt;
     *         &lt;element name="MntIVAOtra" type="{http://cfe.dgi.gub.uy}MontoType" minOccurs="0"/&gt;
     *         &lt;element name="IVATasaMin" type="{http://cfe.dgi.gub.uy}TasaIVAType" minOccurs="0"/&gt;
     *         &lt;element name="IVATasaBas" type="{http://cfe.dgi.gub.uy}TasaIVAType" minOccurs="0"/&gt;
     *         &lt;element name="TotMntTotal" type="{http://cfe.dgi.gub.uy}MontoType"/&gt;
     *         &lt;element name="TotMntRetenido" type="{http://cfe.dgi.gub.uy}Monto_admite_negType" minOccurs="0"/&gt;
     *         &lt;element name="TotMntCredFisc" type="{http://cfe.dgi.gub.uy}Monto_admite_negType" minOccurs="0"/&gt;
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
        "fecha",
        "codSuc",
        "indPagCta3Ros",
        "totMntNoGrv",
        "totMntExpyAsim",
        "totMntImpPerc",
        "totMntIVAenSusp",
        "totMntIVATasaMin",
        "totMntIVATasaBas",
        "totMntIVAOtra",
        "mntIVATasaMin",
        "mntIVATasaBas",
        "mntIVAOtra",
        "ivaTasaMin",
        "ivaTasaBas",
        "totMntTotal",
        "totMntRetenido",
        "totMntCredFisc"
    })
    public static class MntsFyTItem {

        @XmlElement(name = "Fecha", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar fecha;
        @XmlElement(name = "CodSuc", required = true)
        protected BigInteger codSuc;
        @XmlElement(name = "IndPagCta3ros")
        protected BigInteger indPagCta3Ros;
        @XmlElement(name = "TotMntNoGrv")
        protected BigDecimal totMntNoGrv;
        @XmlElement(name = "TotMntExpyAsim")
        protected BigDecimal totMntExpyAsim;
        @XmlElement(name = "TotMntImpPerc")
        protected BigDecimal totMntImpPerc;
        @XmlElement(name = "TotMntIVAenSusp")
        protected BigDecimal totMntIVAenSusp;
        @XmlElement(name = "TotMntIVATasaMin")
        protected BigDecimal totMntIVATasaMin;
        @XmlElement(name = "TotMntIVATasaBas")
        protected BigDecimal totMntIVATasaBas;
        @XmlElement(name = "TotMntIVAOtra")
        protected BigDecimal totMntIVAOtra;
        @XmlElement(name = "MntIVATasaMin")
        protected BigDecimal mntIVATasaMin;
        @XmlElement(name = "MntIVATasaBas")
        protected BigDecimal mntIVATasaBas;
        @XmlElement(name = "MntIVAOtra")
        protected BigDecimal mntIVAOtra;
        @XmlElement(name = "IVATasaMin")
        protected BigDecimal ivaTasaMin;
        @XmlElement(name = "IVATasaBas")
        protected BigDecimal ivaTasaBas;
        @XmlElement(name = "TotMntTotal", required = true)
        protected BigDecimal totMntTotal;
        @XmlElement(name = "TotMntRetenido")
        protected BigDecimal totMntRetenido;
        @XmlElement(name = "TotMntCredFisc")
        protected BigDecimal totMntCredFisc;

        /**
         * Obtiene el valor de la propiedad fecha.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFecha() {
            return fecha;
        }

        /**
         * Define el valor de la propiedad fecha.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFecha(XMLGregorianCalendar value) {
            this.fecha = value;
        }

        /**
         * Obtiene el valor de la propiedad codSuc.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCodSuc() {
            return codSuc;
        }

        /**
         * Define el valor de la propiedad codSuc.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCodSuc(BigInteger value) {
            this.codSuc = value;
        }

        /**
         * Obtiene el valor de la propiedad indPagCta3Ros.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getIndPagCta3Ros() {
            return indPagCta3Ros;
        }

        /**
         * Define el valor de la propiedad indPagCta3Ros.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setIndPagCta3Ros(BigInteger value) {
            this.indPagCta3Ros = value;
        }

        /**
         * Obtiene el valor de la propiedad totMntNoGrv.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotMntNoGrv() {
            return totMntNoGrv;
        }

        /**
         * Define el valor de la propiedad totMntNoGrv.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotMntNoGrv(BigDecimal value) {
            this.totMntNoGrv = value;
        }

        /**
         * Obtiene el valor de la propiedad totMntExpyAsim.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotMntExpyAsim() {
            return totMntExpyAsim;
        }

        /**
         * Define el valor de la propiedad totMntExpyAsim.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotMntExpyAsim(BigDecimal value) {
            this.totMntExpyAsim = value;
        }

        /**
         * Obtiene el valor de la propiedad totMntImpPerc.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotMntImpPerc() {
            return totMntImpPerc;
        }

        /**
         * Define el valor de la propiedad totMntImpPerc.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotMntImpPerc(BigDecimal value) {
            this.totMntImpPerc = value;
        }

        /**
         * Obtiene el valor de la propiedad totMntIVAenSusp.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotMntIVAenSusp() {
            return totMntIVAenSusp;
        }

        /**
         * Define el valor de la propiedad totMntIVAenSusp.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotMntIVAenSusp(BigDecimal value) {
            this.totMntIVAenSusp = value;
        }

        /**
         * Obtiene el valor de la propiedad totMntIVATasaMin.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotMntIVATasaMin() {
            return totMntIVATasaMin;
        }

        /**
         * Define el valor de la propiedad totMntIVATasaMin.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotMntIVATasaMin(BigDecimal value) {
            this.totMntIVATasaMin = value;
        }

        /**
         * Obtiene el valor de la propiedad totMntIVATasaBas.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotMntIVATasaBas() {
            return totMntIVATasaBas;
        }

        /**
         * Define el valor de la propiedad totMntIVATasaBas.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotMntIVATasaBas(BigDecimal value) {
            this.totMntIVATasaBas = value;
        }

        /**
         * Obtiene el valor de la propiedad totMntIVAOtra.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotMntIVAOtra() {
            return totMntIVAOtra;
        }

        /**
         * Define el valor de la propiedad totMntIVAOtra.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotMntIVAOtra(BigDecimal value) {
            this.totMntIVAOtra = value;
        }

        /**
         * Obtiene el valor de la propiedad mntIVATasaMin.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMntIVATasaMin() {
            return mntIVATasaMin;
        }

        /**
         * Define el valor de la propiedad mntIVATasaMin.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMntIVATasaMin(BigDecimal value) {
            this.mntIVATasaMin = value;
        }

        /**
         * Obtiene el valor de la propiedad mntIVATasaBas.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMntIVATasaBas() {
            return mntIVATasaBas;
        }

        /**
         * Define el valor de la propiedad mntIVATasaBas.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMntIVATasaBas(BigDecimal value) {
            this.mntIVATasaBas = value;
        }

        /**
         * Obtiene el valor de la propiedad mntIVAOtra.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMntIVAOtra() {
            return mntIVAOtra;
        }

        /**
         * Define el valor de la propiedad mntIVAOtra.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMntIVAOtra(BigDecimal value) {
            this.mntIVAOtra = value;
        }

        /**
         * Obtiene el valor de la propiedad ivaTasaMin.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getIVATasaMin() {
            return ivaTasaMin;
        }

        /**
         * Define el valor de la propiedad ivaTasaMin.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setIVATasaMin(BigDecimal value) {
            this.ivaTasaMin = value;
        }

        /**
         * Obtiene el valor de la propiedad ivaTasaBas.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getIVATasaBas() {
            return ivaTasaBas;
        }

        /**
         * Define el valor de la propiedad ivaTasaBas.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setIVATasaBas(BigDecimal value) {
            this.ivaTasaBas = value;
        }

        /**
         * Obtiene el valor de la propiedad totMntTotal.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotMntTotal() {
            return totMntTotal;
        }

        /**
         * Define el valor de la propiedad totMntTotal.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotMntTotal(BigDecimal value) {
            this.totMntTotal = value;
        }

        /**
         * Obtiene el valor de la propiedad totMntRetenido.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotMntRetenido() {
            return totMntRetenido;
        }

        /**
         * Define el valor de la propiedad totMntRetenido.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotMntRetenido(BigDecimal value) {
            this.totMntRetenido = value;
        }

        /**
         * Obtiene el valor de la propiedad totMntCredFisc.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotMntCredFisc() {
            return totMntCredFisc;
        }

        /**
         * Define el valor de la propiedad totMntCredFisc.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotMntCredFisc(BigDecimal value) {
            this.totMntCredFisc = value;
        }

    }

}
