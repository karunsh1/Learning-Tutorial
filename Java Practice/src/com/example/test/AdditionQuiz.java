package com.example.test;

import java.util.Scanner;

public class AdditionQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = (int) (System.currentTimeMillis() % 10);
		int number2 = (int) (System.currentTimeMillis() / 7 % 10);
		Scanner input = new Scanner(System.in);

		System.out.print("What is " + number1 + " + " + number2 + "? ");
		int number = input.nextInt();
		boolean even = number % 2 == 0;
		System.out.println("Even is "+ even);

		System.out.println(number1 + " + " + number2 + " = " + number + " is " + (number1 + number2 == number));

	}

}
