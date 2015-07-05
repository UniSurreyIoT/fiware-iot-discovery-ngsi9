//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.04 at 03:29:07 PM GMT 
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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContextRegistration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContextRegistration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entityIdList" type="{}EntityIdList" minOccurs="0"/>
 *         &lt;element name="contextRegistrationAttributeList" type="{}ContextRegistrationAttributeList" minOccurs="0"/>
 *         &lt;element name="registrationMetadata" type="{}RegistrationMetadata" minOccurs="0"/>
 *         &lt;element name="providingApplication" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContextRegistration")
public class ContextRegistration {  

    @XmlElementWrapper(name="entityIdList")
    @SerializedName("entities")
    protected List<EntityId> entityId;
    @XmlElementWrapper(name="contextRegistrationAttributeList")
    @SerializedName("attributes")
    protected List<ContextRegistrationAttribute> contextRegistrationAttribute;    
    @XmlElementWrapper(name="registrationMetadata")
    @SerializedName("metadatas")
    protected List<ContextMetadata> contextMetadata;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String providingApplication;
    
    
    public List<ContextMetadata> getContextMetadata() {
        if (contextMetadata == null) {
            contextMetadata = new ArrayList<>();
        }
        return this.contextMetadata;
    }
    
    public List<EntityId> getEntityId() {
        if (entityId == null) {
            entityId = new ArrayList<>();
        }
        return this.entityId;
    }
    
    public List<ContextRegistrationAttribute> getContextRegistrationAttribute() {
        if (contextRegistrationAttribute == null) {
            contextRegistrationAttribute = new ArrayList<>();
        }
        return this.contextRegistrationAttribute;
    }

   
    /**
     * Gets the value of the providingApplication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvidingApplication() {
        return providingApplication;
    }

    /**
     * Sets the value of the providingApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvidingApplication(String value) {
        this.providingApplication = value;
    }
    

}
