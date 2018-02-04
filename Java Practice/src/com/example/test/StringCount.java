package com.example.test;

import java.util.ArrayList;
import java.util.Scanner;

public class StringCount {
	static final int ASCII_SIZE = 256;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter No. of lines");
		int noOfLines = input.nextInt();
		ArrayList<String> allLine = new ArrayList<String>();
		System.out.printf("Enter the pragraph of %d  lines \n ", noOfLines);
		while (noOfLines >= 0) {
			String line = input.nextLine();
			allLine.add(line);
			noOfLines--;
		}
		allLine.remove(0);
		System.out.println(allLine.size());

		System.out.println("Select the grams from 1 or 2 or 3");
		int occurenceGram = input.nextInt();
		String charOfLines = "";
		for (int i = 0; i < allLine.size(); i++) {
			String charOfLine = allLine.get(i);
			charOfLine = charOfLine.replaceAll("\\W", "");
			charOfLines = charOfLines + charOfLine;
			// System.out.println(" charofline : " + charOfLines);
		}
		occurenceSelection(input, occurenceGram, charOfLines);
	}

	private static void occurenceSelection(Scanner input, int occurenceGram, String charOfLines) {
		if (occurenceGram == 1) {
			System.out.println(charOfLines);
			System.out.println(getMaxOccuringOneCharWithCount(charOfLines));

		} else if (occurenceGram == 2) {

			System.out.println(getTwoGramOccurance(charOfLines, occurenceGram));
		} else if (occurenceGram == 3) {

			System.out.println(getTwoGramOccurance(charOfLines, occurenceGram));
		}else {
			System.out.println("Please enter value only from 1 or 2 or 3");
			occurenceGram = input.nextInt();
			occurenceSelection(input, occurenceGram, charOfLines);
		}
	}

	private static String getTwoGramOccurance(String charOfLines, int num) {
		int maxCount = 0;
		ArrayList<String> twoCharArray = getGramString(charOfLines, num);
		String maxOccur = "";
		for (int i = 0; i < twoCharArray.size(); i++) {
			int count = 0;
			for (int j = 1; j < twoCharArray.size(); j++) {
				if (twoCharArray.get(i).equals(twoCharArray.get(j))) {
					count++;
					if (count >= maxCount) {
						maxCount = count;
						maxOccur = twoCharArray.get(i);

					}
				}
			}
		}
		if (maxCount == 1 || maxCount == 0) {
			return "Chars are not repeated";
		}

		return "Max occurance  \"" + maxOccur + "\"  ====== " + maxCount;
	}

	private static ArrayList<String> getGramString(String charOfLines, int num) {
		int len = charOfLines.length();
		String temTwoChar = "";
		ArrayList<String> twoCharArray = new ArrayList<>();
		for (int i = 0; i < len; i++) {
			if (i + 1 < len) {
				if (num == 2) {
					temTwoChar = "" + charOfLines.charAt(i) + charOfLines.charAt(i + 1) + "";
					twoCharArray.add(temTwoChar);
				} else {
					if (i + 2 < len) {
						temTwoChar = "" + charOfLines.charAt(i) + charOfLines.charAt(i + 1) + charOfLines.charAt(i + 2)
								+ "";
						twoCharArray.add(temTwoChar);
					}
				}
			}
		}
		//System.out.println("value     " + twoCharArray);
		return twoCharArray;
	}

	public static String getMaxOccuringOneCharWithCount(String str) {

		int count[] = new int[ASCII_SIZE];
		int len = str.length();
		// int countTemp = -1;
		for (int i = 0; i < len; i++) {
			count[str.charAt(i)]++;
			// countTemp = count[str.charAt(i)];
			// System.out.println("count of " + str.charAt(i) + " =================" +
			// countTemp);
		}
		int max = -1;
		char result = ' ';
		for (int i = 0; i < len; i++) {
			if (max < count[str.charAt(i)]) {
				max = count[str.charAt(i)];
				result = str.charAt(i);
			}
		}

		return "Max occurance  \"" + result + "\"  ====== " + max;
	}

}
