package com.example.test;

import java.util.Scanner;

public class SaleTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       Scanner input = new Scanner(System.in);
       System.out.println("Enter Purchage Amount :");
       double purchaseAmount = input.nextDouble();
       
       double tax = purchaseAmount * 0.06; // 11.823
       System.out.println("tax   "+ tax);
       System.out.println("Sales tax is $"+ (int)(tax*100)/100.0);
       
	}

}
