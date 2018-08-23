package org.java8.chap02;

import java.util.function.Predicate;

public class AppleColorPredicate implements Predicate<Apple> {

	public boolean test(Apple apple) {
		// TODO Auto-generated method stub
		return "green".equals(apple.getColor());
	}

}
