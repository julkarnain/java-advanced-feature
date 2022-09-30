package com.elixirsoft.feature.java8.functional;

import java.util.function.Predicate;

public class PredicateBasicExercise {

	public static void main(String[] args) {
	
		Predicate<Integer> predicate1 = (i) -> i>10;
		System.out.println(predicate1.test(100));
		
		Predicate<Integer> predicate2 = (i) -> i%2 == 0;
		System.out.println(predicate2.test(100));
		
		System.out.println("i>10 && i%10 == 0 : " + predicate1.and(predicate2).test(99));
		
		System.out.println("i>10 || i%10 == 0 : " + predicate1.or(predicate2).test(99));		
		
		System.out.println("i>10 && i%10 != 0 : " + predicate1.or(predicate2.negate()).test(99));	
	}
}