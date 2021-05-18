package com.mtit.micoservice.Cartservice.dto;

public class CartResponse {

    private String ItemId;
    private String message;

    public String getItemId() {
        return ItemId;
    }

    public void setItemId(String itemId) {
        ItemId = itemId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
