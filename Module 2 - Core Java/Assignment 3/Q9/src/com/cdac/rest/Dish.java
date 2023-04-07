package com.cdac.rest;

public enum Dish {
	
	NOODLES("Noodles",250.50f),
	FRIED_RICE("Fried Rice",300f),
	PANEER("Paneer",350.50f),
	CAKE("Cake",500f);
	
	private String name;
	private float price;
	
	private Dish(String name, float price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
	
}
