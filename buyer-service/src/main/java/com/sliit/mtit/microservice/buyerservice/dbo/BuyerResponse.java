package com.sliit.mtit.microservice.buyerservice.dbo;

public class BuyerResponse {
    private String buyerId;
    private String message;

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
