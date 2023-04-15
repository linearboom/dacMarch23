package com.cdac.main;

public class Address implements Cloneable {
	private String street;
	private String city;
	private String state;

	public Address(String street, String city, String state) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	protected Address clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Address add = new Address(this.street, this.city, this.state);
		return add;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Street Name:" + street + " City: " + city + " State: " + state;
	}

}
