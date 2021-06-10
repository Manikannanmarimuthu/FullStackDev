package com.practice.qn07;

public class EmailValidation {

	public static void main(String[] args) {
		String email = "mani@gmail.com";
		if (validateEmailEnd(email) && validateEmailChar(email) && validateEmailbefore(email)) {
			System.out.println("Valid Mail");
		} else {
			System.out.println("Invalid Mail");
		}
	}

	public static boolean validateEmailChar(String email) {
		boolean status = false;
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < email.length(); i++) {
			char emailChar = email.charAt(i);
			if (String.valueOf(emailChar).equalsIgnoreCase("@")) {
				count1++;
			} else if (String.valueOf(emailChar).equalsIgnoreCase(".")) {
				count2++;
			}
		}
		if (count1 == 1 && count2 == 1) {
			status = true;
		}else {
			System.out.println("Failed in @ and . Validation");
		}
		return status;
	}

	public static boolean validateEmailLenbtwn(String email) {
		boolean status = false;
		if ((email.indexOf('@') - 1) - (email.indexOf('.') - 1) == 6) {
			return true;
		} else {
			System.out.println("Failed in btwn Validation");
		}
		return status;
	}

	public static boolean validateEmailbefore(String email) {
		boolean status = false;
		int eChar = email.indexOf('@');
		if (eChar >= 3) {
			status = true;
		} else {
			System.out.println("Failed in before Validation");
		}
		return status;
	}

	public static boolean validateEmailEnd(String email) {
		boolean status = false;
		if (email.substring(email.lastIndexOf(".") + 1).equalsIgnoreCase("com")) {
			status = true;
		} else {
			System.out.println("Failed in end Validation");
		}
		return status;
	}

}
