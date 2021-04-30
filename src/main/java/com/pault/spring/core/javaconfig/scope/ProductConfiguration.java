package com.pault.spring.core.javaconfig.scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.pault.spring.core.javaconfig.scope")
public class ProductConfiguration {

	@Bean
	public Product laptop() {
		return new Product("001", "Laptop");
	}
	
	@Bean
	public Product mobile() {
		return new Product("002", "Mobile");
	}
	
	
}
