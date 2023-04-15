package com.cdac.domain;


public class Librarian {
	private String name;
	private long contact;
	
	

	public Librarian(String name, long contact) {
		//super();
		this.name = name;
		this.contact = contact;
	}

	public boolean addBook(String title, boolean flag, Book[] books) {
		// TODO
		if (flag) {
			for (int i = 0;  i<  books.length; i++) {
				if (books[i] != null && books[i].getAuthor().equals(title)) {
					books[i].increaseCount();
					System.out.println("Quantity Updated!");
					return true;
				}
			}
		} else {
			for (int i = 0;  i<  books.length; i++) {
				if (books[i] != null && books[i].getTitle().equals(title)) {
					books[i].increaseCount();
					System.out.println("Quantity Updated!");
					return true;
				}
			}
		}
		System.out.println("Book not found!");
		return false;
	}
	
	public boolean removeBook(String title, boolean flag ) {
		// TODO
		return false;
	}
	
	public int getnumberBooks() {
		return 0;
	}

	public boolean addNewBook(String title, String author, String isbn, String publisher, int count, Book[] books) {
		// TODO Auto-generated method stub
		for (int i = 0;  i<  books.length; i++) {
			if (books[i] != null && books[i].getTitle().equals(title)) {
				System.out.println("Title Already Exists!");
				return false;
			}
		}
		for (int i = 0 ; i< books.length; i++) {
			if (books[i] ==  null) {
				books[i] = new Book(title, author, isbn, publisher, count);
				System.out.println("Book Added Succesfully !");
				return true;
			}
		}
		System.out.println("Book Array is Full");
		return false;
	}

	public void showAll(Book[] books) {
		// TODO Auto-generated method stub
		for (Book book : books) {
			if (book != null) {
			System.out.println(book);
			}
		}
	}

	public boolean removeBook(String title, boolean flag, Book[] books) {
		// TODO Auto-generated method stub
		if (flag) {
			for (int i = 0;  i<  books.length; i++) {
				if (books[i] != null && books[i].getAuthor().equals(title)) {
					if (books[i].getCount() == 0) {
						System.out.println("No More Books Left!");
						return false;
					}
					books[i].decreaseCount();
					System.out.println("Quantity Updated!");
					return true;
				}
			}
		} else {
			for (int i = 0;  i<  books.length; i++) {
				if (books[i] != null && books[i].getTitle().equals(title)) {
					if (books[i].getCount() == 0) {
						System.out.println("No More Books Left!");
						return false;
					}
					books[i].decreaseCount();
					System.out.println("Quantity Updated!");
					return true;
				}
			}
		}
		System.out.println("Book not found!");
		return false;
	}

	public boolean showBook(String title, boolean flag , Book[] books) {
		// TODO Auto-generated method stubf
		if (flag) {
			for (int i = 0;  i<  books.length; i++) {
				if (books[i] != null && books[i].getAuthor().equals(title)) {
					System.out.println(books[i]);
					return true;
				}
			}
		} else {
			for (int i = 0;  i<  books.length; i++) {
				if (books[i] != null && books[i].getTitle().equals(title)) {
					System.out.println(books[i]);
					return true;
				}
			}
		}
		System.out.println("Book not found!");
		return false;
	}


	
}
