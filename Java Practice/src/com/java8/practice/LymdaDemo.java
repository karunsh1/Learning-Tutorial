package com.java8.practice;

public class LymdaDemo {

	public static void main(String[] args) {
		/**
		 * in java 7 perform via interface
		 */
		Greeter greet = new Greeter();
		HelloworldGreeting hellWorld = new HelloworldGreeting();
		greet.greet(hellWorld);

		/**
		 * in java 8 to creat lymda 1) need interface with same type of method ();
		 */
		Greeting greetingFunction = () -> System.out.print("in lymda expression, hello world");
		myAdd Addfunction = (int a, int b) -> a+b;
		greetingFunction.perform();
	}

}


interface myAdd{
	int add(int x, int y);
}