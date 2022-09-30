package com.elixirsoft.feature.java8.lambda;

public class IncrementLambda {

	public static void main(String[] args) {
		
		IncrementInterface incrementLambda = (x) -> x +5;
		
		System.out.println(incrementLambda.increment(5));
	}
}
