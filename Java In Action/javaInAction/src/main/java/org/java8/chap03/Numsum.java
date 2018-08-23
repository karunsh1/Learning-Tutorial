package org.java8.chap03;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Numsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 Scanner input = new Scanner(System.in);
	 
	 System.out.println("Enter the numbers");
	 int temp = 0;
	 int sumOdd = 0;
	 int sumEven = 0;
	 ArrayList<Integer> list = new ArrayList<>();
	 String line = input.nextLine();
	 
	 for(int i = 0;i<line.length(); i++) {
		 char test = line.charAt(i);
		 list.add(Character.getNumericValue(test));
		 
	 }
	 
	 while(input.hasNextInt()) {
		list.add(input.nextInt());		
	 }
	 for(int i = 0; i<list.size();i++) {
		 if(list.get(i) % 2==0) {
			 sumEven = sumEven + list.get(i);
		 }else {
			 sumOdd = sumOdd+list.get(i);
		 }
	 }
	 
	 System.out.println("The total sum is "+ sumOdd+""+sumEven);
		
		

	}

}
