package com.practice.qn12;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
	public static void main(String args[]) {
		Integer[] myArray1 = { 23, 36, 96, 78, 55 };
		Integer[] myArray2 = { 78, 45, 19, 73, 55 };
		System.out.println("Intersect" + intesect(myArray1, myArray2));
		System.out.println("Union" + union(myArray1, myArray2));
		unionIntesect(intesect(myArray1, myArray2), union(myArray1, myArray2));
	}

	public static HashSet<Integer> intesect(Integer[] myArray1, Integer[] myArray2) {
		HashSet<Integer> intersect = new HashSet<Integer>();
		for (int i = 0; i < myArray1.length; i++) {
			for (int j = 0; j < myArray2.length; j++) {
				if (myArray1[i] == myArray2[j]) {
					intersect.add(myArray1[j]);
				}
			}
		}
		Integer[] inter = {};
		inter = intersect.toArray(inter);
		return intersect;
	}

	public static HashSet<Integer> union(Integer[] myArray1, Integer[] myArray2) {
		HashSet<Integer> arr = new HashSet<Integer>();
		arr.addAll(Arrays.asList(myArray1));
		arr.addAll(Arrays.asList(myArray2));
		Integer[] union = {};
		union = arr.toArray(union);
		return arr;
	}

	public static void unionIntesect(HashSet<Integer> hashSet, HashSet<Integer> hashSet2) {
		for (Integer integer : hashSet) {
			if (hashSet2.contains(integer)) {
				hashSet2.remove(integer);
			}
		}
		Integer[] union = {};
		union = hashSet2.toArray(union);
		System.out.println(Arrays.toString(union));

	}
}