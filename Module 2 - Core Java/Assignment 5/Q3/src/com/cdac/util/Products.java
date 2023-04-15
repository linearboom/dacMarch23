package com.cdac.util;

public class Products {
	private String name;
	private double price;
	private String category;
	
	public Products(String name, double price, String category) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%-10s%-5.2f%-10s", name, price, category);
	}
	
}
