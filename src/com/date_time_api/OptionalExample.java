package com.date_time_api;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {

		String name = "Rajesh";
		Optional<String> optName = Optional.ofNullable(name);

		// 1.isPresent
		if (optName.isPresent()) {
			System.out.println("Name :" + optName.get());
		}

		// 2. orElse
		String result = optName.orElse("No Name");
		System.out.println("Result : " + result);

		// 3.IfPresent
		optName.ifPresent(n -> System.out.println("Hello" + n));
	}
}
