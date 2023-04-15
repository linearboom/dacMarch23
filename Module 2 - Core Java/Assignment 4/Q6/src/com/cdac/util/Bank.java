package com.cdac.util;

import com.cdac.accounts.Account;
import com.cdac.accounts.CheckingAccount;
import com.cdac.accounts.SavingsAccount;

public class Bank {
	private Account [] acc = new Account[5];
	{
		acc[0] = new SavingsAccount("R001",0);
		acc[1] = new CheckingAccount("R002",0);
		acc[2] = new SavingsAccount("R003",0);
		acc[3] = new CheckingAccount("R004",0);
		acc[4] = new SavingsAccount("R005",0);
	}
	
	private Account getAccount(String accountNo) {
		for (int i = 0 ; i < acc.length ; i++) {
			if (acc[i] !=  null && acc[i].getAccountNumber().equals(accountNo)) {
				return acc[i];
			}
		}
		return null;
	}
	
	public boolean deposit(String accountNo, double amount) {
		// TODO Auto-generated method stub
		Account acc =  getAccount(accountNo);
		if (acc == null) {
			System.out.println("Cannot find the Account");
			return false;
		}
		return acc.deposit(amount);
	}
	
	public boolean withdraw(String accountNo, double amount) {
		// TODO Auto-generated method stub
		Account acc =  getAccount(accountNo);
		if (acc == null) {
			System.out.println("Cannot find the Account");
			return false;
		}
		return acc.withdraw(amount);
	}

	public boolean viewBalance(String accountNo) {
		Account acc =  getAccount(accountNo);
		if (acc == null) {
			System.out.println("Cannot find the Account");
			return false;
		}
		System.out.println(acc.toString());
		return true;
	}

	public void viewAll() {
		// TODO Auto-generated method stub
		double total = 0;
		for (Account a : acc) {
			System.out.println(a);
			total +=a.getBalance();
		}
		System.out.println("Total Balance of All Accounts : "+total);
	}

	public void updateAll() {
		// TODO Auto-generated method stub
		for (int i = 0;  i< acc.length ; i++) {
			if (acc[i] != null) {
				if (acc[i] instanceof SavingsAccount) {
					SavingsAccount saving =  (SavingsAccount) acc[i];
					saving.calculateInterest();
					continue;
				}
				if (acc[i] instanceof CheckingAccount) {
					CheckingAccount checking =  (CheckingAccount) acc[i];
					checking.givePenalty();
					continue;
				}
			}
		}
	}
	
	
}
