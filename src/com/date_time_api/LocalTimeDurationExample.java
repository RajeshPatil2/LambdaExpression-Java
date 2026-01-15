package com.date_time_api;

import java.time.Duration;
import java.time.LocalTime;

public class LocalTimeDurationExample {

	public static void main(String[] args) {

		LocalTime t1 = LocalTime.of(10, 4);

		LocalTime t2 = LocalTime.of(12, 44);

		Duration duration = Duration.between(t1, t2);

		System.out.println("Minutes : " + duration.toMinutes());
	}

}
