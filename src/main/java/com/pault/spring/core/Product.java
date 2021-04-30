package com.pault.spring.core;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
	
	private String productId;
	private String productName;
	private String productDesc;

}
