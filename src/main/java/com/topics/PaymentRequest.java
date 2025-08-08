package com.topics;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;


/**
 * PaymentRequest
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class PaymentRequest {

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
    private Integer correlatorId;
    /**
     * 
     * (Required)
     * 
     */
    private Double paymentAmount;
    /**
     * 
     * (Required)
     * 
     */
    private String email;
    /**
     * Credit card number without spaces or dashes
     * (Required)
     * 
     */
    private String creditCard;
    /**
     * Card verification code (3 or 4 digits)
     * (Required)
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
    public Integer getCorrelatorId() {
        return correlatorId;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setCorrelatorId(Integer correlatorId) {
        this.correlatorId = correlatorId;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Double getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
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

    /**
     * Credit card number without spaces or dashes
     * (Required)
     * 
     */
    public String getCreditCard() {
        return creditCard;
    }

    /**
     * Credit card number without spaces or dashes
     * (Required)
     * 
     */
    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    /**
     * Card verification code (3 or 4 digits)
     * (Required)
     * 
     */
    public String getCvc() {
        return cvc;
    }

    /**
     * Card verification code (3 or 4 digits)
     * (Required)
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
        sb.append(PaymentRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("topicName");
        sb.append('=');
        sb.append(((this.topicName == null)?"<null>":this.topicName));
        sb.append(',');
        sb.append("correlatorId");
        sb.append('=');
        sb.append(((this.correlatorId == null)?"<null>":this.correlatorId));
        sb.append(',');
        sb.append("paymentAmount");
        sb.append('=');
        sb.append(((this.paymentAmount == null)?"<null>":this.paymentAmount));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
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
        result = ((result* 31)+((this.topicName == null)? 0 :this.topicName.hashCode()));
        result = ((result* 31)+((this.correlatorId == null)? 0 :this.correlatorId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.creditCard == null)? 0 :this.creditCard.hashCode()));
        result = ((result* 31)+((this.paymentAmount == null)? 0 :this.paymentAmount.hashCode()));
        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PaymentRequest) == false) {
            return false;
        }
        PaymentRequest rhs = ((PaymentRequest) other);
        return ((((((((this.cvc == rhs.cvc)||((this.cvc!= null)&&this.cvc.equals(rhs.cvc)))&&((this.topicName == rhs.topicName)||((this.topicName!= null)&&this.topicName.equals(rhs.topicName))))&&((this.correlatorId == rhs.correlatorId)||((this.correlatorId!= null)&&this.correlatorId.equals(rhs.correlatorId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.creditCard == rhs.creditCard)||((this.creditCard!= null)&&this.creditCard.equals(rhs.creditCard))))&&((this.paymentAmount == rhs.paymentAmount)||((this.paymentAmount!= null)&&this.paymentAmount.equals(rhs.paymentAmount))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))));
    }

}
