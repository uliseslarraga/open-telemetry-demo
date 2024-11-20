package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Price {


    @JsonProperty("price_amount")
    private double priceAmount;

    @JsonProperty("discount")
    private double discount;

    public double getPriceAmount() {
        return priceAmount;
    }

    public void setPriceAmount(double priceAmount) {
        this.priceAmount = priceAmount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
