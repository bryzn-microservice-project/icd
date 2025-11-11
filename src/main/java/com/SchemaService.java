package com;


public enum SchemaService {
    ACCOUNT_INFO_REQUEST("AccountInfoRequest", "json-schema/account-info-request.json"),
    ACCOUNT_INFO_RESPONSE("AccountInfoResponse", "json-schema/account-info-response.json"),
    LOGIN_REQUEST("LoginRequest", "json-schema/login-request.json"),
    LOGIN_RESPONSE("LoginResponse", "json-schema/login-response.json"),
    LOGOUT_REQUEST("LogoutRequest", "json-schema/logout-request.json"),
    MOVIE_LIST_REQUEST("MovieListRequest", "json-schema/movie-list-request.json"),
    MOVIE_LIST_RESPONSE("MovieListResponse", "json-schema/movie-list-response.json"),
    MOVIE_TICKET_REQUEST("MovieTicketRequest", "json-schema/movie-ticket-request.json"),
    MOVIE_TICKET_RESPONSE("MovieTicketResponse", "json-schema/movie-ticket-response.json"),
    MOVIE("Movie", "json-schema/movie.json"),
    NEW_ACCOUNT_REQUEST("NewAccountRequest", "json-schema/new-account-request.json"),
    NEW_ACCOUNT_RESPONSE("NewAccountResponse", "json-schema/new-account-response.json"),
    PAYMENT_REQUEST("PaymentRequest", "json-schema/payment-request.json"),
    PAYMENT_RESPONSE("PaymentResponse", "json-schema/payment-response.json"),
    REWARDS_REQUEST("RewardsRequest", "json-schema/rewards-request.json"),
    REWARDS_RESPONSE("RewardsResponse", "json-schema/rewards-response.json"),
    SEAT_REQUEST("SeatRequest", "json-schema/seat-request.json"),
    SEAT_RESPONSE("SeatResponse", "json-schema/seat-response.json"),
    CREATE_TICKET_REQUEST("CreateTicketRequest", "json-schema/create-ticket-request.json"),
    CREATE_TICKET_RESPONSE("CreateTicketResponse", "json-schema/create-ticket-response.json");

    private final String topicName;
    private final String jsonPath;

    SchemaService(String topicName, String jsonPath) {
        this.topicName = topicName;
        this.jsonPath = jsonPath;
    }

    public String getTopicName() {
        return topicName;
    }

    public String getJsonPath() {
        return jsonPath;
    }

    public static String getPathFor(String topicName) {
        for (SchemaService schema : values()) {
            if (schema.getTopicName().equalsIgnoreCase(topicName)) {
                return schema.getJsonPath();
            }
        }
        return null; // or throw new IllegalArgumentException("Unknown topic: " + topicName);
    }
}

