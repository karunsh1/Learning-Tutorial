package org.java8.chap02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * 
 * @author Admin
 * chap 02 is for passing behavior parameter in the code to reduce the complexity of code
 *
 */
public class FilteringApple {

	public static void main(String... args) {

		List<Apple> listOfApple = Arrays.asList(new Apple(50, "green"), new Apple(60, "yellow"), new Apple(70, "red"));

		System.out.println(filterGreenApple(listOfApple));
		// Java 8 : filtering color : green
		System.out.println(filterApple(listOfApple, FilteringApple::filterColorApple));
		// java 8 : filtering heavy : apple
		System.out.println(filterApple(listOfApple, FilteringApple::filterHeavyApple));
		// java 8 : filtering by using lambda expression

		System.out.println(filterApple(listOfApple, (Apple a) -> "green".equals(a.getColor())));
		System.out.println(filterApple(listOfApple, (Apple a) -> a.getWeight() > 60));
		
		// java 8 by using Behavior parameterization: filtering apples with predicates 

		
		System.out.println(filterApple(listOfApple, new AppleColorPredicate()));
		System.out.println(filterApple(listOfApple, new AppleWeightPredicate()));
		
		// java 8 by using anonymous class 

		System.out.println(filterApple(listOfApple	, new Predicate<Apple>() {
			public boolean test(Apple apple) {
				// TODO Auto-generated method stub
				return "green".equals(apple.getColor());
			}
		}));
		System.out.println(filterApple(listOfApple, new Predicate<Apple>() {
			public boolean test(Apple apple) {
				// TODO Auto-generated method stub
				return apple.getWeight()>50;
			}
		}));
	

	}

	/**
	 * **** This metod is implement by java 7. Similarly we do this to comparing
	 * heavy weight apple
	 * 
	 * @param inventory
	 * @return List of green Apple
	 */
	public static List<Apple> filterGreenApple(List<Apple> inventory) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if ("green".equals(apple.getColor())) {
				result.add(apple);
			}
		}

		return result;

	}

	/**
	 * 
	 * @param inventory
	 * @param p
	 * @return
	 */

	public static List<Apple> filterApple(List<Apple> inventory, Predicate<Apple> p) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (p.test(apple)) {
				result.add(apple);
			}
		}

		return result;

	}

	/**
	 * 
	 * @param apple
	 * @return boolean value for weight
	 */
	public static boolean filterHeavyApple(Apple apple) {
		return apple.getWeight() > 60;
	}

	/**
	 * 
	 * @param apple
	 * @return boolean value for color
	 */

	public static boolean filterColorApple(Apple apple) {
		return "green".equals(apple.getColor());
	}

}
