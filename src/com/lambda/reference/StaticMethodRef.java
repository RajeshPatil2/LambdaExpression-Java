package com.lambda.reference;
/* 1.Reference to a static method
 * Syntax: ClassName :: staticMethodName
 */

import java.util.function.Consumer;

public class StaticMethodRef {

	public static void showMessage(String msg) {
		System.out.println("Static Method : " + msg);
	}

	public static void main(String[] args) {
		Consumer<String> consumer = StaticMethodRef::showMessage;
		consumer.accept("Hello from statci method reference..");
	}
}
