//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.11 at 02:07:01 PM UYT 
//


package dto.sisteco.cfe;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EstadoACKCFEType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EstadoACKCFEType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="2"/>
 *     &lt;enumeration value="AE"/>
 *     &lt;enumeration value="BE"/>
 *     &lt;enumeration value="CE"/>
 *     &lt;enumeration value="FE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EstadoACKCFEType")
@XmlEnum
public enum EstadoACKCFEType {

    AE,
    BE,
    CE,
    FE;

    public String value() {
        return name();
    }

    public static EstadoACKCFEType fromValue(String v) {
        return valueOf(v);
    }

}
