package com.accessmodifiers;

import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.*;

public class SimpleBankingSystem {
	private static List<BankAccount> accounts = new ArrayList<>();
	private static final String ACCOUNTS_FILE = "accounts.csv";
	static final String TRANSACTIONS_FILE = "transactions.txt";
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		loadAccounts();
		System.out.println("=== Welcome to Simple Banking System ===");
		boolean running = true;

		while (running) {
			showMenu();
			int choice = scanner.nextInt();
			scanner.nextLine(); // consume newline

			switch (choice) {
			case 1 -> createAccount();
			case 2 -> loginAndOperate();
			case 3 -> System.out.println("Thank you for using our service!");
			default -> System.out.println("Invalid option! Try again.");
			}
		}
		saveAccounts();
	}

	private static void showMenu() {
		System.out.println("1. Create New Account");
		System.out.println("2. Login to Existing Account");
		System.out.println("3. Exit");
		System.out.print("Choose option: ");
	}

	private static void createAccount() {
		System.out.print("Enter account holder name: ");
		String name = scanner.nextLine();
		System.out.print("Enter initial deposit (min 1000): ");
		double initial = scanner.nextDouble();

		if (initial < 1000) {
			System.out.println("Minimum deposit is 1000!");
			return;
		}

		String accNo = "ACC" + (accounts.size() + 1001);
		int pin = generatePIN();

		BankAccount acc = new BankAccount(accNo, name, initial, pin);
		accounts.add(acc);

		System.out.println("Account created successfully!");
		System.out.println("Account No: " + accNo);
		System.out.println("PIN: " + pin);
		System.out.println("Save these details securely!");
	}

	private static int generatePIN() {
		Random rand = new Random();
		return 1000 + rand.nextInt(9000);
	}

	private static void loginAndOperate() {
		System.out.print("Enter Account No: ");
		String accNo = scanner.nextLine();
		System.out.print("Enter PIN: ");
		int pin = scanner.nextInt();

		BankAccount account = findAccount(accNo);
		if (account != null && account.validatePIN(pin)) {
			accountOperations(account);
		} else {
			System.out.println("Invalid Account No or PIN!");
		}
	}

	private static BankAccount findAccount(String accNo) {
		return accounts.stream().filter(acc -> acc.getAccNo().equals(accNo)).findFirst().orElse(null);
	}

	private static void accountOperations(BankAccount account) {
		boolean loggedIn = true;
		while (loggedIn) {
			System.out.println("=== Account: " + account.getName() + " ===");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Balance Inquiry");
			System.out.println("4. Transaction History");
			System.out.println("5. Logout");
			System.out.print("Choose: ");

			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1 -> {
				System.out.print("Enter deposit amount: ");
				double amt = scanner.nextDouble();
				account.deposit(amt);
			}
			case 2 -> {
				System.out.print("Enter withdrawal amount: ");
				double amt = scanner.nextDouble();
				account.withdraw(amt);
			}
			case 3 -> System.out.println("Current Balance: Rs. " + account.getBalance());
			case 4 -> account.showHistory();
			case 5 -> loggedIn = false;
			default -> System.out.println("Invalid option!");
			}
		}
	}

	private static void loadAccounts() {
		try (BufferedReader br = new BufferedReader(new FileReader(ACCOUNTS_FILE))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				if (data.length == 4) {
					BankAccount acc = new BankAccount(data[0], data[1], Double.parseDouble(data[2]),
							Integer.parseInt(data[3]));
					accounts.add(acc);
				}
			}
		} catch (IOException e) {
			System.out.println("No previous accounts found.");
		}
	}

	private static void saveAccounts() {
		try (PrintWriter pw = new PrintWriter(new FileWriter(ACCOUNTS_FILE))) {
			for (BankAccount acc : accounts) {
				pw.println(acc.getAccNo() + "," + acc.getName() + "," + acc.getBalance() + "," + acc.getPin());
			}
		} catch (IOException e) {
			System.out.println("Error saving accounts.");
		}
	}
}

class BankAccount {
	private String accNo, name;
	private double balance;
	private int pin;
	private List<Transaction> transactions;

	public BankAccount(String accNo, String name, double balance, int pin) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
		this.pin = pin;
		this.transactions = new ArrayList<>();
		logTransaction("OPEN", balance);
	}

	public boolean validatePIN(int inputPin) {
		return pin == inputPin;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			logTransaction("DEPOSIT", amount);
			System.out.println("Deposited Rs. " + amount + ". New balance: Rs. " + balance);
		} else {
			System.out.println("Invalid amount!");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			logTransaction("WITHDRAWAL", amount);
			System.out.println("Withdrew Rs. " + amount + ". New balance: Rs. " + balance);
		} else {
			System.out.println("Insufficient balance or invalid amount!");
		}
	}

	private void logTransaction(String type, double amount) {
		String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
		transactions.add(new Transaction(timestamp, type, amount, balance));

		try (PrintWriter pw = new PrintWriter(new FileWriter(SimpleBankingSystem.TRANSACTIONS_FILE, true))) {
			pw.println(accNo + "," + timestamp + "," + type + "," + amount + "," + balance);
		} catch (IOException e) {
			System.out.println("Error logging transaction.");
		}
	}

	public void showHistory() {
		System.out.println("=== Recent Transactions ===");
		for (int i = Math.max(0, transactions.size() - 5); i < transactions.size(); i++) {
			System.out.println(transactions.get(i));
		}
	}

	// Getters
	public String getAccNo() {
		return accNo;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public int getPin() {
		return pin;
	}
}

class Transaction {
	private String timestamp, type;
	private double amount, balance;

	public Transaction(String timestamp, String type, double amount, double balance) {
		this.timestamp = timestamp;
		this.type = type;
		this.amount = amount;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return timestamp + " | " + type + " Rs." + amount + " | Balance: Rs." + balance;
	}
}
