
package com.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getEstablishmentsResult" type="{http://tempuri.org/}ArrayOfOBJ_Establishment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getEstablishmentsResult"
})
@XmlRootElement(name = "getEstablishmentsResponse")
public class GetEstablishmentsResponse {

    protected ArrayOfOBJEstablishment getEstablishmentsResult;

    /**
     * Gets the value of the getEstablishmentsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOBJEstablishment }
     *     
     */
    public ArrayOfOBJEstablishment getGetEstablishmentsResult() {
        return getEstablishmentsResult;
    }

    /**
     * Sets the value of the getEstablishmentsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOBJEstablishment }
     *     
     */
    public void setGetEstablishmentsResult(ArrayOfOBJEstablishment value) {
        this.getEstablishmentsResult = value;
    }

}
