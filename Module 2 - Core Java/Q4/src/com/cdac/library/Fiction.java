package com.cdac.library;

public class Fiction extends Book {
	private String genre;
	private final double  discount =  .9;
	
	public Fiction(String title, String author, String publisher, double price, int numPages, String genre) {
		super(title, author, publisher, price, numPages);
		this.genre = genre;
	}

	@Override
	public double calculatePrice() {
		if (genre.equals("romance")) {
			return super.calculatePrice() * discount;
		}
		return super.calculatePrice();
	}
	
	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getDiscount() {
		return discount;
	}

	
	
}
