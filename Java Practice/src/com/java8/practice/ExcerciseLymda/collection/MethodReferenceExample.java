package com.java8.practice.ExcerciseLymda.collection;

public class MethodReferenceExample {

	public static void main(String[] args) {
		Thread t = new Thread(MethodReferenceExample :: printMessage);
		Thread t1 = new Thread(() -> printMessage());
		t.start();
		t1.start();

	}
	public static void printMessage() {
		System.out.println("referance Message");
	}

}
