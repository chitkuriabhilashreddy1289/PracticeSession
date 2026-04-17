package com.comstructors1;

import java.util.Scanner;

class UserAccount {
	private String name;
	private double balance;

	public UserAccount(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public void deductBalance(double amount) {
		if (amount <= balance) {
			balance = balance - amount;
			System.out.println("payment successful");
			System.out.println("Remaining balance:"+balance);
		} else {
			System.out.println("insufficient balance");
		}
	}

}

abstract class Payment {
	abstract void pay(UserAccount user, double amount);

}

class UPIpayment extends Payment {
	@Override
	public void pay(UserAccount user, double amount) {
		System.out.println("processing UPIpayment");
		user.deductBalance(amount);
	}
}

class NetBankingpayment extends Payment {
	@Override
	public void pay(UserAccount user, double amount) {
		System.out.println("processing UPIpayment");
		user.deductBalance(amount);
	}
}

class Cardpayment extends Payment {
	@Override
	public void pay(UserAccount user, double amount) {
		System.out.println("processing UPIpayment");
		user.deductBalance(amount);
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserAccount user = new UserAccount("Vinay", 50000);
		System.out.println("welcome " + user.getName());
		System.out.println("Current Balance:" + user.getBalance());
		System.out.println("Choose payment to pay:");
		int choice = sc.nextInt();
		Payment payment;
		switch (choice) {
		case 1:
			System.out.println("you have choosen UPI payment");

			payment = new UPIpayment();
		case 2:
			System.out.println("you have choosen Netbankingpayment");

			payment = new NetBankingpayment();
		case 3:
			System.out.println("you have choosen Card payment");

			payment = new Cardpayment();
			break;
		default:
			System.out.println("Enter valid choice");
			return;
		}
		System.out.println("Enter amount to pay");
		double amount = sc.nextDouble();
		payment.pay(user, amount);
	}

}
