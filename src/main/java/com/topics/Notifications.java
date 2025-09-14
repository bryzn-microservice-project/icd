package com.topics;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;


/**
 * Notifications
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class Notifications {

    /**
     * count of notifications
     * (Required)
     * 
     */
    private Integer notificationCount;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * count of notifications
     * (Required)
     * 
     */
    public Integer getNotificationCount() {
        return notificationCount;
    }

    /**
     * count of notifications
     * (Required)
     * 
     */
    public void setNotificationCount(Integer notificationCount) {
        this.notificationCount = notificationCount;
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
        sb.append(Notifications.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("notificationCount");
        sb.append('=');
        sb.append(((this.notificationCount == null)?"<null>":this.notificationCount));
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
        result = ((result* 31)+((this.notificationCount == null)? 0 :this.notificationCount.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Notifications) == false) {
            return false;
        }
        Notifications rhs = ((Notifications) other);
        return (((this.notificationCount == rhs.notificationCount)||((this.notificationCount!= null)&&this.notificationCount.equals(rhs.notificationCount)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
