//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.29 at 05:47:04 PM UYT 
//


package dto.migrate;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Colección de CFE
 * 
 * <p>Java class for CFEInvoiCyCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CFEInvoiCyCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CFEItem" type="{http://www.invoicy.com.uy/}CFEInvoiCyType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CFEInvoiCyCollectionType", propOrder = {
    "cfeItem"
})
@XmlRootElement(name = "CFE")
public class CFEInvoiCyCollectionType {

    @XmlElement(name = "CFEItem", required = true)
    protected List<CFEInvoiCyType> cfeItem;

    /**
     * Gets the value of the cfeItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cfeItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCFEItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CFEInvoiCyType }
     * 
     * 
     */
    public List<CFEInvoiCyType> getCFEItem() {
        if (cfeItem == null) {
            cfeItem = new ArrayList<CFEInvoiCyType>();
        }
        return this.cfeItem;
    }

}
