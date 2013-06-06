
package com.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOBJ_EstablishmentService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOBJ_EstablishmentService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OBJ_EstablishmentService" type="{http://tempuri.org/}OBJ_EstablishmentService" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOBJ_EstablishmentService", propOrder = {
    "objEstablishmentService"
})
public class ArrayOfOBJEstablishmentService {

    @XmlElement(name = "OBJ_EstablishmentService", nillable = true)
    protected List<OBJEstablishmentService> objEstablishmentService;

    /**
     * Gets the value of the objEstablishmentService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objEstablishmentService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOBJEstablishmentService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OBJEstablishmentService }
     * 
     * 
     */
    public List<OBJEstablishmentService> getOBJEstablishmentService() {
        if (objEstablishmentService == null) {
            objEstablishmentService = new ArrayList<OBJEstablishmentService>();
        }
        return this.objEstablishmentService;
    }

}
