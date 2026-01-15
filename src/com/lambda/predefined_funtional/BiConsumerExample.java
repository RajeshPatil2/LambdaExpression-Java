package com.lambda.predefined_funtional;

import java.util.function.BiConsumer;

/*Biconsumer<T,U> - Takes 2 inputs, returns nothing */
public class BiConsumerExample {
	public static void main(String[] args) {
		BiConsumer<String, Integer> bi = (name, age) -> System.out.println(name + " is " + age + " Years old");
		bi.accept("Rajesh", 25);
		// Rajesh is 25 Years old
	}
}
