package org.java8.chap02;

import java.util.function.Predicate;

public class AppleWeightPredicate implements Predicate<Apple> {

	public boolean test(Apple apple) {
		// TODO Auto-generated method stub
		return apple.getWeight()>50;
	}

}
