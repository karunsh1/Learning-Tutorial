package com.example.test;

import java.util.Scanner;

public class Excercisse_3_29 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter r1's center x- , y- coordinates, width, and height: ");
		double r1_X_Coordinates = input.nextDouble();
		double r1_Y_Coordinates = input.nextDouble();
		double r1_Width = input.nextDouble();
		double r1_Height = input.nextDouble();
		System.out.print("Enter r2's center x- , y- coordinates, width, and height: ");
		double r2_X_Coordinates = input.nextDouble();
		double r2_Y_Coordinates = input.nextDouble();
		double r2_Width = input.nextDouble();
		double r2_Height = input.nextDouble();

		if (((r2_X_Coordinates - r1_X_Coordinates) + r2_Width / 2) < (r1_Width / 2)
				&& ((r2_Y_Coordinates - r1_Y_Coordinates) + (r2_Height / 2)) < r1_Height / 2) {
			System.out.println("r2 is inside r1");
		} else if (((r2_X_Coordinates - r1_X_Coordinates) + r2_Width / 2) == (r1_Width / 2)
				&& ((r2_Y_Coordinates - r1_Y_Coordinates) + (r2_Height / 2)) == r1_Height / 2) {
			System.out.println("r2 and r1 are identical");
		} else if (((r2_X_Coordinates - (r2_Width / 2)) - r1_X_Coordinates) > (r1_Width / 2)
				&& ((r2_Y_Coordinates - (r2_Height / 2)) + r1_Y_Coordinates) > (r1_Height / 2)) {
			System.out.println("r2 is outside r1");
		} else {
			System.out.println("r2 is overlapping r1");
		}

	}

}
