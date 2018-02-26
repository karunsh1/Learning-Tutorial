package com.java8.practice.ExcerciseLymda;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UnitExcercise {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dikcens", 60),
				new Person("Karun", "Sharma", 29),
				new Person("Vikas", "Tyagi", 20));
		// step 1 : sort list by last name

		/**
		 * by java 7
		 */
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});

		// step 2 create a method that print all elements in the list

		printAll(people);
		
		// Step 3: method to print with last name char i.g. d
		
		printLastwithChar(people,"d");
		
	}

	private static void printLastwithChar(List<Person> people, String c) {
		for(Person p: people) {
			if(p.getLastName().toLowerCase().startsWith(c)) {
				System.out.println(p);
			}
		}
		
	}

	private static void printAll(List<Person> people) {
		for (Person p: people) {
			System.out.println(p);
		}
		
	}
	
}

