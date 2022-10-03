package com.elixirsoft.feature.java8.functional;

import java.util.function.Function;

public class FunctionBasicExercise {

	public static void main(String[] args) {

		Function<Integer, Double> function1 = (i) -> Math.sqrt(i);
		System.out.println("Square root : " +function1.apply(64));
		
		Function<String, String> function2 = (s) -> s.toLowerCase();
		System.out.println("Lower case : " +function2.apply("FUNCTIONAL PROGRAMMING"));
		
		Function<String, String> function3 = (s) -> s.concat(" is Interesting.");
		System.out.println("Concatenation : " +function3.apply("FUNCTIONAL PROGRAMMING"));
		
		System.out.println("Concatenation andThen: " + function2.andThen(function3).apply("FUNCTIONAL PROGRAMMING"));
		
		System.out.println("Compose: " + function2.compose(function3).apply("FUNCTIONAL PROGRAMMING"));
	}
}
