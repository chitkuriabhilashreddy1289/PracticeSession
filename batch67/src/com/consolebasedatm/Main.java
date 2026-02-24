package com.consolebasedatm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Account myAccount = new Account(382949, 2000, "1234");
        User user = new User(myAccount);

        System.out.println("🏦 Welcome to Union Bank ATM");

        System.out.print("Enter PIN: ");
        String enteredPin = sc.next();

        if (!enteredPin.equals(myAccount.getPin())) {
            System.out.println("❌ Invalid PIN. Access denied.");
            return;
        }

        int choice;
        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Change PIN");
            System.out.println("5. Display Account");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    user.checkBalance();
                    break;

                case 2:
                    user.depositBalance();
                    break;

                case 3:
                    user.withdrawBalance();
                    break;

                case 4:
                    System.out.print("Enter old PIN: ");
                    String oldPin = sc.next();
                    System.out.print("Enter new PIN: "); 
                    String newPin = sc.next();
                    user.pinChange(oldPin, newPin);
                    break;

                case 5:
                    user.display();
                    break;

                case 6:
                    System.out.println("🙏 Thank you for using Union Bank ATM");
                    break;

                default:
                    System.out.println("⚠️ Invalid choice");
            }

        } while (choice != 6);
    }
}