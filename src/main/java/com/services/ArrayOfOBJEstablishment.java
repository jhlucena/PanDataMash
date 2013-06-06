
package com.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOBJ_Establishment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOBJ_Establishment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OBJ_Establishment" type="{http://tempuri.org/}OBJ_Establishment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOBJ_Establishment", propOrder = {
    "objEstablishment"
})
public class ArrayOfOBJEstablishment {

    @XmlElement(name = "OBJ_Establishment", nillable = true)
    protected List<OBJEstablishment> objEstablishment;

    /**
     * Gets the value of the objEstablishment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objEstablishment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOBJEstablishment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OBJEstablishment }
     * 
     * 
     */
    public List<OBJEstablishment> getOBJEstablishment() {
        if (objEstablishment == null) {
            objEstablishment = new ArrayList<OBJEstablishment>();
        }
        return this.objEstablishment;
    }

}
