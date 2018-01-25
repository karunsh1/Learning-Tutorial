package com.example.test;

import java.util.Scanner;



public class StringOddSelection {

	public static void main(String[] args) {

		int countVowels, countConsonants;
		countConsonants = countVowels = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String strWord = input.nextLine();

		int high = strWord.length() - 1;
		String oddChar = "";
		for (int i = 1; i <= high; i++) {
			if (i % 2 != 0) {
				oddChar = oddChar + strWord.charAt(i);
			}
		}
		System.out.println("The odd chars are " + oddChar);

		for (int i = 0; i <= high; i++) {

			if (Character.isLetter(strWord.charAt(i))) {
				if (Character.toUpperCase(strWord.charAt(i)) == 'A' || Character.toUpperCase(strWord.charAt(i)) == 'I'
						|| Character.toLowerCase(strWord.charAt(i)) == 'o'
						|| Character.toUpperCase(strWord.charAt(i)) == 'E'
						|| Character.toUpperCase(strWord.charAt(i)) == 'U') {
					countVowels++;
				} else {
					countConsonants++;
				}

			}
		}

		System.out.printf("The count of vowels are %d and the count of consonants are %d \n", countVowels, countVowels);

		System.out.println("Enter the another senetence: ");
		String strword2 = input.nextLine();
		String samePrefix = "";

		int index = 0;
		while (strWord.charAt(index) == strword2.charAt(index)) {

			samePrefix += strWord.charAt(index);
			if (strWord.length() >= strword2.length() && strword2.length() == index + 1
					|| strWord.length() < strword2.length() && strWord.length() == index + 1) {
				break;
			} else {
				++index;
			}

		}
		if (samePrefix.length() > 0) {
			System.out.println("The match prefix is " + samePrefix);
		} else {
			System.out.println("No Match!");
		}
		System.out.println("start with "+ strWord.substring(strWord.length()-2));
	}
	

}
