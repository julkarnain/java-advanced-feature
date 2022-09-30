package com.elixirsoft.feature.java8.lambda;

public class IncrementTraditional implements IncrementInterface {

	@Override
	public int increment(int x) {
		// TODO Auto-generated method stub
		return x + 5;
	}

	public static void main(String[] args) {
		IncrementTraditional incrementTraditional = new IncrementTraditional();
		System.out.println(incrementTraditional.increment(5));
	}
}
