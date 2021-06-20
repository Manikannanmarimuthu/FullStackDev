package com.practice.override;

public class HDFC extends Bank {

	int i = 12;
	String name = "HDFC Bank";

	@Override
	void sanctionLoan() {
		System.out.println("HDFC Bank Sanction Loan");
	}

	void sanctionPL() {
		System.out.println("PL Loan Sanctioned");
	}

}
