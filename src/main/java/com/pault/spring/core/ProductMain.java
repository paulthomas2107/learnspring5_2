package com.pault.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ProductMain {
	
	public static void main(String [] args) {
		
		// Instantiate
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		// Get Bean Info
		Product product1 = applicationContext.getBean("product1", Product.class);
		Product product2 = applicationContext.getBean("product2", Product.class);
		
		// Use Bean
		System.out.println(product1);
		System.out.println(product2);
	
		
	}
}
