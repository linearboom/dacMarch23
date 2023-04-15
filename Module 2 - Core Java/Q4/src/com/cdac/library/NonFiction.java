package com.cdac.library;

public class NonFiction extends Book {
	private String subject;
	private final double discount = 0.85;

	public NonFiction(String title, String author, String publisher, double price, int numPages, String subject) {
		super(title, author, publisher, price, numPages);
		this.subject = subject;
	}
	
	

	@Override
	public double calculatePrice() {
		// TODO Auto-generated method stub
		if (subject.equals("history"))
			return super.calculatePrice() * discount;
		return super.calculatePrice();
	}



	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
}
