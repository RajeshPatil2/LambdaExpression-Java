package com.lambda.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 0, 4, 7, 6, 3);

		// 1.Filter Even Number
		List<Integer> evenNumber = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println("Even Number : " + evenNumber);

		// 2.Square of Each number
		List<Integer> sq = numbers.stream().map(n -> n * n)// transform
				.collect(Collectors.toList());
		System.out.println("Square : " + sq);

		// 3. Count Number of Greater than 5
		long count = numbers.stream().filter(n -> n > 5).count();
		System.out.println("Count : " + count);

		// 4. Sort the Numbers
		List<Integer> sorted = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted : " + sorted);

		// 5. print all Numbers using forEach
		System.out.println("All Numbers : ");
		numbers.stream().forEach(n -> System.out.print(n + " "));

	}
}
