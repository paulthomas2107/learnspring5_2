package com.pault.spring.core.autowire.collection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
public class ProductConfiguration {
	
	@Bean(name="Mac")
	public Product product1() {
		return new Product("001", "Mac Book Pro");
	}
	
	@Bean(name="PC")
	public Product product2() {
		return new Product("002", "Gateway PC");
	}
	
	@Bean(name="Early Amiga")
	public Product product3() {
		return new Product("003", "Commodore Amiga");
	}

	@Bean(name="First")
	public Product product4() {
		return new Product("004", "ZX Spextrum");
	}
	
	@Bean
	public ProductViewer productViewer() {
		return new ProductViewer();
	}


}
