package com.elixirsoft.feature.java8.functional;

import java.util.function.Supplier;

public class SupplierBasicExercise {
	public static void main(String[] args) {
		Supplier<Integer> supplier = () -> (int) (Math.random() * 1000);
		System.out.println(supplier.get());
	}
}
