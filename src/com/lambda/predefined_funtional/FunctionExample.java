package com.lambda.predefined_funtional;

import java.util.function.Function;

/** Function<T,R> - Takes 1 input, returns 1 output */
public class FunctionExample {

	public static void main(String[] args) {

		Function<String, Integer> getLength = str -> str.length();

		System.out.println(getLength.apply("Rajesh")); // o/p-6
	}

}
