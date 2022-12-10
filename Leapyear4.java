package com.crk.core;

public class Leapyear4 {
	public static void main(String[] args) {
		int year = 2017;
		if ((year % 4 == 0) || (year % 400 == 0 && year % 100 != 0)) {
			System.out.println("Leap year");
		} else {
			System.out.println("not a Leap year");
		}
	}
}
