
package org.datacontract.schemas._2004._07.uruware_ucfe_inbox;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.uruware.ucfe.inbox.webservice.RespuestaDeUcfe;


/**
 * <p>Java class for RespBody complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RespBody">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Resp" type="{http://www.uruware.com/ucfe/inbox/webservice}RespuestaDeUcfe" minOccurs="0"/>
 *         &lt;element name="RespEnc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespBody", propOrder = {
    "errorCode",
    "errorMessage",
    "resp",
    "respEnc"
})
public class RespBody {

    @XmlElement(name = "ErrorCode")
    protected Integer errorCode;
    @XmlElementRef(name = "ErrorMessage", namespace = "http://schemas.datacontract.org/2004/07/Uruware.Ucfe.Inbox.WebService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorMessage;
    @XmlElementRef(name = "Resp", namespace = "http://schemas.datacontract.org/2004/07/Uruware.Ucfe.Inbox.WebService", type = JAXBElement.class, required = false)
    protected JAXBElement<RespuestaDeUcfe> resp;
    @XmlElementRef(name = "RespEnc", namespace = "http://schemas.datacontract.org/2004/07/Uruware.Ucfe.Inbox.WebService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> respEnc;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setErrorCode(Integer value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorMessage(JAXBElement<String> value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the resp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RespuestaDeUcfe }{@code >}
     *     
     */
    public JAXBElement<RespuestaDeUcfe> getResp() {
        return resp;
    }

    /**
     * Sets the value of the resp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RespuestaDeUcfe }{@code >}
     *     
     */
    public void setResp(JAXBElement<RespuestaDeUcfe> value) {
        this.resp = value;
    }

    /**
     * Gets the value of the respEnc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRespEnc() {
        return respEnc;
    }

    /**
     * Sets the value of the respEnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRespEnc(JAXBElement<String> value) {
        this.respEnc = value;
    }

}
