package com.elixirsoft.feature.java8.lambda;

public class HelloWorldTraditional implements HelloWorldInterface {

	@Override
	public String sayHelloWorld() {
		// TODO Auto-generated method stub
		return "Hello World !";
	}

	public static void main(String[] args) {

		HelloWorldTraditional helloWorldTraditional = new HelloWorldTraditional();
		System.out.println(helloWorldTraditional.sayHelloWorld());
	}
}
