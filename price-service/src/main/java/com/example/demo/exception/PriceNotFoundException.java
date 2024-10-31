package com.example.demo.exception;

public class PriceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

	public PriceNotFoundException(String priceNotFound) {
        super(priceNotFound);
    }
}
