package com.multithreading.Practice;

public class Waiting_NotifyMain {

	public static void main(String[] args) throws InterruptedException {
		
		//Wait_NotifyExampleLowLevelSynch processor = new Wait_NotifyExampleLowLevelSynch();
		//Reentrants_runner runner = new Reentrants_runner();
		Reentrants_runner2 runner = new Reentrants_runner2();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					//processor.produce();
					runner.firstThread();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					//processor.consume();
					runner.secondThread();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		runner.finished();
		

	}

}
