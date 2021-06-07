package com.practice.qn02;

public class VowelsTest {

	/**
	 * 2. Find the number of vowels in a given string Input1:”NewyorkE” 'e' or 'E' -
	 * it should be counted as 1 Output1:2 Hint:irrespective of case
	 */

	public static void main(String[] args) {
		String str = "NewyorkE";
		int vowelsCount = 0;
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u')) {
				vowelsCount++;
				System.out.println(str.charAt(i));
			}
		}
		System.out.println(vowelsCount);
	}
}