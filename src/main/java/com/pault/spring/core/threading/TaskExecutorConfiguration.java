package com.pault.spring.core.threading;

import java.util.concurrent.Executors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.SyncTaskExecutor;
import org.springframework.core.task.support.TaskExecutorAdapter;

@Configuration
@ComponentScan("com.pault.spring.core.threading")
public class TaskExecutorConfiguration {


	@Bean
	public SimpleAsyncTaskExecutor simpleleAsyncTaskExecutor() {
		return new SimpleAsyncTaskExecutor();
	}

	@Bean
	public SyncTaskExecutor syncTaskExecutor() {
		return new SyncTaskExecutor();
	}
	
	@Bean
	public TaskExecutorAdapter taskExecutorAdapter() {
		return new TaskExecutorAdapter(Executors.newFixedThreadPool(3));
	}
}
