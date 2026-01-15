package com.lambda.reference;
/* 2.Reference to an instance method of particular object
 * Syntax: object :: instanceMethod
 */

import java.util.function.Consumer;

public class InstanceMethodRef {

	public void display(String msg) {
		System.out.println("Instance Method : " + msg);
	}

	public static void main(String[] args) {

		InstanceMethodRef obj = new InstanceMethodRef();

		Consumer<String> consumer = obj::display;
		consumer.accept("Hello from instance method reference..");
	}

}
