package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.client.PriceClient;
import com.example.demo.exception.ProductNotFoundException;
import com.example.demo.model.Product;
import com.example.demo.model.ProductDetail;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository; 

    @Autowired
    private PriceClient priceClient;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductService.class);

	public ProductDetail getProductById(long productId) {
		
		ProductDetail productDetail = new ProductDetail();
		Product product = productRepository.findById(productId);
		if(product == null) {
            LOGGER.error("Product Not Found for Product Id {}", productId);
            throw new ProductNotFoundException("Product Not Found");
		}
		productDetail.setProduct(product);
		productDetail.setPrice(priceClient.getPrice(productId));
		return productDetail;
	}

}
