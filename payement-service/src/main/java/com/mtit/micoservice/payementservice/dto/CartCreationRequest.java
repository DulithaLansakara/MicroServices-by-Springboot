package com.mtit.micoservice.payementservice.dto;

public class CartCreationRequest {
    private String itemId;
    private String itemDescription;
    private String qty;
    private String priceOfPiece;
    private String amount;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getPriceOfPiece() {
        return priceOfPiece;
    }

    public void setPriceOfPiece(String priceOfPiece) {
        this.priceOfPiece = priceOfPiece;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "CartCreationRequest{" +
                "itemId='" + itemId + '\'' +
                ", itemDescription='" + itemDescription + '\'' +
                ", qty='" + qty + '\'' +
                ", priceOfPiece='" + priceOfPiece + '\'' +
                ", amount=" + amount +
                '}';
    }
}
