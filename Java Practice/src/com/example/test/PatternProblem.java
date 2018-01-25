package com.example.test;

import java.util.Scanner;

public class PatternProblem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = input.nextInt();
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {

				if (j <= i) {

					System.out.print(" " + j);
				}

			}
			System.out.println();
		}
		for (int i = 1; i <= num; i++) {
			for (int s = num - i; s >= 1; s--) {
				System.out.print("  ");
			}
			for (int j = i; j >= 1; j--) {

				/* if (j <= i) { */

				System.out.print(" " + j);
				// }

			}
			System.out.println();
		}

		for (int i = 1; i <= num; i++) {
			for (int s = num - i; s >= 1; s--) {
				System.out.print("  ");
			}

			for (int j = i; j >= 2; j--) {

				System.out.print(j + " ");

			}

			for (int k = 1; k <= i; k++) {

				System.out.print(k + " ");

			}

			System.out.println();
		}

	}

}
