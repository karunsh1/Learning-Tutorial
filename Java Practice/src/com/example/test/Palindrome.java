package com.example.test;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the word");
		String word = input.nextLine();
		int low = 0;
		int high = word.length()-1;
		boolean isPalindrome = true;
		while(low < high) {
			if(word.charAt(low) != word.charAt(high)) {
				isPalindrome = false;
				break;
			}
			low++;
			high--;
		}
		if(isPalindrome) {
			System.out.println("this word is a palindrome");
		}else {
			System.out.println("This work is not a plaindrome");
		}

	}

}
