package com.pault.spring.core.aware;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

public class Welcome implements MessageSourceAware {

	public void setMessageSource(MessageSource messageSource) {
		
		System.out.println(messageSource.getMessage("welcome", null, Locale.FRANCE));
		System.out.println(messageSource.getMessage("welcome", null, Locale.UK));
		System.out.println(messageSource.getMessage("welcome", null, Locale.US));
	}

	
}
