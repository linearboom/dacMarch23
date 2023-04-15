package com.cdac.accounts;



public class CheckingAccount extends Account {
	private static final double OVERDRAFTLIMIT =  -10_000d;
	private static final double PENALTY = 20;
	

	public CheckingAccount(String accName , double balance) {
		super(accName, balance);
	}
	
	public void givePenalty() {
		if (super.getBalance() <  0) {
		super.setBalance( super.getBalance() - PENALTY );
		}
	}

	@Override
	public boolean withdraw(double amount) {
		// TODO Auto-generated method stub
		if (super.getBalance() - amount >= OVERDRAFTLIMIT) {
			super.setBalance(super.getBalance() - amount);
			return true;
		}
		return false;
	}
	
	
	
}
