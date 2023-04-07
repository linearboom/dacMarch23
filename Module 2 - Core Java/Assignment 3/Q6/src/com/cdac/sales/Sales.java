package com.cdac.sales;

import java.util.Scanner;

public class Sales {
	private SalesPerson [] salesPersons = new SalesPerson[10]; // Seats with 100 capacity
	private static Scanner sc = new Scanner(System.in);
	
	Sales(){
		// TODO
	}
	
	public void start() {
		int choice;
		while ((choice = menuList())!= 5) {
			switch (choice) {
			case 1:
				addSales();
				break;
			case 2:
				updateSales();
				break;
			case 3:
				viewTotalSales();
				break;
			case 4:
				viewCompanySales();
			default:
				System.out.println("Enter valid input");
				break;
			}
		}
	}
		
	private void viewCompanySales() {
		// TODO Auto-generated method stub
		for (int i = 0 ; i< salesPersons.length ; i++) {
			if (salesPersons[i] != null) {
				System.out.println("Total Sales for employee " + salesPersons[i].getId() + " " + salesPersons[i].totalSales());
			}
		}
	}

	private boolean viewTotalSales() {
		// TODO Auto-generated method stub
		System.out.println("Enter the employee id");
		int id = sc.nextInt();
		for (int i = 0 ; i< salesPersons.length ; i++) {
			if (salesPersons[i] != null && salesPersons[i].getId() == id) {
				System.out.println("Total Sales are " +  salesPersons[i].totalSales());
				return true;
			}
		}
		System.out.println("Employee Not found");
		return false;
	}

	private boolean updateSales() {
		// TODO Auto-generated method stub
		System.out.println("Employee id");
		int id = sc.nextInt();
		System.out.println("Enter the sales figures of the last 12 months");
		float arr[] =  new float[12];
		
		for (int i = 0 ; i< salesPersons.length ; i++) {
			if (salesPersons[i] != null && salesPersons[i].getId() == id) {
				for (int j = 0 ; j < 12 ; j++) {
					System.out.println("Enter the sales figure for month "+(i+1));
					arr[i] = sc.nextFloat();
				}
				salesPersons[i].setSalesFig(arr);
				return true;
			}
		}
		System.out.println("Employee Not Found!");
		return false;
	}
		

	private boolean addSales() {
		// TODO Auto-generated method stub
		sc.nextLine();
		System.out.println("Enter the name of the person");
		String name = sc.nextLine();
		System.out.println("Enter unique ID of the sales person");
		int uId =  sc.nextInt();
		
		for (int i = 0 ; i< salesPersons.length ; i++) {
			if (salesPersons[i] != null && salesPersons[i].getId() == uId) {
				System.out.println("Employee Id, Already Exists.. Please Try again");
				return false;
			}
		}
		
		System.out.println("Enter the sales figures of the last 12 months");
		float arr[] =  new float[12];
		for (int i = 0 ; i < 12 ; i++) {
			System.out.println("Enter the sales figure for month "+(i+1));
			arr[i] = sc.nextFloat();
		}
		
		
		for (int i = 0 ; i< salesPersons.length ; i++) {
			if (salesPersons[i] == null) {
				salesPersons[i] = new SalesPerson(name, uId, arr);
				return true;
			}
		}
		System.out.println("Data Base Full");
		return false;
		
	}

	public int menuList(){
		System.out.println("Welcome to Java Sales Program");
		System.out.println("1. Add a new Sales Person");
		System.out.println("2. Update an existing salesperson");
		System.out.println("3. View total sales for salesperson");
		System.out.println("4. View total sales for all salesperson");
		System.out.println("5. Exit");
		return sc.nextInt();
	}
	
	

	
	public void scanClose() {
		sc.close();
	}
	
}
