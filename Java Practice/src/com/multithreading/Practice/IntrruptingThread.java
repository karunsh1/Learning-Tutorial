package com.multithreading.Practice;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import jdk.management.resource.internal.inst.ThreadRMHooks;

public class IntrruptingThread {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Starting...");
		
		ExecutorService exec = Executors.newCachedThreadPool();
		Future<?> fu = exec.submit(new Callable<Void>() {

			@Override
			public Void call() throws Exception {
				Random nran = new Random();

				for (int i = 0; i < 1E8; i++) {
					if (Thread.currentThread().isInterrupted()) {
						System.out.println("Intrrupted");
						break;
					}
					
					Math.sin(nran.nextDouble());

				}

				return null;
			}
		});	
		
		exec.shutdown();
		Thread.sleep(500);
		fu.cancel(true);
		exec.awaitTermination(1, TimeUnit.DAYS);

		/*Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				Random nran = new Random();

				for (int i = 0; i < 1E8; i++) {
					if (Thread.currentThread().isInterrupted()) {
						System.out.println("Intrrupted");
						break;
					}

					
					 * try { Thread.sleep(1); } catch (InterruptedException e) {
					 * System.out.println("We have intrrupted the thread"); }
					 
					Math.sin(nran.nextDouble());

				}

			}
		});*/
		/*thread.start();

		Thread.sleep(500);
		thread.interrupt();
		thread.join();
*/
		System.out.println("Finished...");
	}

}
