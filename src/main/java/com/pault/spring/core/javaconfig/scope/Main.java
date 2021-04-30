package com.pault.spring.core.javaconfig.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class Main {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(ProductConfiguration.class);
		
		Cart shoppingCart1 = appContext.getBean(Cart.class);
		Product laptop = appContext.getBean("laptop", Product.class);
		shoppingCart1.addProduct(laptop);
		System.out.println(shoppingCart1.getProducts());
		
		Cart shoppingCart2 = appContext.getBean(Cart.class);
		Product mobile = appContext.getBean("mobile", Product.class);
		shoppingCart2.addProduct(mobile);
		System.out.println(shoppingCart2.getProducts());
	
		
		((AbstractApplicationContext)appContext).close();

	}

}
