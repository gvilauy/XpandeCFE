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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3._2000._09.xmldsig_.SignatureType;


/**
 * <p>Clase Java para ReporteDefType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ReporteDefType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Caratula"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RUCEmisor" type="{http://cfe.dgi.gub.uy}RUCType"/&gt;
 *                   &lt;element name="FechaResumen"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}FechaType"&gt;
 *                         &lt;minInclusive value="2011-10-01"/&gt;
 *                         &lt;maxInclusive value="2050-12-31"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IDEmisor" type="{http://cfe.dgi.gub.uy}IDRecEmiType" minOccurs="0"/&gt;
 *                   &lt;element name="SecEnvio"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                         &lt;minInclusive value="0"/&gt;
 *                         &lt;totalDigits value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TmstFirmaEnv" type="{http://cfe.dgi.gub.uy}FechaHoraType"/&gt;
 *                   &lt;element name="CantComprobantes"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                         &lt;minInclusive value="0"/&gt;
 *                         &lt;totalDigits value="10"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="version" use="required" fixed="1.0"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;maxLength value="3"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rsmn_Tck" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoComp"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
 *                         &lt;enumeration value="101"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Tck"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rsmn_Tck_Nota_Credito" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoComp"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
 *                         &lt;enumeration value="102"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Tck"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rsmn_Tck_Nota_Debito" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoComp"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
 *                         &lt;enumeration value="103"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Tck"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rsmn_Tck_Cont" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoComp"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
 *                         &lt;enumeration value="201"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Tck_Cont"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rsmn_Tck_Cont_Nota_Credito" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoComp"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
 *                         &lt;enumeration value="202"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Tck_Cont"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rsmn_Tck_Cont_Nota_Debito" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoComp"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
 *                         &lt;enumeration value="203"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Tck_Cont"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rsmn_Tck_CtaAj" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoComp"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
 *                         &lt;enumeration value="131"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Tck"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rsmn_Tck_Nota_Credito_CtaAj" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoComp"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
 *                         &lt;enumeration value="132"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Tck"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rsmn_Tck_Nota_Debito_CtaAj" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoComp"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
 *                         &lt;enumeration value="133"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Tck"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rsmn_Tck_CtaAj_Cont" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoComp"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
 *                         &lt;enumeration value="231"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Tck_Cont"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rsmn_Tck_CtaAj_Cont_Nota_Credito" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoComp"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
 *                         &lt;enumeration value="232"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Tck_Cont"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rsmn_Tck_CtaAj_Cont_Nota_Debito" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoComp"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
 *                         &lt;enumeration value="233"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Tck_Cont"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rsmn_Fac" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoComp"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
 *                         &lt;enumeration value="111"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Fac"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rsmn_Fac_Nota_Credito" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoComp"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
 *                         &lt;enumeration value="112"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Fac"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rsmn_Fac_Nota_Debito" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoComp"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
 *                         &lt;enumeration value="113"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Fac"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rsmn_Fac_Cont" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoComp"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
 *                         &lt;enumeration value="211"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Fac_Cont"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rsmn_Fac_Cont_Nota_Credito" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoComp"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
 *                         &lt;enumeration value="212"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Fac_Cont"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rsmn_Fac_Cont_Nota_Debito" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoComp"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
 *                         &lt;enumeration value="213"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Fac_Cont"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rsmn_Fac_CtaAj" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoComp"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
 *                         &lt;enumeration value="141"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Fac"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rsmn_Fac_Nota_Credito_CtaAj" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoComp"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
 *                         &lt;enumeration value="142"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Fac"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rsmn_Fac_Nota_Debito_CtaAj" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoComp"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
 *                         &lt;enumeration value="143"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Fac"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rsmn_Fac_CtaAj_Cont" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoComp"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
 *                         &lt;enumeration value="241"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Fac_Cont"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rsmn_Fac_CtaAj_Cont_Nota_Credito" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoComp"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
 *                         &lt;enumeration value="242"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Fac_Cont"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rsmn_Fac_CtaAj_Cont_Nota_Debito" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoComp"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
 *                         &lt;enumeration value="243"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Fac_Cont"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rsmn_Fac_Exp" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoComp"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
 *                         &lt;enumeration value="121"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Fac_Exp"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rsmn_Fac_Exp_Nota_Credito" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoComp"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
 *                         &lt;enumeration value="122"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Fac_Exp"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rsmn_Fac_Exp_Nota_Debito" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoComp"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
 *                         &lt;enumeration value="123"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Fac_Exp"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rsmn_Fac_Exp_Cont" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoComp"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
 *                         &lt;enumeration value="221"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Fac_Exp_Cont"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rsmn_Fac_Exp_Cont_Nota_Credito" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoComp"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
 *                         &lt;enumeration value="222"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Fac_Exp_Cont"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rsmn_Fac_Exp_Cont_Nota_Debito" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoComp"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
 *                         &lt;enumeration value="223"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Fac_Exp_Cont"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rsmn_Rem" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoComp"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
 *                         &lt;enumeration value="181"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Rem"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rsmn_Rem_Cont" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoComp"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
 *                         &lt;enumeration value="281"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Rem_Cont"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rsmn_Rem_Exp" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoComp"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
 *                         &lt;enumeration value="124"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Rem_Exp"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rsmn_Rem_Exp_Cont" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoComp"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
 *                         &lt;enumeration value="224"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Rem_Exp_Cont"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rsmn_Resg" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoComp"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
 *                         &lt;enumeration value="182"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Resg"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rsmn_Resg_Cont" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoComp"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
 *                         &lt;enumeration value="282"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Resg_Cont"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rsmn_Bol" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoComp"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
 *                         &lt;enumeration value="151"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Bol"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rsmn_Bol_Nota_Credito" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoComp"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
 *                         &lt;enumeration value="152"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Bol"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rsmn_Bol_Nota_Debito" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoComp"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
 *                         &lt;enumeration value="153"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Bol"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rsmn_Bol_Cont" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoComp"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
 *                         &lt;enumeration value="251"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Bol_Cont"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rsmn_Bol_Cont_Nota_Credito" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoComp"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
 *                         &lt;enumeration value="252"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Bol_Cont"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rsmn_Bol_Cont_Nota_Debito" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoComp"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
 *                         &lt;enumeration value="253"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Bol_Cont"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReporteDefType", propOrder = {
    "caratula",
    "rsmnTck",
    "rsmnTckNotaCredito",
    "rsmnTckNotaDebito",
    "rsmnTckCont",
    "rsmnTckContNotaCredito",
    "rsmnTckContNotaDebito",
    "rsmnTckCtaAj",
    "rsmnTckNotaCreditoCtaAj",
    "rsmnTckNotaDebitoCtaAj",
    "rsmnTckCtaAjCont",
    "rsmnTckCtaAjContNotaCredito",
    "rsmnTckCtaAjContNotaDebito",
    "rsmnFac",
    "rsmnFacNotaCredito",
    "rsmnFacNotaDebito",
    "rsmnFacCont",
    "rsmnFacContNotaCredito",
    "rsmnFacContNotaDebito",
    "rsmnFacCtaAj",
    "rsmnFacNotaCreditoCtaAj",
    "rsmnFacNotaDebitoCtaAj",
    "rsmnFacCtaAjCont",
    "rsmnFacCtaAjContNotaCredito",
    "rsmnFacCtaAjContNotaDebito",
    "rsmnFacExp",
    "rsmnFacExpNotaCredito",
    "rsmnFacExpNotaDebito",
    "rsmnFacExpCont",
    "rsmnFacExpContNotaCredito",
    "rsmnFacExpContNotaDebito",
    "rsmnRem",
    "rsmnRemCont",
    "rsmnRemExp",
    "rsmnRemExpCont",
    "rsmnResg",
    "rsmnResgCont",
    "rsmnBol",
    "rsmnBolNotaCredito",
    "rsmnBolNotaDebito",
    "rsmnBolCont",
    "rsmnBolContNotaCredito",
    "rsmnBolContNotaDebito",
    "signature"
})
public class ReporteDefType {

    @XmlElement(name = "Caratula", required = true)
    protected Caratula caratula;
    @XmlElement(name = "Rsmn_Tck")
    protected RsmnTck rsmnTck;
    @XmlElement(name = "Rsmn_Tck_Nota_Credito")
    protected RsmnTckNotaCredito rsmnTckNotaCredito;
    @XmlElement(name = "Rsmn_Tck_Nota_Debito")
    protected RsmnTckNotaDebito rsmnTckNotaDebito;
    @XmlElement(name = "Rsmn_Tck_Cont")
    protected RsmnTckCont rsmnTckCont;
    @XmlElement(name = "Rsmn_Tck_Cont_Nota_Credito")
    protected RsmnTckContNotaCredito rsmnTckContNotaCredito;
    @XmlElement(name = "Rsmn_Tck_Cont_Nota_Debito")
    protected RsmnTckContNotaDebito rsmnTckContNotaDebito;
    @XmlElement(name = "Rsmn_Tck_CtaAj")
    protected RsmnTckCtaAj rsmnTckCtaAj;
    @XmlElement(name = "Rsmn_Tck_Nota_Credito_CtaAj")
    protected RsmnTckNotaCreditoCtaAj rsmnTckNotaCreditoCtaAj;
    @XmlElement(name = "Rsmn_Tck_Nota_Debito_CtaAj")
    protected RsmnTckNotaDebitoCtaAj rsmnTckNotaDebitoCtaAj;
    @XmlElement(name = "Rsmn_Tck_CtaAj_Cont")
    protected RsmnTckCtaAjCont rsmnTckCtaAjCont;
    @XmlElement(name = "Rsmn_Tck_CtaAj_Cont_Nota_Credito")
    protected RsmnTckCtaAjContNotaCredito rsmnTckCtaAjContNotaCredito;
    @XmlElement(name = "Rsmn_Tck_CtaAj_Cont_Nota_Debito")
    protected RsmnTckCtaAjContNotaDebito rsmnTckCtaAjContNotaDebito;
    @XmlElement(name = "Rsmn_Fac")
    protected RsmnFac rsmnFac;
    @XmlElement(name = "Rsmn_Fac_Nota_Credito")
    protected RsmnFacNotaCredito rsmnFacNotaCredito;
    @XmlElement(name = "Rsmn_Fac_Nota_Debito")
    protected RsmnFacNotaDebito rsmnFacNotaDebito;
    @XmlElement(name = "Rsmn_Fac_Cont")
    protected RsmnFacCont rsmnFacCont;
    @XmlElement(name = "Rsmn_Fac_Cont_Nota_Credito")
    protected RsmnFacContNotaCredito rsmnFacContNotaCredito;
    @XmlElement(name = "Rsmn_Fac_Cont_Nota_Debito")
    protected RsmnFacContNotaDebito rsmnFacContNotaDebito;
    @XmlElement(name = "Rsmn_Fac_CtaAj")
    protected RsmnFacCtaAj rsmnFacCtaAj;
    @XmlElement(name = "Rsmn_Fac_Nota_Credito_CtaAj")
    protected RsmnFacNotaCreditoCtaAj rsmnFacNotaCreditoCtaAj;
    @XmlElement(name = "Rsmn_Fac_Nota_Debito_CtaAj")
    protected RsmnFacNotaDebitoCtaAj rsmnFacNotaDebitoCtaAj;
    @XmlElement(name = "Rsmn_Fac_CtaAj_Cont")
    protected RsmnFacCtaAjCont rsmnFacCtaAjCont;
    @XmlElement(name = "Rsmn_Fac_CtaAj_Cont_Nota_Credito")
    protected RsmnFacCtaAjContNotaCredito rsmnFacCtaAjContNotaCredito;
    @XmlElement(name = "Rsmn_Fac_CtaAj_Cont_Nota_Debito")
    protected RsmnFacCtaAjContNotaDebito rsmnFacCtaAjContNotaDebito;
    @XmlElement(name = "Rsmn_Fac_Exp")
    protected RsmnFacExp rsmnFacExp;
    @XmlElement(name = "Rsmn_Fac_Exp_Nota_Credito")
    protected RsmnFacExpNotaCredito rsmnFacExpNotaCredito;
    @XmlElement(name = "Rsmn_Fac_Exp_Nota_Debito")
    protected RsmnFacExpNotaDebito rsmnFacExpNotaDebito;
    @XmlElement(name = "Rsmn_Fac_Exp_Cont")
    protected RsmnFacExpCont rsmnFacExpCont;
    @XmlElement(name = "Rsmn_Fac_Exp_Cont_Nota_Credito")
    protected RsmnFacExpContNotaCredito rsmnFacExpContNotaCredito;
    @XmlElement(name = "Rsmn_Fac_Exp_Cont_Nota_Debito")
    protected RsmnFacExpContNotaDebito rsmnFacExpContNotaDebito;
    @XmlElement(name = "Rsmn_Rem")
    protected RsmnRem rsmnRem;
    @XmlElement(name = "Rsmn_Rem_Cont")
    protected RsmnRemCont rsmnRemCont;
    @XmlElement(name = "Rsmn_Rem_Exp")
    protected RsmnRemExp rsmnRemExp;
    @XmlElement(name = "Rsmn_Rem_Exp_Cont")
    protected RsmnRemExpCont rsmnRemExpCont;
    @XmlElement(name = "Rsmn_Resg")
    protected RsmnResg rsmnResg;
    @XmlElement(name = "Rsmn_Resg_Cont")
    protected RsmnResgCont rsmnResgCont;
    @XmlElement(name = "Rsmn_Bol")
    protected RsmnBol rsmnBol;
    @XmlElement(name = "Rsmn_Bol_Nota_Credito")
    protected RsmnBolNotaCredito rsmnBolNotaCredito;
    @XmlElement(name = "Rsmn_Bol_Nota_Debito")
    protected RsmnBolNotaDebito rsmnBolNotaDebito;
    @XmlElement(name = "Rsmn_Bol_Cont")
    protected RsmnBolCont rsmnBolCont;
    @XmlElement(name = "Rsmn_Bol_Cont_Nota_Credito")
    protected RsmnBolContNotaCredito rsmnBolContNotaCredito;
    @XmlElement(name = "Rsmn_Bol_Cont_Nota_Debito")
    protected RsmnBolContNotaDebito rsmnBolContNotaDebito;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obtiene el valor de la propiedad caratula.
     * 
     * @return
     *     possible object is
     *     {@link Caratula }
     *     
     */
    public Caratula getCaratula() {
        return caratula;
    }

    /**
     * Define el valor de la propiedad caratula.
     * 
     * @param value
     *     allowed object is
     *     {@link Caratula }
     *     
     */
    public void setCaratula(Caratula value) {
        this.caratula = value;
    }

    /**
     * Obtiene el valor de la propiedad rsmnTck.
     * 
     * @return
     *     possible object is
     *     {@link RsmnTck }
     *     
     */
    public RsmnTck getRsmnTck() {
        return rsmnTck;
    }

    /**
     * Define el valor de la propiedad rsmnTck.
     * 
     * @param value
     *     allowed object is
     *     {@link RsmnTck }
     *     
     */
    public void setRsmnTck(RsmnTck value) {
        this.rsmnTck = value;
    }

    /**
     * Obtiene el valor de la propiedad rsmnTckNotaCredito.
     * 
     * @return
     *     possible object is
     *     {@link RsmnTckNotaCredito }
     *     
     */
    public RsmnTckNotaCredito getRsmnTckNotaCredito() {
        return rsmnTckNotaCredito;
    }

    /**
     * Define el valor de la propiedad rsmnTckNotaCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link RsmnTckNotaCredito }
     *     
     */
    public void setRsmnTckNotaCredito(RsmnTckNotaCredito value) {
        this.rsmnTckNotaCredito = value;
    }

    /**
     * Obtiene el valor de la propiedad rsmnTckNotaDebito.
     * 
     * @return
     *     possible object is
     *     {@link RsmnTckNotaDebito }
     *     
     */
    public RsmnTckNotaDebito getRsmnTckNotaDebito() {
        return rsmnTckNotaDebito;
    }

    /**
     * Define el valor de la propiedad rsmnTckNotaDebito.
     * 
     * @param value
     *     allowed object is
     *     {@link RsmnTckNotaDebito }
     *     
     */
    public void setRsmnTckNotaDebito(RsmnTckNotaDebito value) {
        this.rsmnTckNotaDebito = value;
    }

    /**
     * Obtiene el valor de la propiedad rsmnTckCont.
     * 
     * @return
     *     possible object is
     *     {@link RsmnTckCont }
     *     
     */
    public RsmnTckCont getRsmnTckCont() {
        return rsmnTckCont;
    }

    /**
     * Define el valor de la propiedad rsmnTckCont.
     * 
     * @param value
     *     allowed object is
     *     {@link RsmnTckCont }
     *     
     */
    public void setRsmnTckCont(RsmnTckCont value) {
        this.rsmnTckCont = value;
    }

    /**
     * Obtiene el valor de la propiedad rsmnTckContNotaCredito.
     * 
     * @return
     *     possible object is
     *     {@link RsmnTckContNotaCredito }
     *     
     */
    public RsmnTckContNotaCredito getRsmnTckContNotaCredito() {
        return rsmnTckContNotaCredito;
    }

    /**
     * Define el valor de la propiedad rsmnTckContNotaCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link RsmnTckContNotaCredito }
     *     
     */
    public void setRsmnTckContNotaCredito(RsmnTckContNotaCredito value) {
        this.rsmnTckContNotaCredito = value;
    }

    /**
     * Obtiene el valor de la propiedad rsmnTckContNotaDebito.
     * 
     * @return
     *     possible object is
     *     {@link RsmnTckContNotaDebito }
     *     
     */
    public RsmnTckContNotaDebito getRsmnTckContNotaDebito() {
        return rsmnTckContNotaDebito;
    }

    /**
     * Define el valor de la propiedad rsmnTckContNotaDebito.
     * 
     * @param value
     *     allowed object is
     *     {@link RsmnTckContNotaDebito }
     *     
     */
    public void setRsmnTckContNotaDebito(RsmnTckContNotaDebito value) {
        this.rsmnTckContNotaDebito = value;
    }

    /**
     * Obtiene el valor de la propiedad rsmnTckCtaAj.
     * 
     * @return
     *     possible object is
     *     {@link RsmnTckCtaAj }
     *     
     */
    public RsmnTckCtaAj getRsmnTckCtaAj() {
        return rsmnTckCtaAj;
    }

    /**
     * Define el valor de la propiedad rsmnTckCtaAj.
     * 
     * @param value
     *     allowed object is
     *     {@link RsmnTckCtaAj }
     *     
     */
    public void setRsmnTckCtaAj(RsmnTckCtaAj value) {
        this.rsmnTckCtaAj = value;
    }

    /**
     * Obtiene el valor de la propiedad rsmnTckNotaCreditoCtaAj.
     * 
     * @return
     *     possible object is
     *     {@link RsmnTckNotaCreditoCtaAj }
     *     
     */
    public RsmnTckNotaCreditoCtaAj getRsmnTckNotaCreditoCtaAj() {
        return rsmnTckNotaCreditoCtaAj;
    }

    /**
     * Define el valor de la propiedad rsmnTckNotaCreditoCtaAj.
     * 
     * @param value
     *     allowed object is
     *     {@link RsmnTckNotaCreditoCtaAj }
     *     
     */
    public void setRsmnTckNotaCreditoCtaAj(RsmnTckNotaCreditoCtaAj value) {
        this.rsmnTckNotaCreditoCtaAj = value;
    }

    /**
     * Obtiene el valor de la propiedad rsmnTckNotaDebitoCtaAj.
     * 
     * @return
     *     possible object is
     *     {@link RsmnTckNotaDebitoCtaAj }
     *     
     */
    public RsmnTckNotaDebitoCtaAj getRsmnTckNotaDebitoCtaAj() {
        return rsmnTckNotaDebitoCtaAj;
    }

    /**
     * Define el valor de la propiedad rsmnTckNotaDebitoCtaAj.
     * 
     * @param value
     *     allowed object is
     *     {@link RsmnTckNotaDebitoCtaAj }
     *     
     */
    public void setRsmnTckNotaDebitoCtaAj(RsmnTckNotaDebitoCtaAj value) {
        this.rsmnTckNotaDebitoCtaAj = value;
    }

    /**
     * Obtiene el valor de la propiedad rsmnTckCtaAjCont.
     * 
     * @return
     *     possible object is
     *     {@link RsmnTckCtaAjCont }
     *     
     */
    public RsmnTckCtaAjCont getRsmnTckCtaAjCont() {
        return rsmnTckCtaAjCont;
    }

    /**
     * Define el valor de la propiedad rsmnTckCtaAjCont.
     * 
     * @param value
     *     allowed object is
     *     {@link RsmnTckCtaAjCont }
     *     
     */
    public void setRsmnTckCtaAjCont(RsmnTckCtaAjCont value) {
        this.rsmnTckCtaAjCont = value;
    }

    /**
     * Obtiene el valor de la propiedad rsmnTckCtaAjContNotaCredito.
     * 
     * @return
     *     possible object is
     *     {@link RsmnTckCtaAjContNotaCredito }
     *     
     */
    public RsmnTckCtaAjContNotaCredito getRsmnTckCtaAjContNotaCredito() {
        return rsmnTckCtaAjContNotaCredito;
    }

    /**
     * Define el valor de la propiedad rsmnTckCtaAjContNotaCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link RsmnTckCtaAjContNotaCredito }
     *     
     */
    public void setRsmnTckCtaAjContNotaCredito(RsmnTckCtaAjContNotaCredito value) {
        this.rsmnTckCtaAjContNotaCredito = value;
    }

    /**
     * Obtiene el valor de la propiedad rsmnTckCtaAjContNotaDebito.
     * 
     * @return
     *     possible object is
     *     {@link RsmnTckCtaAjContNotaDebito }
     *     
     */
    public RsmnTckCtaAjContNotaDebito getRsmnTckCtaAjContNotaDebito() {
        return rsmnTckCtaAjContNotaDebito;
    }

    /**
     * Define el valor de la propiedad rsmnTckCtaAjContNotaDebito.
     * 
     * @param value
     *     allowed object is
     *     {@link RsmnTckCtaAjContNotaDebito }
     *     
     */
    public void setRsmnTckCtaAjContNotaDebito(RsmnTckCtaAjContNotaDebito value) {
        this.rsmnTckCtaAjContNotaDebito = value;
    }

    /**
     * Obtiene el valor de la propiedad rsmnFac.
     * 
     * @return
     *     possible object is
     *     {@link RsmnFac }
     *     
     */
    public RsmnFac getRsmnFac() {
        return rsmnFac;
    }

    /**
     * Define el valor de la propiedad rsmnFac.
     * 
     * @param value
     *     allowed object is
     *     {@link RsmnFac }
     *     
     */
    public void setRsmnFac(RsmnFac value) {
        this.rsmnFac = value;
    }

    /**
     * Obtiene el valor de la propiedad rsmnFacNotaCredito.
     * 
     * @return
     *     possible object is
     *     {@link RsmnFacNotaCredito }
     *     
     */
    public RsmnFacNotaCredito getRsmnFacNotaCredito() {
        return rsmnFacNotaCredito;
    }

    /**
     * Define el valor de la propiedad rsmnFacNotaCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link RsmnFacNotaCredito }
     *     
     */
    public void setRsmnFacNotaCredito(RsmnFacNotaCredito value) {
        this.rsmnFacNotaCredito = value;
    }

    /**
     * Obtiene el valor de la propiedad rsmnFacNotaDebito.
     * 
     * @return
     *     possible object is
     *     {@link RsmnFacNotaDebito }
     *     
     */
    public RsmnFacNotaDebito getRsmnFacNotaDebito() {
        return rsmnFacNotaDebito;
    }

    /**
     * Define el valor de la propiedad rsmnFacNotaDebito.
     * 
     * @param value
     *     allowed object is
     *     {@link RsmnFacNotaDebito }
     *     
     */
    public void setRsmnFacNotaDebito(RsmnFacNotaDebito value) {
        this.rsmnFacNotaDebito = value;
    }

    /**
     * Obtiene el valor de la propiedad rsmnFacCont.
     * 
     * @return
     *     possible object is
     *     {@link RsmnFacCont }
     *     
     */
    public RsmnFacCont getRsmnFacCont() {
        return rsmnFacCont;
    }

    /**
     * Define el valor de la propiedad rsmnFacCont.
     * 
     * @param value
     *     allowed object is
     *     {@link RsmnFacCont }
     *     
     */
    public void setRsmnFacCont(RsmnFacCont value) {
        this.rsmnFacCont = value;
    }

    /**
     * Obtiene el valor de la propiedad rsmnFacContNotaCredito.
     * 
     * @return
     *     possible object is
     *     {@link RsmnFacContNotaCredito }
     *     
     */
    public RsmnFacContNotaCredito getRsmnFacContNotaCredito() {
        return rsmnFacContNotaCredito;
    }

    /**
     * Define el valor de la propiedad rsmnFacContNotaCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link RsmnFacContNotaCredito }
     *     
     */
    public void setRsmnFacContNotaCredito(RsmnFacContNotaCredito value) {
        this.rsmnFacContNotaCredito = value;
    }

    /**
     * Obtiene el valor de la propiedad rsmnFacContNotaDebito.
     * 
     * @return
     *     possible object is
     *     {@link RsmnFacContNotaDebito }
     *     
     */
    public RsmnFacContNotaDebito getRsmnFacContNotaDebito() {
        return rsmnFacContNotaDebito;
    }

    /**
     * Define el valor de la propiedad rsmnFacContNotaDebito.
     * 
     * @param value
     *     allowed object is
     *     {@link RsmnFacContNotaDebito }
     *     
     */
    public void setRsmnFacContNotaDebito(RsmnFacContNotaDebito value) {
        this.rsmnFacContNotaDebito = value;
    }

    /**
     * Obtiene el valor de la propiedad rsmnFacCtaAj.
     * 
     * @return
     *     possible object is
     *     {@link RsmnFacCtaAj }
     *     
     */
    public RsmnFacCtaAj getRsmnFacCtaAj() {
        return rsmnFacCtaAj;
    }

    /**
     * Define el valor de la propiedad rsmnFacCtaAj.
     * 
     * @param value
     *     allowed object is
     *     {@link RsmnFacCtaAj }
     *     
     */
    public void setRsmnFacCtaAj(RsmnFacCtaAj value) {
        this.rsmnFacCtaAj = value;
    }

    /**
     * Obtiene el valor de la propiedad rsmnFacNotaCreditoCtaAj.
     * 
     * @return
     *     possible object is
     *     {@link RsmnFacNotaCreditoCtaAj }
     *     
     */
    public RsmnFacNotaCreditoCtaAj getRsmnFacNotaCreditoCtaAj() {
        return rsmnFacNotaCreditoCtaAj;
    }

    /**
     * Define el valor de la propiedad rsmnFacNotaCreditoCtaAj.
     * 
     * @param value
     *     allowed object is
     *     {@link RsmnFacNotaCreditoCtaAj }
     *     
     */
    public void setRsmnFacNotaCreditoCtaAj(RsmnFacNotaCreditoCtaAj value) {
        this.rsmnFacNotaCreditoCtaAj = value;
    }

    /**
     * Obtiene el valor de la propiedad rsmnFacNotaDebitoCtaAj.
     * 
     * @return
     *     possible object is
     *     {@link RsmnFacNotaDebitoCtaAj }
     *     
     */
    public RsmnFacNotaDebitoCtaAj getRsmnFacNotaDebitoCtaAj() {
        return rsmnFacNotaDebitoCtaAj;
    }

    /**
     * Define el valor de la propiedad rsmnFacNotaDebitoCtaAj.
     * 
     * @param value
     *     allowed object is
     *     {@link RsmnFacNotaDebitoCtaAj }
     *     
     */
    public void setRsmnFacNotaDebitoCtaAj(RsmnFacNotaDebitoCtaAj value) {
        this.rsmnFacNotaDebitoCtaAj = value;
    }

    /**
     * Obtiene el valor de la propiedad rsmnFacCtaAjCont.
     * 
     * @return
     *     possible object is
     *     {@link RsmnFacCtaAjCont }
     *     
     */
    public RsmnFacCtaAjCont getRsmnFacCtaAjCont() {
        return rsmnFacCtaAjCont;
    }

    /**
     * Define el valor de la propiedad rsmnFacCtaAjCont.
     * 
     * @param value
     *     allowed object is
     *     {@link RsmnFacCtaAjCont }
     *     
     */
    public void setRsmnFacCtaAjCont(RsmnFacCtaAjCont value) {
        this.rsmnFacCtaAjCont = value;
    }

    /**
     * Obtiene el valor de la propiedad rsmnFacCtaAjContNotaCredito.
     * 
     * @return
     *     possible object is
     *     {@link RsmnFacCtaAjContNotaCredito }
     *     
     */
    public RsmnFacCtaAjContNotaCredito getRsmnFacCtaAjContNotaCredito() {
        return rsmnFacCtaAjContNotaCredito;
    }

    /**
     * Define el valor de la propiedad rsmnFacCtaAjContNotaCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link RsmnFacCtaAjContNotaCredito }
     *     
     */
    public void setRsmnFacCtaAjContNotaCredito(RsmnFacCtaAjContNotaCredito value) {
        this.rsmnFacCtaAjContNotaCredito = value;
    }

    /**
     * Obtiene el valor de la propiedad rsmnFacCtaAjContNotaDebito.
     * 
     * @return
     *     possible object is
     *     {@link RsmnFacCtaAjContNotaDebito }
     *     
     */
    public RsmnFacCtaAjContNotaDebito getRsmnFacCtaAjContNotaDebito() {
        return rsmnFacCtaAjContNotaDebito;
    }

    /**
     * Define el valor de la propiedad rsmnFacCtaAjContNotaDebito.
     * 
     * @param value
     *     allowed object is
     *     {@link RsmnFacCtaAjContNotaDebito }
     *     
     */
    public void setRsmnFacCtaAjContNotaDebito(RsmnFacCtaAjContNotaDebito value) {
        this.rsmnFacCtaAjContNotaDebito = value;
    }

    /**
     * Obtiene el valor de la propiedad rsmnFacExp.
     * 
     * @return
     *     possible object is
     *     {@link RsmnFacExp }
     *     
     */
    public RsmnFacExp getRsmnFacExp() {
        return rsmnFacExp;
    }

    /**
     * Define el valor de la propiedad rsmnFacExp.
     * 
     * @param value
     *     allowed object is
     *     {@link RsmnFacExp }
     *     
     */
    public void setRsmnFacExp(RsmnFacExp value) {
        this.rsmnFacExp = value;
    }

    /**
     * Obtiene el valor de la propiedad rsmnFacExpNotaCredito.
     * 
     * @return
     *     possible object is
     *     {@link RsmnFacExpNotaCredito }
     *     
     */
    public RsmnFacExpNotaCredito getRsmnFacExpNotaCredito() {
        return rsmnFacExpNotaCredito;
    }

    /**
     * Define el valor de la propiedad rsmnFacExpNotaCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link RsmnFacExpNotaCredito }
     *     
     */
    public void setRsmnFacExpNotaCredito(RsmnFacExpNotaCredito value) {
        this.rsmnFacExpNotaCredito = value;
    }

    /**
     * Obtiene el valor de la propiedad rsmnFacExpNotaDebito.
     * 
     * @return
     *     possible object is
     *     {@link RsmnFacExpNotaDebito }
     *     
     */
    public RsmnFacExpNotaDebito getRsmnFacExpNotaDebito() {
        return rsmnFacExpNotaDebito;
    }

    /**
     * Define el valor de la propiedad rsmnFacExpNotaDebito.
     * 
     * @param value
     *     allowed object is
     *     {@link RsmnFacExpNotaDebito }
     *     
     */
    public void setRsmnFacExpNotaDebito(RsmnFacExpNotaDebito value) {
        this.rsmnFacExpNotaDebito = value;
    }

    /**
     * Obtiene el valor de la propiedad rsmnFacExpCont.
     * 
     * @return
     *     possible object is
     *     {@link RsmnFacExpCont }
     *     
     */
    public RsmnFacExpCont getRsmnFacExpCont() {
        return rsmnFacExpCont;
    }

    /**
     * Define el valor de la propiedad rsmnFacExpCont.
     * 
     * @param value
     *     allowed object is
     *     {@link RsmnFacExpCont }
     *     
     */
    public void setRsmnFacExpCont(RsmnFacExpCont value) {
        this.rsmnFacExpCont = value;
    }

    /**
     * Obtiene el valor de la propiedad rsmnFacExpContNotaCredito.
     * 
     * @return
     *     possible object is
     *     {@link RsmnFacExpContNotaCredito }
     *     
     */
    public RsmnFacExpContNotaCredito getRsmnFacExpContNotaCredito() {
        return rsmnFacExpContNotaCredito;
    }

    /**
     * Define el valor de la propiedad rsmnFacExpContNotaCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link RsmnFacExpContNotaCredito }
     *     
     */
    public void setRsmnFacExpContNotaCredito(RsmnFacExpContNotaCredito value) {
        this.rsmnFacExpContNotaCredito = value;
    }

    /**
     * Obtiene el valor de la propiedad rsmnFacExpContNotaDebito.
     * 
     * @return
     *     possible object is
     *     {@link RsmnFacExpContNotaDebito }
     *     
     */
    public RsmnFacExpContNotaDebito getRsmnFacExpContNotaDebito() {
        return rsmnFacExpContNotaDebito;
    }

    /**
     * Define el valor de la propiedad rsmnFacExpContNotaDebito.
     * 
     * @param value
     *     allowed object is
     *     {@link RsmnFacExpContNotaDebito }
     *     
     */
    public void setRsmnFacExpContNotaDebito(RsmnFacExpContNotaDebito value) {
        this.rsmnFacExpContNotaDebito = value;
    }

    /**
     * Obtiene el valor de la propiedad rsmnRem.
     * 
     * @return
     *     possible object is
     *     {@link RsmnRem }
     *     
     */
    public RsmnRem getRsmnRem() {
        return rsmnRem;
    }

    /**
     * Define el valor de la propiedad rsmnRem.
     * 
     * @param value
     *     allowed object is
     *     {@link RsmnRem }
     *     
     */
    public void setRsmnRem(RsmnRem value) {
        this.rsmnRem = value;
    }

    /**
     * Obtiene el valor de la propiedad rsmnRemCont.
     * 
     * @return
     *     possible object is
     *     {@link RsmnRemCont }
     *     
     */
    public RsmnRemCont getRsmnRemCont() {
        return rsmnRemCont;
    }

    /**
     * Define el valor de la propiedad rsmnRemCont.
     * 
     * @param value
     *     allowed object is
     *     {@link RsmnRemCont }
     *     
     */
    public void setRsmnRemCont(RsmnRemCont value) {
        this.rsmnRemCont = value;
    }

    /**
     * Obtiene el valor de la propiedad rsmnRemExp.
     * 
     * @return
     *     possible object is
     *     {@link RsmnRemExp }
     *     
     */
    public RsmnRemExp getRsmnRemExp() {
        return rsmnRemExp;
    }

    /**
     * Define el valor de la propiedad rsmnRemExp.
     * 
     * @param value
     *     allowed object is
     *     {@link RsmnRemExp }
     *     
     */
    public void setRsmnRemExp(RsmnRemExp value) {
        this.rsmnRemExp = value;
    }

    /**
     * Obtiene el valor de la propiedad rsmnRemExpCont.
     * 
     * @return
     *     possible object is
     *     {@link RsmnRemExpCont }
     *     
     */
    public RsmnRemExpCont getRsmnRemExpCont() {
        return rsmnRemExpCont;
    }

    /**
     * Define el valor de la propiedad rsmnRemExpCont.
     * 
     * @param value
     *     allowed object is
     *     {@link RsmnRemExpCont }
     *     
     */
    public void setRsmnRemExpCont(RsmnRemExpCont value) {
        this.rsmnRemExpCont = value;
    }

    /**
     * Obtiene el valor de la propiedad rsmnResg.
     * 
     * @return
     *     possible object is
     *     {@link RsmnResg }
     *     
     */
    public RsmnResg getRsmnResg() {
        return rsmnResg;
    }

    /**
     * Define el valor de la propiedad rsmnResg.
     * 
     * @param value
     *     allowed object is
     *     {@link RsmnResg }
     *     
     */
    public void setRsmnResg(RsmnResg value) {
        this.rsmnResg = value;
    }

    /**
     * Obtiene el valor de la propiedad rsmnResgCont.
     * 
     * @return
     *     possible object is
     *     {@link RsmnResgCont }
     *     
     */
    public RsmnResgCont getRsmnResgCont() {
        return rsmnResgCont;
    }

    /**
     * Define el valor de la propiedad rsmnResgCont.
     * 
     * @param value
     *     allowed object is
     *     {@link RsmnResgCont }
     *     
     */
    public void setRsmnResgCont(RsmnResgCont value) {
        this.rsmnResgCont = value;
    }

    /**
     * Obtiene el valor de la propiedad rsmnBol.
     * 
     * @return
     *     possible object is
     *     {@link RsmnBol }
     *     
     */
    public RsmnBol getRsmnBol() {
        return rsmnBol;
    }

    /**
     * Define el valor de la propiedad rsmnBol.
     * 
     * @param value
     *     allowed object is
     *     {@link RsmnBol }
     *     
     */
    public void setRsmnBol(RsmnBol value) {
        this.rsmnBol = value;
    }

    /**
     * Obtiene el valor de la propiedad rsmnBolNotaCredito.
     * 
     * @return
     *     possible object is
     *     {@link RsmnBolNotaCredito }
     *     
     */
    public RsmnBolNotaCredito getRsmnBolNotaCredito() {
        return rsmnBolNotaCredito;
    }

    /**
     * Define el valor de la propiedad rsmnBolNotaCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link RsmnBolNotaCredito }
     *     
     */
    public void setRsmnBolNotaCredito(RsmnBolNotaCredito value) {
        this.rsmnBolNotaCredito = value;
    }

    /**
     * Obtiene el valor de la propiedad rsmnBolNotaDebito.
     * 
     * @return
     *     possible object is
     *     {@link RsmnBolNotaDebito }
     *     
     */
    public RsmnBolNotaDebito getRsmnBolNotaDebito() {
        return rsmnBolNotaDebito;
    }

    /**
     * Define el valor de la propiedad rsmnBolNotaDebito.
     * 
     * @param value
     *     allowed object is
     *     {@link RsmnBolNotaDebito }
     *     
     */
    public void setRsmnBolNotaDebito(RsmnBolNotaDebito value) {
        this.rsmnBolNotaDebito = value;
    }

    /**
     * Obtiene el valor de la propiedad rsmnBolCont.
     * 
     * @return
     *     possible object is
     *     {@link RsmnBolCont }
     *     
     */
    public RsmnBolCont getRsmnBolCont() {
        return rsmnBolCont;
    }

    /**
     * Define el valor de la propiedad rsmnBolCont.
     * 
     * @param value
     *     allowed object is
     *     {@link RsmnBolCont }
     *     
     */
    public void setRsmnBolCont(RsmnBolCont value) {
        this.rsmnBolCont = value;
    }

    /**
     * Obtiene el valor de la propiedad rsmnBolContNotaCredito.
     * 
     * @return
     *     possible object is
     *     {@link RsmnBolContNotaCredito }
     *     
     */
    public RsmnBolContNotaCredito getRsmnBolContNotaCredito() {
        return rsmnBolContNotaCredito;
    }

    /**
     * Define el valor de la propiedad rsmnBolContNotaCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link RsmnBolContNotaCredito }
     *     
     */
    public void setRsmnBolContNotaCredito(RsmnBolContNotaCredito value) {
        this.rsmnBolContNotaCredito = value;
    }

    /**
     * Obtiene el valor de la propiedad rsmnBolContNotaDebito.
     * 
     * @return
     *     possible object is
     *     {@link RsmnBolContNotaDebito }
     *     
     */
    public RsmnBolContNotaDebito getRsmnBolContNotaDebito() {
        return rsmnBolContNotaDebito;
    }

    /**
     * Define el valor de la propiedad rsmnBolContNotaDebito.
     * 
     * @param value
     *     allowed object is
     *     {@link RsmnBolContNotaDebito }
     *     
     */
    public void setRsmnBolContNotaDebito(RsmnBolContNotaDebito value) {
        this.rsmnBolContNotaDebito = value;
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
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="RUCEmisor" type="{http://cfe.dgi.gub.uy}RUCType"/&gt;
     *         &lt;element name="FechaResumen"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}FechaType"&gt;
     *               &lt;minInclusive value="2011-10-01"/&gt;
     *               &lt;maxInclusive value="2050-12-31"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="IDEmisor" type="{http://cfe.dgi.gub.uy}IDRecEmiType" minOccurs="0"/&gt;
     *         &lt;element name="SecEnvio"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *               &lt;minInclusive value="0"/&gt;
     *               &lt;totalDigits value="2"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TmstFirmaEnv" type="{http://cfe.dgi.gub.uy}FechaHoraType"/&gt;
     *         &lt;element name="CantComprobantes"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *               &lt;minInclusive value="0"/&gt;
     *               &lt;totalDigits value="10"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
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
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "rucEmisor",
        "fechaResumen",
        "idEmisor",
        "secEnvio",
        "tmstFirmaEnv",
        "cantComprobantes"
    })
    public static class Caratula {

        @XmlElement(name = "RUCEmisor", required = true)
        protected String rucEmisor;
        @XmlElement(name = "FechaResumen", required = true)
        protected XMLGregorianCalendar fechaResumen;
        @XmlElement(name = "IDEmisor")
        protected BigInteger idEmisor;
        @XmlElement(name = "SecEnvio", required = true)
        protected BigInteger secEnvio;
        @XmlElement(name = "TmstFirmaEnv", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar tmstFirmaEnv;
        @XmlElement(name = "CantComprobantes", required = true)
        protected BigInteger cantComprobantes;
        @XmlAttribute(name = "version", required = true)
        protected String version;

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
         * Obtiene el valor de la propiedad fechaResumen.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFechaResumen() {
            return fechaResumen;
        }

        /**
         * Define el valor de la propiedad fechaResumen.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFechaResumen(XMLGregorianCalendar value) {
            this.fechaResumen = value;
        }

        /**
         * Obtiene el valor de la propiedad idEmisor.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getIDEmisor() {
            return idEmisor;
        }

        /**
         * Define el valor de la propiedad idEmisor.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setIDEmisor(BigInteger value) {
            this.idEmisor = value;
        }

        /**
         * Obtiene el valor de la propiedad secEnvio.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSecEnvio() {
            return secEnvio;
        }

        /**
         * Define el valor de la propiedad secEnvio.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSecEnvio(BigInteger value) {
            this.secEnvio = value;
        }

        /**
         * Obtiene el valor de la propiedad tmstFirmaEnv.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTmstFirmaEnv() {
            return tmstFirmaEnv;
        }

        /**
         * Define el valor de la propiedad tmstFirmaEnv.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTmstFirmaEnv(XMLGregorianCalendar value) {
            this.tmstFirmaEnv = value;
        }

        /**
         * Obtiene el valor de la propiedad cantComprobantes.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCantComprobantes() {
            return cantComprobantes;
        }

        /**
         * Define el valor de la propiedad cantComprobantes.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCantComprobantes(BigInteger value) {
            this.cantComprobantes = value;
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
     *         &lt;element name="TipoComp"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
     *               &lt;enumeration value="151"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Bol"/&gt;
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
        "tipoComp",
        "rsmnData"
    })
    public static class RsmnBol {

        @XmlElement(name = "TipoComp", required = true)
        protected BigInteger tipoComp;
        @XmlElement(name = "RsmnData", required = true)
        protected RsmnDataBol rsmnData;

        /**
         * Obtiene el valor de la propiedad tipoComp.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTipoComp() {
            return tipoComp;
        }

        /**
         * Define el valor de la propiedad tipoComp.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTipoComp(BigInteger value) {
            this.tipoComp = value;
        }

        /**
         * Obtiene el valor de la propiedad rsmnData.
         * 
         * @return
         *     possible object is
         *     {@link RsmnDataBol }
         *     
         */
        public RsmnDataBol getRsmnData() {
            return rsmnData;
        }

        /**
         * Define el valor de la propiedad rsmnData.
         * 
         * @param value
         *     allowed object is
         *     {@link RsmnDataBol }
         *     
         */
        public void setRsmnData(RsmnDataBol value) {
            this.rsmnData = value;
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
     *         &lt;element name="TipoComp"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
     *               &lt;enumeration value="251"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Bol_Cont"/&gt;
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
        "tipoComp",
        "rsmnData"
    })
    public static class RsmnBolCont {

        @XmlElement(name = "TipoComp", required = true)
        protected BigInteger tipoComp;
        @XmlElement(name = "RsmnData", required = true)
        protected RsmnDataBolCont rsmnData;

        /**
         * Obtiene el valor de la propiedad tipoComp.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTipoComp() {
            return tipoComp;
        }

        /**
         * Define el valor de la propiedad tipoComp.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTipoComp(BigInteger value) {
            this.tipoComp = value;
        }

        /**
         * Obtiene el valor de la propiedad rsmnData.
         * 
         * @return
         *     possible object is
         *     {@link RsmnDataBolCont }
         *     
         */
        public RsmnDataBolCont getRsmnData() {
            return rsmnData;
        }

        /**
         * Define el valor de la propiedad rsmnData.
         * 
         * @param value
         *     allowed object is
         *     {@link RsmnDataBolCont }
         *     
         */
        public void setRsmnData(RsmnDataBolCont value) {
            this.rsmnData = value;
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
     *         &lt;element name="TipoComp"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
     *               &lt;enumeration value="252"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Bol_Cont"/&gt;
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
        "tipoComp",
        "rsmnData"
    })
    public static class RsmnBolContNotaCredito {

        @XmlElement(name = "TipoComp", required = true)
        protected BigInteger tipoComp;
        @XmlElement(name = "RsmnData", required = true)
        protected RsmnDataBolCont rsmnData;

        /**
         * Obtiene el valor de la propiedad tipoComp.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTipoComp() {
            return tipoComp;
        }

        /**
         * Define el valor de la propiedad tipoComp.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTipoComp(BigInteger value) {
            this.tipoComp = value;
        }

        /**
         * Obtiene el valor de la propiedad rsmnData.
         * 
         * @return
         *     possible object is
         *     {@link RsmnDataBolCont }
         *     
         */
        public RsmnDataBolCont getRsmnData() {
            return rsmnData;
        }

        /**
         * Define el valor de la propiedad rsmnData.
         * 
         * @param value
         *     allowed object is
         *     {@link RsmnDataBolCont }
         *     
         */
        public void setRsmnData(RsmnDataBolCont value) {
            this.rsmnData = value;
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
     *         &lt;element name="TipoComp"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
     *               &lt;enumeration value="253"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Bol_Cont"/&gt;
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
        "tipoComp",
        "rsmnData"
    })
    public static class RsmnBolContNotaDebito {

        @XmlElement(name = "TipoComp", required = true)
        protected BigInteger tipoComp;
        @XmlElement(name = "RsmnData", required = true)
        protected RsmnDataBolCont rsmnData;

        /**
         * Obtiene el valor de la propiedad tipoComp.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTipoComp() {
            return tipoComp;
        }

        /**
         * Define el valor de la propiedad tipoComp.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTipoComp(BigInteger value) {
            this.tipoComp = value;
        }

        /**
         * Obtiene el valor de la propiedad rsmnData.
         * 
         * @return
         *     possible object is
         *     {@link RsmnDataBolCont }
         *     
         */
        public RsmnDataBolCont getRsmnData() {
            return rsmnData;
        }

        /**
         * Define el valor de la propiedad rsmnData.
         * 
         * @param value
         *     allowed object is
         *     {@link RsmnDataBolCont }
         *     
         */
        public void setRsmnData(RsmnDataBolCont value) {
            this.rsmnData = value;
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
     *         &lt;element name="TipoComp"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
     *               &lt;enumeration value="152"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Bol"/&gt;
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
        "tipoComp",
        "rsmnData"
    })
    public static class RsmnBolNotaCredito {

        @XmlElement(name = "TipoComp", required = true)
        protected BigInteger tipoComp;
        @XmlElement(name = "RsmnData", required = true)
        protected RsmnDataBol rsmnData;

        /**
         * Obtiene el valor de la propiedad tipoComp.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTipoComp() {
            return tipoComp;
        }

        /**
         * Define el valor de la propiedad tipoComp.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTipoComp(BigInteger value) {
            this.tipoComp = value;
        }

        /**
         * Obtiene el valor de la propiedad rsmnData.
         * 
         * @return
         *     possible object is
         *     {@link RsmnDataBol }
         *     
         */
        public RsmnDataBol getRsmnData() {
            return rsmnData;
        }

        /**
         * Define el valor de la propiedad rsmnData.
         * 
         * @param value
         *     allowed object is
         *     {@link RsmnDataBol }
         *     
         */
        public void setRsmnData(RsmnDataBol value) {
            this.rsmnData = value;
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
     *         &lt;element name="TipoComp"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
     *               &lt;enumeration value="153"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Bol"/&gt;
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
        "tipoComp",
        "rsmnData"
    })
    public static class RsmnBolNotaDebito {

        @XmlElement(name = "TipoComp", required = true)
        protected BigInteger tipoComp;
        @XmlElement(name = "RsmnData", required = true)
        protected RsmnDataBol rsmnData;

        /**
         * Obtiene el valor de la propiedad tipoComp.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTipoComp() {
            return tipoComp;
        }

        /**
         * Define el valor de la propiedad tipoComp.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTipoComp(BigInteger value) {
            this.tipoComp = value;
        }

        /**
         * Obtiene el valor de la propiedad rsmnData.
         * 
         * @return
         *     possible object is
         *     {@link RsmnDataBol }
         *     
         */
        public RsmnDataBol getRsmnData() {
            return rsmnData;
        }

        /**
         * Define el valor de la propiedad rsmnData.
         * 
         * @param value
         *     allowed object is
         *     {@link RsmnDataBol }
         *     
         */
        public void setRsmnData(RsmnDataBol value) {
            this.rsmnData = value;
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
     *         &lt;element name="TipoComp"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
     *               &lt;enumeration value="111"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Fac"/&gt;
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
        "tipoComp",
        "rsmnData"
    })
    public static class RsmnFac {

        @XmlElement(name = "TipoComp", required = true)
        protected BigInteger tipoComp;
        @XmlElement(name = "RsmnData", required = true)
        protected RsmnDataFac rsmnData;

        /**
         * Obtiene el valor de la propiedad tipoComp.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTipoComp() {
            return tipoComp;
        }

        /**
         * Define el valor de la propiedad tipoComp.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTipoComp(BigInteger value) {
            this.tipoComp = value;
        }

        /**
         * Obtiene el valor de la propiedad rsmnData.
         * 
         * @return
         *     possible object is
         *     {@link RsmnDataFac }
         *     
         */
        public RsmnDataFac getRsmnData() {
            return rsmnData;
        }

        /**
         * Define el valor de la propiedad rsmnData.
         * 
         * @param value
         *     allowed object is
         *     {@link RsmnDataFac }
         *     
         */
        public void setRsmnData(RsmnDataFac value) {
            this.rsmnData = value;
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
     *         &lt;element name="TipoComp"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
     *               &lt;enumeration value="211"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Fac_Cont"/&gt;
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
        "tipoComp",
        "rsmnData"
    })
    public static class RsmnFacCont {

        @XmlElement(name = "TipoComp", required = true)
        protected BigInteger tipoComp;
        @XmlElement(name = "RsmnData", required = true)
        protected RsmnDataFacCont rsmnData;

        /**
         * Obtiene el valor de la propiedad tipoComp.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTipoComp() {
            return tipoComp;
        }

        /**
         * Define el valor de la propiedad tipoComp.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTipoComp(BigInteger value) {
            this.tipoComp = value;
        }

        /**
         * Obtiene el valor de la propiedad rsmnData.
         * 
         * @return
         *     possible object is
         *     {@link RsmnDataFacCont }
         *     
         */
        public RsmnDataFacCont getRsmnData() {
            return rsmnData;
        }

        /**
         * Define el valor de la propiedad rsmnData.
         * 
         * @param value
         *     allowed object is
         *     {@link RsmnDataFacCont }
         *     
         */
        public void setRsmnData(RsmnDataFacCont value) {
            this.rsmnData = value;
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
     *         &lt;element name="TipoComp"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
     *               &lt;enumeration value="212"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Fac_Cont"/&gt;
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
        "tipoComp",
        "rsmnData"
    })
    public static class RsmnFacContNotaCredito {

        @XmlElement(name = "TipoComp", required = true)
        protected BigInteger tipoComp;
        @XmlElement(name = "RsmnData", required = true)
        protected RsmnDataFacCont rsmnData;

        /**
         * Obtiene el valor de la propiedad tipoComp.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTipoComp() {
            return tipoComp;
        }

        /**
         * Define el valor de la propiedad tipoComp.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTipoComp(BigInteger value) {
            this.tipoComp = value;
        }

        /**
         * Obtiene el valor de la propiedad rsmnData.
         * 
         * @return
         *     possible object is
         *     {@link RsmnDataFacCont }
         *     
         */
        public RsmnDataFacCont getRsmnData() {
            return rsmnData;
        }

        /**
         * Define el valor de la propiedad rsmnData.
         * 
         * @param value
         *     allowed object is
         *     {@link RsmnDataFacCont }
         *     
         */
        public void setRsmnData(RsmnDataFacCont value) {
            this.rsmnData = value;
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
     *         &lt;element name="TipoComp"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
     *               &lt;enumeration value="213"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Fac_Cont"/&gt;
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
        "tipoComp",
        "rsmnData"
    })
    public static class RsmnFacContNotaDebito {

        @XmlElement(name = "TipoComp", required = true)
        protected BigInteger tipoComp;
        @XmlElement(name = "RsmnData", required = true)
        protected RsmnDataFacCont rsmnData;

        /**
         * Obtiene el valor de la propiedad tipoComp.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTipoComp() {
            return tipoComp;
        }

        /**
         * Define el valor de la propiedad tipoComp.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTipoComp(BigInteger value) {
            this.tipoComp = value;
        }

        /**
         * Obtiene el valor de la propiedad rsmnData.
         * 
         * @return
         *     possible object is
         *     {@link RsmnDataFacCont }
         *     
         */
        public RsmnDataFacCont getRsmnData() {
            return rsmnData;
        }

        /**
         * Define el valor de la propiedad rsmnData.
         * 
         * @param value
         *     allowed object is
         *     {@link RsmnDataFacCont }
         *     
         */
        public void setRsmnData(RsmnDataFacCont value) {
            this.rsmnData = value;
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
     *         &lt;element name="TipoComp"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
     *               &lt;enumeration value="141"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Fac"/&gt;
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
        "tipoComp",
        "rsmnData"
    })
    public static class RsmnFacCtaAj {

        @XmlElement(name = "TipoComp", required = true)
        protected BigInteger tipoComp;
        @XmlElement(name = "RsmnData", required = true)
        protected RsmnDataFac rsmnData;

        /**
         * Obtiene el valor de la propiedad tipoComp.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTipoComp() {
            return tipoComp;
        }

        /**
         * Define el valor de la propiedad tipoComp.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTipoComp(BigInteger value) {
            this.tipoComp = value;
        }

        /**
         * Obtiene el valor de la propiedad rsmnData.
         * 
         * @return
         *     possible object is
         *     {@link RsmnDataFac }
         *     
         */
        public RsmnDataFac getRsmnData() {
            return rsmnData;
        }

        /**
         * Define el valor de la propiedad rsmnData.
         * 
         * @param value
         *     allowed object is
         *     {@link RsmnDataFac }
         *     
         */
        public void setRsmnData(RsmnDataFac value) {
            this.rsmnData = value;
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
     *         &lt;element name="TipoComp"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
     *               &lt;enumeration value="241"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Fac_Cont"/&gt;
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
        "tipoComp",
        "rsmnData"
    })
    public static class RsmnFacCtaAjCont {

        @XmlElement(name = "TipoComp", required = true)
        protected BigInteger tipoComp;
        @XmlElement(name = "RsmnData", required = true)
        protected RsmnDataFacCont rsmnData;

        /**
         * Obtiene el valor de la propiedad tipoComp.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTipoComp() {
            return tipoComp;
        }

        /**
         * Define el valor de la propiedad tipoComp.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTipoComp(BigInteger value) {
            this.tipoComp = value;
        }

        /**
         * Obtiene el valor de la propiedad rsmnData.
         * 
         * @return
         *     possible object is
         *     {@link RsmnDataFacCont }
         *     
         */
        public RsmnDataFacCont getRsmnData() {
            return rsmnData;
        }

        /**
         * Define el valor de la propiedad rsmnData.
         * 
         * @param value
         *     allowed object is
         *     {@link RsmnDataFacCont }
         *     
         */
        public void setRsmnData(RsmnDataFacCont value) {
            this.rsmnData = value;
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
     *         &lt;element name="TipoComp"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
     *               &lt;enumeration value="242"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Fac_Cont"/&gt;
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
        "tipoComp",
        "rsmnData"
    })
    public static class RsmnFacCtaAjContNotaCredito {

        @XmlElement(name = "TipoComp", required = true)
        protected BigInteger tipoComp;
        @XmlElement(name = "RsmnData", required = true)
        protected RsmnDataFacCont rsmnData;

        /**
         * Obtiene el valor de la propiedad tipoComp.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTipoComp() {
            return tipoComp;
        }

        /**
         * Define el valor de la propiedad tipoComp.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTipoComp(BigInteger value) {
            this.tipoComp = value;
        }

        /**
         * Obtiene el valor de la propiedad rsmnData.
         * 
         * @return
         *     possible object is
         *     {@link RsmnDataFacCont }
         *     
         */
        public RsmnDataFacCont getRsmnData() {
            return rsmnData;
        }

        /**
         * Define el valor de la propiedad rsmnData.
         * 
         * @param value
         *     allowed object is
         *     {@link RsmnDataFacCont }
         *     
         */
        public void setRsmnData(RsmnDataFacCont value) {
            this.rsmnData = value;
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
     *         &lt;element name="TipoComp"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
     *               &lt;enumeration value="243"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Fac_Cont"/&gt;
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
        "tipoComp",
        "rsmnData"
    })
    public static class RsmnFacCtaAjContNotaDebito {

        @XmlElement(name = "TipoComp", required = true)
        protected BigInteger tipoComp;
        @XmlElement(name = "RsmnData", required = true)
        protected RsmnDataFacCont rsmnData;

        /**
         * Obtiene el valor de la propiedad tipoComp.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTipoComp() {
            return tipoComp;
        }

        /**
         * Define el valor de la propiedad tipoComp.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTipoComp(BigInteger value) {
            this.tipoComp = value;
        }

        /**
         * Obtiene el valor de la propiedad rsmnData.
         * 
         * @return
         *     possible object is
         *     {@link RsmnDataFacCont }
         *     
         */
        public RsmnDataFacCont getRsmnData() {
            return rsmnData;
        }

        /**
         * Define el valor de la propiedad rsmnData.
         * 
         * @param value
         *     allowed object is
         *     {@link RsmnDataFacCont }
         *     
         */
        public void setRsmnData(RsmnDataFacCont value) {
            this.rsmnData = value;
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
     *         &lt;element name="TipoComp"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
     *               &lt;enumeration value="121"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Fac_Exp"/&gt;
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
        "tipoComp",
        "rsmnData"
    })
    public static class RsmnFacExp {

        @XmlElement(name = "TipoComp", required = true)
        protected BigInteger tipoComp;
        @XmlElement(name = "RsmnData", required = true)
        protected RsmnDataFacExp rsmnData;

        /**
         * Obtiene el valor de la propiedad tipoComp.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTipoComp() {
            return tipoComp;
        }

        /**
         * Define el valor de la propiedad tipoComp.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTipoComp(BigInteger value) {
            this.tipoComp = value;
        }

        /**
         * Obtiene el valor de la propiedad rsmnData.
         * 
         * @return
         *     possible object is
         *     {@link RsmnDataFacExp }
         *     
         */
        public RsmnDataFacExp getRsmnData() {
            return rsmnData;
        }

        /**
         * Define el valor de la propiedad rsmnData.
         * 
         * @param value
         *     allowed object is
         *     {@link RsmnDataFacExp }
         *     
         */
        public void setRsmnData(RsmnDataFacExp value) {
            this.rsmnData = value;
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
     *         &lt;element name="TipoComp"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
     *               &lt;enumeration value="221"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Fac_Exp_Cont"/&gt;
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
        "tipoComp",
        "rsmnData"
    })
    public static class RsmnFacExpCont {

        @XmlElement(name = "TipoComp", required = true)
        protected BigInteger tipoComp;
        @XmlElement(name = "RsmnData", required = true)
        protected RsmnDataFacExpCont rsmnData;

        /**
         * Obtiene el valor de la propiedad tipoComp.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTipoComp() {
            return tipoComp;
        }

        /**
         * Define el valor de la propiedad tipoComp.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTipoComp(BigInteger value) {
            this.tipoComp = value;
        }

        /**
         * Obtiene el valor de la propiedad rsmnData.
         * 
         * @return
         *     possible object is
         *     {@link RsmnDataFacExpCont }
         *     
         */
        public RsmnDataFacExpCont getRsmnData() {
            return rsmnData;
        }

        /**
         * Define el valor de la propiedad rsmnData.
         * 
         * @param value
         *     allowed object is
         *     {@link RsmnDataFacExpCont }
         *     
         */
        public void setRsmnData(RsmnDataFacExpCont value) {
            this.rsmnData = value;
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
     *         &lt;element name="TipoComp"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
     *               &lt;enumeration value="222"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Fac_Exp_Cont"/&gt;
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
        "tipoComp",
        "rsmnData"
    })
    public static class RsmnFacExpContNotaCredito {

        @XmlElement(name = "TipoComp", required = true)
        protected BigInteger tipoComp;
        @XmlElement(name = "RsmnData", required = true)
        protected RsmnDataFacExpCont rsmnData;

        /**
         * Obtiene el valor de la propiedad tipoComp.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTipoComp() {
            return tipoComp;
        }

        /**
         * Define el valor de la propiedad tipoComp.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTipoComp(BigInteger value) {
            this.tipoComp = value;
        }

        /**
         * Obtiene el valor de la propiedad rsmnData.
         * 
         * @return
         *     possible object is
         *     {@link RsmnDataFacExpCont }
         *     
         */
        public RsmnDataFacExpCont getRsmnData() {
            return rsmnData;
        }

        /**
         * Define el valor de la propiedad rsmnData.
         * 
         * @param value
         *     allowed object is
         *     {@link RsmnDataFacExpCont }
         *     
         */
        public void setRsmnData(RsmnDataFacExpCont value) {
            this.rsmnData = value;
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
     *         &lt;element name="TipoComp"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
     *               &lt;enumeration value="223"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Fac_Exp_Cont"/&gt;
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
        "tipoComp",
        "rsmnData"
    })
    public static class RsmnFacExpContNotaDebito {

        @XmlElement(name = "TipoComp", required = true)
        protected BigInteger tipoComp;
        @XmlElement(name = "RsmnData", required = true)
        protected RsmnDataFacExpCont rsmnData;

        /**
         * Obtiene el valor de la propiedad tipoComp.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTipoComp() {
            return tipoComp;
        }

        /**
         * Define el valor de la propiedad tipoComp.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTipoComp(BigInteger value) {
            this.tipoComp = value;
        }

        /**
         * Obtiene el valor de la propiedad rsmnData.
         * 
         * @return
         *     possible object is
         *     {@link RsmnDataFacExpCont }
         *     
         */
        public RsmnDataFacExpCont getRsmnData() {
            return rsmnData;
        }

        /**
         * Define el valor de la propiedad rsmnData.
         * 
         * @param value
         *     allowed object is
         *     {@link RsmnDataFacExpCont }
         *     
         */
        public void setRsmnData(RsmnDataFacExpCont value) {
            this.rsmnData = value;
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
     *         &lt;element name="TipoComp"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
     *               &lt;enumeration value="122"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Fac_Exp"/&gt;
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
        "tipoComp",
        "rsmnData"
    })
    public static class RsmnFacExpNotaCredito {

        @XmlElement(name = "TipoComp", required = true)
        protected BigInteger tipoComp;
        @XmlElement(name = "RsmnData", required = true)
        protected RsmnDataFacExp rsmnData;

        /**
         * Obtiene el valor de la propiedad tipoComp.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTipoComp() {
            return tipoComp;
        }

        /**
         * Define el valor de la propiedad tipoComp.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTipoComp(BigInteger value) {
            this.tipoComp = value;
        }

        /**
         * Obtiene el valor de la propiedad rsmnData.
         * 
         * @return
         *     possible object is
         *     {@link RsmnDataFacExp }
         *     
         */
        public RsmnDataFacExp getRsmnData() {
            return rsmnData;
        }

        /**
         * Define el valor de la propiedad rsmnData.
         * 
         * @param value
         *     allowed object is
         *     {@link RsmnDataFacExp }
         *     
         */
        public void setRsmnData(RsmnDataFacExp value) {
            this.rsmnData = value;
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
     *         &lt;element name="TipoComp"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
     *               &lt;enumeration value="123"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Fac_Exp"/&gt;
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
        "tipoComp",
        "rsmnData"
    })
    public static class RsmnFacExpNotaDebito {

        @XmlElement(name = "TipoComp", required = true)
        protected BigInteger tipoComp;
        @XmlElement(name = "RsmnData", required = true)
        protected RsmnDataFacExp rsmnData;

        /**
         * Obtiene el valor de la propiedad tipoComp.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTipoComp() {
            return tipoComp;
        }

        /**
         * Define el valor de la propiedad tipoComp.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTipoComp(BigInteger value) {
            this.tipoComp = value;
        }

        /**
         * Obtiene el valor de la propiedad rsmnData.
         * 
         * @return
         *     possible object is
         *     {@link RsmnDataFacExp }
         *     
         */
        public RsmnDataFacExp getRsmnData() {
            return rsmnData;
        }

        /**
         * Define el valor de la propiedad rsmnData.
         * 
         * @param value
         *     allowed object is
         *     {@link RsmnDataFacExp }
         *     
         */
        public void setRsmnData(RsmnDataFacExp value) {
            this.rsmnData = value;
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
     *         &lt;element name="TipoComp"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
     *               &lt;enumeration value="112"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Fac"/&gt;
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
        "tipoComp",
        "rsmnData"
    })
    public static class RsmnFacNotaCredito {

        @XmlElement(name = "TipoComp", required = true)
        protected BigInteger tipoComp;
        @XmlElement(name = "RsmnData", required = true)
        protected RsmnDataFac rsmnData;

        /**
         * Obtiene el valor de la propiedad tipoComp.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTipoComp() {
            return tipoComp;
        }

        /**
         * Define el valor de la propiedad tipoComp.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTipoComp(BigInteger value) {
            this.tipoComp = value;
        }

        /**
         * Obtiene el valor de la propiedad rsmnData.
         * 
         * @return
         *     possible object is
         *     {@link RsmnDataFac }
         *     
         */
        public RsmnDataFac getRsmnData() {
            return rsmnData;
        }

        /**
         * Define el valor de la propiedad rsmnData.
         * 
         * @param value
         *     allowed object is
         *     {@link RsmnDataFac }
         *     
         */
        public void setRsmnData(RsmnDataFac value) {
            this.rsmnData = value;
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
     *         &lt;element name="TipoComp"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
     *               &lt;enumeration value="142"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Fac"/&gt;
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
        "tipoComp",
        "rsmnData"
    })
    public static class RsmnFacNotaCreditoCtaAj {

        @XmlElement(name = "TipoComp", required = true)
        protected BigInteger tipoComp;
        @XmlElement(name = "RsmnData", required = true)
        protected RsmnDataFac rsmnData;

        /**
         * Obtiene el valor de la propiedad tipoComp.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTipoComp() {
            return tipoComp;
        }

        /**
         * Define el valor de la propiedad tipoComp.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTipoComp(BigInteger value) {
            this.tipoComp = value;
        }

        /**
         * Obtiene el valor de la propiedad rsmnData.
         * 
         * @return
         *     possible object is
         *     {@link RsmnDataFac }
         *     
         */
        public RsmnDataFac getRsmnData() {
            return rsmnData;
        }

        /**
         * Define el valor de la propiedad rsmnData.
         * 
         * @param value
         *     allowed object is
         *     {@link RsmnDataFac }
         *     
         */
        public void setRsmnData(RsmnDataFac value) {
            this.rsmnData = value;
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
     *         &lt;element name="TipoComp"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
     *               &lt;enumeration value="113"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Fac"/&gt;
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
        "tipoComp",
        "rsmnData"
    })
    public static class RsmnFacNotaDebito {

        @XmlElement(name = "TipoComp", required = true)
        protected BigInteger tipoComp;
        @XmlElement(name = "RsmnData", required = true)
        protected RsmnDataFac rsmnData;

        /**
         * Obtiene el valor de la propiedad tipoComp.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTipoComp() {
            return tipoComp;
        }

        /**
         * Define el valor de la propiedad tipoComp.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTipoComp(BigInteger value) {
            this.tipoComp = value;
        }

        /**
         * Obtiene el valor de la propiedad rsmnData.
         * 
         * @return
         *     possible object is
         *     {@link RsmnDataFac }
         *     
         */
        public RsmnDataFac getRsmnData() {
            return rsmnData;
        }

        /**
         * Define el valor de la propiedad rsmnData.
         * 
         * @param value
         *     allowed object is
         *     {@link RsmnDataFac }
         *     
         */
        public void setRsmnData(RsmnDataFac value) {
            this.rsmnData = value;
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
     *         &lt;element name="TipoComp"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
     *               &lt;enumeration value="143"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Fac"/&gt;
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
        "tipoComp",
        "rsmnData"
    })
    public static class RsmnFacNotaDebitoCtaAj {

        @XmlElement(name = "TipoComp", required = true)
        protected BigInteger tipoComp;
        @XmlElement(name = "RsmnData", required = true)
        protected RsmnDataFac rsmnData;

        /**
         * Obtiene el valor de la propiedad tipoComp.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTipoComp() {
            return tipoComp;
        }

        /**
         * Define el valor de la propiedad tipoComp.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTipoComp(BigInteger value) {
            this.tipoComp = value;
        }

        /**
         * Obtiene el valor de la propiedad rsmnData.
         * 
         * @return
         *     possible object is
         *     {@link RsmnDataFac }
         *     
         */
        public RsmnDataFac getRsmnData() {
            return rsmnData;
        }

        /**
         * Define el valor de la propiedad rsmnData.
         * 
         * @param value
         *     allowed object is
         *     {@link RsmnDataFac }
         *     
         */
        public void setRsmnData(RsmnDataFac value) {
            this.rsmnData = value;
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
     *         &lt;element name="TipoComp"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
     *               &lt;enumeration value="181"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Rem"/&gt;
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
        "tipoComp",
        "rsmnData"
    })
    public static class RsmnRem {

        @XmlElement(name = "TipoComp", required = true)
        protected BigInteger tipoComp;
        @XmlElement(name = "RsmnData", required = true)
        protected RsmnDataRem rsmnData;

        /**
         * Obtiene el valor de la propiedad tipoComp.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTipoComp() {
            return tipoComp;
        }

        /**
         * Define el valor de la propiedad tipoComp.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTipoComp(BigInteger value) {
            this.tipoComp = value;
        }

        /**
         * Obtiene el valor de la propiedad rsmnData.
         * 
         * @return
         *     possible object is
         *     {@link RsmnDataRem }
         *     
         */
        public RsmnDataRem getRsmnData() {
            return rsmnData;
        }

        /**
         * Define el valor de la propiedad rsmnData.
         * 
         * @param value
         *     allowed object is
         *     {@link RsmnDataRem }
         *     
         */
        public void setRsmnData(RsmnDataRem value) {
            this.rsmnData = value;
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
     *         &lt;element name="TipoComp"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
     *               &lt;enumeration value="281"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Rem_Cont"/&gt;
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
        "tipoComp",
        "rsmnData"
    })
    public static class RsmnRemCont {

        @XmlElement(name = "TipoComp", required = true)
        protected BigInteger tipoComp;
        @XmlElement(name = "RsmnData", required = true)
        protected RsmnDataRemCont rsmnData;

        /**
         * Obtiene el valor de la propiedad tipoComp.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTipoComp() {
            return tipoComp;
        }

        /**
         * Define el valor de la propiedad tipoComp.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTipoComp(BigInteger value) {
            this.tipoComp = value;
        }

        /**
         * Obtiene el valor de la propiedad rsmnData.
         * 
         * @return
         *     possible object is
         *     {@link RsmnDataRemCont }
         *     
         */
        public RsmnDataRemCont getRsmnData() {
            return rsmnData;
        }

        /**
         * Define el valor de la propiedad rsmnData.
         * 
         * @param value
         *     allowed object is
         *     {@link RsmnDataRemCont }
         *     
         */
        public void setRsmnData(RsmnDataRemCont value) {
            this.rsmnData = value;
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
     *         &lt;element name="TipoComp"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
     *               &lt;enumeration value="124"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Rem_Exp"/&gt;
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
        "tipoComp",
        "rsmnData"
    })
    public static class RsmnRemExp {

        @XmlElement(name = "TipoComp", required = true)
        protected BigInteger tipoComp;
        @XmlElement(name = "RsmnData", required = true)
        protected RsmnDataRemExp rsmnData;

        /**
         * Obtiene el valor de la propiedad tipoComp.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTipoComp() {
            return tipoComp;
        }

        /**
         * Define el valor de la propiedad tipoComp.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTipoComp(BigInteger value) {
            this.tipoComp = value;
        }

        /**
         * Obtiene el valor de la propiedad rsmnData.
         * 
         * @return
         *     possible object is
         *     {@link RsmnDataRemExp }
         *     
         */
        public RsmnDataRemExp getRsmnData() {
            return rsmnData;
        }

        /**
         * Define el valor de la propiedad rsmnData.
         * 
         * @param value
         *     allowed object is
         *     {@link RsmnDataRemExp }
         *     
         */
        public void setRsmnData(RsmnDataRemExp value) {
            this.rsmnData = value;
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
     *         &lt;element name="TipoComp"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
     *               &lt;enumeration value="224"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Rem_Exp_Cont"/&gt;
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
        "tipoComp",
        "rsmnData"
    })
    public static class RsmnRemExpCont {

        @XmlElement(name = "TipoComp", required = true)
        protected BigInteger tipoComp;
        @XmlElement(name = "RsmnData", required = true)
        protected RsmnDataRemExpCont rsmnData;

        /**
         * Obtiene el valor de la propiedad tipoComp.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTipoComp() {
            return tipoComp;
        }

        /**
         * Define el valor de la propiedad tipoComp.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTipoComp(BigInteger value) {
            this.tipoComp = value;
        }

        /**
         * Obtiene el valor de la propiedad rsmnData.
         * 
         * @return
         *     possible object is
         *     {@link RsmnDataRemExpCont }
         *     
         */
        public RsmnDataRemExpCont getRsmnData() {
            return rsmnData;
        }

        /**
         * Define el valor de la propiedad rsmnData.
         * 
         * @param value
         *     allowed object is
         *     {@link RsmnDataRemExpCont }
         *     
         */
        public void setRsmnData(RsmnDataRemExpCont value) {
            this.rsmnData = value;
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
     *         &lt;element name="TipoComp"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
     *               &lt;enumeration value="182"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Resg"/&gt;
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
        "tipoComp",
        "rsmnData"
    })
    public static class RsmnResg {

        @XmlElement(name = "TipoComp", required = true)
        protected BigInteger tipoComp;
        @XmlElement(name = "RsmnData", required = true)
        protected RsmnDataResg rsmnData;

        /**
         * Obtiene el valor de la propiedad tipoComp.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTipoComp() {
            return tipoComp;
        }

        /**
         * Define el valor de la propiedad tipoComp.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTipoComp(BigInteger value) {
            this.tipoComp = value;
        }

        /**
         * Obtiene el valor de la propiedad rsmnData.
         * 
         * @return
         *     possible object is
         *     {@link RsmnDataResg }
         *     
         */
        public RsmnDataResg getRsmnData() {
            return rsmnData;
        }

        /**
         * Define el valor de la propiedad rsmnData.
         * 
         * @param value
         *     allowed object is
         *     {@link RsmnDataResg }
         *     
         */
        public void setRsmnData(RsmnDataResg value) {
            this.rsmnData = value;
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
     *         &lt;element name="TipoComp"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
     *               &lt;enumeration value="282"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Resg_Cont"/&gt;
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
        "tipoComp",
        "rsmnData"
    })
    public static class RsmnResgCont {

        @XmlElement(name = "TipoComp", required = true)
        protected BigInteger tipoComp;
        @XmlElement(name = "RsmnData", required = true)
        protected RsmnDataResgCont rsmnData;

        /**
         * Obtiene el valor de la propiedad tipoComp.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTipoComp() {
            return tipoComp;
        }

        /**
         * Define el valor de la propiedad tipoComp.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTipoComp(BigInteger value) {
            this.tipoComp = value;
        }

        /**
         * Obtiene el valor de la propiedad rsmnData.
         * 
         * @return
         *     possible object is
         *     {@link RsmnDataResgCont }
         *     
         */
        public RsmnDataResgCont getRsmnData() {
            return rsmnData;
        }

        /**
         * Define el valor de la propiedad rsmnData.
         * 
         * @param value
         *     allowed object is
         *     {@link RsmnDataResgCont }
         *     
         */
        public void setRsmnData(RsmnDataResgCont value) {
            this.rsmnData = value;
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
     *         &lt;element name="TipoComp"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
     *               &lt;enumeration value="101"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Tck"/&gt;
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
        "tipoComp",
        "rsmnData"
    })
    public static class RsmnTck {

        @XmlElement(name = "TipoComp", required = true)
        protected BigInteger tipoComp;
        @XmlElement(name = "RsmnData", required = true)
        protected RsmnDataTck rsmnData;

        /**
         * Obtiene el valor de la propiedad tipoComp.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTipoComp() {
            return tipoComp;
        }

        /**
         * Define el valor de la propiedad tipoComp.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTipoComp(BigInteger value) {
            this.tipoComp = value;
        }

        /**
         * Obtiene el valor de la propiedad rsmnData.
         * 
         * @return
         *     possible object is
         *     {@link RsmnDataTck }
         *     
         */
        public RsmnDataTck getRsmnData() {
            return rsmnData;
        }

        /**
         * Define el valor de la propiedad rsmnData.
         * 
         * @param value
         *     allowed object is
         *     {@link RsmnDataTck }
         *     
         */
        public void setRsmnData(RsmnDataTck value) {
            this.rsmnData = value;
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
     *         &lt;element name="TipoComp"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
     *               &lt;enumeration value="201"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Tck_Cont"/&gt;
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
        "tipoComp",
        "rsmnData"
    })
    public static class RsmnTckCont {

        @XmlElement(name = "TipoComp", required = true)
        protected BigInteger tipoComp;
        @XmlElement(name = "RsmnData", required = true)
        protected RsmnDataTckCont rsmnData;

        /**
         * Obtiene el valor de la propiedad tipoComp.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTipoComp() {
            return tipoComp;
        }

        /**
         * Define el valor de la propiedad tipoComp.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTipoComp(BigInteger value) {
            this.tipoComp = value;
        }

        /**
         * Obtiene el valor de la propiedad rsmnData.
         * 
         * @return
         *     possible object is
         *     {@link RsmnDataTckCont }
         *     
         */
        public RsmnDataTckCont getRsmnData() {
            return rsmnData;
        }

        /**
         * Define el valor de la propiedad rsmnData.
         * 
         * @param value
         *     allowed object is
         *     {@link RsmnDataTckCont }
         *     
         */
        public void setRsmnData(RsmnDataTckCont value) {
            this.rsmnData = value;
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
     *         &lt;element name="TipoComp"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
     *               &lt;enumeration value="202"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Tck_Cont"/&gt;
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
        "tipoComp",
        "rsmnData"
    })
    public static class RsmnTckContNotaCredito {

        @XmlElement(name = "TipoComp", required = true)
        protected BigInteger tipoComp;
        @XmlElement(name = "RsmnData", required = true)
        protected RsmnDataTckCont rsmnData;

        /**
         * Obtiene el valor de la propiedad tipoComp.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTipoComp() {
            return tipoComp;
        }

        /**
         * Define el valor de la propiedad tipoComp.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTipoComp(BigInteger value) {
            this.tipoComp = value;
        }

        /**
         * Obtiene el valor de la propiedad rsmnData.
         * 
         * @return
         *     possible object is
         *     {@link RsmnDataTckCont }
         *     
         */
        public RsmnDataTckCont getRsmnData() {
            return rsmnData;
        }

        /**
         * Define el valor de la propiedad rsmnData.
         * 
         * @param value
         *     allowed object is
         *     {@link RsmnDataTckCont }
         *     
         */
        public void setRsmnData(RsmnDataTckCont value) {
            this.rsmnData = value;
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
     *         &lt;element name="TipoComp"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
     *               &lt;enumeration value="203"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Tck_Cont"/&gt;
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
        "tipoComp",
        "rsmnData"
    })
    public static class RsmnTckContNotaDebito {

        @XmlElement(name = "TipoComp", required = true)
        protected BigInteger tipoComp;
        @XmlElement(name = "RsmnData", required = true)
        protected RsmnDataTckCont rsmnData;

        /**
         * Obtiene el valor de la propiedad tipoComp.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTipoComp() {
            return tipoComp;
        }

        /**
         * Define el valor de la propiedad tipoComp.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTipoComp(BigInteger value) {
            this.tipoComp = value;
        }

        /**
         * Obtiene el valor de la propiedad rsmnData.
         * 
         * @return
         *     possible object is
         *     {@link RsmnDataTckCont }
         *     
         */
        public RsmnDataTckCont getRsmnData() {
            return rsmnData;
        }

        /**
         * Define el valor de la propiedad rsmnData.
         * 
         * @param value
         *     allowed object is
         *     {@link RsmnDataTckCont }
         *     
         */
        public void setRsmnData(RsmnDataTckCont value) {
            this.rsmnData = value;
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
     *         &lt;element name="TipoComp"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
     *               &lt;enumeration value="131"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Tck"/&gt;
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
        "tipoComp",
        "rsmnData"
    })
    public static class RsmnTckCtaAj {

        @XmlElement(name = "TipoComp", required = true)
        protected BigInteger tipoComp;
        @XmlElement(name = "RsmnData", required = true)
        protected RsmnDataTck rsmnData;

        /**
         * Obtiene el valor de la propiedad tipoComp.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTipoComp() {
            return tipoComp;
        }

        /**
         * Define el valor de la propiedad tipoComp.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTipoComp(BigInteger value) {
            this.tipoComp = value;
        }

        /**
         * Obtiene el valor de la propiedad rsmnData.
         * 
         * @return
         *     possible object is
         *     {@link RsmnDataTck }
         *     
         */
        public RsmnDataTck getRsmnData() {
            return rsmnData;
        }

        /**
         * Define el valor de la propiedad rsmnData.
         * 
         * @param value
         *     allowed object is
         *     {@link RsmnDataTck }
         *     
         */
        public void setRsmnData(RsmnDataTck value) {
            this.rsmnData = value;
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
     *         &lt;element name="TipoComp"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
     *               &lt;enumeration value="231"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Tck_Cont"/&gt;
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
        "tipoComp",
        "rsmnData"
    })
    public static class RsmnTckCtaAjCont {

        @XmlElement(name = "TipoComp", required = true)
        protected BigInteger tipoComp;
        @XmlElement(name = "RsmnData", required = true)
        protected RsmnDataTckCont rsmnData;

        /**
         * Obtiene el valor de la propiedad tipoComp.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTipoComp() {
            return tipoComp;
        }

        /**
         * Define el valor de la propiedad tipoComp.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTipoComp(BigInteger value) {
            this.tipoComp = value;
        }

        /**
         * Obtiene el valor de la propiedad rsmnData.
         * 
         * @return
         *     possible object is
         *     {@link RsmnDataTckCont }
         *     
         */
        public RsmnDataTckCont getRsmnData() {
            return rsmnData;
        }

        /**
         * Define el valor de la propiedad rsmnData.
         * 
         * @param value
         *     allowed object is
         *     {@link RsmnDataTckCont }
         *     
         */
        public void setRsmnData(RsmnDataTckCont value) {
            this.rsmnData = value;
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
     *         &lt;element name="TipoComp"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
     *               &lt;enumeration value="232"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Tck_Cont"/&gt;
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
        "tipoComp",
        "rsmnData"
    })
    public static class RsmnTckCtaAjContNotaCredito {

        @XmlElement(name = "TipoComp", required = true)
        protected BigInteger tipoComp;
        @XmlElement(name = "RsmnData", required = true)
        protected RsmnDataTckCont rsmnData;

        /**
         * Obtiene el valor de la propiedad tipoComp.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTipoComp() {
            return tipoComp;
        }

        /**
         * Define el valor de la propiedad tipoComp.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTipoComp(BigInteger value) {
            this.tipoComp = value;
        }

        /**
         * Obtiene el valor de la propiedad rsmnData.
         * 
         * @return
         *     possible object is
         *     {@link RsmnDataTckCont }
         *     
         */
        public RsmnDataTckCont getRsmnData() {
            return rsmnData;
        }

        /**
         * Define el valor de la propiedad rsmnData.
         * 
         * @param value
         *     allowed object is
         *     {@link RsmnDataTckCont }
         *     
         */
        public void setRsmnData(RsmnDataTckCont value) {
            this.rsmnData = value;
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
     *         &lt;element name="TipoComp"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
     *               &lt;enumeration value="233"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Tck_Cont"/&gt;
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
        "tipoComp",
        "rsmnData"
    })
    public static class RsmnTckCtaAjContNotaDebito {

        @XmlElement(name = "TipoComp", required = true)
        protected BigInteger tipoComp;
        @XmlElement(name = "RsmnData", required = true)
        protected RsmnDataTckCont rsmnData;

        /**
         * Obtiene el valor de la propiedad tipoComp.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTipoComp() {
            return tipoComp;
        }

        /**
         * Define el valor de la propiedad tipoComp.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTipoComp(BigInteger value) {
            this.tipoComp = value;
        }

        /**
         * Obtiene el valor de la propiedad rsmnData.
         * 
         * @return
         *     possible object is
         *     {@link RsmnDataTckCont }
         *     
         */
        public RsmnDataTckCont getRsmnData() {
            return rsmnData;
        }

        /**
         * Define el valor de la propiedad rsmnData.
         * 
         * @param value
         *     allowed object is
         *     {@link RsmnDataTckCont }
         *     
         */
        public void setRsmnData(RsmnDataTckCont value) {
            this.rsmnData = value;
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
     *         &lt;element name="TipoComp"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
     *               &lt;enumeration value="102"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Tck"/&gt;
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
        "tipoComp",
        "rsmnData"
    })
    public static class RsmnTckNotaCredito {

        @XmlElement(name = "TipoComp", required = true)
        protected BigInteger tipoComp;
        @XmlElement(name = "RsmnData", required = true)
        protected RsmnDataTck rsmnData;

        /**
         * Obtiene el valor de la propiedad tipoComp.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTipoComp() {
            return tipoComp;
        }

        /**
         * Define el valor de la propiedad tipoComp.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTipoComp(BigInteger value) {
            this.tipoComp = value;
        }

        /**
         * Obtiene el valor de la propiedad rsmnData.
         * 
         * @return
         *     possible object is
         *     {@link RsmnDataTck }
         *     
         */
        public RsmnDataTck getRsmnData() {
            return rsmnData;
        }

        /**
         * Define el valor de la propiedad rsmnData.
         * 
         * @param value
         *     allowed object is
         *     {@link RsmnDataTck }
         *     
         */
        public void setRsmnData(RsmnDataTck value) {
            this.rsmnData = value;
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
     *         &lt;element name="TipoComp"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
     *               &lt;enumeration value="132"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Tck"/&gt;
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
        "tipoComp",
        "rsmnData"
    })
    public static class RsmnTckNotaCreditoCtaAj {

        @XmlElement(name = "TipoComp", required = true)
        protected BigInteger tipoComp;
        @XmlElement(name = "RsmnData", required = true)
        protected RsmnDataTck rsmnData;

        /**
         * Obtiene el valor de la propiedad tipoComp.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTipoComp() {
            return tipoComp;
        }

        /**
         * Define el valor de la propiedad tipoComp.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTipoComp(BigInteger value) {
            this.tipoComp = value;
        }

        /**
         * Obtiene el valor de la propiedad rsmnData.
         * 
         * @return
         *     possible object is
         *     {@link RsmnDataTck }
         *     
         */
        public RsmnDataTck getRsmnData() {
            return rsmnData;
        }

        /**
         * Define el valor de la propiedad rsmnData.
         * 
         * @param value
         *     allowed object is
         *     {@link RsmnDataTck }
         *     
         */
        public void setRsmnData(RsmnDataTck value) {
            this.rsmnData = value;
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
     *         &lt;element name="TipoComp"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
     *               &lt;enumeration value="103"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Tck"/&gt;
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
        "tipoComp",
        "rsmnData"
    })
    public static class RsmnTckNotaDebito {

        @XmlElement(name = "TipoComp", required = true)
        protected BigInteger tipoComp;
        @XmlElement(name = "RsmnData", required = true)
        protected RsmnDataTck rsmnData;

        /**
         * Obtiene el valor de la propiedad tipoComp.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTipoComp() {
            return tipoComp;
        }

        /**
         * Define el valor de la propiedad tipoComp.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTipoComp(BigInteger value) {
            this.tipoComp = value;
        }

        /**
         * Obtiene el valor de la propiedad rsmnData.
         * 
         * @return
         *     possible object is
         *     {@link RsmnDataTck }
         *     
         */
        public RsmnDataTck getRsmnData() {
            return rsmnData;
        }

        /**
         * Define el valor de la propiedad rsmnData.
         * 
         * @param value
         *     allowed object is
         *     {@link RsmnDataTck }
         *     
         */
        public void setRsmnData(RsmnDataTck value) {
            this.rsmnData = value;
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
     *         &lt;element name="TipoComp"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}CFEType"&gt;
     *               &lt;enumeration value="133"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RsmnData" type="{http://cfe.dgi.gub.uy}RsmnData_Tck"/&gt;
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
        "tipoComp",
        "rsmnData"
    })
    public static class RsmnTckNotaDebitoCtaAj {

        @XmlElement(name = "TipoComp", required = true)
        protected BigInteger tipoComp;
        @XmlElement(name = "RsmnData", required = true)
        protected RsmnDataTck rsmnData;

        /**
         * Obtiene el valor de la propiedad tipoComp.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTipoComp() {
            return tipoComp;
        }

        /**
         * Define el valor de la propiedad tipoComp.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTipoComp(BigInteger value) {
            this.tipoComp = value;
        }

        /**
         * Obtiene el valor de la propiedad rsmnData.
         * 
         * @return
         *     possible object is
         *     {@link RsmnDataTck }
         *     
         */
        public RsmnDataTck getRsmnData() {
            return rsmnData;
        }

        /**
         * Define el valor de la propiedad rsmnData.
         * 
         * @param value
         *     allowed object is
         *     {@link RsmnDataTck }
         *     
         */
        public void setRsmnData(RsmnDataTck value) {
            this.rsmnData = value;
        }

    }

}
