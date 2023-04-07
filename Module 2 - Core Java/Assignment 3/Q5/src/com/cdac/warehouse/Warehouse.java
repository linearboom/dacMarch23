package com.cdac.warehouse;

import java.util.Scanner;

public class Warehouse {
	private String [] shelf = new String[10]; // Seats with 100 capacity
	private static Scanner sc = new Scanner(System.in);
	
	Warehouse(){
		// TODO
	}
	
	public void start() {
		int choice;
		while ((choice = menuList())!= 4) {
			switch (choice) {
			case 1:
				addShelf();
				break;
			case 2:
				removeShelf();
				break;
			case 3:
				displayShelf();
				break;
			default:
				System.out.println("Enter valid input");
				break;
			}
		}
	}
		
	private boolean removeShelf() {
		// TODO Auto-generated method stub
		System.out.println("Enter the shelf number from which you want to remove item");
		int pos = sc.nextInt()-1;
		sc.nextLine();
		if (pos < 0 || pos > 9) {
			System.out.println("Enter valid input, Please Try again");
			return false;
		}
		if (shelf[pos] != null) {
			shelf[pos] = null;
			return true;
		}else {
			System.out.println("There is nothing at the shelf, Please try again");
			return false;
		}
	}

	private boolean addShelf() {
		// TODO Auto-generated method stub
		sc.nextLine();
		System.out.println("Enter the item you want to add");
		String item = sc.nextLine();
		System.out.println("Enter the shelf number");
		int pos = sc.nextInt()-1;
		//sc.nextLine();
		if(pos < 0 || pos > 9) {
			System.out.println("Enter valid input, Please Try again");
			return false;
		}
		if (shelf[pos] == null ) {
			shelf[pos] = item;
			return true;
		} else {
			System.out.println("Shelf Occupied, please try again");
			return false;
		}
	}

	public int menuList(){
		System.out.println("Welcome to Java Shelf");
		System.out.println("1. Add Item to shelf");
		System.out.println("2. Remove item from shelf");
		System.out.println("3. Display contents of all shelf");
		System.out.println("4. Exit");
		return sc.nextInt();
	}
	
	private void displayShelf() {
		// TODO Auto-generated method stub
		System.out.println("The contents of the shelf are : ");
		for (int i = 1; i<shelf.length; i++) {
			System.out.println(i+" "+shelf[i-1]);
		}
	}

	
	public void scanClose() {
		sc.close();
	}
	
}
