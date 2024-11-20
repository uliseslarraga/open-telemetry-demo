package com.example.demo.model;


import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "prices")
public class Price {

    @Id
    @JsonProperty("productId")
    private long productId;

    @JsonProperty("price_amount")
    private double priceAmount;

    @JsonProperty("discount")
    private double discount;

    public Price(){}

    
    
    public long getProductId() {
		return productId;
	}



	public double getPriceAmount() {
		return priceAmount;
	}



	public double getDiscount() {
		return discount;
	}



	public void setDiscount(double discount) {
        this.discount = discount;
	}

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public void setPriceAmount(double priceAmount) {
        this.priceAmount = priceAmount;
    }
}
