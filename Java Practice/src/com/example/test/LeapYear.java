package com.example.test;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		
		boolean isLeapYear = (year % 4 == 0 && year / 100 != 0) || ( year % 400 == 0 );
		
		System.out.println(year + " is a leap year? "+ isLeapYear);
		
		//System.out.println(year + " is ? "+ year) ;
		int c = 0x2202;
		
		String s = Character.toString((char)c);
		System.out.println(year + " is ? "+ s) ;
	}

}
