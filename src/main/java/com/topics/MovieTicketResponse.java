package com.topics;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;


/**
 * MovieTicketResponse
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class MovieTicketResponse {

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
    private Integer ticketId;
    /**
     * Movie
     * <p>
     * 
     * (Required)
     * 
     */
    private Movie movie;
    /**
     * 
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
    public Integer getTicketId() {
        return ticketId;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    /**
     * Movie
     * <p>
     * 
     * (Required)
     * 
     */
    public Movie getMovie() {
        return movie;
    }

    /**
     * Movie
     * <p>
     * 
     * (Required)
     * 
     */
    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    /**
     * 
     * (Required)
     * 
     */
    public String getSeatNumber() {
        return seatNumber;
    }

    /**
     * 
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
        sb.append(MovieTicketResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("topicName");
        sb.append('=');
        sb.append(((this.topicName == null)?"<null>":this.topicName));
        sb.append(',');
        sb.append("correlatorId");
        sb.append('=');
        sb.append(((this.correlatorId == null)?"<null>":this.correlatorId));
        sb.append(',');
        sb.append("ticketId");
        sb.append('=');
        sb.append(((this.ticketId == null)?"<null>":this.ticketId));
        sb.append(',');
        sb.append("movie");
        sb.append('=');
        sb.append(((this.movie == null)?"<null>":this.movie));
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
        result = ((result* 31)+((this.movie == null)? 0 :this.movie.hashCode()));
        result = ((result* 31)+((this.ticketId == null)? 0 :this.ticketId.hashCode()));
        result = ((result* 31)+((this.seatNumber == null)? 0 :this.seatNumber.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MovieTicketResponse) == false) {
            return false;
        }
        MovieTicketResponse rhs = ((MovieTicketResponse) other);
        return (((((((this.topicName == rhs.topicName)||((this.topicName!= null)&&this.topicName.equals(rhs.topicName)))&&((this.correlatorId == rhs.correlatorId)||((this.correlatorId!= null)&&this.correlatorId.equals(rhs.correlatorId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.movie == rhs.movie)||((this.movie!= null)&&this.movie.equals(rhs.movie))))&&((this.ticketId == rhs.ticketId)||((this.ticketId!= null)&&this.ticketId.equals(rhs.ticketId))))&&((this.seatNumber == rhs.seatNumber)||((this.seatNumber!= null)&&this.seatNumber.equals(rhs.seatNumber))));
    }

}
