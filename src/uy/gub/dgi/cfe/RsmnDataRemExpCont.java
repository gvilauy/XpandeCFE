//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.23 a las 05:37:24 PM UTC 
//


package uy.gub.dgi.cfe;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RsmnData_Rem_Exp_Cont complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RsmnData_Rem_Exp_Cont"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Montos" type="{http://cfe.dgi.gub.uy}Montos_Rem_Exp" minOccurs="0"/&gt;
 *         &lt;element name="CantCFCEmi" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RsmnData_Rem_Exp_Cont", propOrder = {
    "montos",
    "cantCFCEmi"
})
public class RsmnDataRemExpCont {

    @XmlElement(name = "Montos")
    protected MontosRemExp montos;
    @XmlElement(name = "CantCFCEmi", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cantCFCEmi;

    /**
     * Obtiene el valor de la propiedad montos.
     * 
     * @return
     *     possible object is
     *     {@link MontosRemExp }
     *     
     */
    public MontosRemExp getMontos() {
        return montos;
    }

    /**
     * Define el valor de la propiedad montos.
     * 
     * @param value
     *     allowed object is
     *     {@link MontosRemExp }
     *     
     */
    public void setMontos(MontosRemExp value) {
        this.montos = value;
    }

    /**
     * Obtiene el valor de la propiedad cantCFCEmi.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCantCFCEmi() {
        return cantCFCEmi;
    }

    /**
     * Define el valor de la propiedad cantCFCEmi.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCantCFCEmi(BigInteger value) {
        this.cantCFCEmi = value;
    }

}
