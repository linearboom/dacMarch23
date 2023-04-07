package org.cdac.airline;

import java.util.Scanner;

import org.cdac.domain.Airline;
import org.cdac.domain.User;

public class Main {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Airline airline = new Airline();
		try {
			int choice;
			while ((choice = menu()) != 6){
				switch (choice) {
				case 1:
					System.out.println(userRegister(airline)? "Success" : "Not Success");
					break;
				case 2:
					System.out.println(getFlight(airline)? "Success" : "Not Success");
					break;
				case 3:
					System.out.println(reserveSeat(airline) ? "Success" : "Not Success");   ;
					break;
				case 4:
					System.out.println(viewReservation(airline) ? "Success" : "Not Success");
					break;
				case 5:
					System.out.println(cancelReservation(airline) ? "Success" : "Not Success");
					break;
				default :
					System.out.println("Invalid Input");
					//break;
				}
			}
			System.out.println("Thank you for using the application");
			
		}catch (Exception e){
			System.err.println(e);
			System.out.println("Enter valid inputs");
		}
	}
	
		
	private static boolean cancelReservation(Airline airline) {
		// TODO Auto-generated method stub
		System.out.println("Enter your email");
		sc.nextLine();
		String email = sc.nextLine();
		System.out.println("Enter your booking Number");
		int bNo = sc.nextInt();
		return airline.cancelReservation(email, bNo);

	}


	private static boolean viewReservation(Airline airline) {
		// TODO Auto-generated method stub
		System.out.println("Enter your email");
		sc.nextLine();
		String email = sc.nextLine();
		return airline.viewReservation(email);
	}



	private static boolean reserveSeat(Airline airline) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Flight Number");
		int fNo = sc.nextInt();
		if (!airline.getFlight(fNo))
			return false;
		System.out.println("Enter the seat row");
		int row = sc.nextInt();
		System.out.println("Enter the sear col");
		int col = sc.nextInt();
		System.out.println("Enter your email");
		sc.nextLine();
		String email = sc.nextLine();
		if (airline.reserveSeat(fNo, row, col, email))
			return true;
		return false;
	}

	private static boolean getFlight(Airline airline) {
		// TODO Auto-generated method stub
		airline.displayFlight();
		System.out.println("Enter the flight number");
		return  (airline.getFlight(sc.nextInt()));
		
	}

	private static boolean userRegister(Airline airline) {
		// TODO Auto-generated method stub
		User user = new User();
		System.out.println("Enter your name");
		sc.nextLine();
		user.setName(sc.nextLine());
		System.out.println("Enter your email");
		user.setEmail(sc.nextLine());
		System.out.println("Enter your contact");
		user.setContact(sc.nextLong());
		return airline.registerUser(user);
	}

	public static int menu() throws Exception {
		System.out.println("Enter your choice");
		System.out.println("1. User Registeration");
		System.out.println("2. Flight Availaibility");
		System.out.println("3. Seat Reservation");
		System.out.println("4. View Reservation");
		System.out.println("5. Cancel Reservation");
		System.out.println("6. Exit");
		return sc.nextInt();
	}

}
