
package com.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OBJ_EstablishmentService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OBJ_EstablishmentService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceCode_FK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="establishment_FK" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="selected" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OBJ_EstablishmentService", propOrder = {
    "serviceCodeFK",
    "establishmentFK",
    "selected"
})
public class OBJEstablishmentService {

    @XmlElement(name = "serviceCode_FK")
    protected String serviceCodeFK;
    @XmlElement(name = "establishment_FK")
    protected int establishmentFK;
    protected boolean selected;

    /**
     * Gets the value of the serviceCodeFK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCodeFK() {
        return serviceCodeFK;
    }

    /**
     * Sets the value of the serviceCodeFK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCodeFK(String value) {
        this.serviceCodeFK = value;
    }

    /**
     * Gets the value of the establishmentFK property.
     * 
     */
    public int getEstablishmentFK() {
        return establishmentFK;
    }

    /**
     * Sets the value of the establishmentFK property.
     * 
     */
    public void setEstablishmentFK(int value) {
        this.establishmentFK = value;
    }

    /**
     * Gets the value of the selected property.
     * 
     */
    public boolean isSelected() {
        return selected;
    }

    /**
     * Sets the value of the selected property.
     * 
     */
    public void setSelected(boolean value) {
        this.selected = value;
    }

}
