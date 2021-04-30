package com.pault.spring.core.autowire.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class Main {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(ProductConfiguration.class);
		
		appContext.getBean(ProductViewer.class).viewProducts();
		
		((AbstractApplicationContext)appContext).close();

	}

}
