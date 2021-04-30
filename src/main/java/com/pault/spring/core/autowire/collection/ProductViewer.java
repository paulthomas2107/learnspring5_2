package com.pault.spring.core.autowire.collection;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
public class ProductViewer {
	
	@Autowired
	private Map<String, Product> products;
	
	public void viewProducts() {
		for(Map.Entry<String, Product> product : products.entrySet()) {
			System.out.println(product.getKey() + " ==> " + product.getValue());
		}
	}

}
