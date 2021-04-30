package com.pault.spring.core.bean.collaboration;


import lombok.Data;

@Data
public class Person {

	private int id;
	private String firstName;
	private String lastName;
	private Address address;
	
}
