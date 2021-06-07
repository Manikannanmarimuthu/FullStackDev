package com.practice.qn05;

public class StringToNumber {

	public static void main(String[] args) {

		String[] StrArr = { "2AA", "12", "ABC", "67H", "uu678" };
		int total = 0;
		for (int i = 0; i < StrArr.length; i++) {
			String str = StrArr[i];
			for (int j = 0; j < str.length(); j++) {
				if (Character.isDigit(str.charAt(j))) {
					total = total + Integer.parseInt(String.valueOf(str.charAt(j)));
				}
			}
		}
		System.out.println("Total " + total);
	}
}
