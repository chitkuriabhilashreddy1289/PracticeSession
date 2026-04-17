package com.Inheritance;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PersonalLoan {
	static Scanner sc = new Scanner(System.in);

	double getIntrestrate() {
		return 10.5;
	}

	int getSalaryInfo() {
		System.out.println("Enter your salary");
		int salary = sc.nextInt();
		return salary;
	}

	int getAgeInfo() {
		System.out.println("Enter your age");
		int age = sc.nextInt();
		return age;
	}

	int cibilScore() {
		System.out.println("enter your cibilScore");
		int cibil=sc.nextInt();
		return cibil;
	}
	boolean validateAdhaar() {
		System.out.println("Enter Adhaar number");
		String adhaar=sc.next();
		String adhaarRegex="^[2-9][0-9]{11}$";
				return Pattern.matches(adhaarRegex, adhaar);

	}
	boolean validatePan() {
		System.out.println("Enter Pan number");
		String Pan=sc.next();
		String PanRegex="[A-Z]{5}[0-9]{4}[A-Z]{1}";
		return Pattern.matches(PanRegex,Pan);

	}

	public static void main(String[] args) {
		System.out.println("Welcome to the Loan section");
		PersonalLoan p=new PersonalLoan();
		//p.validateAdhaar();

		if(p.validateAdhaar() && p.validatePan()) {

			if(p.getSalaryInfo()>150000&&p.cibilScore()>750&&p.getAgeInfo()>25) {
			System.out.println("congratulations yourLoan got Approved");
			System.out.println("your loan rate of intrest is:"+p.getIntrestrate());
			}else {
				System.out.println("your loan got Rejected");}
		}
			else {
				System.out.println("You have Entered incorrect data");

		}
	}

	}

