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
import javax.xml.bind.annotation.XmlType;
import org.w3._2001._04.xmlenc_.EncryptedDataType;


/**
 * <p>Clase Java para Compl_FiscalType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Compl_FiscalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Compl_Fiscal_Data" type="{http://cfe.dgi.gub.uy}Compl_Fiscal_DataType"/&gt;
 *         &lt;element ref="{http://www.w3.org/2001/04/xmlenc#}EncryptedData"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Compl_FiscalType", propOrder = {
    "complFiscalData",
    "encryptedData"
})
public class ComplFiscalType {

    @XmlElement(name = "Compl_Fiscal_Data")
    protected ComplFiscalDataType complFiscalData;
    @XmlElement(name = "EncryptedData", namespace = "http://www.w3.org/2001/04/xmlenc#")
    protected EncryptedDataType encryptedData;

    /**
     * Obtiene el valor de la propiedad complFiscalData.
     * 
     * @return
     *     possible object is
     *     {@link ComplFiscalDataType }
     *     
     */
    public ComplFiscalDataType getComplFiscalData() {
        return complFiscalData;
    }

    /**
     * Define el valor de la propiedad complFiscalData.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplFiscalDataType }
     *     
     */
    public void setComplFiscalData(ComplFiscalDataType value) {
        this.complFiscalData = value;
    }

    /**
     * Obtiene el valor de la propiedad encryptedData.
     * 
     * @return
     *     possible object is
     *     {@link EncryptedDataType }
     *     
     */
    public EncryptedDataType getEncryptedData() {
        return encryptedData;
    }

    /**
     * Define el valor de la propiedad encryptedData.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptedDataType }
     *     
     */
    public void setEncryptedData(EncryptedDataType value) {
        this.encryptedData = value;
    }

}
