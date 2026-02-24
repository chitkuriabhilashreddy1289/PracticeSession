package com.consolebasedatm;

public interface ATMService {
	void checkBalance();
	void withdrawBalance();
	void pinChange(String oldPin,String newPin);
	void display();
	void depositBalance();


}
