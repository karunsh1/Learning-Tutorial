package com.example.test;

import java.util.Random;
import java.util.Scanner;

public class RepeatAdditionQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randomNo = new Random();
		int number1 = randomNo.nextInt(50) + 1;
		int number2 = randomNo.nextInt(100) + 20;
		Scanner input = new Scanner(System.in);

		System.out.println("what is" + number1 + " + " + number2 + "?");
		int sumValue = input.nextInt();

		/*while (number1 + number2 != sumValue) {

			System.out.println("sum is not valid ! Please, enter the coorect sum");
			sumValue = input.nextInt();

		}
		System.out.println("Great!, you got it");*/
		
		do {
			System.out.println("sum is not valid ! Please, enter the coorect sum");
			sumValue = input.nextInt();
			
		}
		while(number1 + number2 != sumValue);
		System.out.println("Great!, you got it");
		

	}

}
