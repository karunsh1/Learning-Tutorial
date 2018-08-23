package org.java8.chap03;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		rightNumberPattern(n);
		

		for (int i = 1; i <= n; i++) {
			for (int s = n - i; s >= 1; s--) {
				System.out.print("  ");
			}

			for (int j = i; j >= 2; j--) {

				System.out.print("*" + " ");

			}

			for (int k = 1; k <= i; k++) {

				System.out.print("*" + " ");

			}

			System.out.println();
		}
		
		

	}

	private static void rightNumberPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= 2 * i - 1; j++) {

				System.out.print(j + " ");

			}

			System.out.println();

		}
	}

}
