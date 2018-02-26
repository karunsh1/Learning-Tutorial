package com.java8.practice.ExcerciseLymda;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UnitExcerciseWithJava8 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dikcens", 60),
				new Person("Karun", "Sharma", 29),
				new Person("Vikas", "Tyagi", 20));
		// step 1 : sort list by last name

		/**
		 * by java 8 lambda
		 */
		Collections.sort(people, (o1, o2)-> o1.getLastName().compareTo(o2.getLastName()));

		// step 2 create a method that print all elements in the list

		printLastwithChar(people, p -> true);
		printFilter(people,p->true);
		printFilterWith3rdArgument(people,p->true,p->System.out.println(p));
		// Step 3: method to print with last name char i.g. d
		
		printLastwithChar(people,p -> p.getLastName().toLowerCase().startsWith("d"));
		printFilter(people,p -> p.getLastName().toLowerCase().startsWith("d"));
		printFilterWith3rdArgument(people,p -> p.getLastName().toLowerCase().startsWith("d"),p->System.out.println(p));
		
	}

	private static void printLastwithChar(List<Person> people, Condition condition) {
		for(Person p: people) {
			if(condition.test(p)) {
				System.out.println(p);
			}
		}
		
	}
	
	
// by function in util throgh predicate to remove interface
	private static void printFilter(List<Person> people, Predicate<Person> predicate) {
		for (Person p: people) {
			if(predicate.test(p)) {
				System.out.println(p);
			}
		}
	}
	
	// by function in util throgh predicate to remove interface
	private static void printFilterWith3rdArgument(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person p: people) {
			if(predicate.test(p)) {
				consumer.accept(p);
			}
		}
	}
	

}
interface Condition{
	

	boolean test(Person p);
}
