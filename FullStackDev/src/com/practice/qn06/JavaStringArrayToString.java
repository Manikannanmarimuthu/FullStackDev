package com.practice.qn06;

import java.util.Arrays;

public class JavaStringArrayToString {

	public static void main(String[] args) {
		String[] strArr = { "Vikas", "Lokesh", "Ashok" };
		String str = Arrays.toString(strArr);
		str = convertStringArrayToString(strArr, ",");
		System.out.println("Convert Java String array to String = " + str);
	}

	private static String convertStringArrayToString(String[] strArr, String delimiter) {
		StringBuilder sb = new StringBuilder();
		for (String str : strArr)
			sb.append(str).append(delimiter);
		return sb.substring(0, sb.length() - 1);
	}
}