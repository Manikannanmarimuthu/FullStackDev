package com.practice.qn04;

public class LengthArray {

	/**
	 * Find the number of words are of given length Input1:{“aa”,”b”,”cc”,”ddd”}
	 * Input2:2 Output1:2
	 * 
	 * Input1:{“aa”,”b”,”cc”,”ddd”} Input2:1 Output1:1
	 * 
	 * Input1:{“aa”,”b”,”cc”,”ddd”} Input2:3 Output1:1
	 */

	public static void main(String[] args) {
		int len = 1;
		int count = 0;
		String[] strArr = { "aa", "b", "cc", "ddd" };
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i].length() == len) {
				count++;
				System.out.println(len + " Length array(s) are ::  " + strArr[i]);
			}
		}
		if (count >= 1) {
			System.out.println(count + "  :: times present in given array ");
		} else {
			System.out.println("No array present in the given length");
		}

	}

}
