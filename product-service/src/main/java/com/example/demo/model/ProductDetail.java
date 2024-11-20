package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductDetail {
	
    @JsonProperty("product")
    private Product product;
	
	@JsonProperty("price")
    private Price price;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

}
