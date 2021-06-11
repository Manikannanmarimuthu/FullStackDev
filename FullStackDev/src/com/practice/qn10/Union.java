package com.practice.qn10;

import java.util.Arrays;
import java.util.HashSet;

public class Union {

	public static void main(String arg[]) {

		Integer[] intArr1 = { 1, 2, 3, 4 };
		Integer[] intArr2 = { 3, 4, 5, 6 };

		HashSet<Integer> arr = new HashSet<Integer>();
		arr.addAll(Arrays.asList(intArr1));
		arr.addAll(Arrays.asList(intArr2));
		Integer[] union = {};
		union = arr.toArray(union);

		System.out.println(Arrays.toString(union));
	}
}