
package com.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OBJ_Establishment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OBJ_Establishment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="estId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="estName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estTrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estAuthNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estBusinessType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estOpeningDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="estLegalStructure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estMunicipality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estUnitNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estChain" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="estFranchise" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="estPhone1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estPhoneType1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="estPhone2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estPhoneType2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="estEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estAddPostal1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estAddPostal2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estAddPostalCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estAddPostalState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estAddPostalZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estAddPhysical1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estAddPhysical2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estAddPhysicalNeighborhood" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estAddPhysicalStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estAddPhysicalKilometer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estAddPhysicalCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estAddPhysicalState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estAddPhysicalZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estAddAdditionalInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estLatLong" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estLatestMod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oEstablishmentOtherData" type="{http://tempuri.org/}OBJ_EstablishmentOtherData" minOccurs="0"/>
 *         &lt;element name="oEstablishmentService" type="{http://tempuri.org/}ArrayOfOBJ_EstablishmentService" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OBJ_Establishment", propOrder = {
    "estId",
    "estName",
    "estTrackingNumber",
    "estAuthNumber",
    "estStatusCode",
    "estStatus",
    "estBusinessType",
    "estOpeningDate",
    "estLegalStructure",
    "estRegion",
    "estMunicipality",
    "estUnitNumber",
    "estChain",
    "estFranchise",
    "estPhone1",
    "estPhoneType1",
    "estPhone2",
    "estPhoneType2",
    "estEmail",
    "estAddPostal1",
    "estAddPostal2",
    "estAddPostalCity",
    "estAddPostalState",
    "estAddPostalZipCode",
    "estAddPhysical1",
    "estAddPhysical2",
    "estAddPhysicalNeighborhood",
    "estAddPhysicalStreet",
    "estAddPhysicalKilometer",
    "estAddPhysicalCity",
    "estAddPhysicalState",
    "estAddPhysicalZipCode",
    "estAddAdditionalInfo",
    "estLatLong",
    "estLatestMod",
    "oEstablishmentOtherData",
    "oEstablishmentService"
})
public class OBJEstablishment {

    protected int estId;
    protected String estName;
    protected String estTrackingNumber;
    protected String estAuthNumber;
    protected String estStatusCode;
    protected String estStatus;
    protected String estBusinessType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar estOpeningDate;
    protected String estLegalStructure;
    protected String estRegion;
    protected String estMunicipality;
    protected String estUnitNumber;
    protected boolean estChain;
    protected boolean estFranchise;
    protected String estPhone1;
    protected int estPhoneType1;
    protected String estPhone2;
    protected int estPhoneType2;
    protected String estEmail;
    protected String estAddPostal1;
    protected String estAddPostal2;
    protected String estAddPostalCity;
    protected String estAddPostalState;
    protected String estAddPostalZipCode;
    protected String estAddPhysical1;
    protected String estAddPhysical2;
    protected String estAddPhysicalNeighborhood;
    protected String estAddPhysicalStreet;
    protected String estAddPhysicalKilometer;
    protected String estAddPhysicalCity;
    protected String estAddPhysicalState;
    protected String estAddPhysicalZipCode;
    protected String estAddAdditionalInfo;
    protected String estLatLong;
    protected String estLatestMod;
    protected OBJEstablishmentOtherData oEstablishmentOtherData;
    protected ArrayOfOBJEstablishmentService oEstablishmentService;

    /**
     * Gets the value of the estId property.
     * 
     */
    public int getEstId() {
        return estId;
    }

    /**
     * Sets the value of the estId property.
     * 
     */
    public void setEstId(int value) {
        this.estId = value;
    }

