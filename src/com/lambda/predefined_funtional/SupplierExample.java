package com.lambda.predefined_funtional;
/*4]Supplier<T> - Takes No Input Returns Output*/

import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		Supplier<String> msg = () -> "hello from supplier";

		System.out.println(msg.get());
	}

}
