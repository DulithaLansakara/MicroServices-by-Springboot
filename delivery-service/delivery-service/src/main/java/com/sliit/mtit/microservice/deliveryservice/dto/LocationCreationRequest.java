package com.sliit.mtit.microservice.deliveryservice.dto;

public class LocationCreationRequest {

    private String customerName;
    private String customerNIC;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerNIC() {
        return customerNIC;
    }

    public void setCustomerNIC(String customerNIC) {
        this.customerNIC = customerNIC;
    }
}
