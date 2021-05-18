package com.sliit.mtit.microservice.deliveryservice.dto;

import java.util.StringJoiner;

public class DeliveryRequest {
    private String customerName;
    private String customerNIC;
    private String customerAddress;
    private String deliveryType;
    private String deliveryDetails;

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

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public String getDeliveryDetails() {
        return deliveryDetails;
    }

    public void setDeliveryDetails(String deliveryDetails) {
        this.deliveryDetails = deliveryDetails;
    }

    public String getCustomerAddress() { return customerAddress; }

    public void setCustomerAddress(String customerAddress) { this.customerAddress = customerAddress; }

    @Override
    public String toString() {
        return new StringJoiner(", ", DeliveryRequest.class.getSimpleName() + "[", "]")
                .add("customerName='" + customerName + "'")
                .add("customerNIC='" + customerNIC + "'")
                .add("customerAddress='" + customerAddress + "'")
                .add("deliveryType='" + deliveryType + "'")
                .add("deliveryDetails='" + deliveryDetails + "'")
                .toString();
    }
}
