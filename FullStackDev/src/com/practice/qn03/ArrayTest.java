package com.practice.qn03;

public class ArrayTest {

	/**
	 * . Find the sum of maximum and minimum number from a given input array
	 * Input:{19,17,12} max - 19 min - 12 sum - 31 Output:31
	 */

	public static void main(String[] args) {

		int[] arr = { 90, 5, 10 };
		ArrayTest arrayTest = new ArrayTest();
		System.out.println("Max value of given array :: "+arrayTest.max(arr));
		System.out.println("Min value of given array :: "+arrayTest.min(arr));
		System.out.println("Sum of the given array ::  "+arrayTest.sum(arr));
	}

	public int max(int arr[]) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public int min(int arr[]) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;

	}

	public int sum(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
}
