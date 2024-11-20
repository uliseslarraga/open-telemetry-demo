package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.PriceNotFoundException;
import com.example.demo.model.Price;
import com.example.demo.repository.PriceRepository;

@Service
public class PriceService {

	@Autowired
	private PriceRepository priceRepository;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PriceService.class);
	
	public Price findById(long id) {
		Price price = priceRepository.findByProductId(id);
	    if(price==null){
	        LOGGER.error("Price Not Found for Product Id {}", id);
	        throw new PriceNotFoundException("Price Not Found");
	    }
	    return price;
	}
	
}
