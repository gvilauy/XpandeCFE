//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.23 a las 05:37:24 PM UTC 
//


package uy.gub.dgi.cfe;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EstadoACKRepType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="EstadoACKRepType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;maxLength value="2"/&gt;
 *     &lt;enumeration value="AR"/&gt;
 *     &lt;enumeration value="BA"/&gt;
 *     &lt;enumeration value="BR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EstadoACKRepType")
@XmlEnum
public enum EstadoACKRepType {

    AR,
    BA,
    BR;

    public String value() {
        return name();
    }

    public static EstadoACKRepType fromValue(String v) {
        return valueOf(v);
    }

}
