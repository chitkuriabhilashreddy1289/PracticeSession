package com.langfundamentals;

import java.util.Scanner;

public class BankDetails {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Main method started");

		BankDetails b1 = new BankDetails();
		long n1 = b1.Accnum();                                       
		String a1 = b1.Accountholder();
		double d1 = b1.deposit();                                 
		double f1 = b1.fixedamount();
		double t1 = b1.total();
		double total = b1.deposit() + f1;
		double w1 = b1.withdraw();
		double afterwithdraw = b1.fixedamount() + w1;

		System.out.println("your Account number is:" + n1);
		System.out.println(" Accountholder name is:" + a1);
		System.out.println("your deposite  Amount is:" + d1);
		System.out.println("your fixed amount is:" + f1);
		System.out.println("your total amount is:" + t1);
		System.out.println("afterwithdraw amount is:" + afterwithdraw);

	}

	long Accnum() {
		System.out.println("Enter your AccountNumber");
		long accnum = sc.nextLong();

		return accnum;

	}

	String Accountholder() {
		System.out.println("Enter your name");
		String accountholder = sc.next();

		return accountholder;

	}

	double deposit() {
		System.out.println("Deposit Amount");
		double deposit = sc.nextLong();
		return deposit;
	}

	double fixedamount() {
		double fixedamount = 5000;
		return fixedamount;
	}

	double total() {
		double total = 5000;
		return total        ;
	}

	double withdraw() {
		System.out.println("withdraw amount");

		double withdraw = sc.nextDouble();
		return withdraw;
	}
}
