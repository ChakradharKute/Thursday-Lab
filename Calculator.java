package com.crk.core;

import java.util.Scanner;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;

public class Calculator {
	public static void main(String[] args) {
		String yn;
		do {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter First No.:");
			int no1 = s.nextInt();
			System.out.println("Enter Second No.");
			int no2 = s.nextInt();
			System.out.println("Select Symbol(+,-,*,/)");
			String sys = s.next();
			int res;
			switch (sys) {
			case "+":
				res = no1 + no2;
				System.out.println("Addition Result:" + res);
				break;
			case "-":
				res = no1 - no2;
				System.out.println("Substraction Result:" + res);
				break;
			case "*":
				res = no1 * no2;
				System.out.println("Multiplication Result:" + res);
				break;
			case "/":
				res = no1 / no2;
				System.out.println("Dividation Result:" + res);
				break;
			default:
				System.out.println("Invalid Symbol");
				break;
			}
			System.out.println("Do You want to continue(Press y for yes and n for No)");
			yn = s.next();
		}
		while(yn.equals("y") || yn.equals("Y"));

	}
}
