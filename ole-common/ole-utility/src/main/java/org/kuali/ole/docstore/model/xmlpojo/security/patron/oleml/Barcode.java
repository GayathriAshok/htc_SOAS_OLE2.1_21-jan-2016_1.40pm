////
//// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
//// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
//// Any modifications to this file will be lost upon recompilation of the source schema.
//// Generated on: 2012.03.15 at 02:03:46 PM IST
////
//
//
//package org.kuali.ole.docstore.model.xmlpojo.security.patron.oleml;
//
//import com.thoughtworks.xstream.annotations.XStreamAlias;
//
//import javax.xml.bind.annotation.XmlAccessType;
//import javax.xml.bind.annotation.XmlAccessorType;
//import javax.xml.bind.annotation.XmlElement;
//import javax.xml.bind.annotation.XmlSchemaType;
//import javax.xml.bind.annotation.XmlType;
////import javax.xml.datatype.XMLGregorianCalendar;
//
//
///**
// * <p>Java class for barcode complex type.
// *
// * <p>The following schema fragment specifies the expected content contained within this class.
// *
// * <pre>
// * &lt;complexType name="barcode">
// *   &lt;complexContent>
// *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
// *       &lt;sequence>
// *         &lt;element name="barcodeNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
// *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
// *         &lt;element name="statusDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
// *       &lt;/sequence>
// *     &lt;/restriction>
// *   &lt;/complexContent>
// * &lt;/complexType>
// * </pre>
// *
// *
// * @author Rajesh Chowdary K
// * @created Mar 15, 2012
// */
//
//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "barcode", propOrder = {
//    "barcodeNumber",
//    "status",
//    "statusDate"
//})
//@XStreamAlias("barcode")
//public class Barcode {
//
//    @XmlElement(required = true)
//    protected String barcodeNumber;
//    @XmlElement(required = true)
//    protected String status;
//    @XmlElement(required = true)
//    @XmlSchemaType(name = "dateTime")
//    protected String statusDate;
//
//    /**
//     * Gets the value of the barcodeNumber property.
//     *
//     * @return
//     *     possible object is
//     *     {@link String }
//     *
//     */
//    public String getBarcodeNumber() {
//        return barcodeNumber;
//    }
//
//    /**
//     * Sets the value of the barcodeNumber property.
//     *
//     * @param value
//     *     allowed object is
//     *     {@link String }
//     *
//     */
//    public void setBarcodeNumber(String value) {
//        this.barcodeNumber = value;
//    }
//
//    /**
//     * Gets the value of the status property.
//     *
//     * @return
//     *     possible object is
//     *     {@link String }
//     *
//     */
//    public String getStatus() {
//        return status;
//    }
//
//    /**
//     * Sets the value of the status property.
//     *
//     * @param value
//     *     allowed object is
//     *     {@link String }
//     *
//     */
//    public void setStatus(String value) {
//        this.status = value;
//    }
//
//    /**
//     * Gets the value of the statusDate property.
//     *
//     * @return
//     *     possible object is
//     *     {@link String }
//     *
//     */
//    public String getStatusDate() {
//        return statusDate;
//    }
//
//    /**
//     * Sets the value of the statusDate property.
//     *
//     * @param value
//     *     allowed object is
//     *     {@link String }
//     *
//     */
//    public void setStatusDate(String value) {
//        this.statusDate = value;
//    }
//
//}
