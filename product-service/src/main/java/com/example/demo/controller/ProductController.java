package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ProductDetail;
import com.example.demo.service.ProductService;

@RestController
public class ProductController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductService productService;

    @GetMapping(path = "/product/{id}")
    public ProductDetail getProductDetails(@PathVariable("id") long productId){
        LOGGER.info("Getting Product and Price Details with Product Id {}", productId);
        ProductDetail product = productService.getProductById(productId);
        return product;
    }
}
