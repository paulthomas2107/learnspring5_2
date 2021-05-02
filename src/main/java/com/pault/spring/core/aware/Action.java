package com.pault.spring.core.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class Action implements BeanFactoryAware {

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println(beanFactory);
		
	}

}
