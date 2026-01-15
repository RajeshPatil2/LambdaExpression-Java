package com.date_time_api;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {

	public static void main(String[] args) {

		ZonedDateTime indianTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Indian Time : " + indianTime);

		ZonedDateTime usTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("US Time : " + usTime);

		ZonedDateTime londonTime = ZonedDateTime.now(ZoneId.of("Europe/London"));
		System.out.println("London Time : " + londonTime);

	}

}
