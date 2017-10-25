package com.example.number;

public class MathOperation {

	public static void mathOperation() {
		int intValue1 = 48;
		int intValue2 = 20;

		int resultSum = intValue1 + intValue2;
		System.out.println("Addition " +resultSum);

		int resultSubtraction = intValue1 - intValue2;
		System.out.println("Subtraction " +resultSubtraction);

		int resultMultiplication = intValue1 * intValue2;
		System.out.println("Multiplication " +resultMultiplication);

		double resultDivison = (double) intValue1 / intValue2;
		System.out.println("Division " +resultDivison);

		double resultReminder = (double)intValue1 % intValue2;
		System.out.println("Reminder " +resultReminder);

		double doubleValue = 3.655;
		long rounded = Math.round(doubleValue);
		System.out.println("Double Value " +doubleValue+" Rounded " +rounded);

	}

}
