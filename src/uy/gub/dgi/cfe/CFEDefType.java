//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.23 a las 05:35:46 PM UTC 
//


package uy.gub.dgi.cfe;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3._2000._09.xmldsig_.SignatureType;


/**
 * Comprobante Fiscal Electronico
 * 
 * <p>Clase Java para CFEDefType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CFEDefType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="eTck"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="TmstFirma" type="{http://cfe.dgi.gub.uy}FechaHoraType"/&gt;
 *                     &lt;element name="Encabezado"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="IdDoc" type="{http://cfe.dgi.gub.uy}IdDoc_Tck"/&gt;
 *                               &lt;element name="Emisor" type="{http://cfe.dgi.gub.uy}Emisor"/&gt;
 *                               &lt;element name="Receptor" type="{http://cfe.dgi.gub.uy}Receptor_Tck" minOccurs="0"/&gt;
 *                               &lt;element name="Totales" type="{http://cfe.dgi.gub.uy}Totales"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="Detalle"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="Item" type="{http://cfe.dgi.gub.uy}Item_Det_Fact" maxOccurs="700"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="SubTotInfo" type="{http://cfe.dgi.gub.uy}SubTotInfo" minOccurs="0"/&gt;
 *                     &lt;element name="DscRcgGlobal" type="{http://cfe.dgi.gub.uy}DscRcgGlobal" minOccurs="0"/&gt;
 *                     &lt;element name="MediosPago" type="{http://cfe.dgi.gub.uy}MediosPago" minOccurs="0"/&gt;
 *                     &lt;element name="Referencia" type="{http://cfe.dgi.gub.uy}Referencia" minOccurs="0"/&gt;
 *                     &lt;element name="CAEData" type="{http://cfe.dgi.gub.uy}CAEDataType"/&gt;
 *                     &lt;element name="Compl_Fiscal" type="{http://cfe.dgi.gub.uy}Compl_FiscalType" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="eFact"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="TmstFirma" type="{http://cfe.dgi.gub.uy}FechaHoraType"/&gt;
 *                     &lt;element name="Encabezado"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="IdDoc" type="{http://cfe.dgi.gub.uy}IdDoc_Fact"/&gt;
 *                               &lt;element name="Emisor" type="{http://cfe.dgi.gub.uy}Emisor"/&gt;
 *                               &lt;element name="Receptor" type="{http://cfe.dgi.gub.uy}Receptor_Fact" minOccurs="0"/&gt;
 *                               &lt;element name="Totales" type="{http://cfe.dgi.gub.uy}Totales"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="Detalle"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="Item" type="{http://cfe.dgi.gub.uy}Item_Det_Fact" maxOccurs="200"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="SubTotInfo" type="{http://cfe.dgi.gub.uy}SubTotInfo" minOccurs="0"/&gt;
 *                     &lt;element name="DscRcgGlobal" type="{http://cfe.dgi.gub.uy}DscRcgGlobal" minOccurs="0"/&gt;
 *                     &lt;element name="MediosPago" type="{http://cfe.dgi.gub.uy}MediosPago" minOccurs="0"/&gt;
 *                     &lt;element name="Referencia" type="{http://cfe.dgi.gub.uy}Referencia" minOccurs="0"/&gt;
 *                     &lt;element name="CAEData" type="{http://cfe.dgi.gub.uy}CAEDataType"/&gt;
 *                     &lt;element name="Compl_Fiscal" type="{http://cfe.dgi.gub.uy}Compl_FiscalType" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="eFact_Exp"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="TmstFirma" type="{http://cfe.dgi.gub.uy}FechaHoraType"/&gt;
 *                     &lt;element name="Encabezado"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="IdDoc" type="{http://cfe.dgi.gub.uy}IdDoc_Fact_Exp"/&gt;
 *                               &lt;element name="Emisor" type="{http://cfe.dgi.gub.uy}Emisor"/&gt;
 *                               &lt;element name="Receptor" type="{http://cfe.dgi.gub.uy}Receptor_Fact_Exp" minOccurs="0"/&gt;
 *                               &lt;element name="Totales" type="{http://cfe.dgi.gub.uy}Totales_Fact_Exp"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="Detalle"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="Item" type="{http://cfe.dgi.gub.uy}Item_Det_Fact_Exp" maxOccurs="200"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="SubTotInfo" type="{http://cfe.dgi.gub.uy}SubTotInfo" minOccurs="0"/&gt;
 *                     &lt;element name="DscRcgGlobal" type="{http://cfe.dgi.gub.uy}DscRcgGlobal" minOccurs="0"/&gt;
 *                     &lt;element name="MediosPago" type="{http://cfe.dgi.gub.uy}MediosPago" minOccurs="0"/&gt;
 *                     &lt;element name="Referencia" type="{http://cfe.dgi.gub.uy}Referencia" minOccurs="0"/&gt;
 *                     &lt;element name="CAEData" type="{http://cfe.dgi.gub.uy}CAEDataType"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="eRem"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="TmstFirma" type="{http://cfe.dgi.gub.uy}FechaHoraType"/&gt;
 *                     &lt;element name="Encabezado"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="IdDoc" type="{http://cfe.dgi.gub.uy}IdDoc_Rem"/&gt;
 *                               &lt;element name="Emisor" type="{http://cfe.dgi.gub.uy}Emisor"/&gt;
 *                               &lt;element name="Receptor" type="{http://cfe.dgi.gub.uy}Receptor_Rem" minOccurs="0"/&gt;
 *                               &lt;element name="Totales"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                       &lt;sequence&gt;
 *                                         &lt;element name="CantLinDet"&gt;
 *                                           &lt;simpleType&gt;
 *                                             &lt;restriction base="{http://cfe.dgi.gub.uy}LineasDetType"&gt;
 *                                               &lt;totalDigits value="3"/&gt;
 *                                               &lt;fractionDigits value="0"/&gt;
 *                                               &lt;maxInclusive value="200"/&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/simpleType&gt;
 *                                         &lt;/element&gt;
 *                                       &lt;/sequence&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="Detalle"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="Item" type="{http://cfe.dgi.gub.uy}Item_Rem" maxOccurs="200"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="SubTotInfo" type="{http://cfe.dgi.gub.uy}SubTotInfo" minOccurs="0"/&gt;
 *                     &lt;element name="Referencia" type="{http://cfe.dgi.gub.uy}Referencia" minOccurs="0"/&gt;
 *                     &lt;element name="CAEData" type="{http://cfe.dgi.gub.uy}CAEDataType"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="eRem_Exp"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="TmstFirma" type="{http://cfe.dgi.gub.uy}FechaHoraType"/&gt;
 *                     &lt;element name="Encabezado"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="IdDoc" type="{http://cfe.dgi.gub.uy}IdDoc_Rem_Exp"/&gt;
 *                               &lt;element name="Emisor" type="{http://cfe.dgi.gub.uy}Emisor"/&gt;
 *                               &lt;element name="Receptor" type="{http://cfe.dgi.gub.uy}Receptor_Rem_Exp" minOccurs="0"/&gt;
 *                               &lt;element name="Totales" type="{http://cfe.dgi.gub.uy}Totales_Rem_Exp"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="Detalle"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="Item" type="{http://cfe.dgi.gub.uy}Item_Rem_Exp" maxOccurs="200"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="SubTotInfo" type="{http://cfe.dgi.gub.uy}SubTotInfo" minOccurs="0"/&gt;
 *                     &lt;element name="Referencia" type="{http://cfe.dgi.gub.uy}Referencia" minOccurs="0"/&gt;
 *                     &lt;element name="CAEData" type="{http://cfe.dgi.gub.uy}CAEDataType"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="eResg"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="TmstFirma" type="{http://cfe.dgi.gub.uy}FechaHoraType"/&gt;
 *                     &lt;element name="Encabezado"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="IdDoc" type="{http://cfe.dgi.gub.uy}IdDoc_Resg"/&gt;
 *                               &lt;element name="Emisor" type="{http://cfe.dgi.gub.uy}Emisor"/&gt;
 *                               &lt;element name="Receptor" type="{http://cfe.dgi.gub.uy}Receptor_Resg" minOccurs="0"/&gt;
 *                               &lt;element name="Totales" type="{http://cfe.dgi.gub.uy}Totales_Resg"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="Detalle"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="Item" type="{http://cfe.dgi.gub.uy}Item_Resg" maxOccurs="200"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="SubTotInfo" type="{http://cfe.dgi.gub.uy}SubTotInfo" minOccurs="0"/&gt;
 *                     &lt;element name="Referencia" type="{http://cfe.dgi.gub.uy}Referencia" minOccurs="0"/&gt;
 *                     &lt;element name="CAEData" type="{http://cfe.dgi.gub.uy}CAEDataType"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="eBoleta"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="TmstFirma" type="{http://cfe.dgi.gub.uy}FechaHoraType"/&gt;
 *                     &lt;element name="Encabezado"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="IdDoc" type="{http://cfe.dgi.gub.uy}IdDoc_Boleta"/&gt;
 *                               &lt;element name="Emisor" type="{http://cfe.dgi.gub.uy}Emisor"/&gt;
 *                               &lt;element name="Receptor" type="{http://cfe.dgi.gub.uy}Receptor_Boleta" minOccurs="0"/&gt;
 *                               &lt;element name="Totales" type="{http://cfe.dgi.gub.uy}Totales_Boleta"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="Detalle"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="Item" type="{http://cfe.dgi.gub.uy}Item_Det_Boleta" maxOccurs="200"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="SubTotInfo" type="{http://cfe.dgi.gub.uy}SubTotInfo" minOccurs="0"/&gt;
 *                     &lt;element name="DscRcgGlobal" type="{http://cfe.dgi.gub.uy}DscRcgGlobal" minOccurs="0"/&gt;
 *                     &lt;element name="MediosPago" type="{http://cfe.dgi.gub.uy}MediosPago" minOccurs="0"/&gt;
 *                     &lt;element name="Referencia" type="{http://cfe.dgi.gub.uy}Referencia" minOccurs="0"/&gt;
 *                     &lt;element name="CAEData" type="{http://cfe.dgi.gub.uy}CAEDataType"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="version" use="required" fixed="1.0"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="3"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "CFE")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CFEDefType", propOrder = {
    "eTck",
    "eFact",
    "eFactExp",
    "eRem",
    "eRemExp",
    "eResg",
    "eBoleta",
    "signature"
})
public class CFEDefType {

    protected ETck eTck;
    protected EFact eFact;
    @XmlElement(name = "eFact_Exp")
    protected EFactExp eFactExp;
    protected ERem eRem;
    @XmlElement(name = "eRem_Exp")
    protected ERemExp eRemExp;
    protected EResg eResg;
    protected EBoleta eBoleta;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Obtiene el valor de la propiedad eTck.
     * 
     * @return
     *     possible object is
     *     {@link ETck }
     *     
     */
    public ETck getETck() {
        return eTck;
    }

    /**
     * Define el valor de la propiedad eTck.
     * 
     * @param value
     *     allowed object is
     *     {@link ETck }
     *     
     */
    public void setETck(ETck value) {
        this.eTck = value;
    }

    /**
     * Obtiene el valor de la propiedad eFact.
     * 
     * @return
     *     possible object is
     *     {@link EFact }
     *     
     */
    public EFact getEFact() {
        return eFact;
    }

    /**
     * Define el valor de la propiedad eFact.
     * 
     * @param value
     *     allowed object is
     *     {@link EFact }
     *     
     */
    public void setEFact(EFact value) {
        this.eFact = value;
    }

    /**
     * Obtiene el valor de la propiedad eFactExp.
     * 
     * @return
     *     possible object is
     *     {@link EFactExp }
     *     
     */
    public EFactExp getEFactExp() {
        return eFactExp;
    }

    /**
     * Define el valor de la propiedad eFactExp.
     * 
     * @param value
     *     allowed object is
     *     {@link EFactExp }
     *     
     */
    public void setEFactExp(EFactExp value) {
        this.eFactExp = value;
    }

    /**
     * Obtiene el valor de la propiedad eRem.
     * 
     * @return
     *     possible object is
     *     {@link ERem }
     *     
     */
    public ERem getERem() {
        return eRem;
    }

    /**
     * Define el valor de la propiedad eRem.
     * 
     * @param value
     *     allowed object is
     *     {@link ERem }
     *     
     */
    public void setERem(ERem value) {
        this.eRem = value;
    }

    /**
     * Obtiene el valor de la propiedad eRemExp.
     * 
     * @return
     *     possible object is
     *     {@link ERemExp }
     *     
     */
    public ERemExp getERemExp() {
        return eRemExp;
    }

    /**
     * Define el valor de la propiedad eRemExp.
     * 
     * @param value
     *     allowed object is
     *     {@link ERemExp }
     *     
     */
    public void setERemExp(ERemExp value) {
        this.eRemExp = value;
    }

    /**
     * Obtiene el valor de la propiedad eResg.
     * 
     * @return
     *     possible object is
     *     {@link EResg }
     *     
     */
    public EResg getEResg() {
        return eResg;
    }

    /**
     * Define el valor de la propiedad eResg.
     * 
     * @param value
     *     allowed object is
     *     {@link EResg }
     *     
     */
    public void setEResg(EResg value) {
        this.eResg = value;
    }

    /**
     * Obtiene el valor de la propiedad eBoleta.
     * 
     * @return
     *     possible object is
     *     {@link EBoleta }
     *     
     */
    public EBoleta getEBoleta() {
        return eBoleta;
    }

    /**
     * Define el valor de la propiedad eBoleta.
     * 
     * @param value
     *     allowed object is
     *     {@link EBoleta }
     *     
     */
    public void setEBoleta(EBoleta value) {
        this.eBoleta = value;
    }

    /**
     * Obtiene el valor de la propiedad signature.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Define el valor de la propiedad signature.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "1.0";
        } else {
            return version;
        }
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
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
     *         &lt;element name="TmstFirma" type="{http://cfe.dgi.gub.uy}FechaHoraType"/&gt;
     *         &lt;element name="Encabezado"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="IdDoc" type="{http://cfe.dgi.gub.uy}IdDoc_Boleta"/&gt;
     *                   &lt;element name="Emisor" type="{http://cfe.dgi.gub.uy}Emisor"/&gt;
     *                   &lt;element name="Receptor" type="{http://cfe.dgi.gub.uy}Receptor_Boleta" minOccurs="0"/&gt;
     *                   &lt;element name="Totales" type="{http://cfe.dgi.gub.uy}Totales_Boleta"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Detalle"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Item" type="{http://cfe.dgi.gub.uy}Item_Det_Boleta" maxOccurs="200"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SubTotInfo" type="{http://cfe.dgi.gub.uy}SubTotInfo" minOccurs="0"/&gt;
     *         &lt;element name="DscRcgGlobal" type="{http://cfe.dgi.gub.uy}DscRcgGlobal" minOccurs="0"/&gt;
     *         &lt;element name="MediosPago" type="{http://cfe.dgi.gub.uy}MediosPago" minOccurs="0"/&gt;
     *         &lt;element name="Referencia" type="{http://cfe.dgi.gub.uy}Referencia" minOccurs="0"/&gt;
     *         &lt;element name="CAEData" type="{http://cfe.dgi.gub.uy}CAEDataType"/&gt;
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
        "tmstFirma",
        "encabezado",
        "detalle",
        "subTotInfo",
        "dscRcgGlobal",
        "mediosPago",
        "referencia",
        "caeData"
    })
    public static class EBoleta {

        @XmlElement(name = "TmstFirma", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar tmstFirma;
        @XmlElement(name = "Encabezado", required = true)
        protected Encabezado encabezado;
        @XmlElement(name = "Detalle", required = true)
        protected Detalle detalle;
        @XmlElement(name = "SubTotInfo")
        protected SubTotInfo subTotInfo;
        @XmlElement(name = "DscRcgGlobal")
        protected DscRcgGlobal dscRcgGlobal;
        @XmlElement(name = "MediosPago")
        protected MediosPago mediosPago;
        @XmlElement(name = "Referencia")
        protected Referencia1 referencia;
        @XmlElement(name = "CAEData", required = true)
        protected CAEDataType caeData;

        /**
         * Obtiene el valor de la propiedad tmstFirma.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTmstFirma() {
            return tmstFirma;
        }

        /**
         * Define el valor de la propiedad tmstFirma.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTmstFirma(XMLGregorianCalendar value) {
            this.tmstFirma = value;
        }

        /**
         * Obtiene el valor de la propiedad encabezado.
         * 
         * @return
         *     possible object is
         *     {@link Encabezado }
         *     
         */
        public Encabezado getEncabezado() {
            return encabezado;
        }

        /**
         * Define el valor de la propiedad encabezado.
         * 
         * @param value
         *     allowed object is
         *     {@link Encabezado }
         *     
         */
        public void setEncabezado(Encabezado value) {
            this.encabezado = value;
        }

        /**
         * Obtiene el valor de la propiedad detalle.
         * 
         * @return
         *     possible object is
         *     {@link Detalle }
         *     
         */
        public Detalle getDetalle() {
            return detalle;
        }

        /**
         * Define el valor de la propiedad detalle.
         * 
         * @param value
         *     allowed object is
         *     {@link Detalle }
         *     
         */
        public void setDetalle(Detalle value) {
            this.detalle = value;
        }

        /**
         * Obtiene el valor de la propiedad subTotInfo.
         * 
         * @return
         *     possible object is
         *     {@link SubTotInfo }
         *     
         */
        public SubTotInfo getSubTotInfo() {
            return subTotInfo;
        }

        /**
         * Define el valor de la propiedad subTotInfo.
         * 
         * @param value
         *     allowed object is
         *     {@link SubTotInfo }
         *     
         */
        public void setSubTotInfo(SubTotInfo value) {
            this.subTotInfo = value;
        }

        /**
         * Obtiene el valor de la propiedad dscRcgGlobal.
         * 
         * @return
         *     possible object is
         *     {@link DscRcgGlobal }
         *     
         */
        public DscRcgGlobal getDscRcgGlobal() {
            return dscRcgGlobal;
        }

        /**
         * Define el valor de la propiedad dscRcgGlobal.
         * 
         * @param value
         *     allowed object is
         *     {@link DscRcgGlobal }
         *     
         */
        public void setDscRcgGlobal(DscRcgGlobal value) {
            this.dscRcgGlobal = value;
        }

        /**
         * Obtiene el valor de la propiedad mediosPago.
         * 
         * @return
         *     possible object is
         *     {@link MediosPago }
         *     
         */
        public MediosPago getMediosPago() {
            return mediosPago;
        }

        /**
         * Define el valor de la propiedad mediosPago.
         * 
         * @param value
         *     allowed object is
         *     {@link MediosPago }
         *     
         */
        public void setMediosPago(MediosPago value) {
            this.mediosPago = value;
        }

        /**
         * Obtiene el valor de la propiedad referencia.
         * 
         * @return
         *     possible object is
         *     {@link Referencia1 }
         *     
         */
        public Referencia1 getReferencia() {
            return referencia;
        }

        /**
         * Define el valor de la propiedad referencia.
         * 
         * @param value
         *     allowed object is
         *     {@link Referencia1 }
         *     
         */
        public void setReferencia(Referencia1 value) {
            this.referencia = value;
        }

        /**
         * Obtiene el valor de la propiedad caeData.
         * 
         * @return
         *     possible object is
         *     {@link CAEDataType }
         *     
         */
        public CAEDataType getCAEData() {
            return caeData;
        }

        /**
         * Define el valor de la propiedad caeData.
         * 
         * @param value
         *     allowed object is
         *     {@link CAEDataType }
         *     
         */
        public void setCAEData(CAEDataType value) {
            this.caeData = value;
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
         *         &lt;element name="Item" type="{http://cfe.dgi.gub.uy}Item_Det_Boleta" maxOccurs="200"/&gt;
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
            "item"
        })
        public static class Detalle {

            @XmlElement(name = "Item", required = true)
            protected List<ItemDetBoleta> item;

            /**
             * Gets the value of the item property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the item property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getItem().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ItemDetBoleta }
             * 
             * 
             */
            public List<ItemDetBoleta> getItem() {
                if (item == null) {
                    item = new ArrayList<ItemDetBoleta>();
                }
                return this.item;
            }

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
         *         &lt;element name="IdDoc" type="{http://cfe.dgi.gub.uy}IdDoc_Boleta"/&gt;
         *         &lt;element name="Emisor" type="{http://cfe.dgi.gub.uy}Emisor"/&gt;
         *         &lt;element name="Receptor" type="{http://cfe.dgi.gub.uy}Receptor_Boleta" minOccurs="0"/&gt;
         *         &lt;element name="Totales" type="{http://cfe.dgi.gub.uy}Totales_Boleta"/&gt;
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
            "idDoc",
            "emisor",
            "receptor",
            "totales"
        })
        public static class Encabezado {

            @XmlElement(name = "IdDoc", required = true)
            protected IdDocBoleta idDoc;
            @XmlElement(name = "Emisor", required = true)
            protected Emisor emisor;
            @XmlElement(name = "Receptor")
            protected ReceptorBoleta receptor;
            @XmlElement(name = "Totales", required = true)
            protected TotalesBoleta totales;

            /**
             * Obtiene el valor de la propiedad idDoc.
             * 
             * @return
             *     possible object is
             *     {@link IdDocBoleta }
             *     
             */
            public IdDocBoleta getIdDoc() {
                return idDoc;
            }

            /**
             * Define el valor de la propiedad idDoc.
             * 
             * @param value
             *     allowed object is
             *     {@link IdDocBoleta }
             *     
             */
            public void setIdDoc(IdDocBoleta value) {
                this.idDoc = value;
            }

            /**
             * Obtiene el valor de la propiedad emisor.
             * 
             * @return
             *     possible object is
             *     {@link Emisor }
             *     
             */
            public Emisor getEmisor() {
                return emisor;
            }

            /**
             * Define el valor de la propiedad emisor.
             * 
             * @param value
             *     allowed object is
             *     {@link Emisor }
             *     
             */
            public void setEmisor(Emisor value) {
                this.emisor = value;
            }

            /**
             * Obtiene el valor de la propiedad receptor.
             * 
             * @return
             *     possible object is
             *     {@link ReceptorBoleta }
             *     
             */
            public ReceptorBoleta getReceptor() {
                return receptor;
            }

            /**
             * Define el valor de la propiedad receptor.
             * 
             * @param value
             *     allowed object is
             *     {@link ReceptorBoleta }
             *     
             */
            public void setReceptor(ReceptorBoleta value) {
                this.receptor = value;
            }

            /**
             * Obtiene el valor de la propiedad totales.
             * 
             * @return
             *     possible object is
             *     {@link TotalesBoleta }
             *     
             */
            public TotalesBoleta getTotales() {
                return totales;
            }

            /**
             * Define el valor de la propiedad totales.
             * 
             * @param value
             *     allowed object is
             *     {@link TotalesBoleta }
             *     
             */
            public void setTotales(TotalesBoleta value) {
                this.totales = value;
            }

        }

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
     *         &lt;element name="TmstFirma" type="{http://cfe.dgi.gub.uy}FechaHoraType"/&gt;
     *         &lt;element name="Encabezado"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="IdDoc" type="{http://cfe.dgi.gub.uy}IdDoc_Fact"/&gt;
     *                   &lt;element name="Emisor" type="{http://cfe.dgi.gub.uy}Emisor"/&gt;
     *                   &lt;element name="Receptor" type="{http://cfe.dgi.gub.uy}Receptor_Fact" minOccurs="0"/&gt;
     *                   &lt;element name="Totales" type="{http://cfe.dgi.gub.uy}Totales"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Detalle"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Item" type="{http://cfe.dgi.gub.uy}Item_Det_Fact" maxOccurs="200"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SubTotInfo" type="{http://cfe.dgi.gub.uy}SubTotInfo" minOccurs="0"/&gt;
     *         &lt;element name="DscRcgGlobal" type="{http://cfe.dgi.gub.uy}DscRcgGlobal" minOccurs="0"/&gt;
     *         &lt;element name="MediosPago" type="{http://cfe.dgi.gub.uy}MediosPago" minOccurs="0"/&gt;
     *         &lt;element name="Referencia" type="{http://cfe.dgi.gub.uy}Referencia" minOccurs="0"/&gt;
     *         &lt;element name="CAEData" type="{http://cfe.dgi.gub.uy}CAEDataType"/&gt;
     *         &lt;element name="Compl_Fiscal" type="{http://cfe.dgi.gub.uy}Compl_FiscalType" minOccurs="0"/&gt;
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
        "tmstFirma",
        "encabezado",
        "detalle",
        "subTotInfo",
        "dscRcgGlobal",
        "mediosPago",
        "referencia",
        "caeData",
        "complFiscal"
    })
    public static class EFact {

        @XmlElement(name = "TmstFirma", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar tmstFirma;
        @XmlElement(name = "Encabezado", required = true)
        protected Encabezado encabezado;
        @XmlElement(name = "Detalle", required = true)
        protected Detalle detalle;
        @XmlElement(name = "SubTotInfo")
        protected SubTotInfo subTotInfo;
        @XmlElement(name = "DscRcgGlobal")
        protected DscRcgGlobal dscRcgGlobal;
        @XmlElement(name = "MediosPago")
        protected MediosPago mediosPago;
        @XmlElement(name = "Referencia")
        protected Referencia1 referencia;
        @XmlElement(name = "CAEData", required = true)
        protected CAEDataType caeData;
        @XmlElement(name = "Compl_Fiscal")
        protected ComplFiscalType complFiscal;

        /**
         * Obtiene el valor de la propiedad tmstFirma.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTmstFirma() {
            return tmstFirma;
        }

        /**
         * Define el valor de la propiedad tmstFirma.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTmstFirma(XMLGregorianCalendar value) {
            this.tmstFirma = value;
        }

        /**
         * Obtiene el valor de la propiedad encabezado.
         * 
         * @return
         *     possible object is
         *     {@link Encabezado }
         *     
         */
        public Encabezado getEncabezado() {
            return encabezado;
        }

        /**
         * Define el valor de la propiedad encabezado.
         * 
         * @param value
         *     allowed object is
         *     {@link Encabezado }
         *     
         */
        public void setEncabezado(Encabezado value) {
            this.encabezado = value;
        }

        /**
         * Obtiene el valor de la propiedad detalle.
         * 
         * @return
         *     possible object is
         *     {@link Detalle }
         *     
         */
        public Detalle getDetalle() {
            return detalle;
        }

        /**
         * Define el valor de la propiedad detalle.
         * 
         * @param value
         *     allowed object is
         *     {@link Detalle }
         *     
         */
        public void setDetalle(Detalle value) {
            this.detalle = value;
        }

        /**
         * Obtiene el valor de la propiedad subTotInfo.
         * 
         * @return
         *     possible object is
         *     {@link SubTotInfo }
         *     
         */
        public SubTotInfo getSubTotInfo() {
            return subTotInfo;
        }

        /**
         * Define el valor de la propiedad subTotInfo.
         * 
         * @param value
         *     allowed object is
         *     {@link SubTotInfo }
         *     
         */
        public void setSubTotInfo(SubTotInfo value) {
            this.subTotInfo = value;
        }

        /**
         * Obtiene el valor de la propiedad dscRcgGlobal.
         * 
         * @return
         *     possible object is
         *     {@link DscRcgGlobal }
         *     
         */
        public DscRcgGlobal getDscRcgGlobal() {
            return dscRcgGlobal;
        }

        /**
         * Define el valor de la propiedad dscRcgGlobal.
         * 
         * @param value
         *     allowed object is
         *     {@link DscRcgGlobal }
         *     
         */
        public void setDscRcgGlobal(DscRcgGlobal value) {
            this.dscRcgGlobal = value;
        }

        /**
         * Obtiene el valor de la propiedad mediosPago.
         * 
         * @return
         *     possible object is
         *     {@link MediosPago }
         *     
         */
        public MediosPago getMediosPago() {
            return mediosPago;
        }

        /**
         * Define el valor de la propiedad mediosPago.
         * 
         * @param value
         *     allowed object is
         *     {@link MediosPago }
         *     
         */
        public void setMediosPago(MediosPago value) {
            this.mediosPago = value;
        }

        /**
         * Obtiene el valor de la propiedad referencia.
         * 
         * @return
         *     possible object is
         *     {@link Referencia1 }
         *     
         */
        public Referencia1 getReferencia() {
            return referencia;
        }

        /**
         * Define el valor de la propiedad referencia.
         * 
         * @param value
         *     allowed object is
         *     {@link Referencia1 }
         *     
         */
        public void setReferencia(Referencia1 value) {
            this.referencia = value;
        }

        /**
         * Obtiene el valor de la propiedad caeData.
         * 
         * @return
         *     possible object is
         *     {@link CAEDataType }
         *     
         */
        public CAEDataType getCAEData() {
            return caeData;
        }

        /**
         * Define el valor de la propiedad caeData.
         * 
         * @param value
         *     allowed object is
         *     {@link CAEDataType }
         *     
         */
        public void setCAEData(CAEDataType value) {
            this.caeData = value;
        }

        /**
         * Obtiene el valor de la propiedad complFiscal.
         * 
         * @return
         *     possible object is
         *     {@link ComplFiscalType }
         *     
         */
        public ComplFiscalType getComplFiscal() {
            return complFiscal;
        }

        /**
         * Define el valor de la propiedad complFiscal.
         * 
         * @param value
         *     allowed object is
         *     {@link ComplFiscalType }
         *     
         */
        public void setComplFiscal(ComplFiscalType value) {
            this.complFiscal = value;
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
         *         &lt;element name="Item" type="{http://cfe.dgi.gub.uy}Item_Det_Fact" maxOccurs="200"/&gt;
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
            "item"
        })
        public static class Detalle {

            @XmlElement(name = "Item", required = true)
            protected List<ItemDetFact> item;

            /**
             * Gets the value of the item property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the item property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getItem().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ItemDetFact }
             * 
             * 
             */
            public List<ItemDetFact> getItem() {
                if (item == null) {
                    item = new ArrayList<ItemDetFact>();
                }
                return this.item;
            }

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
         *         &lt;element name="IdDoc" type="{http://cfe.dgi.gub.uy}IdDoc_Fact"/&gt;
         *         &lt;element name="Emisor" type="{http://cfe.dgi.gub.uy}Emisor"/&gt;
         *         &lt;element name="Receptor" type="{http://cfe.dgi.gub.uy}Receptor_Fact" minOccurs="0"/&gt;
         *         &lt;element name="Totales" type="{http://cfe.dgi.gub.uy}Totales"/&gt;
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
            "idDoc",
            "emisor",
            "receptor",
            "totales"
        })
        public static class Encabezado {

            @XmlElement(name = "IdDoc", required = true)
            protected IdDocFact idDoc;
            @XmlElement(name = "Emisor", required = true)
            protected Emisor emisor;
            @XmlElement(name = "Receptor")
            protected ReceptorFact receptor;
            @XmlElement(name = "Totales", required = true)
            protected Totales totales;

            /**
             * Obtiene el valor de la propiedad idDoc.
             * 
             * @return
             *     possible object is
             *     {@link IdDocFact }
             *     
             */
            public IdDocFact getIdDoc() {
                return idDoc;
            }

            /**
             * Define el valor de la propiedad idDoc.
             * 
             * @param value
             *     allowed object is
             *     {@link IdDocFact }
             *     
             */
            public void setIdDoc(IdDocFact value) {
                this.idDoc = value;
            }

            /**
             * Obtiene el valor de la propiedad emisor.
             * 
             * @return
             *     possible object is
             *     {@link Emisor }
             *     
             */
            public Emisor getEmisor() {
                return emisor;
            }

            /**
             * Define el valor de la propiedad emisor.
             * 
             * @param value
             *     allowed object is
             *     {@link Emisor }
             *     
             */
            public void setEmisor(Emisor value) {
                this.emisor = value;
            }

            /**
             * Obtiene el valor de la propiedad receptor.
             * 
             * @return
             *     possible object is
             *     {@link ReceptorFact }
             *     
             */
            public ReceptorFact getReceptor() {
                return receptor;
            }

            /**
             * Define el valor de la propiedad receptor.
             * 
             * @param value
             *     allowed object is
             *     {@link ReceptorFact }
             *     
             */
            public void setReceptor(ReceptorFact value) {
                this.receptor = value;
            }

            /**
             * Obtiene el valor de la propiedad totales.
             * 
             * @return
             *     possible object is
             *     {@link Totales }
             *     
             */
            public Totales getTotales() {
                return totales;
            }

            /**
             * Define el valor de la propiedad totales.
             * 
             * @param value
             *     allowed object is
             *     {@link Totales }
             *     
             */
            public void setTotales(Totales value) {
                this.totales = value;
            }

        }

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
     *         &lt;element name="TmstFirma" type="{http://cfe.dgi.gub.uy}FechaHoraType"/&gt;
     *         &lt;element name="Encabezado"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="IdDoc" type="{http://cfe.dgi.gub.uy}IdDoc_Fact_Exp"/&gt;
     *                   &lt;element name="Emisor" type="{http://cfe.dgi.gub.uy}Emisor"/&gt;
     *                   &lt;element name="Receptor" type="{http://cfe.dgi.gub.uy}Receptor_Fact_Exp" minOccurs="0"/&gt;
     *                   &lt;element name="Totales" type="{http://cfe.dgi.gub.uy}Totales_Fact_Exp"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Detalle"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Item" type="{http://cfe.dgi.gub.uy}Item_Det_Fact_Exp" maxOccurs="200"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SubTotInfo" type="{http://cfe.dgi.gub.uy}SubTotInfo" minOccurs="0"/&gt;
     *         &lt;element name="DscRcgGlobal" type="{http://cfe.dgi.gub.uy}DscRcgGlobal" minOccurs="0"/&gt;
     *         &lt;element name="MediosPago" type="{http://cfe.dgi.gub.uy}MediosPago" minOccurs="0"/&gt;
     *         &lt;element name="Referencia" type="{http://cfe.dgi.gub.uy}Referencia" minOccurs="0"/&gt;
     *         &lt;element name="CAEData" type="{http://cfe.dgi.gub.uy}CAEDataType"/&gt;
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
        "tmstFirma",
        "encabezado",
        "detalle",
        "subTotInfo",
        "dscRcgGlobal",
        "mediosPago",
        "referencia",
        "caeData"
    })
    public static class EFactExp {

        @XmlElement(name = "TmstFirma", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar tmstFirma;
        @XmlElement(name = "Encabezado", required = true)
        protected Encabezado encabezado;
        @XmlElement(name = "Detalle", required = true)
        protected Detalle detalle;
        @XmlElement(name = "SubTotInfo")
        protected SubTotInfo subTotInfo;
        @XmlElement(name = "DscRcgGlobal")
        protected DscRcgGlobal dscRcgGlobal;
        @XmlElement(name = "MediosPago")
        protected MediosPago mediosPago;
        @XmlElement(name = "Referencia")
        protected Referencia1 referencia;
        @XmlElement(name = "CAEData", required = true)
        protected CAEDataType caeData;

        /**
         * Obtiene el valor de la propiedad tmstFirma.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTmstFirma() {
            return tmstFirma;
        }

        /**
         * Define el valor de la propiedad tmstFirma.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTmstFirma(XMLGregorianCalendar value) {
            this.tmstFirma = value;
        }

        /**
         * Obtiene el valor de la propiedad encabezado.
         * 
         * @return
         *     possible object is
         *     {@link Encabezado }
         *     
         */
        public Encabezado getEncabezado() {
            return encabezado;
        }

        /**
         * Define el valor de la propiedad encabezado.
         * 
         * @param value
         *     allowed object is
         *     {@link Encabezado }
         *     
         */
        public void setEncabezado(Encabezado value) {
            this.encabezado = value;
        }

        /**
         * Obtiene el valor de la propiedad detalle.
         * 
         * @return
         *     possible object is
         *     {@link Detalle }
         *     
         */
        public Detalle getDetalle() {
            return detalle;
        }

        /**
         * Define el valor de la propiedad detalle.
         * 
         * @param value
         *     allowed object is
         *     {@link Detalle }
         *     
         */
        public void setDetalle(Detalle value) {
            this.detalle = value;
        }

        /**
         * Obtiene el valor de la propiedad subTotInfo.
         * 
         * @return
         *     possible object is
         *     {@link SubTotInfo }
         *     
         */
        public SubTotInfo getSubTotInfo() {
            return subTotInfo;
        }

        /**
         * Define el valor de la propiedad subTotInfo.
         * 
         * @param value
         *     allowed object is
         *     {@link SubTotInfo }
         *     
         */
        public void setSubTotInfo(SubTotInfo value) {
            this.subTotInfo = value;
        }

        /**
         * Obtiene el valor de la propiedad dscRcgGlobal.
         * 
         * @return
         *     possible object is
         *     {@link DscRcgGlobal }
         *     
         */
        public DscRcgGlobal getDscRcgGlobal() {
            return dscRcgGlobal;
        }

        /**
         * Define el valor de la propiedad dscRcgGlobal.
         * 
         * @param value
         *     allowed object is
         *     {@link DscRcgGlobal }
         *     
         */
        public void setDscRcgGlobal(DscRcgGlobal value) {
            this.dscRcgGlobal = value;
        }

        /**
         * Obtiene el valor de la propiedad mediosPago.
         * 
         * @return
         *     possible object is
         *     {@link MediosPago }
         *     
         */
        public MediosPago getMediosPago() {
            return mediosPago;
        }

        /**
         * Define el valor de la propiedad mediosPago.
         * 
         * @param value
         *     allowed object is
         *     {@link MediosPago }
         *     
         */
        public void setMediosPago(MediosPago value) {
            this.mediosPago = value;
        }

        /**
         * Obtiene el valor de la propiedad referencia.
         * 
         * @return
         *     possible object is
         *     {@link Referencia1 }
         *     
         */
        public Referencia1 getReferencia() {
            return referencia;
        }

        /**
         * Define el valor de la propiedad referencia.
         * 
         * @param value
         *     allowed object is
         *     {@link Referencia1 }
         *     
         */
        public void setReferencia(Referencia1 value) {
            this.referencia = value;
        }

        /**
         * Obtiene el valor de la propiedad caeData.
         * 
         * @return
         *     possible object is
         *     {@link CAEDataType }
         *     
         */
        public CAEDataType getCAEData() {
            return caeData;
        }

        /**
         * Define el valor de la propiedad caeData.
         * 
         * @param value
         *     allowed object is
         *     {@link CAEDataType }
         *     
         */
        public void setCAEData(CAEDataType value) {
            this.caeData = value;
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
         *         &lt;element name="Item" type="{http://cfe.dgi.gub.uy}Item_Det_Fact_Exp" maxOccurs="200"/&gt;
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
            "item"
        })
        public static class Detalle {

            @XmlElement(name = "Item", required = true)
            protected List<ItemDetFactExp> item;

            /**
             * Gets the value of the item property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the item property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getItem().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ItemDetFactExp }
             * 
             * 
             */
            public List<ItemDetFactExp> getItem() {
                if (item == null) {
                    item = new ArrayList<ItemDetFactExp>();
                }
                return this.item;
            }

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
         *         &lt;element name="IdDoc" type="{http://cfe.dgi.gub.uy}IdDoc_Fact_Exp"/&gt;
         *         &lt;element name="Emisor" type="{http://cfe.dgi.gub.uy}Emisor"/&gt;
         *         &lt;element name="Receptor" type="{http://cfe.dgi.gub.uy}Receptor_Fact_Exp" minOccurs="0"/&gt;
         *         &lt;element name="Totales" type="{http://cfe.dgi.gub.uy}Totales_Fact_Exp"/&gt;
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
            "idDoc",
            "emisor",
            "receptor",
            "totales"
        })
        public static class Encabezado {

            @XmlElement(name = "IdDoc", required = true)
            protected IdDocFactExp idDoc;
            @XmlElement(name = "Emisor", required = true)
            protected Emisor emisor;
            @XmlElement(name = "Receptor")
            protected ReceptorFactExp receptor;
            @XmlElement(name = "Totales", required = true)
            protected TotalesFactExp totales;

            /**
             * Obtiene el valor de la propiedad idDoc.
             * 
             * @return
             *     possible object is
             *     {@link IdDocFactExp }
             *     
             */
            public IdDocFactExp getIdDoc() {
                return idDoc;
            }

            /**
             * Define el valor de la propiedad idDoc.
             * 
             * @param value
             *     allowed object is
             *     {@link IdDocFactExp }
             *     
             */
            public void setIdDoc(IdDocFactExp value) {
                this.idDoc = value;
            }

            /**
             * Obtiene el valor de la propiedad emisor.
             * 
             * @return
             *     possible object is
             *     {@link Emisor }
             *     
             */
            public Emisor getEmisor() {
                return emisor;
            }

            /**
             * Define el valor de la propiedad emisor.
             * 
             * @param value
             *     allowed object is
             *     {@link Emisor }
             *     
             */
            public void setEmisor(Emisor value) {
                this.emisor = value;
            }

            /**
             * Obtiene el valor de la propiedad receptor.
             * 
             * @return
             *     possible object is
             *     {@link ReceptorFactExp }
             *     
             */
            public ReceptorFactExp getReceptor() {
                return receptor;
            }

            /**
             * Define el valor de la propiedad receptor.
             * 
             * @param value
             *     allowed object is
             *     {@link ReceptorFactExp }
             *     
             */
            public void setReceptor(ReceptorFactExp value) {
                this.receptor = value;
            }

            /**
             * Obtiene el valor de la propiedad totales.
             * 
             * @return
             *     possible object is
             *     {@link TotalesFactExp }
             *     
             */
            public TotalesFactExp getTotales() {
                return totales;
            }

            /**
             * Define el valor de la propiedad totales.
             * 
             * @param value
             *     allowed object is
             *     {@link TotalesFactExp }
             *     
             */
            public void setTotales(TotalesFactExp value) {
                this.totales = value;
            }

        }

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
     *         &lt;element name="TmstFirma" type="{http://cfe.dgi.gub.uy}FechaHoraType"/&gt;
     *         &lt;element name="Encabezado"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="IdDoc" type="{http://cfe.dgi.gub.uy}IdDoc_Rem"/&gt;
     *                   &lt;element name="Emisor" type="{http://cfe.dgi.gub.uy}Emisor"/&gt;
     *                   &lt;element name="Receptor" type="{http://cfe.dgi.gub.uy}Receptor_Rem" minOccurs="0"/&gt;
     *                   &lt;element name="Totales"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CantLinDet"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://cfe.dgi.gub.uy}LineasDetType"&gt;
     *                                   &lt;totalDigits value="3"/&gt;
     *                                   &lt;fractionDigits value="0"/&gt;
     *                                   &lt;maxInclusive value="200"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Detalle"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Item" type="{http://cfe.dgi.gub.uy}Item_Rem" maxOccurs="200"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SubTotInfo" type="{http://cfe.dgi.gub.uy}SubTotInfo" minOccurs="0"/&gt;
     *         &lt;element name="Referencia" type="{http://cfe.dgi.gub.uy}Referencia" minOccurs="0"/&gt;
     *         &lt;element name="CAEData" type="{http://cfe.dgi.gub.uy}CAEDataType"/&gt;
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
        "tmstFirma",
        "encabezado",
        "detalle",
        "subTotInfo",
        "referencia",
        "caeData"
    })
    public static class ERem {

        @XmlElement(name = "TmstFirma", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar tmstFirma;
        @XmlElement(name = "Encabezado", required = true)
        protected Encabezado encabezado;
        @XmlElement(name = "Detalle", required = true)
        protected Detalle detalle;
        @XmlElement(name = "SubTotInfo")
        protected SubTotInfo subTotInfo;
        @XmlElement(name = "Referencia")
        protected Referencia1 referencia;
        @XmlElement(name = "CAEData", required = true)
        protected CAEDataType caeData;

        /**
         * Obtiene el valor de la propiedad tmstFirma.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTmstFirma() {
            return tmstFirma;
        }

        /**
         * Define el valor de la propiedad tmstFirma.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTmstFirma(XMLGregorianCalendar value) {
            this.tmstFirma = value;
        }

        /**
         * Obtiene el valor de la propiedad encabezado.
         * 
         * @return
         *     possible object is
         *     {@link Encabezado }
         *     
         */
        public Encabezado getEncabezado() {
            return encabezado;
        }

        /**
         * Define el valor de la propiedad encabezado.
         * 
         * @param value
         *     allowed object is
         *     {@link Encabezado }
         *     
         */
        public void setEncabezado(Encabezado value) {
            this.encabezado = value;
        }

        /**
         * Obtiene el valor de la propiedad detalle.
         * 
         * @return
         *     possible object is
         *     {@link Detalle }
         *     
         */
        public Detalle getDetalle() {
            return detalle;
        }

        /**
         * Define el valor de la propiedad detalle.
         * 
         * @param value
         *     allowed object is
         *     {@link Detalle }
         *     
         */
        public void setDetalle(Detalle value) {
            this.detalle = value;
        }

        /**
         * Obtiene el valor de la propiedad subTotInfo.
         * 
         * @return
         *     possible object is
         *     {@link SubTotInfo }
         *     
         */
        public SubTotInfo getSubTotInfo() {
            return subTotInfo;
        }

        /**
         * Define el valor de la propiedad subTotInfo.
         * 
         * @param value
         *     allowed object is
         *     {@link SubTotInfo }
         *     
         */
        public void setSubTotInfo(SubTotInfo value) {
            this.subTotInfo = value;
        }

        /**
         * Obtiene el valor de la propiedad referencia.
         * 
         * @return
         *     possible object is
         *     {@link Referencia1 }
         *     
         */
        public Referencia1 getReferencia() {
            return referencia;
        }

        /**
         * Define el valor de la propiedad referencia.
         * 
         * @param value
         *     allowed object is
         *     {@link Referencia1 }
         *     
         */
        public void setReferencia(Referencia1 value) {
            this.referencia = value;
        }

        /**
         * Obtiene el valor de la propiedad caeData.
         * 
         * @return
         *     possible object is
         *     {@link CAEDataType }
         *     
         */
        public CAEDataType getCAEData() {
            return caeData;
        }

        /**
         * Define el valor de la propiedad caeData.
         * 
         * @param value
         *     allowed object is
         *     {@link CAEDataType }
         *     
         */
        public void setCAEData(CAEDataType value) {
            this.caeData = value;
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
         *         &lt;element name="Item" type="{http://cfe.dgi.gub.uy}Item_Rem" maxOccurs="200"/&gt;
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
            "item"
        })
        public static class Detalle {

            @XmlElement(name = "Item", required = true)
            protected List<ItemRem> item;

            /**
             * Gets the value of the item property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the item property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getItem().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ItemRem }
             * 
             * 
             */
            public List<ItemRem> getItem() {
                if (item == null) {
                    item = new ArrayList<ItemRem>();
                }
                return this.item;
            }

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
         *         &lt;element name="IdDoc" type="{http://cfe.dgi.gub.uy}IdDoc_Rem"/&gt;
         *         &lt;element name="Emisor" type="{http://cfe.dgi.gub.uy}Emisor"/&gt;
         *         &lt;element name="Receptor" type="{http://cfe.dgi.gub.uy}Receptor_Rem" minOccurs="0"/&gt;
         *         &lt;element name="Totales"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="CantLinDet"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://cfe.dgi.gub.uy}LineasDetType"&gt;
         *                         &lt;totalDigits value="3"/&gt;
         *                         &lt;fractionDigits value="0"/&gt;
         *                         &lt;maxInclusive value="200"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
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
        @XmlType(name = "", propOrder = {
            "idDoc",
            "emisor",
            "receptor",
            "totales"
        })
        public static class Encabezado {

            @XmlElement(name = "IdDoc", required = true)
            protected IdDocRem idDoc;
            @XmlElement(name = "Emisor", required = true)
            protected Emisor emisor;
            @XmlElement(name = "Receptor")
            protected ReceptorRem receptor;
            @XmlElement(name = "Totales", required = true)
            protected Totales totales;

            /**
             * Obtiene el valor de la propiedad idDoc.
             * 
             * @return
             *     possible object is
             *     {@link IdDocRem }
             *     
             */
            public IdDocRem getIdDoc() {
                return idDoc;
            }

            /**
             * Define el valor de la propiedad idDoc.
             * 
             * @param value
             *     allowed object is
             *     {@link IdDocRem }
             *     
             */
            public void setIdDoc(IdDocRem value) {
                this.idDoc = value;
            }

            /**
             * Obtiene el valor de la propiedad emisor.
             * 
             * @return
             *     possible object is
             *     {@link Emisor }
             *     
             */
            public Emisor getEmisor() {
                return emisor;
            }

            /**
             * Define el valor de la propiedad emisor.
             * 
             * @param value
             *     allowed object is
             *     {@link Emisor }
             *     
             */
            public void setEmisor(Emisor value) {
                this.emisor = value;
            }

            /**
             * Obtiene el valor de la propiedad receptor.
             * 
             * @return
             *     possible object is
             *     {@link ReceptorRem }
             *     
             */
            public ReceptorRem getReceptor() {
                return receptor;
            }

            /**
             * Define el valor de la propiedad receptor.
             * 
             * @param value
             *     allowed object is
             *     {@link ReceptorRem }
             *     
             */
            public void setReceptor(ReceptorRem value) {
                this.receptor = value;
            }

            /**
             * Obtiene el valor de la propiedad totales.
             * 
             * @return
             *     possible object is
             *     {@link Totales }
             *     
             */
            public Totales getTotales() {
                return totales;
            }

            /**
             * Define el valor de la propiedad totales.
             * 
             * @param value
             *     allowed object is
             *     {@link Totales }
             *     
             */
            public void setTotales(Totales value) {
                this.totales = value;
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
             *         &lt;element name="CantLinDet"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://cfe.dgi.gub.uy}LineasDetType"&gt;
             *               &lt;totalDigits value="3"/&gt;
             *               &lt;fractionDigits value="0"/&gt;
             *               &lt;maxInclusive value="200"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
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
            @XmlType(name = "", propOrder = {
                "cantLinDet"
            })
            public static class Totales {

                @XmlElement(name = "CantLinDet")
                protected int cantLinDet;

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

            }

        }

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
     *         &lt;element name="TmstFirma" type="{http://cfe.dgi.gub.uy}FechaHoraType"/&gt;
     *         &lt;element name="Encabezado"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="IdDoc" type="{http://cfe.dgi.gub.uy}IdDoc_Rem_Exp"/&gt;
     *                   &lt;element name="Emisor" type="{http://cfe.dgi.gub.uy}Emisor"/&gt;
     *                   &lt;element name="Receptor" type="{http://cfe.dgi.gub.uy}Receptor_Rem_Exp" minOccurs="0"/&gt;
     *                   &lt;element name="Totales" type="{http://cfe.dgi.gub.uy}Totales_Rem_Exp"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Detalle"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Item" type="{http://cfe.dgi.gub.uy}Item_Rem_Exp" maxOccurs="200"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SubTotInfo" type="{http://cfe.dgi.gub.uy}SubTotInfo" minOccurs="0"/&gt;
     *         &lt;element name="Referencia" type="{http://cfe.dgi.gub.uy}Referencia" minOccurs="0"/&gt;
     *         &lt;element name="CAEData" type="{http://cfe.dgi.gub.uy}CAEDataType"/&gt;
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
        "tmstFirma",
        "encabezado",
        "detalle",
        "subTotInfo",
        "referencia",
        "caeData"
    })
    public static class ERemExp {

        @XmlElement(name = "TmstFirma", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar tmstFirma;
        @XmlElement(name = "Encabezado", required = true)
        protected Encabezado encabezado;
        @XmlElement(name = "Detalle", required = true)
        protected Detalle detalle;
        @XmlElement(name = "SubTotInfo")
        protected SubTotInfo subTotInfo;
        @XmlElement(name = "Referencia")
        protected Referencia1 referencia;
        @XmlElement(name = "CAEData", required = true)
        protected CAEDataType caeData;

        /**
         * Obtiene el valor de la propiedad tmstFirma.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTmstFirma() {
            return tmstFirma;
        }

        /**
         * Define el valor de la propiedad tmstFirma.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTmstFirma(XMLGregorianCalendar value) {
            this.tmstFirma = value;
        }

        /**
         * Obtiene el valor de la propiedad encabezado.
         * 
         * @return
         *     possible object is
         *     {@link Encabezado }
         *     
         */
        public Encabezado getEncabezado() {
            return encabezado;
        }

        /**
         * Define el valor de la propiedad encabezado.
         * 
         * @param value
         *     allowed object is
         *     {@link Encabezado }
         *     
         */
        public void setEncabezado(Encabezado value) {
            this.encabezado = value;
        }

        /**
         * Obtiene el valor de la propiedad detalle.
         * 
         * @return
         *     possible object is
         *     {@link Detalle }
         *     
         */
        public Detalle getDetalle() {
            return detalle;
        }

        /**
         * Define el valor de la propiedad detalle.
         * 
         * @param value
         *     allowed object is
         *     {@link Detalle }
         *     
         */
        public void setDetalle(Detalle value) {
            this.detalle = value;
        }

        /**
         * Obtiene el valor de la propiedad subTotInfo.
         * 
         * @return
         *     possible object is
         *     {@link SubTotInfo }
         *     
         */
        public SubTotInfo getSubTotInfo() {
            return subTotInfo;
        }

        /**
         * Define el valor de la propiedad subTotInfo.
         * 
         * @param value
         *     allowed object is
         *     {@link SubTotInfo }
         *     
         */
        public void setSubTotInfo(SubTotInfo value) {
            this.subTotInfo = value;
        }

        /**
         * Obtiene el valor de la propiedad referencia.
         * 
         * @return
         *     possible object is
         *     {@link Referencia1 }
         *     
         */
        public Referencia1 getReferencia() {
            return referencia;
        }

        /**
         * Define el valor de la propiedad referencia.
         * 
         * @param value
         *     allowed object is
         *     {@link Referencia1 }
         *     
         */
        public void setReferencia(Referencia1 value) {
            this.referencia = value;
        }

        /**
         * Obtiene el valor de la propiedad caeData.
         * 
         * @return
         *     possible object is
         *     {@link CAEDataType }
         *     
         */
        public CAEDataType getCAEData() {
            return caeData;
        }

        /**
         * Define el valor de la propiedad caeData.
         * 
         * @param value
         *     allowed object is
         *     {@link CAEDataType }
         *     
         */
        public void setCAEData(CAEDataType value) {
            this.caeData = value;
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
         *         &lt;element name="Item" type="{http://cfe.dgi.gub.uy}Item_Rem_Exp" maxOccurs="200"/&gt;
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
            "item"
        })
        public static class Detalle {

            @XmlElement(name = "Item", required = true)
            protected List<ItemRemExp> item;

            /**
             * Gets the value of the item property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the item property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getItem().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ItemRemExp }
             * 
             * 
             */
            public List<ItemRemExp> getItem() {
                if (item == null) {
                    item = new ArrayList<ItemRemExp>();
                }
                return this.item;
            }

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
         *         &lt;element name="IdDoc" type="{http://cfe.dgi.gub.uy}IdDoc_Rem_Exp"/&gt;
         *         &lt;element name="Emisor" type="{http://cfe.dgi.gub.uy}Emisor"/&gt;
         *         &lt;element name="Receptor" type="{http://cfe.dgi.gub.uy}Receptor_Rem_Exp" minOccurs="0"/&gt;
         *         &lt;element name="Totales" type="{http://cfe.dgi.gub.uy}Totales_Rem_Exp"/&gt;
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
            "idDoc",
            "emisor",
            "receptor",
            "totales"
        })
        public static class Encabezado {

            @XmlElement(name = "IdDoc", required = true)
            protected IdDocRemExp idDoc;
            @XmlElement(name = "Emisor", required = true)
            protected Emisor emisor;
            @XmlElement(name = "Receptor")
            protected ReceptorRemExp receptor;
            @XmlElement(name = "Totales", required = true)
            protected TotalesRemExp totales;

            /**
             * Obtiene el valor de la propiedad idDoc.
             * 
             * @return
             *     possible object is
             *     {@link IdDocRemExp }
             *     
             */
            public IdDocRemExp getIdDoc() {
                return idDoc;
            }

            /**
             * Define el valor de la propiedad idDoc.
             * 
             * @param value
             *     allowed object is
             *     {@link IdDocRemExp }
             *     
             */
            public void setIdDoc(IdDocRemExp value) {
                this.idDoc = value;
            }

            /**
             * Obtiene el valor de la propiedad emisor.
             * 
             * @return
             *     possible object is
             *     {@link Emisor }
             *     
             */
            public Emisor getEmisor() {
                return emisor;
            }

            /**
             * Define el valor de la propiedad emisor.
             * 
             * @param value
             *     allowed object is
             *     {@link Emisor }
             *     
             */
            public void setEmisor(Emisor value) {
                this.emisor = value;
            }

            /**
             * Obtiene el valor de la propiedad receptor.
             * 
             * @return
             *     possible object is
             *     {@link ReceptorRemExp }
             *     
             */
            public ReceptorRemExp getReceptor() {
                return receptor;
            }

            /**
             * Define el valor de la propiedad receptor.
             * 
             * @param value
             *     allowed object is
             *     {@link ReceptorRemExp }
             *     
             */
            public void setReceptor(ReceptorRemExp value) {
                this.receptor = value;
            }

            /**
             * Obtiene el valor de la propiedad totales.
             * 
             * @return
             *     possible object is
             *     {@link TotalesRemExp }
             *     
             */
            public TotalesRemExp getTotales() {
                return totales;
            }

            /**
             * Define el valor de la propiedad totales.
             * 
             * @param value
             *     allowed object is
             *     {@link TotalesRemExp }
             *     
             */
            public void setTotales(TotalesRemExp value) {
                this.totales = value;
            }

        }

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
     *         &lt;element name="TmstFirma" type="{http://cfe.dgi.gub.uy}FechaHoraType"/&gt;
     *         &lt;element name="Encabezado"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="IdDoc" type="{http://cfe.dgi.gub.uy}IdDoc_Resg"/&gt;
     *                   &lt;element name="Emisor" type="{http://cfe.dgi.gub.uy}Emisor"/&gt;
     *                   &lt;element name="Receptor" type="{http://cfe.dgi.gub.uy}Receptor_Resg" minOccurs="0"/&gt;
     *                   &lt;element name="Totales" type="{http://cfe.dgi.gub.uy}Totales_Resg"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Detalle"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Item" type="{http://cfe.dgi.gub.uy}Item_Resg" maxOccurs="200"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SubTotInfo" type="{http://cfe.dgi.gub.uy}SubTotInfo" minOccurs="0"/&gt;
     *         &lt;element name="Referencia" type="{http://cfe.dgi.gub.uy}Referencia" minOccurs="0"/&gt;
     *         &lt;element name="CAEData" type="{http://cfe.dgi.gub.uy}CAEDataType"/&gt;
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
        "tmstFirma",
        "encabezado",
        "detalle",
        "subTotInfo",
        "referencia",
        "caeData"
    })
    public static class EResg {

        @XmlElement(name = "TmstFirma", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar tmstFirma;
        @XmlElement(name = "Encabezado", required = true)
        protected Encabezado encabezado;
        @XmlElement(name = "Detalle", required = true)
        protected Detalle detalle;
        @XmlElement(name = "SubTotInfo")
        protected SubTotInfo subTotInfo;
        @XmlElement(name = "Referencia")
        protected Referencia1 referencia;
        @XmlElement(name = "CAEData", required = true)
        protected CAEDataType caeData;

        /**
         * Obtiene el valor de la propiedad tmstFirma.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTmstFirma() {
            return tmstFirma;
        }

        /**
         * Define el valor de la propiedad tmstFirma.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTmstFirma(XMLGregorianCalendar value) {
            this.tmstFirma = value;
        }

        /**
         * Obtiene el valor de la propiedad encabezado.
         * 
         * @return
         *     possible object is
         *     {@link Encabezado }
         *     
         */
        public Encabezado getEncabezado() {
            return encabezado;
        }

        /**
         * Define el valor de la propiedad encabezado.
         * 
         * @param value
         *     allowed object is
         *     {@link Encabezado }
         *     
         */
        public void setEncabezado(Encabezado value) {
            this.encabezado = value;
        }

        /**
         * Obtiene el valor de la propiedad detalle.
         * 
         * @return
         *     possible object is
         *     {@link Detalle }
         *     
         */
        public Detalle getDetalle() {
            return detalle;
        }

        /**
         * Define el valor de la propiedad detalle.
         * 
         * @param value
         *     allowed object is
         *     {@link Detalle }
         *     
         */
        public void setDetalle(Detalle value) {
            this.detalle = value;
        }

        /**
         * Obtiene el valor de la propiedad subTotInfo.
         * 
         * @return
         *     possible object is
         *     {@link SubTotInfo }
         *     
         */
        public SubTotInfo getSubTotInfo() {
            return subTotInfo;
        }

        /**
         * Define el valor de la propiedad subTotInfo.
         * 
         * @param value
         *     allowed object is
         *     {@link SubTotInfo }
         *     
         */
        public void setSubTotInfo(SubTotInfo value) {
            this.subTotInfo = value;
        }

        /**
         * Obtiene el valor de la propiedad referencia.
         * 
         * @return
         *     possible object is
         *     {@link Referencia1 }
         *     
         */
        public Referencia1 getReferencia() {
            return referencia;
        }

        /**
         * Define el valor de la propiedad referencia.
         * 
         * @param value
         *     allowed object is
         *     {@link Referencia1 }
         *     
         */
        public void setReferencia(Referencia1 value) {
            this.referencia = value;
        }

        /**
         * Obtiene el valor de la propiedad caeData.
         * 
         * @return
         *     possible object is
         *     {@link CAEDataType }
         *     
         */
        public CAEDataType getCAEData() {
            return caeData;
        }

        /**
         * Define el valor de la propiedad caeData.
         * 
         * @param value
         *     allowed object is
         *     {@link CAEDataType }
         *     
         */
        public void setCAEData(CAEDataType value) {
            this.caeData = value;
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
         *         &lt;element name="Item" type="{http://cfe.dgi.gub.uy}Item_Resg" maxOccurs="200"/&gt;
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
            "item"
        })
        public static class Detalle {

            @XmlElement(name = "Item", required = true)
            protected List<ItemResg> item;

            /**
             * Gets the value of the item property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the item property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getItem().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ItemResg }
             * 
             * 
             */
            public List<ItemResg> getItem() {
                if (item == null) {
                    item = new ArrayList<ItemResg>();
                }
                return this.item;
            }

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
         *         &lt;element name="IdDoc" type="{http://cfe.dgi.gub.uy}IdDoc_Resg"/&gt;
         *         &lt;element name="Emisor" type="{http://cfe.dgi.gub.uy}Emisor"/&gt;
         *         &lt;element name="Receptor" type="{http://cfe.dgi.gub.uy}Receptor_Resg" minOccurs="0"/&gt;
         *         &lt;element name="Totales" type="{http://cfe.dgi.gub.uy}Totales_Resg"/&gt;
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
            "idDoc",
            "emisor",
            "receptor",
            "totales"
        })
        public static class Encabezado {

            @XmlElement(name = "IdDoc", required = true)
            protected IdDocResg idDoc;
            @XmlElement(name = "Emisor", required = true)
            protected Emisor emisor;
            @XmlElement(name = "Receptor")
            protected ReceptorResg receptor;
            @XmlElement(name = "Totales", required = true)
            protected TotalesResg totales;

            /**
             * Obtiene el valor de la propiedad idDoc.
             * 
             * @return
             *     possible object is
             *     {@link IdDocResg }
             *     
             */
            public IdDocResg getIdDoc() {
                return idDoc;
            }

            /**
             * Define el valor de la propiedad idDoc.
             * 
             * @param value
             *     allowed object is
             *     {@link IdDocResg }
             *     
             */
            public void setIdDoc(IdDocResg value) {
                this.idDoc = value;
            }

            /**
             * Obtiene el valor de la propiedad emisor.
             * 
             * @return
             *     possible object is
             *     {@link Emisor }
             *     
             */
            public Emisor getEmisor() {
                return emisor;
            }

            /**
             * Define el valor de la propiedad emisor.
             * 
             * @param value
             *     allowed object is
             *     {@link Emisor }
             *     
             */
            public void setEmisor(Emisor value) {
                this.emisor = value;
            }

            /**
             * Obtiene el valor de la propiedad receptor.
             * 
             * @return
             *     possible object is
             *     {@link ReceptorResg }
             *     
             */
            public ReceptorResg getReceptor() {
                return receptor;
            }

            /**
             * Define el valor de la propiedad receptor.
             * 
             * @param value
             *     allowed object is
             *     {@link ReceptorResg }
             *     
             */
            public void setReceptor(ReceptorResg value) {
                this.receptor = value;
            }

            /**
             * Obtiene el valor de la propiedad totales.
             * 
             * @return
             *     possible object is
             *     {@link TotalesResg }
             *     
             */
            public TotalesResg getTotales() {
                return totales;
            }

            /**
             * Define el valor de la propiedad totales.
             * 
             * @param value
             *     allowed object is
             *     {@link TotalesResg }
             *     
             */
            public void setTotales(TotalesResg value) {
                this.totales = value;
            }

        }

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
     *         &lt;element name="TmstFirma" type="{http://cfe.dgi.gub.uy}FechaHoraType"/&gt;
     *         &lt;element name="Encabezado"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="IdDoc" type="{http://cfe.dgi.gub.uy}IdDoc_Tck"/&gt;
     *                   &lt;element name="Emisor" type="{http://cfe.dgi.gub.uy}Emisor"/&gt;
     *                   &lt;element name="Receptor" type="{http://cfe.dgi.gub.uy}Receptor_Tck" minOccurs="0"/&gt;
     *                   &lt;element name="Totales" type="{http://cfe.dgi.gub.uy}Totales"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Detalle"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Item" type="{http://cfe.dgi.gub.uy}Item_Det_Fact" maxOccurs="700"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SubTotInfo" type="{http://cfe.dgi.gub.uy}SubTotInfo" minOccurs="0"/&gt;
     *         &lt;element name="DscRcgGlobal" type="{http://cfe.dgi.gub.uy}DscRcgGlobal" minOccurs="0"/&gt;
     *         &lt;element name="MediosPago" type="{http://cfe.dgi.gub.uy}MediosPago" minOccurs="0"/&gt;
     *         &lt;element name="Referencia" type="{http://cfe.dgi.gub.uy}Referencia" minOccurs="0"/&gt;
     *         &lt;element name="CAEData" type="{http://cfe.dgi.gub.uy}CAEDataType"/&gt;
     *         &lt;element name="Compl_Fiscal" type="{http://cfe.dgi.gub.uy}Compl_FiscalType" minOccurs="0"/&gt;
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
        "tmstFirma",
        "encabezado",
        "detalle",
        "subTotInfo",
        "dscRcgGlobal",
        "mediosPago",
        "referencia",
        "caeData",
        "complFiscal"
    })
    public static class ETck {

        @XmlElement(name = "TmstFirma", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar tmstFirma;
        @XmlElement(name = "Encabezado", required = true)
        protected Encabezado encabezado;
        @XmlElement(name = "Detalle", required = true)
        protected Detalle detalle;
        @XmlElement(name = "SubTotInfo")
        protected SubTotInfo subTotInfo;
        @XmlElement(name = "DscRcgGlobal")
        protected DscRcgGlobal dscRcgGlobal;
        @XmlElement(name = "MediosPago")
        protected MediosPago mediosPago;
        @XmlElement(name = "Referencia")
        protected Referencia1 referencia;
        @XmlElement(name = "CAEData", required = true)
        protected CAEDataType caeData;
        @XmlElement(name = "Compl_Fiscal")
        protected ComplFiscalType complFiscal;

        /**
         * Obtiene el valor de la propiedad tmstFirma.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTmstFirma() {
            return tmstFirma;
        }

        /**
         * Define el valor de la propiedad tmstFirma.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTmstFirma(XMLGregorianCalendar value) {
            this.tmstFirma = value;
        }

        /**
         * Obtiene el valor de la propiedad encabezado.
         * 
         * @return
         *     possible object is
         *     {@link Encabezado }
         *     
         */
        public Encabezado getEncabezado() {
            return encabezado;
        }

        /**
         * Define el valor de la propiedad encabezado.
         * 
         * @param value
         *     allowed object is
         *     {@link Encabezado }
         *     
         */
        public void setEncabezado(Encabezado value) {
            this.encabezado = value;
        }

        /**
         * Obtiene el valor de la propiedad detalle.
         * 
         * @return
         *     possible object is
         *     {@link Detalle }
         *     
         */
        public Detalle getDetalle() {
            return detalle;
        }

        /**
         * Define el valor de la propiedad detalle.
         * 
         * @param value
         *     allowed object is
         *     {@link Detalle }
         *     
         */
        public void setDetalle(Detalle value) {
            this.detalle = value;
        }

        /**
         * Obtiene el valor de la propiedad subTotInfo.
         * 
         * @return
         *     possible object is
         *     {@link SubTotInfo }
         *     
         */
        public SubTotInfo getSubTotInfo() {
            return subTotInfo;
        }

        /**
         * Define el valor de la propiedad subTotInfo.
         * 
         * @param value
         *     allowed object is
         *     {@link SubTotInfo }
         *     
         */
        public void setSubTotInfo(SubTotInfo value) {
            this.subTotInfo = value;
        }

        /**
         * Obtiene el valor de la propiedad dscRcgGlobal.
         * 
         * @return
         *     possible object is
         *     {@link DscRcgGlobal }
         *     
         */
        public DscRcgGlobal getDscRcgGlobal() {
            return dscRcgGlobal;
        }

        /**
         * Define el valor de la propiedad dscRcgGlobal.
         * 
         * @param value
         *     allowed object is
         *     {@link DscRcgGlobal }
         *     
         */
        public void setDscRcgGlobal(DscRcgGlobal value) {
            this.dscRcgGlobal = value;
        }

        /**
         * Obtiene el valor de la propiedad mediosPago.
         * 
         * @return
         *     possible object is
         *     {@link MediosPago }
         *     
         */
        public MediosPago getMediosPago() {
            return mediosPago;
        }

        /**
         * Define el valor de la propiedad mediosPago.
         * 
         * @param value
         *     allowed object is
         *     {@link MediosPago }
         *     
         */
        public void setMediosPago(MediosPago value) {
            this.mediosPago = value;
        }

        /**
         * Obtiene el valor de la propiedad referencia.
         * 
         * @return
         *     possible object is
         *     {@link Referencia1 }
         *     
         */
        public Referencia1 getReferencia() {
            return referencia;
        }

        /**
         * Define el valor de la propiedad referencia.
         * 
         * @param value
         *     allowed object is
         *     {@link Referencia1 }
         *     
         */
        public void setReferencia(Referencia1 value) {
            this.referencia = value;
        }

        /**
         * Obtiene el valor de la propiedad caeData.
         * 
         * @return
         *     possible object is
         *     {@link CAEDataType }
         *     
         */
        public CAEDataType getCAEData() {
            return caeData;
        }

        /**
         * Define el valor de la propiedad caeData.
         * 
         * @param value
         *     allowed object is
         *     {@link CAEDataType }
         *     
         */
        public void setCAEData(CAEDataType value) {
            this.caeData = value;
        }

        /**
         * Obtiene el valor de la propiedad complFiscal.
         * 
         * @return
         *     possible object is
         *     {@link ComplFiscalType }
         *     
         */
        public ComplFiscalType getComplFiscal() {
            return complFiscal;
        }

        /**
         * Define el valor de la propiedad complFiscal.
         * 
         * @param value
         *     allowed object is
         *     {@link ComplFiscalType }
         *     
         */
        public void setComplFiscal(ComplFiscalType value) {
            this.complFiscal = value;
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
         *         &lt;element name="Item" type="{http://cfe.dgi.gub.uy}Item_Det_Fact" maxOccurs="700"/&gt;
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
            "item"
        })
        public static class Detalle {

            @XmlElement(name = "Item", required = true)
            protected List<ItemDetFact> item;

            /**
             * Gets the value of the item property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the item property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getItem().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ItemDetFact }
             * 
             * 
             */
            public List<ItemDetFact> getItem() {
                if (item == null) {
                    item = new ArrayList<ItemDetFact>();
                }
                return this.item;
            }

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
         *         &lt;element name="IdDoc" type="{http://cfe.dgi.gub.uy}IdDoc_Tck"/&gt;
         *         &lt;element name="Emisor" type="{http://cfe.dgi.gub.uy}Emisor"/&gt;
         *         &lt;element name="Receptor" type="{http://cfe.dgi.gub.uy}Receptor_Tck" minOccurs="0"/&gt;
         *         &lt;element name="Totales" type="{http://cfe.dgi.gub.uy}Totales"/&gt;
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
            "idDoc",
            "emisor",
            "receptor",
            "totales"
        })
        public static class Encabezado {

            @XmlElement(name = "IdDoc", required = true)
            protected IdDocTck idDoc;
            @XmlElement(name = "Emisor", required = true)
            protected Emisor emisor;
            @XmlElement(name = "Receptor")
            protected ReceptorTck receptor;
            @XmlElement(name = "Totales", required = true)
            protected Totales totales;

            /**
             * Obtiene el valor de la propiedad idDoc.
             * 
             * @return
             *     possible object is
             *     {@link IdDocTck }
             *     
             */
            public IdDocTck getIdDoc() {
                return idDoc;
            }

            /**
             * Define el valor de la propiedad idDoc.
             * 
             * @param value
             *     allowed object is
             *     {@link IdDocTck }
             *     
             */
            public void setIdDoc(IdDocTck value) {
                this.idDoc = value;
            }

            /**
             * Obtiene el valor de la propiedad emisor.
             * 
             * @return
             *     possible object is
             *     {@link Emisor }
             *     
             */
            public Emisor getEmisor() {
                return emisor;
            }

            /**
             * Define el valor de la propiedad emisor.
             * 
             * @param value
             *     allowed object is
             *     {@link Emisor }
             *     
             */
            public void setEmisor(Emisor value) {
                this.emisor = value;
            }

            /**
             * Obtiene el valor de la propiedad receptor.
             * 
             * @return
             *     possible object is
             *     {@link ReceptorTck }
             *     
             */
            public ReceptorTck getReceptor() {
                return receptor;
            }

            /**
             * Define el valor de la propiedad receptor.
             * 
             * @param value
             *     allowed object is
             *     {@link ReceptorTck }
             *     
             */
            public void setReceptor(ReceptorTck value) {
                this.receptor = value;
            }

            /**
             * Obtiene el valor de la propiedad totales.
             * 
             * @return
             *     possible object is
             *     {@link Totales }
             *     
             */
            public Totales getTotales() {
                return totales;
            }

            /**
             * Define el valor de la propiedad totales.
             * 
             * @param value
             *     allowed object is
             *     {@link Totales }
             *     
             */
            public void setTotales(Totales value) {
                this.totales = value;
            }

        }

    }

}
