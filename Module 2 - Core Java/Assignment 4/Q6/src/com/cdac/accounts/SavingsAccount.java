package com.cdac.accounts;

public class SavingsAccount extends Account {
	private static final double INTEREST_RATE = 1.02; // Multiplying factor for 2 % increase
	private static final double PENALTY = 20;
	
	public SavingsAccount(String accName , double balance) {
		super(accName, balance);
	}
	
	public void calculateInterest() {
		//Ideally would like to calculate the number of years here
		super.setBalance( super.getBalance() * INTEREST_RATE);
	}
	

}
