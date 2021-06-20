package com.practice.override;

public class BankTest {

	public static void main(String[] args) {

		Bank bank = new HDFC();
		bank.sanctionLoan();
		System.out.println(bank.name);
		System.out.println(bank.i);

		HDFC hdfcbank = new HDFC();
		hdfcbank.sanctionPL();
		bank.sanctionLoan();
		System.out.println(bank.name);
		System.out.println(bank.i);

		bank = new SBI();
		bank.sanctionLoan();
		System.out.println(bank.name);
		System.out.println(bank.i);
	}

}
