package com.functionalInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Comparable<T> -used for sorting
 * single method : int compareTo(T o)
 */
public class ComparableExample {

	public static void main(String[] args) {
		List<String> n = Arrays.asList("Zara", "Ovi", "Amit", "Riyansh");

		Collections.sort(n);// uses compareTo() internally

		for (String name : n) {
			System.out.println(name);
		}
	}
}
