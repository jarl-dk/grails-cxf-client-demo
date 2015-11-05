package cxf.client.demo.simple;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.3
 * 2015-11-05T11:18:05.687-06:00
 * Generated source version: 3.1.3
 * 
 */
@WebService(targetNamespace = "http://demo.client.cxf/", name = "SimpleService")
@XmlSeeAlso({ObjectFactory.class})
public interface SimpleService {

    @WebMethod
    @RequestWrapper(localName = "simpleMethod2", targetNamespace = "http://demo.client.cxf/", className = "cxf.client.demo.simple.SimpleMethod2")
    @ResponseWrapper(localName = "simpleMethod2Response", targetNamespace = "http://demo.client.cxf/", className = "cxf.client.demo.simple.SimpleMethod2Response")
    @WebResult(name = "SimpleResponse", targetNamespace = "")
    public cxf.client.demo.simple.SimpleResponse simpleMethod2(
        @WebParam(name = "simpleRequest", targetNamespace = "")
        cxf.client.demo.simple.SimpleRequest simpleRequest
    );

    @WebMethod
    @RequestWrapper(localName = "simpleMethod1", targetNamespace = "http://demo.client.cxf/", className = "cxf.client.demo.simple.SimpleMethod1")
    @ResponseWrapper(localName = "simpleMethod1Response", targetNamespace = "http://demo.client.cxf/", className = "cxf.client.demo.simple.SimpleMethod1Response")
    @WebResult(name = "SimpleResponse", targetNamespace = "")
    public cxf.client.demo.simple.SimpleResponse simpleMethod1(
        @WebParam(name = "simpleRequest", targetNamespace = "")
        cxf.client.demo.simple.SimpleRequest simpleRequest
    );
}