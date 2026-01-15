package com.lambda.predefined_funtional;

import java.util.function.BiFunction;

/** Bi-Function<T,U,R> - Takes 2 input, returns 1 output */

public class BiFunctionExample {

	public static void main(String[] args) {

		BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

		System.out.println(add.apply(10, 33)); // o/p-6
	}
}
