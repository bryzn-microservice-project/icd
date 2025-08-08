package com.topics;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;


/**
 * NewAccountRequest
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class NewAccountRequest {

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
     * Account
     * <p>
     * 
     * (Required)
     * 
     */
    private Account account;
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
     * Account
     * <p>
     * 
     * (Required)
     * 
     */
    public Account getAccount() {
        return account;
    }

    /**
     * Account
     * <p>
     * 
     * (Required)
     * 
     */
    public void setAccount(Account account) {
        this.account = account;
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
        sb.append(NewAccountRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("topicName");
        sb.append('=');
        sb.append(((this.topicName == null)?"<null>":this.topicName));
        sb.append(',');
        sb.append("correlatorId");
        sb.append('=');
        sb.append(((this.correlatorId == null)?"<null>":this.correlatorId));
        sb.append(',');
        sb.append("account");
        sb.append('=');
        sb.append(((this.account == null)?"<null>":this.account));
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
        result = ((result* 31)+((this.topicName == null)? 0 :this.topicName.hashCode()));
        result = ((result* 31)+((this.correlatorId == null)? 0 :this.correlatorId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.account == null)? 0 :this.account.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NewAccountRequest) == false) {
            return false;
        }
        NewAccountRequest rhs = ((NewAccountRequest) other);
        return (((((this.topicName == rhs.topicName)||((this.topicName!= null)&&this.topicName.equals(rhs.topicName)))&&((this.correlatorId == rhs.correlatorId)||((this.correlatorId!= null)&&this.correlatorId.equals(rhs.correlatorId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.account == rhs.account)||((this.account!= null)&&this.account.equals(rhs.account))));
    }

}
