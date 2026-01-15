package com.lambda.predefined_funtional;

import java.util.function.BiPredicate;

/*BiPredicate<T,U> - Takes 2 input returns boolean*/
public class BiPredicateExample {

	public static void main(String[] args) {
		BiPredicate<String, Integer> bip = (str, len) -> str.length() == len;

		System.out.println(bip.test("Java", 4));
		System.out.println(bip.test("Spring", 6));
	}

}
