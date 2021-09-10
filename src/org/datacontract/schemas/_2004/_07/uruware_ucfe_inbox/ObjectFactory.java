
package org.datacontract.schemas._2004._07.uruware_ucfe_inbox;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.uruware.ucfe.inbox.webservice.RespuestaDeUcfe;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.uruware_ucfe_inbox package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RespBody_QNAME = new QName("http://schemas.datacontract.org/2004/07/Uruware.Ucfe.Inbox.WebService", "RespBody");
    private final static QName _RespBodyResp_QNAME = new QName("http://schemas.datacontract.org/2004/07/Uruware.Ucfe.Inbox.WebService", "Resp");
    private final static QName _RespBodyRespEnc_QNAME = new QName("http://schemas.datacontract.org/2004/07/Uruware.Ucfe.Inbox.WebService", "RespEnc");
    private final static QName _RespBodyErrorMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Uruware.Ucfe.Inbox.WebService", "ErrorMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.uruware_ucfe_inbox
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RespBody }
     * 
     */
    public RespBody createRespBody() {
        return new RespBody();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespBody }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Uruware.Ucfe.Inbox.WebService", name = "RespBody")
    public JAXBElement<RespBody> createRespBody(RespBody value) {
        return new JAXBElement<RespBody>(_RespBody_QNAME, RespBody.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespuestaDeUcfe }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Uruware.Ucfe.Inbox.WebService", name = "Resp", scope = RespBody.class)
    public JAXBElement<RespuestaDeUcfe> createRespBodyResp(RespuestaDeUcfe value) {
        return new JAXBElement<RespuestaDeUcfe>(_RespBodyResp_QNAME, RespuestaDeUcfe.class, RespBody.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Uruware.Ucfe.Inbox.WebService", name = "RespEnc", scope = RespBody.class)
    public JAXBElement<String> createRespBodyRespEnc(String value) {
        return new JAXBElement<String>(_RespBodyRespEnc_QNAME, String.class, RespBody.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Uruware.Ucfe.Inbox.WebService", name = "ErrorMessage", scope = RespBody.class)
    public JAXBElement<String> createRespBodyErrorMessage(String value) {
        return new JAXBElement<String>(_RespBodyErrorMessage_QNAME, String.class, RespBody.class, value);
    }

}
