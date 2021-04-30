package com.pault.spring.core.autowire.type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-autowire-bytype.xml");	
		
		System.out.println(applicationContext.getBean("person"));
		
		((AbstractApplicationContext)applicationContext).close();
		

	}

}
