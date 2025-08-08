package com.topics;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;


/**
 * MovieTicketRequest
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class MovieTicketRequest {

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
    private Integer ticketId;
    /**
     * name of the movie the customer is intended to watch
     * (Required)
     * 
     */
    private String movieName;
    /**
     * 
     * (Required)
     * 
     */
    private Date showtime;
    /**
     * this will be a seat number with some number ex. A12
     * (Required)
     * 
     */
    private String seatNumber;
    /**
     * we do not believe in free
     * (Required)
     * 
     */
    private Double price;
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
     * name of the movie the customer is intended to watch
     * (Required)
     * 
     */
    public String getMovieName() {
        return movieName;
    }

    /**
     * name of the movie the customer is intended to watch
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

    /**
     * we do not believe in free
     * (Required)
     * 
     */
    public Double getPrice() {
        return price;
    }

    /**
     * we do not believe in free
     * (Required)
     * 
     */
    public void setPrice(Double price) {
        this.price = price;
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
        sb.append(MovieTicketRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("topicName");
        sb.append('=');
        sb.append(((this.topicName == null)?"<null>":this.topicName));
        sb.append(',');
        sb.append("ticketId");
        sb.append('=');
        sb.append(((this.ticketId == null)?"<null>":this.ticketId));
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
        sb.append("price");
        sb.append('=');
        sb.append(((this.price == null)?"<null>":this.price));
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
        result = ((result* 31)+((this.showtime == null)? 0 :this.showtime.hashCode()));
        result = ((result* 31)+((this.price == null)? 0 :this.price.hashCode()));
        result = ((result* 31)+((this.topicName == null)? 0 :this.topicName.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.movieName == null)? 0 :this.movieName.hashCode()));
        result = ((result* 31)+((this.ticketId == null)? 0 :this.ticketId.hashCode()));
        result = ((result* 31)+((this.seatNumber == null)? 0 :this.seatNumber.hashCode()));
        result = ((result* 31)+((this.account == null)? 0 :this.account.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MovieTicketRequest) == false) {
            return false;
        }
        MovieTicketRequest rhs = ((MovieTicketRequest) other);
        return (((((((((this.showtime == rhs.showtime)||((this.showtime!= null)&&this.showtime.equals(rhs.showtime)))&&((this.price == rhs.price)||((this.price!= null)&&this.price.equals(rhs.price))))&&((this.topicName == rhs.topicName)||((this.topicName!= null)&&this.topicName.equals(rhs.topicName))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.movieName == rhs.movieName)||((this.movieName!= null)&&this.movieName.equals(rhs.movieName))))&&((this.ticketId == rhs.ticketId)||((this.ticketId!= null)&&this.ticketId.equals(rhs.ticketId))))&&((this.seatNumber == rhs.seatNumber)||((this.seatNumber!= null)&&this.seatNumber.equals(rhs.seatNumber))))&&((this.account == rhs.account)||((this.account!= null)&&this.account.equals(rhs.account))));
    }

}
