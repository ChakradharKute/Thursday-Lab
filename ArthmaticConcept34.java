package com.crk.core;
import java.util.Scanner;
public class ArthmaticConcept34 {
	public static void main(String args[])
	{
	String yn;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter First No.:");
	int a= sc.nextInt();
	System.out.println("Enter Second No.:");
	int b= sc.nextInt();
	int result;
	result = a+b;
	System.out.println("Addition Result:"+result);
	result = a-b;
	System.out.println("Substraction Result:"+result);
	System.out.println("Do you want to continue (Press yes for continue and n for No)");
				yn = sc.next();
	}

}
