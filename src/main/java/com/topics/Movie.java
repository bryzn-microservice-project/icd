package com.topics;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * Movie
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class Movie {

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
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssXXX", timezone = "UTC")
    private Date showtime;
    /**
     * Filter movies by genre
     * 
     */
    private Movie.Genre genre;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

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
     * Filter movies by genre
     * 
     */
    public Movie.Genre getGenre() {
        return genre;
    }

    /**
     * Filter movies by genre
     * 
     */
    public void setGenre(Movie.Genre genre) {
        this.genre = genre;
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
        sb.append(Movie.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("movieName");
        sb.append('=');
        sb.append(((this.movieName == null)?"<null>":this.movieName));
        sb.append(',');
        sb.append("showtime");
        sb.append('=');
        sb.append(((this.showtime == null)?"<null>":this.showtime));
        sb.append(',');
        sb.append("genre");
        sb.append('=');
        sb.append(((this.genre == null)?"<null>":this.genre));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.movieName == null)? 0 :this.movieName.hashCode()));
        result = ((result* 31)+((this.showtime == null)? 0 :this.showtime.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Movie) == false) {
            return false;
        }
        Movie rhs = ((Movie) other);
        return (((((this.genre == rhs.genre)||((this.genre!= null)&&this.genre.equals(rhs.genre)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.movieName == rhs.movieName)||((this.movieName!= null)&&this.movieName.equals(rhs.movieName))))&&((this.showtime == rhs.showtime)||((this.showtime!= null)&&this.showtime.equals(rhs.showtime))));
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
        private final static Map<String, Movie.Genre> CONSTANTS = new HashMap<String, Movie.Genre>();

        static {
            for (Movie.Genre c: values()) {
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

        public static Movie.Genre fromValue(String value) {
            Movie.Genre constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
