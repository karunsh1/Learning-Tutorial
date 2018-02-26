package com.multithreading.Practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Procesor implements Runnable{
 private int id;
	public Procesor(int id) {
		this.id = id;
	}
	public void run() {
		System.out.println("Starting: "+ id);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Completed: "+ id);
		
	}
	
}
public class ThreadPool {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService executor = Executors.newFixedThreadPool(10);
		for(int i = 0; i<5; i++){
			executor.submit(new Procesor(i));
		}
		executor.shutdown();
		System.out.println("All tase submmited");
		executor.awaitTermination(1, TimeUnit.DAYS);
		System.out.println("All tase Completed");

	}

}
