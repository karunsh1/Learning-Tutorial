package com.example.test;

public class PrimeNumber {

	public static void main(String[] args) {
		final int NUMBER_OF_PRIME_NO = 10;

		int count = 0;
		int number = 2;

		System.out.println("The first 50 prime numbers are");

		while (count < NUMBER_OF_PRIME_NO) {
			boolean isPrimeNumber = true;

			for (int divisor = 2; divisor <= number / 2; divisor++) {
				if (number % divisor == 0) {
					isPrimeNumber = false;
					break;
				}
			}
			if (isPrimeNumber) {
				System.out.print(number+" " );
				count++;
			}

			number++;
		}

	}

}
