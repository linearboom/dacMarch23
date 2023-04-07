package org.cdac.domain;


public class Airline {
	private User [] users = new User[100];
	private int index = 0;
	private Flight[] flights = new Flight[4];
	private int bookNumber = 0;
	{
		flights[0] = new Flight("Lufthansa",0,"Mumbai", "Germany");
		flights[1] = new Flight("Air India",1,"Mumbai", "Delhi");
		flights[2] = new Flight("Singapore Airline",2,"Delhi", "Singapore");
		flights[3] = new Flight("Ethiad",3,"Dubai", "Mumbai");
	}
	
	
	public boolean registerUser(User user) {
		if (index < users.length) {
			users[index] = user;
			return true;
		}
		return false;
	}


	public boolean getFlight(int flightNo) {
		// TODO Auto-generated method stub
		for (Flight flight :  this.flights) {
			if (flight.getFlightNo() == flightNo) {
				flight.displaySeat();
				return true;
			}
		}
		return false;
	}
	
	public void displayFlight() {
		for (Flight flight : flights) {
			flight.flightInfo();
			System.out.println("");
		}
	}


	public boolean reserveSeat(int fNo, int row, int col, String email) {
		// TODO Auto-generated method stub
		for (int i = 0; i < flights.length ; i++ ) {
			if (flights[i].getFlightNo() == fNo) {
				for (User user :  users) {
					if (user!= null && user.getEmail().equals(email)) {
						int bN = this.bookNumber;
						user.storeReservation(fNo, row, col, bN);
						System.out.println("Your Booking number is "+bN);
						bookNumber++;
						if (!flights[i].reserveSeat(row, col))
							return false;
						return true;
					}
				}
				
			}
		}
		return false;
	}


	public boolean viewReservation(String email) {
		// TODO Auto-generated method stub
		for (User user :  users) {
			if (user!= null && user.getEmail().equals(email)) {
				user.viewReservation();
				return true;
			}
		}
		return false;
	}


	public boolean cancelReservation(String email, int bNo) {
		// TODO Auto-generated method stub
		for (User user :  users) {
			if (user!= null && user.getEmail().equals(email)) {
				int arr[] = user.cancelReservation(bNo);
				if (arr == null)
					return false;
				for (int i = 0; i < flights.length ; i++ ) {
					if (flights[i].getFlightNo() == arr[0]) {
						flights[i].getSeats()[arr[1]][arr[2]] = false;
						return true;
					}
				}
				return false;
			}
		}
		return false;
	}
}
