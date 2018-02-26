package com.java8.practice.ExcerciseLymda.collection;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;


import com.java8.practice.ExcerciseLymda.Person;

public class MethodRefrenceExample2 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dikcens", 60),
				new Person("Karun", "Sharma", 29),
				new Person("Vikas", "Tyagi", 20));
		
		printFilterWith3rdArgument(people,p->true,System.out::println);

	}
	private static void printFilterWith3rdArgument(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person p: people) {
			if(predicate.test(p)) {
				consumer.accept(p);
			}
		}
	}
		
	}
	

