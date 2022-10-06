//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.23 a las 05:35:46 PM UTC 
//


package uy.gub.dgi.cfe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Compl_Fiscal_DataType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Compl_Fiscal_DataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RUCEmisor" type="{http://cfe.dgi.gub.uy}RUCType"/&gt;
 *         &lt;element name="TipoDocMdte" type="{http://cfe.dgi.gub.uy}DocTypemasNIE"/&gt;
 *         &lt;element name="Pais" type="{http://cfe.dgi.gub.uy}CodPaisType"/&gt;
 *         &lt;element name="DocMdte"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NombreMdte" type="{http://cfe.dgi.gub.uy}RznSocType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Compl_Fiscal_DataType", propOrder = {
    "rucEmisor",
    "tipoDocMdte",
    "pais",
    "docMdte",
    "nombreMdte"
})
public class ComplFiscalDataType {

    @XmlElement(name = "RUCEmisor", required = true)
    protected String rucEmisor;
    @XmlElement(name = "TipoDocMdte")
    @XmlSchemaType(name = "positiveInteger")
    protected int tipoDocMdte;
    @XmlElement(name = "Pais", required = true)
    protected String pais;
    @XmlElement(name = "DocMdte", required = true)
    protected String docMdte;
    @XmlElement(name = "NombreMdte", required = true)
    protected String nombreMdte;

    /**
     * Obtiene el valor de la propiedad rucEmisor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRUCEmisor() {
        return rucEmisor;
    }

    /**
     * Define el valor de la propiedad rucEmisor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRUCEmisor(String value) {
        this.rucEmisor = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDocMdte.
     * 
     */
    public int getTipoDocMdte() {
        return tipoDocMdte;
    }

    /**
     * Define el valor de la propiedad tipoDocMdte.
     * 
     */
    public void setTipoDocMdte(int value) {
        this.tipoDocMdte = value;
    }

    /**
     * Obtiene el valor de la propiedad pais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPais() {
        return pais;
    }

    /**
     * Define el valor de la propiedad pais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPais(String value) {
        this.pais = value;
    }

    /**
     * Obtiene el valor de la propiedad docMdte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocMdte() {
        return docMdte;
    }

    /**
     * Define el valor de la propiedad docMdte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocMdte(String value) {
        this.docMdte = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreMdte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreMdte() {
        return nombreMdte;
    }

    /**
     * Define el valor de la propiedad nombreMdte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreMdte(String value) {
        this.nombreMdte = value;
    }

}
