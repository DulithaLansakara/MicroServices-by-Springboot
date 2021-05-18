package com.sliit.mtit.microservice.buyerservice.dbo;

public class BuyerRequest {

    private String buyerName;
    private String buyerId;
    private String buyerDetails;

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getBuyerId() {
        return buyerId;
    }

    @Override
    public String toString() {
        return "BuyerRequest{" +
                "buyerName='" + buyerName + '\'' +
                ", buyerId='" + buyerId + '\'' +
                ", buyerDetails='" + buyerDetails + '\'' +
                '}';
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getBuyerDetails() {
        return buyerDetails;
    }

    public void setBuyerDetails(String buyerDetails) {
        this.buyerDetails = buyerDetails;
    }
}
