package com.java8.practice;

public class TypeInterfaceExample {
	
	public static void main(String[] args) {
		stringLength  LymbastringLength =  s -> s.length();//(s) -> s.length(); // no ()
		System.out.println(LymbastringLength.getlength("hello World!"));
		otherwwaylymda( s -> s.length()); // by passing in method
		
		
		
	}
	public static void otherwwaylymda (stringLength l) {
		System.out.println("Other way to define  "+ l.getlength("test length"));
		
	}
	interface stringLength{
		int getlength(String s);
	}
}
