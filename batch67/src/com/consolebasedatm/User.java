package com.consolebasedatm;

import java.util.Scanner;

public class User implements ATMService {

     Account account;
     Scanner sc = new Scanner(System.in);

    public User(Account account) {
        this.account = account;
    }

    @Override
    public void checkBalance() {
        System.out.println("💰 Current Balance: ₹" + account.getBalance());
    }

    @Override
    public void depositBalance() {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();

        if (amount > 0) {
            account.setBalance(account.getBalance() + amount);
            System.out.println("✅ Amount deposited successfully");
        } else {
            System.out.println("❌ Invalid amount");
        }
    }

    @Override
    public void withdrawBalance() {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("❌ Invalid amount");
        } else if (amount > account.getBalance()) {
            System.out.println("❌ Insufficient balance");
        } else {
            account.setBalance(account.getBalance() - amount);
            System.out.println("✅ Please collect your cash");
        }
    }

    @Override
    public void pinChange(String oldPin, String newPin) {
        if (account.getPin().equals(oldPin)) {
            account.setPin(newPin);
            System.out.println("✅ PIN changed successfully");
        } else {
            System.out.println("❌ Incorrect old PIN");
        }
    }

    @Override
    public void display() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: ₹" + account.getBalance());
    }
}