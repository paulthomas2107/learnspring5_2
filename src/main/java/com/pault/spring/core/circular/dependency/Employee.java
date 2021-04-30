package com.pault.spring.core.circular.dependency;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
	
	private Department dept;

}
