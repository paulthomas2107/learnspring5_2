package com.pault.spring.core.threading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;


public class ThreadingBasics {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		System.out.println(Thread.currentThread().getName());
		
		//Thread t1 = new Thread(new MyRunnable());
		//t1.start();
		
		//Future<Integer> result = Executors.newFixedThreadPool(1).submit(new MyCallable());
		//System.out.println(result.get());
		
		//Executor directExecutor = new DirectExecutor();
		//directExecutor.execute(new MyRunnable());
		
		Executor threadPerTaskExecutor = new ThreadPerTask();
		threadPerTaskExecutor.execute(new MyRunnable());	
		threadPerTaskExecutor.execute(new MyRunnable());  //  2 threads started
		
		
	}

	
	static class MyRunnable implements Runnable {

		@Override
		public void run() {
			
			System.out.println(Thread.currentThread().getName());
			
			for (int i = 0; i < 5; i++) {
				System.out.println(i);
				try {
					Thread.sleep(2000); 
				} catch (InterruptedException e) {
					System.out.println(e.getLocalizedMessage());
				}	
			}	
		}
		
	}
	
	static class MyCallable implements Callable<Integer> {

		@Override
		public Integer call() throws Exception {
			
			int result = 0;
			System.out.println(Thread.currentThread().getName());
			
			for (int i = 0; i < 10; i++) {
				result+=i;
			}
			return result;
		}
		
	}
	
	static class DirectExecutor implements Executor {

		@Override
		public void execute(Runnable command) {
			command.run();
			
		}
		
	}
	
	
	static class ThreadPerTask implements Executor {

		@Override
		public void execute(Runnable command) {
			Thread th = new Thread(command);
			th.start();
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
