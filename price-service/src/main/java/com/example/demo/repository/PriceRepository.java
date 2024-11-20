package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Price;


public interface PriceRepository extends CrudRepository<Price, Long> {
	

    Price findByProductId(long productId);


}
