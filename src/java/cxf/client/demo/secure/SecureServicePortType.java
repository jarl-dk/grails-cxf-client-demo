package cxf.client.demo.secure;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.2
 * 2012-03-02T10:43:15.100-06:00
 * Generated source version: 2.4.2
 * 
 */
@WebService(targetNamespace = "http://demo.client.cxf/", name = "SecureServicePortType")
@XmlSeeAlso({ObjectFactory.class})
public interface SecureServicePortType {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "secureMethod", targetNamespace = "http://demo.client.cxf/", className = "cxf.client.demo.secure.SecureMethod")
    @WebMethod
    @ResponseWrapper(localName = "secureMethodResponse", targetNamespace = "http://demo.client.cxf/", className = "cxf.client.demo.secure.SecureMethodResponse")
    public cxf.client.demo.secure.SimpleResponse secureMethod();
}
