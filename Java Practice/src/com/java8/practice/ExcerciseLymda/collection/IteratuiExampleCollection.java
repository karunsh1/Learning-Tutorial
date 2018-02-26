package com.java8.practice.ExcerciseLymda.collection;

import java.util.Arrays;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import com.java8.practice.ExcerciseLymda.Person;

public class IteratuiExampleCollection {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dikcens", 60),
				new Person("Karun", "Sharma", 29),
				new Person("Vikas", "Tyagi", 20));
	
	for(Person p : people) {
		
		System.out.println(p);
		
	}
	people.forEach(System.out::println);
	
	}

}
