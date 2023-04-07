package com.cdac.movie;

import java.util.Scanner;

public class Theatre {
	private boolean [][] seats = new boolean[10][10]; // Seats with 100 capacity
	private int uniqNo = 1;
	private int seatSold = 0;
	private static Scanner sc = new Scanner(System.in);
	private int PRICE = 350;
	
	Theatre(){
		// TODO
	}
	
	public void start() {
		int choice;
		while ((choice = menuList())!= 4) {
			switch (choice) {
			case 1:
				displaySeats();
				break;
			case 2:
				reserveSeats();
				break;
			case 3:
				viewSales();
				break;
			default:
				System.out.println("Enter valid input");
				break;
			}
		}
	}
	

	private void viewSales() {
		// TODO Auto-generated method stub
		System.out.println("The total number of ticket sales are: "+seatSold);
		System.out.println("The total revenue is                : "+seatSold*PRICE);
	}

	private boolean reserveSeats() {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of seats you want to book");
		int num = sc.nextInt();
		if (num<1 && num <= 100 - seatSold) {
			System.out.println("Enter invalid input");
			return false;
		}
		int i = 0;
		while (i < num) {
			System.out.println("Enter the row of seat "+(i+1));
			int row = sc.nextInt();
			System.out.println("Enter the col of seat "+(i+1));
			int col = sc.nextInt();
			if (row > 10 || col > 10 || row < 0 || col < 0) {
				System.out.println("Select valid seats");
			}else if (seats[row][col] == false) {
			 seats[row][col] = true;
			 i++;
			 seatSold++;
			}else {
				System.out.println("Select valid seats");
			}
		}
		System.out.println("Your unique Booking Number is "+uniqNo);
		System.out.println("Your Total Booking Amount is "+num*PRICE);
		uniqNo++;
		return true;
	}

	public int menuList(){
		System.out.println("Welcome to Java Theatre");
		System.out.println("1. View Available Seats");
		System.out.println("2. Reserve Seats");
		System.out.println("3. View Ticket Sales");
		System.out.println("4. Exit");
		return sc.nextInt();
	}
	
	private void displaySeats() {
		// TODO Auto-generated method stub
		System.out.print("  ");
		for (int i = 0 ; i< seats.length; i++) {
			String str = String.format("%-6d", i);
			System.out.print(str);
		}
		System.out.println("");
		for (int i = 0 ; i< seats.length; i++) {
			System.out.print(i+" ");
			for (int j = 0 ; j <seats[i].length; j++) {
				String str = String.format("%-6s",seats[i][j]);
				System.out.print(str);
			}
			System.out.println("");
		}
		System.out.println("");
	}
	

	public boolean[][] getSeats() {
		return seats;
	}

	public void setSeats(boolean[][] seats) {
		this.seats = seats;
	}

	public int getUniqNo() {
		return uniqNo;
	}

	public void setUniqNo(int uniqNo) {
		this.uniqNo = uniqNo;
	}

	public int getSeatSold() {
		return seatSold;
	}

	public void setSeatSold(int seatSold) {
		this.seatSold = seatSold;
	}
	
	public void scanClose() {
		sc.close();
	}
	
	
}
