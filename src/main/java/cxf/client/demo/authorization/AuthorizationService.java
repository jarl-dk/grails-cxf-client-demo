package cxf.client.demo.authorization;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.3
 * 2016-01-14T16:15:01.047-06:00
 * Generated source version: 3.1.3
 * 
 */
@WebService(targetNamespace = "http://demo.client.cxf/", name = "AuthorizationService")
@XmlSeeAlso({ObjectFactory.class})
public interface AuthorizationService {

    @WebMethod
    @RequestWrapper(localName = "secureMethod", targetNamespace = "http://demo.client.cxf/", className = "cxf.client.demo.authorization.SecureMethod")
    @ResponseWrapper(localName = "secureMethodResponse", targetNamespace = "http://demo.client.cxf/", className = "cxf.client.demo.authorization.SecureMethodResponse")
    @WebResult(name = "SimpleResponse", targetNamespace = "")
    public cxf.client.demo.authorization.SimpleResponse secureMethod();
}
