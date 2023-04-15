package com.cdac.util;

public class Books implements Comparable<Books> {
	private String title;
	private String author;
	private int publicationYear;
	private final int NUM = 1;
	
	public Books(String title, String author, int publicationYear) {
		super();
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;
	}

	@Override
	public int compareTo(Books o) {
		// TODO Auto-generated method stub
		return this.publicationYear - o.publicationYear;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%-20s%-20s%-10d", title, author, publicationYear);
	}
	
	
}
