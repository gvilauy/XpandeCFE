//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.11 at 02:07:01 PM UYT 
//


package dto.sisteco.cfe;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for Montos_FyT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Montos_FyT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Mnts_FyT_Item" maxOccurs="2000">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Fecha" type="{http://cfe.dgi.gub.uy}FechaType"/>
 *                   &lt;element name="CodSuc" type="{http://cfe.dgi.gub.uy}CodSucType"/>
 *                   &lt;element name="IndPagCta3ros" type="{http://cfe.dgi.gub.uy}IndPagCta3rosType" minOccurs="0"/>
 *                   &lt;element name="TotMntNoGrv" type="{http://cfe.dgi.gub.uy}MontoType" minOccurs="0"/>
 *                   &lt;element name="TotMntExpyAsim" type="{http://cfe.dgi.gub.uy}MontoType" minOccurs="0"/>
 *                   &lt;element name="TotMntImpPerc" type="{http://cfe.dgi.gub.uy}MontoType" minOccurs="0"/>
 *                   &lt;element name="TotMntIVAenSusp" type="{http://cfe.dgi.gub.uy}MontoType" minOccurs="0"/>
 *                   &lt;element name="TotMntIVATasaMin" type="{http://cfe.dgi.gub.uy}MontoType" minOccurs="0"/>
 *                   &lt;element name="TotMntIVATasaBas" type="{http://cfe.dgi.gub.uy}MontoType" minOccurs="0"/>
 *                   &lt;element name="TotMntIVAOtra" type="{http://cfe.dgi.gub.uy}MontoType" minOccurs="0"/>
 *                   &lt;element name="MntIVATasaMin" type="{http://cfe.dgi.gub.uy}MontoType" minOccurs="0"/>
 *                   &lt;element name="MntIVATasaBas" type="{http://cfe.dgi.gub.uy}MontoType" minOccurs="0"/>
 *                   &lt;element name="MntIVAOtra" type="{http://cfe.dgi.gub.uy}MontoType" minOccurs="0"/>
 *                   &lt;element name="IVATasaMin" type="{http://cfe.dgi.gub.uy}TasaIVAType" minOccurs="0"/>
 *                   &lt;element name="IVATasaBas" type="{http://cfe.dgi.gub.uy}TasaIVAType" minOccurs="0"/>
 *                   &lt;element name="TotMntTotal" type="{http://cfe.dgi.gub.uy}MontoType"/>
 *                   &lt;element name="TotMntRetenido" type="{http://cfe.dgi.gub.uy}Monto_admite_negType" minOccurs="0"/>
 *                   &lt;element name="TotMntCredFisc" type="{http://cfe.dgi.gub.uy}Monto_admite_negType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Fecha" type="{http://cfe.dgi.gub.uy}FechaType"/>
     *         &lt;element name="CodSuc" type="{http://cfe.dgi.gub.uy}CodSucType"/>
     *         &lt;element name="IndPagCta3ros" type="{http://cfe.dgi.gub.uy}IndPagCta3rosType" minOccurs="0"/>
     *         &lt;element name="TotMntNoGrv" type="{http://cfe.dgi.gub.uy}MontoType" minOccurs="0"/>
     *         &lt;element name="TotMntExpyAsim" type="{http://cfe.dgi.gub.uy}MontoType" minOccurs="0"/>
     *         &lt;element name="TotMntImpPerc" type="{http://cfe.dgi.gub.uy}MontoType" minOccurs="0"/>
     *         &lt;element name="TotMntIVAenSusp" type="{http://cfe.dgi.gub.uy}MontoType" minOccurs="0"/>
     *         &lt;element name="TotMntIVATasaMin" type="{http://cfe.dgi.gub.uy}MontoType" minOccurs="0"/>
     *         &lt;element name="TotMntIVATasaBas" type="{http://cfe.dgi.gub.uy}MontoType" minOccurs="0"/>
     *         &lt;element name="TotMntIVAOtra" type="{http://cfe.dgi.gub.uy}MontoType" minOccurs="0"/>
     *         &lt;element name="MntIVATasaMin" type="{http://cfe.dgi.gub.uy}MontoType" minOccurs="0"/>
     *         &lt;element name="MntIVATasaBas" type="{http://cfe.dgi.gub.uy}MontoType" minOccurs="0"/>
     *         &lt;element name="MntIVAOtra" type="{http://cfe.dgi.gub.uy}MontoType" minOccurs="0"/>
     *         &lt;element name="IVATasaMin" type="{http://cfe.dgi.gub.uy}TasaIVAType" minOccurs="0"/>
     *         &lt;element name="IVATasaBas" type="{http://cfe.dgi.gub.uy}TasaIVAType" minOccurs="0"/>
     *         &lt;element name="TotMntTotal" type="{http://cfe.dgi.gub.uy}MontoType"/>
     *         &lt;element name="TotMntRetenido" type="{http://cfe.dgi.gub.uy}Monto_admite_negType" minOccurs="0"/>
     *         &lt;element name="TotMntCredFisc" type="{http://cfe.dgi.gub.uy}Monto_admite_negType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
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
         * Gets the value of the fecha property.
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
         * Sets the value of the fecha property.
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
         * Gets the value of the codSuc property.
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
         * Sets the value of the codSuc property.
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
         * Gets the value of the indPagCta3Ros property.
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
         * Sets the value of the indPagCta3Ros property.
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
         * Gets the value of the totMntNoGrv property.
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
         * Sets the value of the totMntNoGrv property.
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
         * Gets the value of the totMntExpyAsim property.
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
         * Sets the value of the totMntExpyAsim property.
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
         * Gets the value of the totMntImpPerc property.
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
         * Sets the value of the totMntImpPerc property.
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
         * Gets the value of the totMntIVAenSusp property.
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
         * Sets the value of the totMntIVAenSusp property.
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
         * Gets the value of the totMntIVATasaMin property.
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
         * Sets the value of the totMntIVATasaMin property.
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
         * Gets the value of the totMntIVATasaBas property.
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
         * Sets the value of the totMntIVATasaBas property.
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
         * Gets the value of the totMntIVAOtra property.
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
         * Sets the value of the totMntIVAOtra property.
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
         * Gets the value of the mntIVATasaMin property.
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
         * Sets the value of the mntIVATasaMin property.
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
         * Gets the value of the mntIVATasaBas property.
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
         * Sets the value of the mntIVATasaBas property.
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
         * Gets the value of the mntIVAOtra property.
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
         * Sets the value of the mntIVAOtra property.
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
         * Gets the value of the ivaTasaMin property.
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
         * Sets the value of the ivaTasaMin property.
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
         * Gets the value of the ivaTasaBas property.
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
         * Sets the value of the ivaTasaBas property.
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
         * Gets the value of the totMntTotal property.
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
         * Sets the value of the totMntTotal property.
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
         * Gets the value of the totMntRetenido property.
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
         * Sets the value of the totMntRetenido property.
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
         * Gets the value of the totMntCredFisc property.
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
         * Sets the value of the totMntCredFisc property.
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
