package com;


public enum SchemaService {
    ACCOUNT("Account", "json-schema/new-account-request.json"),
    LOGIN_RQUEST("LoginRequest", "json-schema/login-request.json"),
    LOGIN_RESPONSE("LoginResponse", "json-schema/login-response.json"),
    MOVIE_TICKET_REQUEST("MovieTicketRequest", "json-schema/movie-ticket-request.json"),
    MOVIE_TICKET_RESPONSE("MovieTicketResponse", "json-schema/movie-ticket-response.json"),
    NEW_ACCOUNT_REQUEST("NewAccountRequest", "json-schema/new-account-request.json"),
    NEW_ACCOUNT_RESPONSE("NewAccountResponse", "json-schema/new-account-response.json"),
    PAYMENT_REQUEST("PaymentRequest", "json-schema/payment-request.json"),
    PAYMENT_RESPONSE("PaymentResponse", "json-schema/payment-response.json"),
    SEAT_REQUEST("SeatRequest", "json-schema/seat-request.json"),
    SEAT_RESPONSE("SeatResponse", "json-schema/seat-response.json"),;

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

