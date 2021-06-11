package com.practice.qn08;

public class SqureRoot {

	public static void main(String[] args) {

		double x1 = 2;
		double x2 = 3;
		double y1 = 4;
		double y2 = 5;

		double square = (x1 + x2) * (x1 + x2) + (y1 + y2) * (y1 + y2);
		System.out.println(square);
		int squareRoot = (int) square;

		System.out.println(squareRoot);
	}

}
