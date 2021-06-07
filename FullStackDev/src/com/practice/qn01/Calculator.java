package com.practice.qn01;

public class Calculator {

	/**
	 * Question :01: Create a calculator class to perform addition, subtraction,
	 * multiplication and division of two integers. Get inputs from command
	 * line/program arguments.
	 */
	
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