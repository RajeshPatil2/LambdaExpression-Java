package com.lambda.predefined_funtional;

import java.util.function.Predicate;

/*Predicate<T> - Takes 1 input returns boolean*/
public class PredicateExample {

	public static void main(String[] args) {
		Predicate<Integer> isAdult = age -> age >= 18;
		System.out.println(isAdult.test(20)); //true
		System.out.println(isAdult.test(15)); //false
		
	}
}
