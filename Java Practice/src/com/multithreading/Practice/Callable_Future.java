package com.multithreading.Practice;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Callable_Future {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newCachedThreadPool();
		Future<Integer> future = executor.submit(new Callable<Integer>() {

			@Override
			public Integer call() throws InterruptedException,Exception {

				Random random = new Random();
				int durtation  = random.nextInt(4000);
				System.out.println("Start the process.....");
				
				Thread.sleep(durtation);
				System.out.println("finished the process.....");
				
				return durtation;
			}
		});
		executor.shutdown();
		
		
		System.out.println("the result is "+ future.get());

	}

}
