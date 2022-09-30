package com.elixirsoft.feature.java8.functional;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class ConsumerSpecialExercise {

	public static void main(String[] args) {
		IntConsumer intConsumer = (a) -> System.out.println("Int Consumer : " + a);
		intConsumer.accept(10);
		LongConsumer longConsumer = (a) -> System.out.println("Long Consumer : " + a);
		longConsumer.accept(20L);
		DoubleConsumer doubleConsumer = (a) -> System.out.println("Double Consumer : " + a);
		doubleConsumer.accept(30.66);
	}
}
