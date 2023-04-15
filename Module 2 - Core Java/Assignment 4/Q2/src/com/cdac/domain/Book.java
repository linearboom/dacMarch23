package com.cdac.domain;

public class Book {
	private String title;
	private String author;
	private String ISBN;
	private String publisher;
	private int count = 0;
	
	public Book(String title, String author, String iSBN, String publisher, int count) {
		//super();
		this.title = title;
		this.author = author;
		ISBN = iSBN;
		this.publisher = publisher;
		this.count = count;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void increaseCount() {
		// TODO Auto-generated method stub
		count +=1;
		
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", ISBN=" + ISBN + ", publisher=" + publisher
				+ ", count=" + count + "]";
	}

	public void decreaseCount() {
		// TODO Auto-generated method stub
		count -=1;
	}
	
	
}
