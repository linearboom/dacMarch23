package com.cdac.main;

import com.cdac.util.Books;
import com.cdac.util.CustomLinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomLinkedList<Books> list = new CustomLinkedList<>();
		Books b3 = new Books("Fantastic Beasts", "KJ Rowling", 2017);
		list.AddItem(b3);
		list.AddItem(new Books("Harry Potter 1", "JK Rowling", 2000));
		list.AddItem(new Books("Harry Potter 2", "JK Rowling", 2002));
		list.AddItem(new Books("Harry Potter 3", "JK Rowling", 2004));
		list.AddItem(new Books("Harry Potter 4", "JK Rowling", 2005));
		list.AddItem(new Books("Harry Potter 5", "JK Rowling", 2007));
		list.AddItem(new Books("Harry Potter 6", "JK Rowling", 2011));
		list.AddItem(new Books("Harry Potter 7", "JK Rowling", 2013));
		
		
		list.getItem();
		list.removeItem(b3);
		System.out.println("Removed List");
		list.getItem();
	}
	
	

}
