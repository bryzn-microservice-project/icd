package com.topics;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;


/**
 * MovieListRequest
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class MovieListRequest {

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
     * Filter movies by genre
     * 
     */
    private MovieListRequest.Genre genre;
    /**
     * Filter movies by show date (YYYY-MM-DD)
     * 
     */
    private String showTime;
    private String movieName;
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
     * Filter movies by genre
     * 
     */
    public MovieListRequest.Genre getGenre() {
        return genre;
    }

    /**
     * Filter movies by genre
     * 
     */
    public void setGenre(MovieListRequest.Genre genre) {
        this.genre = genre;
    }

    /**
     * Filter movies by show date (YYYY-MM-DD)
     * 
     */
    public String getShowTime() {
        return showTime;
    }

    /**
     * Filter movies by show date (YYYY-MM-DD)
     * 
     */
    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
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
        sb.append(MovieListRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("topicName");
        sb.append('=');
        sb.append(((this.topicName == null)?"<null>":this.topicName));
        sb.append(',');
        sb.append("correlatorId");
        sb.append('=');
        sb.append(((this.correlatorId == null)?"<null>":this.correlatorId));
        sb.append(',');
        sb.append("genre");
        sb.append('=');
        sb.append(((this.genre == null)?"<null>":this.genre));
        sb.append(',');
        sb.append("showTime");
        sb.append('=');
        sb.append(((this.showTime == null)?"<null>":this.showTime));
        sb.append(',');
        sb.append("movieName");
        sb.append('=');
        sb.append(((this.movieName == null)?"<null>":this.movieName));
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
        result = ((result* 31)+((this.genre == null)? 0 :this.genre.hashCode()));
        result = ((result* 31)+((this.topicName == null)? 0 :this.topicName.hashCode()));
        result = ((result* 31)+((this.correlatorId == null)? 0 :this.correlatorId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.movieName == null)? 0 :this.movieName.hashCode()));
        result = ((result* 31)+((this.showTime == null)? 0 :this.showTime.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MovieListRequest) == false) {
            return false;
        }
        MovieListRequest rhs = ((MovieListRequest) other);
        return (((((((this.genre == rhs.genre)||((this.genre!= null)&&this.genre.equals(rhs.genre)))&&((this.topicName == rhs.topicName)||((this.topicName!= null)&&this.topicName.equals(rhs.topicName))))&&((this.correlatorId == rhs.correlatorId)||((this.correlatorId!= null)&&this.correlatorId.equals(rhs.correlatorId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.movieName == rhs.movieName)||((this.movieName!= null)&&this.movieName.equals(rhs.movieName))))&&((this.showTime == rhs.showTime)||((this.showTime!= null)&&this.showTime.equals(rhs.showTime))));
    }


    /**
     * Filter movies by genre
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Genre {

        ACTION("ACTION"),
        COMEDY("COMEDY"),
        DRAMA("DRAMA"),
        HORROR("HORROR"),
        SCIFI("SCIFI"),
        ROMANCE("ROMANCE"),
        THRILLER("THRILLER");
        private final String value;
        private final static Map<String, MovieListRequest.Genre> CONSTANTS = new HashMap<String, MovieListRequest.Genre>();

        static {
            for (MovieListRequest.Genre c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Genre(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static MovieListRequest.Genre fromValue(String value) {
            MovieListRequest.Genre constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
