package com.example.test;

public class For_Loop_Problems {

	public static void main(String[] args) {
		int i = 0;
		while (i < 5) {
			for (int j = i; j > 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println("****");
			i++;

		}
	}

}
