package com.example.datetimeapi;

import java.time.LocalDateTime;

public class PrintCurrentDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDateTime localDateandTime = LocalDateTime.now();
		System.out.println("Prnting the current day of the month : "+localDateandTime.getDayOfMonth());

	}

}
