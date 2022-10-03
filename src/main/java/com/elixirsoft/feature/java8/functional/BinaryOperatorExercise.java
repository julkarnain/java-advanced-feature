package com.elixirsoft.feature.java8.functional;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

public class BinaryOperatorExercise {

	public static void main(String[] args) {
		BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;
		System.out.println(binaryOperator.apply(10, 10));

		Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
		BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
		System.out.println(maxBy.apply(7, 8));

		BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
		System.out.println(minBy.apply(7, 8));

		IntBinaryOperator intBinaryOperator = (a, b) -> a * b;
		System.out.println(intBinaryOperator.applyAsInt(7, 8));

		LongBinaryOperator longBinaryOperator = (a, b) -> a * b;
		System.out.println(longBinaryOperator.applyAsLong(7, 80000L));

		DoubleBinaryOperator doubleBinaryOperator = (a, b) -> a * b;
		System.out.println(doubleBinaryOperator.applyAsDouble(7, 80000.00));
	}
}
