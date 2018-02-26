package com.multithreading.Practice;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Reentrants_runner {
	private Lock lock = new ReentrantLock();
	private Condition cond = lock.newCondition();

	private int count = 0;

	private void increment() {
		for (int i = 0; i < 10000; i++) {
			count++;
		}

	}

	public void firstThread() throws InterruptedException {
		lock.lock();
		System.out.println("waiting.......");
		cond.await();
		System.out.println("Woken Up");
		try {
			increment();
		} finally {
			lock.unlock();

		}

	}

	public void secondThread() throws InterruptedException {
		Thread.sleep(1000);
		lock.lock();
		System.out.println("Press the return Key");
		new Scanner(System.in).nextLine();
		System.out.println("eturn key pressed......");
		cond.signal();
		try {
			increment();
		} finally {
			lock.unlock();

		}


	}

	public void finished() {
		System.out.println("count is: " + count);

	}

}
