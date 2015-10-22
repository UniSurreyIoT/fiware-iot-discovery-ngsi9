//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.25 at 06:50:50 PM BST 
//


package uk.ac.surrey.ee.iot.fiware.ngsi9.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotifyCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotifyCondition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{}NotifyConditionType"/>
 *         &lt;element name="condValueList" type="{}CondValueList" minOccurs="0"/>
 *         &lt;element name="restriction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotifyCondition")
public class NotifyCondition {

    @XmlElement(required = true)
    protected NotifyConditionType type;
    protected CondValueList condValueList;
    protected String restriction;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link NotifyConditionType }
     *     
     */
    public NotifyConditionType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotifyConditionType }
     *     
     */
    public void setType(NotifyConditionType value) {
        this.type = value;
    }

    /**
     * Gets the value of the condValueList property.
     * 
     * @return
     *     possible object is
     *     {@link CondValueList }
     *     
     */
    public CondValueList getCondValueList() {
        return condValueList;
    }

    /**
     * Sets the value of the condValueList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CondValueList }
     *     
     */
    public void setCondValueList(CondValueList value) {
        this.condValueList = value;
    }

    /**
     * Gets the value of the restriction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestriction() {
        return restriction;
    }

    /**
     * Sets the value of the restriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestriction(String value) {
        this.restriction = value;
    }

}
