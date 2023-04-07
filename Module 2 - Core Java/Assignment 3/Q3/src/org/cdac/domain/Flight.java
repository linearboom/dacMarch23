package org.cdac.domain;

public class Flight {
	private String name;
	private int flightNo;
	private String source;
	private String destination;
	private boolean [][] seats = new boolean[10][4];
	
	
	
	
	public Flight(String name, int flightNo, String source, String destination) {
		this.name = name;
		this.flightNo = flightNo;
		this.source = source;
		this.destination = destination;
		
	}
	
	public void flightInfo() {
		System.out.println("Flight Name :  "+name);
		System.out.println("Flight Source :  "+source);
		System.out.println("Flight Destination :  "+destination);
		System.out.println("Flight Number : "+flightNo);
	}
	
	public void displaySeat() {
		this.flightInfo();
		for (int i = 0 ; i< this.seats.length; i++) {
			for (int j = 0; j <this.seats[i].length; j++) {
				System.out.print(this.seats[i][j]+" ");
			}
			System.out.println("");
		}
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestianation() {
		return destination;
	}
	public void setDestianation(String destianation) {
		this.destination = destianation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(int flightNo) {
		this.flightNo = flightNo;
	}
	public boolean [][] getSeats() {
		return seats;
	}
	public void setSeats(boolean[][] seats) {
		this.seats = seats;
	}

	public boolean reserveSeat(int row, int col) {
		// TODO Auto-generated method stub
		if (this.seats[row][col] == false) {
			this.seats[row][col] = true;
			return true;
		}
			
		return false;
	}
	
	
}
