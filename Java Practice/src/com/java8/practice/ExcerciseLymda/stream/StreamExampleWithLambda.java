package com.java8.practice.ExcerciseLymda.stream;

import java.util.Arrays;
import java.util.List;

import com.java8.practice.ExcerciseLymda.Person;

public class StreamExampleWithLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dikcens", 60),
				new Person("Karun", "Sharma", 29),
				new Person("Vikas", "Tyagi", 20));
		
		people.stream()
		.filter(p-> p.getLastName().startsWith("S"))
		.forEach(p -> System.out.println(p.getFirstName()));
				
	}
    
}
