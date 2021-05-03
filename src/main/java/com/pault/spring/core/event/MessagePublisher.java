package com.pault.spring.core.event;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.stereotype.Component;

@Component
public class MessagePublisher implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher applicationEventPublisher;
	
	private static Map<Integer, String> messages = new HashMap<>();
	
	static {
		messages.put(1, "Sample Message 1");
		messages.put(2, "Sample Message 2");
		messages.put(3, "Sample Message 3");
		messages.put(4, "Sample Message 4");
		messages.put(5, "Sample Message 5");
	}
	
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
	}

	public void publishMessage() {
		
		new SimpleAsyncTaskExecutor().execute(() -> {
			
			try {
					
				for (int i = 0; i < 5; i++) {
					int id = new Random().nextInt(5);
					MessageEvent messageEvent = new MessageEvent(messages.get(++id));
					applicationEventPublisher.publishEvent(messageEvent);
					TimeUnit.SECONDS.sleep(2);
					
				}
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
		});
		
	}
}
