package com.cdac.accounts;

public class Account {
	private String accountNumber;
	private double balance;
	
	
	public Account() {
		//Parameter less constructor
	}
	
	public Account(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public boolean deposit(double amount) {
		balance += amount;
		return true;
	}
	
	public boolean withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			return true;
		}
		return false;
		
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.accountNumber +"         " + this.balance;
	}
	
	
	
	
}
