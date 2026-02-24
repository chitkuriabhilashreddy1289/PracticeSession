package com.Oops;

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
			System.out.println("payment succesful");
			System.out.println("Remaining balance" + balance);
		} else {
			System.out.println("Insufficient balance");
		}
	}
}
//Absrtaction
	abstract class Payment {
		abstract void pay(UserAccount user, double amount);
	}

	// Inheritance+polymorphism
	class UPIPayment extends Payment {
		@Override
		void pay(UserAccount user, double amount) {
			System.out.println("Processing Upi payment");
			user.deductBalance(amount);
		}
	}

	class cardpayment extends Payment {
		@Override
		void pay(UserAccount user, double amount) {
			System.out.println("Processing cardpayment");
			user.deductBalance(amount);
		}
	}

	class Netbankingpayment extends Payment {
		@Override
		void pay(UserAccount user, double amount) {
			System.out.println("processing Netbankingpayment");
			user.deductBalance(amount);
		}
	}

	public class OnlinePaymentSystem {
		 
		public static void main(String[] args) {
			 Scanner sc = new Scanner(System.in);

			UserAccount u = new UserAccount("Vinay", 5000);
			System.out.println("Welcome" + u.getName());
			System.out.println("Current Balance:" + u.getBalance());
			System.out.println("Choose payment to pay");
			int choice = sc.nextInt();
			// polymorphism
			Payment payment;
			switch (choice) {
			case 1:
				System.out.println("You have choosen Upi payment");
				payment = new UPIPayment();
				break;
			case 2:
				System.out.println("you have choosen cardpayment");
				payment = new cardpayment();
				break;
			case 3:
				System.out.println("you have choosen Netbankingpayment");
				payment = new Netbankingpayment();
				break;
			default:
				System.out.println("Invalid choice");
				return;
			}
			System.out.println("Enter amount to pay");
			double amount=sc.nextDouble();
			payment.pay(u, amount);
		}
		
	}