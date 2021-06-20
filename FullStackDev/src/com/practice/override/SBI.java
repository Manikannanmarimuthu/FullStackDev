package com.practice.override;

public class SBI extends Bank {

	int i = 13;
	String name = "SBI Bank";

	@Override
	void sanctionLoan() {
		System.out.println("SBI Bank Sanction Loan");
	}

}
