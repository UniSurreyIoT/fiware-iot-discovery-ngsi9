//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.25 at 06:50:50 PM BST 
//


package uk.ac.surrey.ee.iot.fiware.ngsi9.pojo;

import java.util.ArrayList;
import java.util.List;

//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "ContextRegistrationAttributeList")
public class ContextRegistrationAttributeList {

    //@SerializedName("attributes")
    protected List<ContextRegistrationAttribute> contextRegistrationAttribute;

    public List<ContextRegistrationAttribute> getContextRegistrationAttribute() {
        if (contextRegistrationAttribute == null) {
            contextRegistrationAttribute = new ArrayList<>();
        }
        return this.contextRegistrationAttribute;
    }

}
