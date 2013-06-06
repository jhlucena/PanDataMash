
package com.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OBJ_EstablishmentOtherData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OBJ_EstablishmentOtherData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="openAllyear" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="openJanuary" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="openFebruary" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="openMarch" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="openApril" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="openMay" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="openJune" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="openJuly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="openAugust" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="openSeptember" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="openOctober" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="openNovember" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="openDecember" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="open24Hours" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="open24HoursComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employeeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cashRegisterAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scanners" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="WICAuthorized" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="WICid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WICDenied" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="WICDeniedReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OBJ_EstablishmentOtherData", propOrder = {
    "id",
    "openAllyear",
    "openJanuary",
    "openFebruary",
    "openMarch",
    "openApril",
    "openMay",
    "openJune",
    "openJuly",
    "openAugust",
    "openSeptember",
    "openOctober",
    "openNovember",
    "openDecember",
    "open24Hours",
    "open24HoursComment",
    "employeeAmount",
    "cashRegisterAmount",
    "scanners",
    "wicAuthorized",
    "wiCid",
    "wicDenied",
    "wicDeniedReason"
})
public class OBJEstablishmentOtherData {

    protected int id;
    protected boolean openAllyear;
    protected boolean openJanuary;
    protected boolean openFebruary;
    protected boolean openMarch;
    protected boolean openApril;
    protected boolean openMay;
    protected boolean openJune;
    protected boolean openJuly;
    protected boolean openAugust;
    protected boolean openSeptember;
    protected boolean openOctober;
    protected boolean openNovember;
    protected boolean openDecember;
    protected boolean open24Hours;
    protected String open24HoursComment;
    protected String employeeAmount;
    protected String cashRegisterAmount;
    protected boolean scanners;
    @XmlElement(name = "WICAuthorized")
    protected boolean wicAuthorized;
    @XmlElement(name = "WICid")
    protected String wiCid;
    @XmlElement(name = "WICDenied")
    protected boolean wicDenied;
    @XmlElement(name = "WICDeniedReason")
    protected String wicDeniedReason;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the openAllyear property.
     * 
     */
    public boolean isOpenAllyear() {
        return openAllyear;
    }

    /**
     * Sets the value of the openAllyear property.
     * 
     */
    public void setOpenAllyear(boolean value) {
        this.openAllyear = value;
    }

    /**
     * Gets the value of the openJanuary property.
     * 
     */
    public boolean isOpenJanuary() {
        return openJanuary;
    }

    /**
     * Sets the value of the openJanuary property.
     * 
     */
    public void setOpenJanuary(boolean value) {
        this.openJanuary = value;
    }

    /**
     * Gets the value of the openFebruary property.
     * 
     */
    public boolean isOpenFebruary() {
        return openFebruary;
    }

    /**
     * Sets the value of the openFebruary property.
     * 
     */
    public void setOpenFebruary(boolean value) {
        this.openFebruary = value;
    }

    /**
     * Gets the value of the openMarch property.
     * 
     */
    public boolean isOpenMarch() {
        return openMarch;
    }

    /**
     * Sets the value of the openMarch property.
     * 
     */
    public void setOpenMarch(boolean value) {
        this.openMarch = value;
    }

    /**
     * Gets the value of the openApril property.
     * 
     */
    public boolean isOpenApril() {
        return openApril;
    }

    /**
     * Sets the value of the openApril property.
     * 
     */
    public void setOpenApril(boolean value) {
        this.openApril = value;
    }

    /**
     * Gets the value of the openMay property.
     * 
     */
    public boolean isOpenMay() {
        return openMay;
    }

    /**
     * Sets the value of the openMay property.
     * 
     */
    public void setOpenMay(boolean value) {
        this.openMay = value;
    }

    /**
     * Gets the value of the openJune property.
     * 
     */
    public boolean isOpenJune() {
        return openJune;
    }

    /**
     * Sets the value of the openJune property.
     * 
     */
    public void setOpenJune(boolean value) {
        this.openJune = value;
    }

