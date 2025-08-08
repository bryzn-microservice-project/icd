package com.topics;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;


/**
 * Account
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class Account {

    /**
     * 
     * (Required)
     * 
     */
    private String topicName;
    /**
     * 
     * (Required)
     * 
     */
    private String name;
    /**
     * 
     * (Required)
     * 
     */
    private String email;
    private String username;
    /**
     * Credit card number without spaces or dashes
     * 
     */
    private String creditCard;
    /**
     * Card verification code (3 or 4 digits)
     * 
     */
    private String cvc;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    public String getTopicName() {
        return topicName;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getEmail() {
        return email;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Credit card number without spaces or dashes
     * 
     */
    public String getCreditCard() {
        return creditCard;
    }

    /**
     * Credit card number without spaces or dashes
     * 
     */
    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    /**
     * Card verification code (3 or 4 digits)
     * 
     */
    public String getCvc() {
        return cvc;
    }

    /**
     * Card verification code (3 or 4 digits)
     * 
     */
    public void setCvc(String cvc) {
        this.cvc = cvc;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Account.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("topicName");
        sb.append('=');
        sb.append(((this.topicName == null)?"<null>":this.topicName));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
        sb.append(',');
        sb.append("username");
        sb.append('=');
        sb.append(((this.username == null)?"<null>":this.username));
        sb.append(',');
        sb.append("creditCard");
        sb.append('=');
        sb.append(((this.creditCard == null)?"<null>":this.creditCard));
        sb.append(',');
        sb.append("cvc");
        sb.append('=');
        sb.append(((this.cvc == null)?"<null>":this.cvc));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.cvc == null)? 0 :this.cvc.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.topicName == null)? 0 :this.topicName.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.creditCard == null)? 0 :this.creditCard.hashCode()));
        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
        result = ((result* 31)+((this.username == null)? 0 :this.username.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Account) == false) {
            return false;
        }
        Account rhs = ((Account) other);
        return ((((((((this.cvc == rhs.cvc)||((this.cvc!= null)&&this.cvc.equals(rhs.cvc)))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.topicName == rhs.topicName)||((this.topicName!= null)&&this.topicName.equals(rhs.topicName))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.creditCard == rhs.creditCard)||((this.creditCard!= null)&&this.creditCard.equals(rhs.creditCard))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))))&&((this.username == rhs.username)||((this.username!= null)&&this.username.equals(rhs.username))));
    }

}
