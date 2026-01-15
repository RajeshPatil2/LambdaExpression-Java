package com.lambda.predefined_funtional;

import java.util.function.*;

public class AllFunctionalInterfacesExample {
	public static void main(String[] args) {

		// 1) Consumer<T> → Takes input, returns nothing
		Consumer<String> printUpperCase = str -> System.out.println("Uppercase: " + str.toUpperCase());
		printUpperCase.accept("rajesh"); // Output: Uppercase: RAJESH

		// 1.1) BiConsumer<T, U> → Takes 2 inputs, returns nothing
		BiConsumer<Integer, Integer> sum = (a, b) -> System.out.println("Sum: " + (a + b));
		sum.accept(10, 20); // Output: Sum: 30

		// 2) Predicate<T> → Takes input, returns boolean
		Predicate<String> isEmpty = str -> str.isEmpty();
		System.out.println("Is empty? " + isEmpty.test("")); // true
		System.out.println("Is empty? " + isEmpty.test("Java")); // false

		// 2.1) BiPredicate<T, U> → Takes 2 inputs, returns boolean
		BiPredicate<String, String> isEqual = (s1, s2) -> s1.equalsIgnoreCase(s2);
		System.out.println("Is 'Java' equal to 'JAVA'? " + isEqual.test("Java", "JAVA")); // true

		// 3) Function<T, R> → Takes input, returns output
		Function<String, String> reverse = str -> new StringBuilder(str).reverse().toString();
		System.out.println("Reverse of 'hello': " + reverse.apply("hello")); // olleh

		// 3.1) BiFunction<T, U, R> → Takes 2 inputs, returns 1 output
		BiFunction<Integer, Integer, String> compare = (x, y) -> (x > y) ? "First is greater"
				: (x < y) ? "Second is greater" : "Both are equal";
		System.out.println(compare.apply(10, 20)); // Output: Second is greater

		// 4) Supplier<T> → No input, only returns output
		Supplier<Double> randomValue = () -> Math.random();
		System.out.println("Random number: " + randomValue.get()); // Output: Random number: 0.123456
	}
}
