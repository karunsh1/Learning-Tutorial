package com.java8.practice.ExcerciseLymda;

import java.util.function.BiConsumer;

import com.sun.media.sound.AiffFileReader;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		int[] someNumbers = { 1, 3, 5, 6 };
		int key = 2;

		/**
		 * can do by that but poor try catch and no trace
		 */
		/*process(someNumbers, key, (v, k) -> {
			try {

				System.out.println(v / k);
			} catch (ArithmeticException e) {

				System.out.println("Airthmetic exception");
			}
		});*/
		process(someNumbers, key,wrapperLambda((v,k) ->System.out.println(v / k)));
	}

	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {

		for (int i : someNumbers) {

			consumer.accept(i, key);
		}

	}

	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
		//return consumer;
		return(a,b) -> {
			try {
				consumer.accept(a, b);
				System.out.println("eecuting from wrapper");
			} catch (ArithmeticException e) {
				System.out.println("exception caught in wrapper");
			}
			
		
		};

	}
}
