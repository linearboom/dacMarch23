package org.cdac.domain;

import java.util.Arrays;
import java.util.Scanner;

public class Restuarant {
	private String[][] dishes = new String[3][2];
	private int index = 0;
	private static Scanner sc = new Scanner(System.in);
	public Restuarant() {
		
	}
	
	public static int menu(Restuarant rest) {
		System.out.println("Choose one of the following");
		System.out.println("1. To view the current menu with all the prices");
		System.out.println("2. Add a new dish to the menu");
		System.out.println("3. Remove a dish from the menu");
		System.out.println("4. Modify the price of a dish on the menu");
		System.out.println("5. Exit the program");
		return sc.nextInt();
	}
	
	public boolean acceptDish(String name, String price){
		
		
		
		if(index >= dishes.length) {
			for(int i = 0 ; i<this.dishes.length ; i++) {
				if (this.dishes[i] == null) {
					this.dishes[i] = new String[2]; // But this code does not work with 
					this.dishes[i][0] =  name;
					this.dishes[i][1] = price;
					return true;
				}
			}
			return false; 
			/*
			for (String[] dish : this.dishes) {
				if (dish == null) {
					dish = new String[2]; // Why does this code not work but the above one works? 
					dish[0] =  name;      // For each is a read only loop
					dish[1] = price;
					return true;
				}
			}
			return false;
			//}
			*/
			//return false;
		}else {
			this.dishes[index][0] = name;
			this.dishes[index][1] = price;
			index++;
			return true;
		}
	} 

	public void viewRecord() {
		// TODO Auto-generated method stub
		for(String [] dish : this.dishes) {
			System.out.println(Arrays.toString(dish));
		}
	}

	public boolean removeRecord(String name) {
		// TODO Auto-generated method stub
		for (int i = 0 ; i<this.dishes.length; i++ ) {
			if (this.dishes[i][0] != null && this.dishes[i][0].equals(name)) {
				this.dishes[i] = null;
				return true;
			}
		}
		return false;
	}

	public boolean changePrice(String name, String price) {
		// TODO Auto-generated method stub
		for (int i = 0 ; i<this.dishes.length; i++ ) {
			if (this.dishes[i] != null && this.dishes[i][0].equals(name)) {
				this.dishes[i][1] = price;
				return true;
			}
		}
		return false;
	}
	
}
