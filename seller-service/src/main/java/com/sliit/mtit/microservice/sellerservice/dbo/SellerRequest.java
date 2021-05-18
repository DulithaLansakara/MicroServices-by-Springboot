package com.sliit.mtit.microservice.sellerservice.dbo;

public class SellerRequest {
    private String sellerId;
    private String sellerName;
    private String sellingItemCode;
    private String sellerDetails;
    private String sellingItemName;
    private String sellingPrice;

    public String getSellerDetails() {
        return sellerDetails;
    }

    @Override
    public String toString() {
        return "SellerRequest{" +
                "sellerId='" + sellerId + '\'' +
                ", sellerName='" + sellerName + '\'' +
                ", sellingItemCode='" + sellingItemCode + '\'' +
                ", sellerDetails='" + sellerDetails + '\'' +
                ", sellingItemName='" + sellingItemName + '\'' +
                ", sellingPrice='" + sellingPrice + '\'' +
                '}';
    }

    public void setSellerDetails(String sellerDetails) {
        this.sellerDetails = sellerDetails;



    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellingItemCode() {
        return sellingItemCode;
    }

    public void setSellingItemCode(String sellingItemCode) {
        this.sellingItemCode = sellingItemCode;
    }

    public String getSellingItemName() {
        return sellingItemName;
    }

    public void setSellingItemName(String sellingItemName) {
        this.sellingItemName = sellingItemName;
    }

    public String getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(String sellingPrice) {
        this.sellingPrice = sellingPrice;
    }



}
