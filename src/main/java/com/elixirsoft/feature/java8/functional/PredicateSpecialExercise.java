package com.elixirsoft.feature.java8.functional;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class PredicateSpecialExercise {
	
	public static void main(String[] args) {
		
		IntPredicate intPredicate = (p) -> p>100;
		System.out.println("Int Predicate : " + intPredicate.test(220));
		
		LongPredicate longPredicate = (p) -> p>100L;
		System.out.println("Long Predicate : " + longPredicate.test(220L));
		
		DoublePredicate doublePredicate = (p) -> p>10.5;
		System.out.println("Double Predicate : " + doublePredicate.test(22.5));	
		
		DoublePredicate doublePredicate1 = (p) -> p>10.5;
		DoublePredicate doublePredicate2 = (p) -> p<15.5;
		System.out.println("Double Predicate && : " + doublePredicate1.and(doublePredicate2).test(22.5));
		System.out.println("Double Predicate || : " + doublePredicate1.or(doublePredicate2).test(22.5));
		
	}
}
