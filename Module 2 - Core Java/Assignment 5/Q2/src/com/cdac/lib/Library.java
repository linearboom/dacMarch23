package com.cdac.lib;

import java.awt.print.Book;
import java.util.Arrays;

public class Library {
	private Books[]  books = new Books[8];
	
	public Library() {
		books[0] =  new Books("Harry Potter 1", "JK Rowling", 2000);
		books[5] =  new Books("Harry Potter 2", "JK Rowling", 2002);
		books[7] =  new Books("Harry Potter 3", "JK Rowling", 2004);
		books[3] =  new Books("Harry Potter 4", "JK Rowling", 2005);
		books[6] =  new Books("Harry Potter 5", "JK Rowling", 2007);
		books[1] =  new Books("Harry Potter 6", "JK Rowling", 2011);
		books[4] =  new Books("Harry Potter 7", "JK Rowling", 2013);
		books[2] =  new Books("Fantastic Beasts", "JK Rowling", 2017);
	}
	
	public void print() {
		for (Books book : books) {
			System.out.println(book);
		}
	}
	
	public void sortBooks() {
		Arrays.sort(books);
	}
}