    /**
     * Gets the value of the openJuly property.
     * 
     */
    public boolean isOpenJuly() {
        return openJuly;
    }

    /**
     * Sets the value of the openJuly property.
     * 
     */
    public void setOpenJuly(boolean value) {
        this.openJuly = value;
    }

    /**
     * Gets the value of the openAugust property.
     * 
     */
    public boolean isOpenAugust() {
        return openAugust;
    }

    /**
     * Sets the value of the openAugust property.
     * 
     */
    public void setOpenAugust(boolean value) {
        this.openAugust = value;
    }

    /**
     * Gets the value of the openSeptember property.
     * 
     */
    public boolean isOpenSeptember() {
        return openSeptember;
    }

    /**
     * Sets the value of the openSeptember property.
     * 
     */
    public void setOpenSeptember(boolean value) {
        this.openSeptember = value;
    }

    /**
     * Gets the value of the openOctober property.
     * 
     */
    public boolean isOpenOctober() {
        return openOctober;
    }

    /**
     * Sets the value of the openOctober property.
     * 
     */
    public void setOpenOctober(boolean value) {
        this.openOctober = value;
    }

    /**
     * Gets the value of the openNovember property.
     * 
     */
    public boolean isOpenNovember() {
        return openNovember;
    }

    /**
     * Sets the value of the openNovember property.
     * 
     */
    public void setOpenNovember(boolean value) {
        this.openNovember = value;
    }

    /**
     * Gets the value of the openDecember property.
     * 
     */
    public boolean isOpenDecember() {
        return openDecember;
    }

    /**
     * Sets the value of the openDecember property.
     * 
     */
    public void setOpenDecember(boolean value) {
        this.openDecember = value;
    }

    /**
     * Gets the value of the open24Hours property.
     * 
     */
    public boolean isOpen24Hours() {
        return open24Hours;
    }

    /**
     * Sets the value of the open24Hours property.
     * 
     */
    public void setOpen24Hours(boolean value) {
        this.open24Hours = value;
    }

    /**
     * Gets the value of the open24HoursComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpen24HoursComment() {
        return open24HoursComment;
    }

    /**
     * Sets the value of the open24HoursComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpen24HoursComment(String value) {
        this.open24HoursComment = value;
    }

    /**
     * Gets the value of the employeeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeAmount() {
        return employeeAmount;
    }

    /**
     * Sets the value of the employeeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeAmount(String value) {
        this.employeeAmount = value;
    }

    /**
     * Gets the value of the cashRegisterAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashRegisterAmount() {
        return cashRegisterAmount;
    }

    /**
     * Sets the value of the cashRegisterAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashRegisterAmount(String value) {
        this.cashRegisterAmount = value;
    }

    /**
     * Gets the value of the scanners property.
     * 
     */
    public boolean isScanners() {
        return scanners;
    }

    /**
     * Sets the value of the scanners property.
     * 
     */
    public void setScanners(boolean value) {
        this.scanners = value;
    }

    /**
     * Gets the value of the wicAuthorized property.
     * 
     */
    public boolean isWICAuthorized() {
        return wicAuthorized;
    }

    /**
     * Sets the value of the wicAuthorized property.
     * 
     */
    public void setWICAuthorized(boolean value) {
        this.wicAuthorized = value;
    }

    /**
     * Gets the value of the wiCid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWICid() {
        return wiCid;
    }

    /**
     * Sets the value of the wiCid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWICid(String value) {
        this.wiCid = value;
    }

    /**
     * Gets the value of the wicDenied property.
     * 
     */
    public boolean isWICDenied() {
        return wicDenied;
    }

    /**
     * Sets the value of the wicDenied property.
     * 
     */
    public void setWICDenied(boolean value) {
        this.wicDenied = value;
    }

    /**
     * Gets the value of the wicDeniedReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWICDeniedReason() {
        return wicDeniedReason;
    }

    /**
     * Sets the value of the wicDeniedReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWICDeniedReason(String value) {
        this.wicDeniedReason = value;
    }

}
