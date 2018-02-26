package com.multithreading.Practice;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Wait_NotifyExampleLowLevelSynch {

	private LinkedList<Integer> list = new LinkedList<Integer>();
	private final int LIMIT = 10;
	private Object lock = new Object();

	public void produce() throws InterruptedException {
		/*
		 * synchronized (this) { System.out.println("Producer thread is running....");
		 * wait(); System.out.println("Resumed......."); }
		 */
		int value = 0;

		while (true) {
			synchronized (lock) {
				while(list.size() == LIMIT){
					System.out.println("Producer thread is in waiting because list is full....");
					lock.wait();
				}
				list.add(value++);
				lock.notify();
			}
		}
	}

	public void consume() throws InterruptedException {
		
		Random random = new Random();
		/*
		 * synchronized (this) { System.out.println("Waitig or return key....");
		 * scanner.nextLine(); System.out.println("Key Pressed........."); notify();
		 * Thread.sleep(5000); }
		 */
		while (true) {
			synchronized (lock) {
				while(list.size() == 0){
					System.out.println("consumer thread is in wait because list is empty....");
					lock.wait();
				}
				System.out.print("List size is: " + list.size());
				int value = list.removeFirst();
				System.out.println("; value is: " + value);
				lock.notify(); 
			}
			Thread.sleep(random.nextInt(1000));
		}
	}

}
