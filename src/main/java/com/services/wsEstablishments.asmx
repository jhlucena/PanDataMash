<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://tempuri.org/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" targetNamespace="http://tempuri.org/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://tempuri.org/">
      <s:element name="getEstablishments">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="status" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="establishment" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="municipality" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="getEstablishmentsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="getEstablishmentsResult" type="tns:ArrayOfOBJ_Establishment" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfOBJ_Establishment">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="OBJ_Establishment" nillable="true" type="tns:OBJ_Establishment" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="OBJ_Establishment">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="estId" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="estName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="estTrackingNumber" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="estAuthNumber" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="estStatusCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="estStatus" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="estBusinessType" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="estOpeningDate" type="s:dateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="estLegalStructure" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="estRegion" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="estMunicipality" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="estUnitNumber" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="estChain" type="s:boolean" />
          <s:element minOccurs="1" maxOccurs="1" name="estFranchise" type="s:boolean" />
          <s:element minOccurs="0" maxOccurs="1" name="estPhone1" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="estPhoneType1" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="estPhone2" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="estPhoneType2" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="estEmail" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="estAddPostal1" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="estAddPostal2" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="estAddPostalCity" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="estAddPostalState" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="estAddPostalZipCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="estAddPhysical1" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="estAddPhysical2" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="estAddPhysicalNeighborhood" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="estAddPhysicalStreet" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="estAddPhysicalKilometer" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="estAddPhysicalCity" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="estAddPhysicalState" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="estAddPhysicalZipCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="estAddAdditionalInfo" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="estLatLong" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="estLatestMod" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="oEstablishmentOtherData" type="tns:OBJ_EstablishmentOtherData" />
          <s:element minOccurs="0" maxOccurs="1" name="oEstablishmentService" type="tns:ArrayOfOBJ_EstablishmentService" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="OBJ_EstablishmentOtherData">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="id" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="openAllyear" type="s:boolean" />
          <s:element minOccurs="1" maxOccurs="1" name="openJanuary" type="s:boolean" />
          <s:element minOccurs="1" maxOccurs="1" name="openFebruary" type="s:boolean" />
          <s:element minOccurs="1" maxOccurs="1" name="openMarch" type="s:boolean" />
          <s:element minOccurs="1" maxOccurs="1" name="openApril" type="s:boolean" />
          <s:element minOccurs="1" maxOccurs="1" name="openMay" type="s:boolean" />
          <s:element minOccurs="1" maxOccurs="1" name="openJune" type="s:boolean" />
          <s:element minOccurs="1" maxOccurs="1" name="openJuly" type="s:boolean" />
          <s:element minOccurs="1" maxOccurs="1" name="openAugust" type="s:boolean" />
          <s:element minOccurs="1" maxOccurs="1" name="openSeptember" type="s:boolean" />
          <s:element minOccurs="1" maxOccurs="1" name="openOctober" type="s:boolean" />
          <s:element minOccurs="1" maxOccurs="1" name="openNovember" type="s:boolean" />
          <s:element minOccurs="1" maxOccurs="1" name="openDecember" type="s:boolean" />
          <s:element minOccurs="1" maxOccurs="1" name="open24Hours" type="s:boolean" />
          <s:element minOccurs="0" maxOccurs="1" name="open24HoursComment" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="employeeAmount" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="cashRegisterAmount" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="scanners" type="s:boolean" />
          <s:element minOccurs="1" maxOccurs="1" name="WICAuthorized" type="s:boolean" />
          <s:element minOccurs="0" maxOccurs="1" name="WICid" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="WICDenied" type="s:boolean" />
          <s:element minOccurs="0" maxOccurs="1" name="WICDeniedReason" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfOBJ_EstablishmentService">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="OBJ_EstablishmentService" nillable="true" type="tns:OBJ_EstablishmentService" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="OBJ_EstablishmentService">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="serviceCode_FK" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="establishment_FK" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="selected" type="s:boolean" />
        </s:sequence>
      </s:complexType>
      <s:element name="ArrayOfOBJ_Establishment" nillable="true" type="tns:ArrayOfOBJ_Establishment" />
    </s:schema>
  </wsdl:types>
  <wsdl:message name="getEstablishmentsSoapIn">
    <wsdl:part name="parameters" element="tns:getEstablishments" />
  </wsdl:message>
  <wsdl:message name="getEstablishmentsSoapOut">
    <wsdl:part name="parameters" element="tns:getEstablishmentsResponse" />
  </wsdl:message>
  <wsdl:message name="getEstablishmentsHttpGetIn">
    <wsdl:part name="status" type="s:string" />
    <wsdl:part name="establishment" type="s:string" />
    <wsdl:part name="municipality" type="s:string" />
  </wsdl:message>
  <wsdl:message name="getEstablishmentsHttpGetOut">
    <wsdl:part name="Body" element="tns:ArrayOfOBJ_Establishment" />
  </wsdl:message>
  <wsdl:message name="getEstablishmentsHttpPostIn">
    <wsdl:part name="status" type="s:string" />
    <wsdl:part name="establishment" type="s:string" />
    <wsdl:part name="municipality" type="s:string" />
  </wsdl:message>
  <wsdl:message name="getEstablishmentsHttpPostOut">
    <wsdl:part name="Body" element="tns:ArrayOfOBJ_Establishment" />
  </wsdl:message>
  <wsdl:portType name="wsEstablishmentsSoap">
    <wsdl:operation name="getEstablishments">
      <wsdl:input message="tns:getEstablishmentsSoapIn" />
      <wsdl:output message="tns:getEstablishmentsSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:portType name="wsEstablishmentsHttpGet">
    <wsdl:operation name="getEstablishments">
      <wsdl:input message="tns:getEstablishmentsHttpGetIn" />
      <wsdl:output message="tns:getEstablishmentsHttpGetOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:portType name="wsEstablishmentsHttpPost">
    <wsdl:operation name="getEstablishments">
      <wsdl:input message="tns:getEstablishmentsHttpPostIn" />
      <wsdl:output message="tns:getEstablishmentsHttpPostOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="wsEstablishmentsSoap" type="tns:wsEstablishmentsSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="getEstablishments">
      <soap:operation soapAction="http://tempuri.org/getEstablishments" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="wsEstablishmentsSoap12" type="tns:wsEstablishmentsSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="getEstablishments">
      <soap12:operation soapAction="http://tempuri.org/getEstablishments" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="wsEstablishmentsHttpGet" type="tns:wsEstablishmentsHttpGet">
    <http:binding verb="GET" />
    <wsdl:operation name="getEstablishments">
      <http:operation location="/getEstablishments" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="wsEstablishmentsHttpPost" type="tns:wsEstablishmentsHttpPost">
    <http:binding verb="POST" />
    <wsdl:operation name="getEstablishments">
      <http:operation location="/getEstablishments" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="wsEstablishments">
    <wsdl:port name="wsEstablishmentsSoap" binding="tns:wsEstablishmentsSoap">
      <soap:address location="https://servicios.adsef.pr.gov/sdec_ws/wsEstablishments.asmx" />
    </wsdl:port>
    <wsdl:port name="wsEstablishmentsSoap12" binding="tns:wsEstablishmentsSoap12">
      <soap12:address location="https://servicios.adsef.pr.gov/sdec_ws/wsEstablishments.asmx" />
    </wsdl:port>
    <wsdl:port name="wsEstablishmentsHttpGet" binding="tns:wsEstablishmentsHttpGet">
      <http:address location="https://servicios.adsef.pr.gov/sdec_ws/wsEstablishments.asmx" />
    </wsdl:port>
    <wsdl:port name="wsEstablishmentsHttpPost" binding="tns:wsEstablishmentsHttpPost">
      <http:address location="https://servicios.adsef.pr.gov/sdec_ws/wsEstablishments.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>