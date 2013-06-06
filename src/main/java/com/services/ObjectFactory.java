
package com.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.services package. 
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

    private final static QName _ArrayOfOBJEstablishment_QNAME = new QName("http://tempuri.org/", "ArrayOfOBJ_Establishment");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEstablishments }
     * 
     */
    public GetEstablishments createGetEstablishments() {
        return new GetEstablishments();
    }

    /**
     * Create an instance of {@link GetEstablishmentsResponse }
     * 
     */
    public GetEstablishmentsResponse createGetEstablishmentsResponse() {
        return new GetEstablishmentsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfOBJEstablishment }
     * 
     */
    public ArrayOfOBJEstablishment createArrayOfOBJEstablishment() {
        return new ArrayOfOBJEstablishment();
    }

    /**
     * Create an instance of {@link ArrayOfOBJEstablishmentService }
     * 
     */
    public ArrayOfOBJEstablishmentService createArrayOfOBJEstablishmentService() {
        return new ArrayOfOBJEstablishmentService();
    }

    /**
     * Create an instance of {@link OBJEstablishmentService }
     * 
     */
    public OBJEstablishmentService createOBJEstablishmentService() {
        return new OBJEstablishmentService();
    }

    /**
     * Create an instance of {@link OBJEstablishmentOtherData }
     * 
     */
    public OBJEstablishmentOtherData createOBJEstablishmentOtherData() {
        return new OBJEstablishmentOtherData();
    }

    /**
     * Create an instance of {@link OBJEstablishment }
     * 
     */
    public OBJEstablishment createOBJEstablishment() {
        return new OBJEstablishment();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOBJEstablishment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ArrayOfOBJ_Establishment")
    public JAXBElement<ArrayOfOBJEstablishment> createArrayOfOBJEstablishment(ArrayOfOBJEstablishment value) {
        return new JAXBElement<ArrayOfOBJEstablishment>(_ArrayOfOBJEstablishment_QNAME, ArrayOfOBJEstablishment.class, null, value);
    }

}
