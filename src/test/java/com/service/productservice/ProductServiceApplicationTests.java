package com.service.productservice;

import com.service.productservice.Repository.ProductRepository;
import com.service.productservice.projections.findProductWithTitleAndPrice;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ProductServiceApplicationTests {
	@Autowired
	ProductRepository productRepository;
	@Test
	void contextLoads() {
		List<findProductWithTitleAndPrice> products = productRepository.getProductWithTitleAndPrice("iPhone12", 50000.0);

		for(findProductWithTitleAndPrice product : products) {
			System.out.println("Product Title: " + product.getTitle());
			System.out.println("Product Price: " + product.getPrice());
		}
	}

}
