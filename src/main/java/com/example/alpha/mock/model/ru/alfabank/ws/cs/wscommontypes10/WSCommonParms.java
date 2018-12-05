//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.05 at 06:06:17 PM MSK 
//


package ru.alfabank.ws.cs.wscommontypes10;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSCommonParms complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSCommonParms">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userID" type="{http://WSCommonTypes10.CS.ws.alfabank.ru}WSTypeChar4" minOccurs="0"/>
 *         &lt;element name="branchNumber" type="{http://WSCommonTypes10.CS.ws.alfabank.ru}WSTypeChar4" minOccurs="0"/>
 *         &lt;element name="externalSystemCode" type="{http://WSCommonTypes10.CS.ws.alfabank.ru}WSTypeChar10"/>
 *         &lt;element name="externalUserCode" type="{http://WSCommonTypes10.CS.ws.alfabank.ru}WSTypeChar30"/>
 *         &lt;element name="ldapUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ldapPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inCommonParmsExt" type="{http://WSCommonTypes10.CS.ws.alfabank.ru}WSExtention" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSCommonParms", propOrder = {
    "userID",
    "branchNumber",
    "externalSystemCode",
    "externalUserCode",
    "ldapUser",
    "ldapPassword",
    "inCommonParmsExt"
})
public class WSCommonParms {

    protected String userID;
    protected String branchNumber;
    @XmlElement(required = true)
    protected String externalSystemCode;
    @XmlElement(required = true)
    protected String externalUserCode;
    protected String ldapUser;
    protected String ldapPassword;
    @XmlElement(required = true)
    protected List<WSExtention> inCommonParmsExt;

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the branchNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchNumber() {
        return branchNumber;
    }

    /**
     * Sets the value of the branchNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchNumber(String value) {
        this.branchNumber = value;
    }

    /**
     * Gets the value of the externalSystemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalSystemCode() {
        return externalSystemCode;
    }

    /**
     * Sets the value of the externalSystemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalSystemCode(String value) {
        this.externalSystemCode = value;
    }

    /**
     * Gets the value of the externalUserCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalUserCode() {
        return externalUserCode;
    }

    /**
     * Sets the value of the externalUserCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalUserCode(String value) {
        this.externalUserCode = value;
    }

    /**
     * Gets the value of the ldapUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLdapUser() {
        return ldapUser;
    }

    /**
     * Sets the value of the ldapUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLdapUser(String value) {
        this.ldapUser = value;
    }

    /**
     * Gets the value of the ldapPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLdapPassword() {
        return ldapPassword;
    }

    /**
     * Sets the value of the ldapPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLdapPassword(String value) {
        this.ldapPassword = value;
    }

    /**
     * Gets the value of the inCommonParmsExt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inCommonParmsExt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInCommonParmsExt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSExtention }
     * 
     * 
     */
    public List<WSExtention> getInCommonParmsExt() {
        if (inCommonParmsExt == null) {
            inCommonParmsExt = new ArrayList<WSExtention>();
        }
        return this.inCommonParmsExt;
    }

}
