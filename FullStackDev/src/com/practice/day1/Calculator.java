package com.practice.day1;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Length is :: " + args.length);
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("Addition Operation output is :: " + (a + b));
		System.out.println("Subraction Operation output is :: " + (a - b));
		System.out.println("Multiplication Operation output is :: " + (a * b));
		System.out.println("Division Operation output is :: " + (a / b));
	}

}
