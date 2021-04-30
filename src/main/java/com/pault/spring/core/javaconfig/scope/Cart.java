package com.pault.spring.core.javaconfig.scope;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Scope("prototype")
@Component	
public class Cart {
	
	public List<Product> productList = new ArrayList<Product>();
	
	public void addProduct(Product product) {
		productList.add(product);
	}
	
	public List<Product> getProducts(){
		return productList;
	}
}
