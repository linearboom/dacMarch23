package org.cdac.domain;

import java.util.Arrays;

public class User {
	private String name;
	private String email;
	private long contact;
	private int reservations[][] = new int[10][4];
	private  int  index = 0;
	
	public User() {
		//TODO
	}
	public User(String name, String email, long contact) {
		this.name = name;
		this.email = email;
		this.contact = contact;
	}
	public boolean storeReservation(int flightNo, int row, int col, int bNo) {
		if (index < 10) {
			reservations[index] = new int[]{flightNo, row, col, bNo};
			index++;
			return true;
		} else
			System.out.println("You have reached the maximum booking limit");
			return false;
	}
	
	public void viewReservation() {
		if (index == 0) {
			System.out.println("No Reservations yet!");
		}else {
			System.out.println("Flight Number|Row|Col|Booking Number");
			for (int i = 0; i< index; i++) {
				System.out.println(Arrays.deepToString(reservations));
			}
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}
	public int[] cancelReservation(int bNo) {
		// TODO Auto-generated method stub
		if (index == 0) {
			System.out.println("No Reservations yet!");
			return null;
		}else {
			for (int i = 0; i< index; i++) {
				if (reservations[i][3] == bNo) {
					int [] arr = reservations[i];
					reservations[i] = null;
					return arr;
				}
			}
			return null;
		}
	}
	
	
	
}
