package com.comstructors1;

public class BankAccount {
	long accountnumber;
	String accountholdername;
	double balance;
	 BankAccount(long accountnumber){
		 this.accountnumber=accountnumber;
		 
		 
	 }
	 BankAccount(long accountnumber,String accountholdername){
	      this(accountnumber);
		 this.accountholdername = accountholdername;
		 
		 }
	 BankAccount(long accountnumber,String accountholdername,double balance){
		this(accountnumber, accountholdername);
		 this.balance=balance;
		
		 }
	 void show() {
		 System.out.println("AccountNumber:"+accountnumber);
		 System.out.println("Accountholdername:"+accountholdername);
		 System.out.println("AccountBalance:"+balance);
		 System.out.println("************************");
		 
		 
	 }
	public static void main(String[] args) {
		BankAccount b = new BankAccount(674293842,"abhi",70000.0);
		b.show();
		BankAccount b1 = new BankAccount(674293843,"vinay",7.0);
		b1.show();

	}

}
