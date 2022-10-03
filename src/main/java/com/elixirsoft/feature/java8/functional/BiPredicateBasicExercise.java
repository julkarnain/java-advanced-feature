package com.elixirsoft.feature.java8.functional;

import java.util.function.BiPredicate;

public class BiPredicateBasicExercise {

	public static void main(String[] args) {

		BiPredicate<Boolean, Integer> biPredicate1 = (i, j) ->  i == true && j > 10;
		
		System.out.println("Bi Predicate 1: " + biPredicate1.test(true, 20));
		
		BiPredicate<Boolean, Integer> biPredicate2 = (i, j) ->  i == false || j > 50;
		
		System.out.println("Bi Predicate 2: " + biPredicate2.test(false, 20));
		
		if(biPredicate1.and(biPredicate2).test(true, 30)) {
			System.out.println("Bi Predicate AND Operation");
		}
		if(biPredicate1.or(biPredicate2).test(false, 30)) {
			System.out.println("Bi Predicate OR Operation");
		}
		if(biPredicate1.and(biPredicate2.negate()).test(true, 30)) {
			System.out.println("Bi Predicate NEGATE Operation");
		}
	}
}
