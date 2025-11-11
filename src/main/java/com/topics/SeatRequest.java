package com.topics;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * SeatRequest
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class SeatRequest {

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
    private String movieName;
    /**
     * 
     * (Required)
     * 
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssXXX", timezone = "UTC")
    private Date showtime;
    /**
     * this will be a seat number with some number ex. A12
     * (Required)
     * 
     */
    private String seatNumber;
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
    public String getMovieName() {
        return movieName;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Date getShowtime() {
        return showtime;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setShowtime(Date showtime) {
        this.showtime = showtime;
    }

    /**
     * this will be a seat number with some number ex. A12
     * (Required)
     * 
     */
    public String getSeatNumber() {
        return seatNumber;
    }

    /**
     * this will be a seat number with some number ex. A12
     * (Required)
     * 
     */
    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
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
        sb.append(SeatRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("topicName");
        sb.append('=');
        sb.append(((this.topicName == null)?"<null>":this.topicName));
        sb.append(',');
        sb.append("correlatorId");
        sb.append('=');
        sb.append(((this.correlatorId == null)?"<null>":this.correlatorId));
        sb.append(',');
        sb.append("movieName");
        sb.append('=');
        sb.append(((this.movieName == null)?"<null>":this.movieName));
        sb.append(',');
        sb.append("showtime");
        sb.append('=');
        sb.append(((this.showtime == null)?"<null>":this.showtime));
        sb.append(',');
        sb.append("seatNumber");
        sb.append('=');
        sb.append(((this.seatNumber == null)?"<null>":this.seatNumber));
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
        result = ((result* 31)+((this.movieName == null)? 0 :this.movieName.hashCode()));
        result = ((result* 31)+((this.showtime == null)? 0 :this.showtime.hashCode()));
        result = ((result* 31)+((this.seatNumber == null)? 0 :this.seatNumber.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SeatRequest) == false) {
            return false;
        }
        SeatRequest rhs = ((SeatRequest) other);
        return (((((((this.topicName == rhs.topicName)||((this.topicName!= null)&&this.topicName.equals(rhs.topicName)))&&((this.correlatorId == rhs.correlatorId)||((this.correlatorId!= null)&&this.correlatorId.equals(rhs.correlatorId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.movieName == rhs.movieName)||((this.movieName!= null)&&this.movieName.equals(rhs.movieName))))&&((this.showtime == rhs.showtime)||((this.showtime!= null)&&this.showtime.equals(rhs.showtime))))&&((this.seatNumber == rhs.seatNumber)||((this.seatNumber!= null)&&this.seatNumber.equals(rhs.seatNumber))));
    }

}
