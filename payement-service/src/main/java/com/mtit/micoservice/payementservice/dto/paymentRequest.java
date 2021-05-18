package com.mtit.micoservice.payementservice.dto;

public class paymentRequest {

    private String paymentId;
    private String paymentType;
    private String amount;
    private String verificationCode;

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    @Override
    public String toString() {
        return "paymentRequest{" +
                "paymentId='" + paymentId + '\'' +
                ", paymentType='" + paymentType + '\'' +
                ", amount='" + amount + '\'' +
                ", verificationCode='" + verificationCode + '\'' +
                '}';
    }
}
