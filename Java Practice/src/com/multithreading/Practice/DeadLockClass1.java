package com.multithreading.Practice;

public class DeadLockClass1 {
	private int balance = 10000;
	
	public void deposit(int amount) {
		balance += amount;
	}
	public void withdraw(int amount) {
		balance -= amount;
	}
	public int getBalance() {
		return balance;
	}
	public static void transfer(DeadLockClass1 acc1, DeadLockClass1 acc2, int amount) {
		acc1.withdraw(amount);
		acc2.deposit(amount);
	}

}
