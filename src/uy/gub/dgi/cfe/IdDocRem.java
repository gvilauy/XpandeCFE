//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.23 a las 05:35:46 PM UTC 
//


package uy.gub.dgi.cfe;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para IdDoc_Rem complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IdDoc_Rem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TipoCFE"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
 *               &lt;enumeration value="181"/&gt;
 *               &lt;enumeration value="281"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Serie" type="{http://cfe.dgi.gub.uy}SerieType"/&gt;
 *         &lt;element name="Nro" type="{http://cfe.dgi.gub.uy}NroCFEType"/&gt;
 *         &lt;element name="NroInterno" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FchEmis" type="{http://cfe.dgi.gub.uy}FechaType"/&gt;
 *         &lt;element name="TipoTraslado" type="{http://cfe.dgi.gub.uy}TipoTrasladoType"/&gt;
 *         &lt;element name="IndPropiedad" type="{http://cfe.dgi.gub.uy}IndPropiedadType" minOccurs="0"/&gt;
 *         &lt;element name="TipoDocProp" type="{http://cfe.dgi.gub.uy}DocType" minOccurs="0"/&gt;
 *         &lt;element name="CodPaisProp" type="{http://cfe.dgi.gub.uy}CodPaisType" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="DocProp" type="{http://cfe.dgi.gub.uy}NroDocType" minOccurs="0"/&gt;
 *           &lt;element name="DocPropExt" minOccurs="0"&gt;
 *             &lt;simpleType&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                 &lt;maxLength value="20"/&gt;
 *                 &lt;whiteSpace value="collapse"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="RznSocProp" type="{http://cfe.dgi.gub.uy}RznSocType" minOccurs="0"/&gt;
 *         &lt;element name="InfoAdicionalDoc" type="{http://cfe.dgi.gub.uy}InfoAdicionalType" minOccurs="0"/&gt;
 *         &lt;element name="SecProf" type="{http://cfe.dgi.gub.uy}SecProfType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdDoc_Rem", propOrder = {
    "tipoCFE",
    "serie",
    "nro",
    "nroInterno",
    "fchEmis",
    "tipoTraslado",
    "indPropiedad",
    "tipoDocProp",
    "codPaisProp",
    "docProp",
    "docPropExt",
    "rznSocProp",
    "infoAdicionalDoc",
    "secProf"
})
public class IdDocRem {

    @XmlElement(name = "TipoCFE", required = true)
    protected BigInteger tipoCFE;
    @XmlElement(name = "Serie", required = true)
    protected String serie;
    @XmlElement(name = "Nro", required = true)
    protected BigInteger nro;
    @XmlElement(name = "NroInterno")
    protected String nroInterno;
    @XmlElement(name = "FchEmis", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fchEmis;
    @XmlElement(name = "TipoTraslado", required = true)
    protected BigInteger tipoTraslado;
    @XmlElement(name = "IndPropiedad")
    protected BigInteger indPropiedad;
    @XmlElement(name = "TipoDocProp")
    @XmlSchemaType(name = "positiveInteger")
    protected Integer tipoDocProp;
    @XmlElement(name = "CodPaisProp")
    protected String codPaisProp;
    @XmlElement(name = "DocProp")
    protected String docProp;
    @XmlElement(name = "DocPropExt")
    protected String docPropExt;
    @XmlElement(name = "RznSocProp")
    protected String rznSocProp;
    @XmlElement(name = "InfoAdicionalDoc")
    protected String infoAdicionalDoc;
    @XmlElement(name = "SecProf")
    protected BigInteger secProf;

    /**
     * Obtiene el valor de la propiedad tipoCFE.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTipoCFE() {
        return tipoCFE;
    }

    /**
     * Define el valor de la propiedad tipoCFE.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTipoCFE(BigInteger value) {
        this.tipoCFE = value;
    }

    /**
     * Obtiene el valor de la propiedad serie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerie() {
        return serie;
    }

    /**
     * Define el valor de la propiedad serie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerie(String value) {
        this.serie = value;
    }

    /**
     * Obtiene el valor de la propiedad nro.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNro() {
        return nro;
    }

    /**
     * Define el valor de la propiedad nro.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNro(BigInteger value) {
        this.nro = value;
    }

    /**
     * Obtiene el valor de la propiedad nroInterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroInterno() {
        return nroInterno;
    }

    /**
     * Define el valor de la propiedad nroInterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroInterno(String value) {
        this.nroInterno = value;
    }

    /**
     * Obtiene el valor de la propiedad fchEmis.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFchEmis() {
        return fchEmis;
    }

    /**
     * Define el valor de la propiedad fchEmis.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFchEmis(XMLGregorianCalendar value) {
        this.fchEmis = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoTraslado.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTipoTraslado() {
        return tipoTraslado;
    }

    /**
     * Define el valor de la propiedad tipoTraslado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTipoTraslado(BigInteger value) {
        this.tipoTraslado = value;
    }

    /**
     * Obtiene el valor de la propiedad indPropiedad.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIndPropiedad() {
        return indPropiedad;
    }

    /**
     * Define el valor de la propiedad indPropiedad.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIndPropiedad(BigInteger value) {
        this.indPropiedad = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDocProp.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTipoDocProp() {
        return tipoDocProp;
    }

    /**
     * Define el valor de la propiedad tipoDocProp.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTipoDocProp(Integer value) {
        this.tipoDocProp = value;
    }

    /**
     * Obtiene el valor de la propiedad codPaisProp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodPaisProp() {
        return codPaisProp;
    }

    /**
     * Define el valor de la propiedad codPaisProp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodPaisProp(String value) {
        this.codPaisProp = value;
    }

    /**
     * Obtiene el valor de la propiedad docProp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocProp() {
        return docProp;
    }

    /**
     * Define el valor de la propiedad docProp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocProp(String value) {
        this.docProp = value;
    }

    /**
     * Obtiene el valor de la propiedad docPropExt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocPropExt() {
        return docPropExt;
    }

    /**
     * Define el valor de la propiedad docPropExt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocPropExt(String value) {
        this.docPropExt = value;
    }

    /**
     * Obtiene el valor de la propiedad rznSocProp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRznSocProp() {
        return rznSocProp;
    }

    /**
     * Define el valor de la propiedad rznSocProp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRznSocProp(String value) {
        this.rznSocProp = value;
    }

    /**
     * Obtiene el valor de la propiedad infoAdicionalDoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoAdicionalDoc() {
        return infoAdicionalDoc;
    }

    /**
     * Define el valor de la propiedad infoAdicionalDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoAdicionalDoc(String value) {
        this.infoAdicionalDoc = value;
    }

    /**
     * Obtiene el valor de la propiedad secProf.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSecProf() {
        return secProf;
    }

    /**
     * Define el valor de la propiedad secProf.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSecProf(BigInteger value) {
        this.secProf = value;
    }

}
