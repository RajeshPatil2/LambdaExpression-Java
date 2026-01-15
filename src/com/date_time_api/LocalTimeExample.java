package com.date_time_api;

import java.time.LocalTime;

public class LocalTimeExample {

	public static void main(String[] args) {
		LocalTime now = LocalTime.now();// current time
		System.out.println("current time : " + now);

		LocalTime time = LocalTime.of(10, 45);
		System.out.println("Fixed Time : " + time);
	}
}
