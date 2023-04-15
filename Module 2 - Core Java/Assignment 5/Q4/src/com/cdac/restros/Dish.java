package com.cdac.restros;

public class Dish implements Comparable<Dish> {
	private String name;
	private double price;
	private double calories;
	
	public Dish(String name, double price, double calories) {
		super();
		this.name = name;
		this.price = price;
		this.calories = calories;
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

	public double getCalories() {
		return calories;
	}

	public void setCalories(double calories) {
		this.calories = calories;
	}
	
	@Override
	public int compareTo(Dish o) {
		// Natural Ordering of Elements
		return Double.valueOf(price).compareTo(Double.valueOf(o.price));
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%-20s%-8.2f%-5.2f", name, price, calories);
	}
	
}
