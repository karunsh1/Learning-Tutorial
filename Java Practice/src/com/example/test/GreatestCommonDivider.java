package com.example.test;

import java.util.Random;
import java.util.Scanner;

public class GreatestCommonDivider {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number");		
		int num1 = input.nextInt();
		System.out.println("Enter the second number");
		int num2 = input.nextInt();
		int gcd = 1;
		int comFactor = 2;
		while(comFactor <= num1 && comFactor <= num2) {
			if(num1 % comFactor == 0 && num2 % comFactor == 0) {
				gcd = comFactor ;
			}
			comFactor++;
		}
		System.out.println("The gcd is "+ gcd);
		

	}

}
