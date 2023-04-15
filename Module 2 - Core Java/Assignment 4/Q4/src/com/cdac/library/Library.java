package com.cdac.library;

public class Library {
	
	Book [] books = new Book[10];
	{
		// TODO add more books later!
	books[0] = new Fiction("Harry Potter",
						   "JK Rownling",
						   "Penguin",
						   500.50f,
						   250,
						   "romance");
	
	books[1] = new ReferenceBook("Let Us C",
						        "Yashwant K",
						        "Penguin",
						        1250f,
						        1500,
						        4);
	}
	
	public void calculatePrice() {
		for (int i = 0 ; i < books.length; i++) {
			if(books[i] != null)
			System.out.println(books[i].getTitle() +" "+ books[i].calculatePrice());
		}
	}
}
