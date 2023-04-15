package BankTest;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.cdac.util.Bank;

public class BankTest {
	private Scanner sc = new Scanner(System.in);
	Bank bank = new Bank();
	
	public void start() {
		int choice;
		while (true) {
			try {
				 choice = menu();
				 if (choice == 0)
					 break;
					switch (choice) {
						case 1:
							deposit();
							break;
						case 2:
							withdraw();
							break;
						case 3:
							viewBalance();
							break;
						case 4:
							viewAll();
							break;
						case 5:
							bank.updateAll();
							break;
						default:
							System.out.println("Enter Valid input");
				}
			} catch (InputMismatchException e) {
				// TODO Auto-generated catch block
				System.out.println("Please Enter a Valid input");
				sc.nextLine();
			} catch(Exception e) {
				e.getStackTrace();
			}
		}
		System.out.println("Exiting System");
		sc.close();
	}
	
	
	private void viewAll() {
		// TODO Auto-generated method stub
		bank.viewAll();
	}


	private void viewBalance() {
		// TODO Auto-generated method stub
		sc.nextLine(); // Scan Line Trap
		System.out.println("Enter the Account Number");
		String accountNo =  sc.nextLine();
		 if (bank.viewBalance(accountNo)) {
			 //To do
		 } else {
			 System.out.println("Please try again!");
		 }
	}


	private void deposit() throws InputMismatchException {
		// TODO Auto-generated method stub
		sc.nextLine(); // Scan Line Trap
		System.out.println("Enter the Account Number");
		String accountNo =  sc.nextLine();
		
		System.out.println("Enter the amount to be deposited");
		double amount = sc.nextDouble();
		 if (!bank.deposit(accountNo, amount)) {
			 System.out.println("Account Number Not Found!");
		 } else {
			 System.out.println("Succesfully Deposited "+ amount);
		 }
	}
	
	private void withdraw() throws InputMismatchException {
		// TODO Auto-generated method stub
		sc.nextLine(); // Scan Line Trap
		System.out.println("Enter the Account Number");
		String accountNo =  sc.nextLine();
		
		System.out.println("Enter the amount to withdraw");
		double amount = sc.nextDouble();
		 if (!bank.withdraw(accountNo, amount)) {
			 System.out.println("Insufficient Balance or overdraft Limit Reached");
		 } else {
			 System.out.println("Succesfully Withdrawn "+ amount);
		 }
	}


	private int menu() throws InputMismatchException {
		System.out.println("0. Exit Application");
		System.out.println("1. Deposit into Account");
		System.out.println("2. Withdraw from Account");
		System.out.println("3. View Account Balance");
		System.out.println("4. Calculate and Print Total Balance");
		System.out.println("5. Yearly Account Updates");
		return sc.nextInt();
	}

}
