package com.pault.spring.core.threading;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.SyncTaskExecutor;
import org.springframework.core.task.support.TaskExecutorAdapter;
import org.springframework.stereotype.Component;

@Component
public class SpringTaskExecutor {
	

	@Autowired
	private SimpleAsyncTaskExecutor simpleAsyncTaskExecutor;
	
	@Autowired
	private SyncTaskExecutor syncTaskExecutor;
	
	@Autowired
	private TaskExecutorAdapter taskExecutorAdapter;
	
	public void doExecute(Runnable task) {
		simpleAsyncTaskExecutor.execute(task);
		//syncTaskExecutor.execute(task);
		//taskExecutorAdapter.execute(task);
	}
		
	
}
