package com.multithreading.Practice;

import java.util.Scanner;

public class Wait_NotifyExample {

	public void produce() throws InterruptedException {
		synchronized (this) {
			System.out.println("Producer thread is running....");
			wait();
			System.out.println("Resumed.......");
		}
	}

	public void consume() throws InterruptedException {
		Thread.sleep(2000);
		Scanner scanner = new Scanner(System.in);
		synchronized (this) {
			System.out.println("Waitig or return key....");
			scanner.nextLine();			
			System.out.println("Key Pressed.........");
			notify();
			Thread.sleep(5000);
		}
	}

	

}
