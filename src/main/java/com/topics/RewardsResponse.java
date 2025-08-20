package com.topics;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;


/**
 * RewardsNotification
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class RewardsResponse {

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
    private String email;
    /**
     * 
     * (Required)
     * 
     */
    private String username;
    /**
     * 
     * (Required)
     * 
     */
    private Integer rewardPoints;
    /**
     * 
     * (Required)
     * 
     */
    private RewardsResponse.Application application;
    /**
     * 
     * (Required)
     * 
     */
    private Date timeStamp;
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
     * 
     * (Required)
     * 
     */
    public String getUsername() {
        return username;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Integer getRewardPoints() {
        return rewardPoints;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setRewardPoints(Integer rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    /**
     * 
     * (Required)
     * 
     */
    public RewardsResponse.Application getApplication() {
        return application;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setApplication(RewardsResponse.Application application) {
        this.application = application;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Date getTimeStamp() {
        return timeStamp;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
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
        sb.append(RewardsResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("topicName");
        sb.append('=');
        sb.append(((this.topicName == null)?"<null>":this.topicName));
        sb.append(',');
        sb.append("correlatorId");
        sb.append('=');
        sb.append(((this.correlatorId == null)?"<null>":this.correlatorId));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
        sb.append(',');
        sb.append("username");
        sb.append('=');
        sb.append(((this.username == null)?"<null>":this.username));
        sb.append(',');
        sb.append("rewardPoints");
        sb.append('=');
        sb.append(((this.rewardPoints == null)?"<null>":this.rewardPoints));
        sb.append(',');
        sb.append("application");
        sb.append('=');
        sb.append(((this.application == null)?"<null>":this.application));
        sb.append(',');
        sb.append("timeStamp");
        sb.append('=');
        sb.append(((this.timeStamp == null)?"<null>":this.timeStamp));
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
        result = ((result* 31)+((this.timeStamp == null)? 0 :this.timeStamp.hashCode()));
        result = ((result* 31)+((this.application == null)? 0 :this.application.hashCode()));
        result = ((result* 31)+((this.topicName == null)? 0 :this.topicName.hashCode()));
        result = ((result* 31)+((this.correlatorId == null)? 0 :this.correlatorId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.rewardPoints == null)? 0 :this.rewardPoints.hashCode()));
        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
        result = ((result* 31)+((this.username == null)? 0 :this.username.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RewardsResponse) == false) {
            return false;
        }
        RewardsResponse rhs = ((RewardsResponse) other);
        return (((((((((this.timeStamp == rhs.timeStamp)||((this.timeStamp!= null)&&this.timeStamp.equals(rhs.timeStamp)))&&((this.application == rhs.application)||((this.application!= null)&&this.application.equals(rhs.application))))&&((this.topicName == rhs.topicName)||((this.topicName!= null)&&this.topicName.equals(rhs.topicName))))&&((this.correlatorId == rhs.correlatorId)||((this.correlatorId!= null)&&this.correlatorId.equals(rhs.correlatorId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.rewardPoints == rhs.rewardPoints)||((this.rewardPoints!= null)&&this.rewardPoints.equals(rhs.rewardPoints))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))))&&((this.username == rhs.username)||((this.username!= null)&&this.username.equals(rhs.username))));
    }

    @Generated("jsonschema2pojo")
    public enum Application {

        SUCCESS("SUCCESS"),
        FAILED("FAILED");
        private final String value;
        private final static Map<String, RewardsResponse.Application> CONSTANTS = new HashMap<String, RewardsResponse.Application>();

        static {
            for (RewardsResponse.Application c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Application(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static RewardsResponse.Application fromValue(String value) {
            RewardsResponse.Application constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
