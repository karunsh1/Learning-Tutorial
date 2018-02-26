package com.multithreading.Practice;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadinWithSynchronizatiion {
	private AtomicInteger count = new AtomicInteger(0);

	private  int countNormal = 0;

	public synchronized void increment() {
		countNormal++;
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadinWithSynchronizatiion countThread = new ThreadinWithSynchronizatiion();
		countThread.doCount();

	}

	public void doCount() throws InterruptedException {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10000; i++) {
					count.incrementAndGet();
					increment();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10000; i++) {
					count.getAndIncrement();
					increment();
				}
			}
		});
		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("Count: " + count);
		System.out.println("CountNormal: " + countNormal);
	}

}
