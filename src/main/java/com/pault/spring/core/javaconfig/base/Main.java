package com.pault.spring.core.javaconfig.base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(ProductConfiguration.class);
		
		System.out.println(appContext.getBean(Product.class));
		System.out.println(appContext.getBean(Address.class));
		
		
		((AbstractApplicationContext)appContext).close();
		

	}

}
