package com.multithreading.Practice;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Reentrants_runner2 {

	private DeadLockClass1 acc1 = new DeadLockClass1();
	private DeadLockClass1 acc2 = new DeadLockClass1();
	private Lock lock1 = new ReentrantLock();
	private Lock lock2 = new ReentrantLock();
	// private Condition cond = lock.newCondition();

	private void aquireLocks(Lock lock1, Lock lock2) throws InterruptedException {
		while (true) {
			// acquire locks
			boolean gotLock1 = false;
			boolean gotLock2 = false;
			try {
				gotLock1 = lock1.tryLock();
				gotLock2 = lock2.tryLock();
			} finally {
				if (gotLock1 && gotLock2) {
					return;
				}
				if (gotLock1) {
					lock1.unlock();
				}
				if (gotLock2) {
					lock2.unlock();
				}
			}

			// lock not acquired
			Thread.sleep(1);
		}

	}

	public void firstThread() throws InterruptedException {

		Random random = new Random();

		for (int i = 0; i < 10000; i++) {
			aquireLocks(lock1, lock2);
			try {
				DeadLockClass1.transfer(acc1, acc2, random.nextInt(100));
			} finally {
				lock1.unlock();
				lock2.unlock();
			}

		}

	}

	public void secondThread() throws InterruptedException {

		Random random = new Random();
		for (int i = 0; i < 10000; i++) {
			aquireLocks(lock1, lock2);
			try {
				DeadLockClass1.transfer(acc2, acc1, random.nextInt(100));
			} finally {
				lock1.unlock();
				lock2.unlock();
			}
		}
	}

	public void finished() {
		System.out.println("Account 1 Balance: " + acc1.getBalance());
		System.out.println("Account 2 Balance: " + acc2.getBalance());
		System.out.println("Total Balance: " + (acc1.getBalance() + acc2.getBalance()));

	}

}