    /**
     * Gets the value of the estName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstName() {
        return estName;
    }

    /**
     * Sets the value of the estName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstName(String value) {
        this.estName = value;
    }

    /**
     * Gets the value of the estTrackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstTrackingNumber() {
        return estTrackingNumber;
    }

    /**
     * Sets the value of the estTrackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstTrackingNumber(String value) {
        this.estTrackingNumber = value;
    }

    /**
     * Gets the value of the estAuthNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstAuthNumber() {
        return estAuthNumber;
    }

    /**
     * Sets the value of the estAuthNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstAuthNumber(String value) {
        this.estAuthNumber = value;
    }

    /**
     * Gets the value of the estStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstStatusCode() {
        return estStatusCode;
    }

    /**
     * Sets the value of the estStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstStatusCode(String value) {
        this.estStatusCode = value;
    }

    /**
     * Gets the value of the estStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstStatus() {
        return estStatus;
    }

    /**
     * Sets the value of the estStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstStatus(String value) {
        this.estStatus = value;
    }

    /**
     * Gets the value of the estBusinessType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstBusinessType() {
        return estBusinessType;
    }

    /**
     * Sets the value of the estBusinessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstBusinessType(String value) {
        this.estBusinessType = value;
    }

    /**
     * Gets the value of the estOpeningDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstOpeningDate() {
        return estOpeningDate;
    }

    /**
     * Sets the value of the estOpeningDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstOpeningDate(XMLGregorianCalendar value) {
        this.estOpeningDate = value;
    }

    /**
     * Gets the value of the estLegalStructure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstLegalStructure() {
        return estLegalStructure;
    }

    /**
     * Sets the value of the estLegalStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstLegalStructure(String value) {
        this.estLegalStructure = value;
    }

    /**
     * Gets the value of the estRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstRegion() {
        return estRegion;
    }

    /**
     * Sets the value of the estRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstRegion(String value) {
        this.estRegion = value;
    }

    /**
     * Gets the value of the estMunicipality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstMunicipality() {
        return estMunicipality;
    }

    /**
     * Sets the value of the estMunicipality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstMunicipality(String value) {
        this.estMunicipality = value;
    }

    /**
     * Gets the value of the estUnitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstUnitNumber() {
        return estUnitNumber;
    }

    /**
     * Sets the value of the estUnitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstUnitNumber(String value) {
        this.estUnitNumber = value;
    }

    /**
     * Gets the value of the estChain property.
     * 
     */
    public boolean isEstChain() {
        return estChain;
    }

    /**
     * Sets the value of the estChain property.
     * 
     */
    public void setEstChain(boolean value) {
        this.estChain = value;
    }

    /**
     * Gets the value of the estFranchise property.
     * 
     */
    public boolean isEstFranchise() {
        return estFranchise;
    }

    /**
     * Sets the value of the estFranchise property.
     * 
     */
    public void setEstFranchise(boolean value) {
        this.estFranchise = value;
    }

    /**
     * Gets the value of the estPhone1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstPhone1() {
        return estPhone1;
    }

    /**
     * Sets the value of the estPhone1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstPhone1(String value) {
        this.estPhone1 = value;
    }

    /**
     * Gets the value of the estPhoneType1 property.
     * 
     */
    public int getEstPhoneType1() {
        return estPhoneType1;
    }

    /**
     * Sets the value of the estPhoneType1 property.
     * 
     */
    public void setEstPhoneType1(int value) {
        this.estPhoneType1 = value;
    }

    /**
     * Gets the value of the estPhone2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstPhone2() {
        return estPhone2;
    }

    /**
     * Sets the value of the estPhone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstPhone2(String value) {
        this.estPhone2 = value;
    }

    /**
     * Gets the value of the estPhoneType2 property.
     * 
     */
    public int getEstPhoneType2() {
        return estPhoneType2;
    }

    /**
     * Sets the value of the estPhoneType2 property.
     * 
     */
    public void setEstPhoneType2(int value) {
        this.estPhoneType2 = value;
    }

