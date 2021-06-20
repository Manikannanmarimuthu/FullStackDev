package com.practice.override;

public class ICICI extends Bank {
	
	int i = 11;
	String name = "ICICI Bank";


	@Override
	void sanctionLoan() {
		System.out.println("ICICI Bank Sanction Loan");
	}

}
