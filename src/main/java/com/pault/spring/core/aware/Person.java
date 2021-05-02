package com.pault.spring.core.aware;

import org.springframework.beans.factory.BeanNameAware;

import lombok.Data;

@Data
public class Person implements BeanNameAware {

	public void setBeanName(String name) {
		System.out.println("Bean Name : "+ name);
		
	}

}
