package com.sliit.mtit.microservice.locationservice.dto;

import java.util.StringJoiner;

public class LocationRequest {

   private String customerName;
   private String customerNIC;
   private String customerAddress;

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

    public String getCustomerAddress() { return customerAddress; }

    public void setCustomerAddress(String customerAddress) { this.customerAddress = customerAddress; }

    @Override
    public String toString() {
        return new StringJoiner(", ", LocationRequest.class.getSimpleName() + "[", "]")
                .add("customerName='" + customerName + "'")
                .add("customerNIC='" + customerNIC + "'")
                .add("customerAddress='" + customerAddress + "'")
                .toString();
    }
}
