package com.java8.practice;

public class RunnabeExample {

	public static void main(String[] args) {

		Thread myThread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Inside print");

			}

		});
		myThread.run();
		Thread myLymdaThread = new Thread(()-> System.out.println("through lamda"));
		myLymdaThread.start();
	}

}
