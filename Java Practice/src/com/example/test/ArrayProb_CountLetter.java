package com.example.test;

import java.util.Random;


public class ArrayProb_CountLetter {

	public static void main(String[] args) {
		char[] chars =  createArray();
		// array create
		displayChars(chars);  // display all char
		
		int[] countOccurence = countLetter(chars);
		 
		displayCounts(countOccurence);
		

	}

	public static char[] createArray() {
		char[] letterArray = new char[100];

		for (int i = 0; i < letterArray.length; i++) {
			letterArray[i] = RandomChar.getRandomLowerCaseLetter();

		}
		return letterArray;

	}
	 public static void displayChars(char [] chars) {
		 
		 for(int i = 0; i < chars.length; i++) {
			 if((i+1) % 20 == 0) {
				 System.out.println(chars[i]);
			 }else {
				 System.out.print(chars[i] + " ");
			 }
		 }
		 
	 }
	 public static int [] countLetter(char [] chars) {
		 int [] count = new int [26];
		 int [] countCheck = new int [26];
		 
		 for(int i = 0;i < chars.length; i++) {
			 count[chars[i] - 'a']++;
			 System.out.println("count value is  "+ count[chars[i] - 'a']++ + " single value "+ countCheck ['b' - 'a']++ +" coountcheck "+ countCheck[0]);
		 }
		 
		return count ;
		 
	 }
	 public static void displayCounts(int[] count) {
		 for (int i = 0; i < count.length; i++) {
			 if((i + 1) % 10 == 0){
				 System.out.println(count[i]+"----" + (char)(i + 'a'));
				 
			 }else {
				 System.out.print(count[i]+"----" + (char)(i + 'a')+ " ");
			 }
		 }
	 }
	
}
