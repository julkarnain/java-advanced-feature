package com.elixirsoft.feature.java8.functional;

import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorExercise {

	public static void main(String[] args) {

		UnaryOperator<Integer> unaryOperator = (u) -> u * 100;
		System.out.println("Unary Operator : " + unaryOperator.apply(10));

		Function<Integer, Integer> fn = (f) -> f * 100;
		System.out.println("Function : " + fn.apply(10));

		IntUnaryOperator intUnaryOperator = (i) -> i * 100;
		System.out.println("Int Unary Operator : " + intUnaryOperator.applyAsInt(10));

		LongUnaryOperator longUnaryOperator = (l) -> l * 100L;
		System.out.println("Long Unary Operator : " + longUnaryOperator.applyAsLong(10L));

		DoubleUnaryOperator doubleUnaryOperator = (d) -> d * 100.50;
		System.out.println("Double Unary Operator : " + doubleUnaryOperator.applyAsDouble(10.00));
	}
}
