package com.Oops;

public abstract class Employee {
	abstract void work();

	void Office() {
		System.out.println("Works at tech Company Office ");

	}
}

class Developer extends Employee {

	@Override
	void work() {
		System.out.println("Developer writes and debugs the code");
	}

}

class Salary  {
	private double amount;

	public void setAmount(double amount) {
		this.amount = amount;

	}

	public double getAmount() {
		return amount;
	}

}
