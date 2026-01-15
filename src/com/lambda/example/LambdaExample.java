package com.lambda.example;

@FunctionalInterface
interface Greeting {
	void greet(); // Functional Interface with one abstract method
}

public class LambdaExample {
	public static void main(String[] args) {

		// Lambda Expression implementing show()
		Greeting g = () -> // { No need for curly braces {}
		System.out.println("Good Morning..!");
		g.greet(); // calling the method

		// };
	}
}
