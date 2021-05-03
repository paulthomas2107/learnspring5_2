package com.pault.spring.core.event;

import java.util.concurrent.TimeUnit;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {//implements ApplicationListener<MessageEvent> {

	@EventListener
	public void onApplicationEvent(MessageEvent event) {
		System.out.println(event.getMessage());
		try {
			TimeUnit.SECONDS.sleep(2000);
			
		} catch (Exception e) {
			
		}
	}

	@EventListener
	public void onApplicationEvent(DateTimeEvent dateTimeEvent) {
		System.out.println(dateTimeEvent.getDateTime());
		
	}
}


