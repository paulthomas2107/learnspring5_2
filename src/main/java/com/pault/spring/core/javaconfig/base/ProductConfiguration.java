package com.pault.spring.core.javaconfig.base;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfiguration {
	
	@Bean
	public Product product() {
		Product product = new Product();
		product.setProductId("A747");
		product.setProductDesc("Boeing 747 Jumbo");
		return product;
	}
	
	@Bean
	public Address address() {
		return new Address("10", "Downing St");
	}

}
