package com.cdac.rest;

import java.util.Scanner;

public class Menu {
	private Dish[] dishes = Dish.values();
	private static Scanner sc = new Scanner(System.in);
	private float[][] orderSummary = new float[4][2];
	{
	orderSummary[0] = new float[] {0,0};
	orderSummary[1] = new float[] {0,0};
	orderSummary[2] = new float[] {0,0};
	orderSummary[3] = new float[] {0,0};
	}
	
	public void takeOrder() {
		int choice;
		System.out.println("Welcome to XYZ Restro");
		while ( (choice = printMenu())!=5 ) {
		}
	}
	
	public int printMenu() {
		System.out.println("Chose one of the following");
		int index = 1;
		for (Dish dish : dishes) {
			System.out.println(index +" " + dish.getName() + " Rs. " + dish.getPrice());
			index++;
		}
		System.out.println("5. Exit");
		System.out.print("Please enter the dish number you wish to order : ");
		int choice = sc.nextInt();
		if (choice == 5)
			return choice;
		System.out.print("Please enter the quantity to order             : ");
		int quant = sc.nextInt();
		if (choice(choice, quant)) {
			if (!repeat()) {
				bill();
				System.out.println("Thank you for Eating with us");
				return 5;
			}
		}else {
			System.out.println("Enter valid Choice /Quantity");
		}
		return choice;
	}
	
	private void bill() {
		// TODO Auto-generated method stub
		for (int i = 0 ; i< orderSummary.length; i++) {
			if (orderSummary[i][0] != 0) {
				System.out.println(dishes[i] + " " + orderSummary[i][0] +" Rs " + orderSummary[i][0]);
			}
		}
		
	}

	public boolean  choice(int choice, int quantity) {
		if (quantity < 1 || choice < 1 || choice > 5 )
			return false;
		orderSummary[choice-1][0] +=quantity;
		orderSummary[choice-1][1] = orderSummary[choice-1][0] * dishes[choice-1].getPrice();
		System.out.println("Total Cost: "+ orderSummary[choice-1][1]);
		return true;
	}
	
	public boolean repeat() {
		System.out.println("Do you want to eat another dish Y/N");
		char c = sc.next().charAt(0);
		if (c == 'Y') {
			//System.out.println("yes");
			return true;
		}else if(c == 'N') {
			//System.out.println("No");
			return false;
		}else {
			System.out.println("Enter valid input");
			return repeat();
		}
	}
	
}