    /**
     * Gets the value of the estEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstEmail() {
        return estEmail;
    }

    /**
     * Sets the value of the estEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstEmail(String value) {
        this.estEmail = value;
    }

    /**
     * Gets the value of the estAddPostal1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstAddPostal1() {
        return estAddPostal1;
    }

    /**
     * Sets the value of the estAddPostal1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstAddPostal1(String value) {
        this.estAddPostal1 = value;
    }

    /**
     * Gets the value of the estAddPostal2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstAddPostal2() {
        return estAddPostal2;
    }

    /**
     * Sets the value of the estAddPostal2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstAddPostal2(String value) {
        this.estAddPostal2 = value;
    }

    /**
     * Gets the value of the estAddPostalCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstAddPostalCity() {
        return estAddPostalCity;
    }

    /**
     * Sets the value of the estAddPostalCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstAddPostalCity(String value) {
        this.estAddPostalCity = value;
    }

    /**
     * Gets the value of the estAddPostalState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstAddPostalState() {
        return estAddPostalState;
    }

    /**
     * Sets the value of the estAddPostalState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstAddPostalState(String value) {
        this.estAddPostalState = value;
    }

    /**
     * Gets the value of the estAddPostalZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstAddPostalZipCode() {
        return estAddPostalZipCode;
    }

    /**
     * Sets the value of the estAddPostalZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstAddPostalZipCode(String value) {
        this.estAddPostalZipCode = value;
    }

    /**
     * Gets the value of the estAddPhysical1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstAddPhysical1() {
        return estAddPhysical1;
    }

    /**
     * Sets the value of the estAddPhysical1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstAddPhysical1(String value) {
        this.estAddPhysical1 = value;
    }

    /**
     * Gets the value of the estAddPhysical2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstAddPhysical2() {
        return estAddPhysical2;
    }

    /**
     * Sets the value of the estAddPhysical2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstAddPhysical2(String value) {
        this.estAddPhysical2 = value;
    }

    /**
     * Gets the value of the estAddPhysicalNeighborhood property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstAddPhysicalNeighborhood() {
        return estAddPhysicalNeighborhood;
    }

    /**
     * Sets the value of the estAddPhysicalNeighborhood property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstAddPhysicalNeighborhood(String value) {
        this.estAddPhysicalNeighborhood = value;
    }

    /**
     * Gets the value of the estAddPhysicalStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstAddPhysicalStreet() {
        return estAddPhysicalStreet;
    }

    /**
     * Sets the value of the estAddPhysicalStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstAddPhysicalStreet(String value) {
        this.estAddPhysicalStreet = value;
    }

    /**
     * Gets the value of the estAddPhysicalKilometer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstAddPhysicalKilometer() {
        return estAddPhysicalKilometer;
    }

    /**
     * Sets the value of the estAddPhysicalKilometer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstAddPhysicalKilometer(String value) {
        this.estAddPhysicalKilometer = value;
    }

    /**
     * Gets the value of the estAddPhysicalCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstAddPhysicalCity() {
        return estAddPhysicalCity;
    }

    /**
     * Sets the value of the estAddPhysicalCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstAddPhysicalCity(String value) {
        this.estAddPhysicalCity = value;
    }

    /**
     * Gets the value of the estAddPhysicalState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstAddPhysicalState() {
        return estAddPhysicalState;
    }

    /**
     * Sets the value of the estAddPhysicalState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstAddPhysicalState(String value) {
        this.estAddPhysicalState = value;
    }

    /**
     * Gets the value of the estAddPhysicalZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstAddPhysicalZipCode() {
        return estAddPhysicalZipCode;
    }

    /**
     * Sets the value of the estAddPhysicalZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstAddPhysicalZipCode(String value) {
        this.estAddPhysicalZipCode = value;
    }

    /**
     * Gets the value of the estAddAdditionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstAddAdditionalInfo() {
        return estAddAdditionalInfo;
    }

    /**
     * Sets the value of the estAddAdditionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstAddAdditionalInfo(String value) {
        this.estAddAdditionalInfo = value;
    }

    /**
     * Gets the value of the estLatLong property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstLatLong() {
        return estLatLong;
    }

    /**
     * Sets the value of the estLatLong property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstLatLong(String value) {
        this.estLatLong = value;
    }

    /**
     * Gets the value of the estLatestMod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstLatestMod() {
        return estLatestMod;
    }

    /**
     * Sets the value of the estLatestMod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstLatestMod(String value) {
        this.estLatestMod = value;
    }

    /**
     * Gets the value of the oEstablishmentOtherData property.
     * 
     * @return
     *     possible object is
     *     {@link OBJEstablishmentOtherData }
     *     
     */
    public OBJEstablishmentOtherData getOEstablishmentOtherData() {
        return oEstablishmentOtherData;
    }

    /**
     * Sets the value of the oEstablishmentOtherData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OBJEstablishmentOtherData }
     *     
     */
    public void setOEstablishmentOtherData(OBJEstablishmentOtherData value) {
        this.oEstablishmentOtherData = value;
    }

    /**
     * Gets the value of the oEstablishmentService property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOBJEstablishmentService }
     *     
     */
    public ArrayOfOBJEstablishmentService getOEstablishmentService() {
        return oEstablishmentService;
    }

    /**
     * Sets the value of the oEstablishmentService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOBJEstablishmentService }
     *     
     */
    public void setOEstablishmentService(ArrayOfOBJEstablishmentService value) {
        this.oEstablishmentService = value;
    }

}
