package com.lambda.predefined_funtional;

import java.util.function.Consumer;

/* Consumer<T> - Takes 1 Input, returns nothing*/
public class ConsumerExample {

	public static void main(String[] args) {

		Consumer<String> greet = name -> System.out.println("Hello " + name);
		greet.accept("Rajesh");

		// o/p-> Hello Rajesh
	}

}
