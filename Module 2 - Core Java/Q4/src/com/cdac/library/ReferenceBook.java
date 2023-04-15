package com.cdac.library;

public class ReferenceBook extends Book {
	private int edition;
	private double discount =  0.8d;

	public ReferenceBook(String title, String author, String publisher, double price, int numPages, int edition) {
		super(title, author, publisher, price, numPages);
		this.edition = edition;
	}
	
	@Override
	public double calculatePrice() {
		if (edition < 5) {
			return super.calculatePrice() * discount;
		}
		return super.calculatePrice();
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}
	
	
}
