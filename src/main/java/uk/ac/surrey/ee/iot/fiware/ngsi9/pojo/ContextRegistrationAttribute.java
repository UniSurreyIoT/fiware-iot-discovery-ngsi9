//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.25 at 06:50:50 PM BST 
//


package uk.ac.surrey.ee.iot.fiware.ngsi9.pojo;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType; 


/**
 * <p>Java class for ContextRegistrationAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContextRegistrationAttribute">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isDomain" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="metadata" type="{}ContextMetadataList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContextRegistrationAttribute")
public class ContextRegistrationAttribute {

    @XmlElement(required = true)
    protected String name;
    protected String type;
    protected boolean isDomain;
//    @SerializedName("metadatas")
//    protected ContextMetadataList metadata;
     @XmlElementWrapper(name="metadata")
     @SerializedName("metadatas")
//     @XmlElementRef
    protected List<ContextMetadata> contextMetadata;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the isDomain property.
     * 
     */
    public boolean isIsDomain() {
        return isDomain;
    }

    /**
     * Sets the value of the isDomain property.
     * 
     */
    public void setIsDomain(boolean value) {
        this.isDomain = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link ContextMetadataList }
     *     
     */
//    public ContextMetadataList getMetadata() {
//        return metadata;
//    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextMetadataList }
     *     
     */
//    public void setMetadata(ContextMetadataList value) {
//        this.metadata = value;
//    }
    public List<ContextMetadata> getContextMetadata() {
        if (contextMetadata == null) {
            contextMetadata = new ArrayList<ContextMetadata>();
        }
        return this.contextMetadata;
    }

}
