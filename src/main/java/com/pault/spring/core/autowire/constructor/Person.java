package com.pault.spring.core.autowire.constructor;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
	
	private String id;
	private String name;
	private Address address;

}
