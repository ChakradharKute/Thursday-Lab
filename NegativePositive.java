package com.crk.core;
import java.util.Scanner;
public class NegativePositive {
	public static void main(String[] args) {
		int no;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		no=sc.nextInt();
		if(no<0)
		{
			System.out.println("Number is Negative");
		}
		else {
			System.out.println("Number is Postive");
		}
		
	}

}
