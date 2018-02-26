package com.multithreading.Practice;

import java.util.Scanner;

class Processor extends Thread{
	private boolean running = true;
	public void run() {
		while(running) {
			System.out.println("Hello thread");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void shutdown() {
		running = false;
	}
}


public class BasicThreadSynchroniztion {

	public static void main(String[] args) {
		
		Processor proc1 = new Processor();
		proc1.start();
		
		System.out.println("enter key to stop ");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();  
	



	}

}
