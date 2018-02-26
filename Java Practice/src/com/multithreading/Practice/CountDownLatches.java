package com.multithreading.Practice;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Processor1 implements Runnable {

	private CountDownLatch latch;

	public Processor1(CountDownLatch latch) {
		this.latch = latch;
	}

	public void run() {
		System.out.println("Started ....");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		latch.countDown();
	}

}

public class CountDownLatches {

	public static void main(String[] args) throws InterruptedException {

		CountDownLatch latch = new CountDownLatch(3);
		
		ExecutorService excecutor = Executors.newFixedThreadPool(3);
		for (int i = 0; i < 3; i++) {
			excecutor.submit(new Processor1(latch));
		}
		latch.await();
		excecutor.shutdown();
		System.out.println("Completed...");
	}

}
