package com.cdac.domain;

import java.util.Scanner;

public class Library {
	private Librarian librarian =  new Librarian("Ram",99999_99999L);
	Book [] books =  new Book[100];
	private Scanner sc = new Scanner(System.in);
	
	public int menu(){
		System.out.println("Chose one of the following");
		System.out.println("0. Add Book to the library");
		System.out.println("1. Remove Book from the Library");
		System.out.println("2. Specific Book Details");
		System.out.println("3. Details of all the books");
		System.out.println("4. EXIT");
		return sc.nextInt();
		
	}
	
	
	public void start() {
		System.out.println("Welcome to Java Library");
		int choice;
		while (( choice = menu())!= 4) {
			switch (choice) {
			case 0:
				getBook();
				break;
			case 1:
				removeBook();
				break;
			case 2:
				showBook();
				break;
			case 3:
				showAll();
				break;
			case 4:
				//TODO
				break;
			default:
				System.out.println("Invalid Input");
			}
		}
	}


	private void showBook() {
		// TODO Auto-generated method stub
		System.out.println("Chose one of the following");
		System.out.println("1. Show an existing book by author");
		System.out.println("2. Show an existing book by title");
		int choice = sc.nextInt();
		sc.nextLine();
		switch (choice) {
		case 1:
			System.out.println("Enter the name of the author");
			librarian.showBook(sc.nextLine(), true, books);
			break;
		case 2:
			System.out.println("Enter the name of the tile");
			librarian.showBook(sc.nextLine(), false , books);
			break;
		default:
			System.out.println("Enter Valid Choice");
		}
	}


	private void removeBook() {
		// TODO Auto-generated method stub
		System.out.println("Chose one of the following");
		System.out.println("1. Remove an existing book by author");
		System.out.println("2. Remove an existing book by title");
		int choice = sc.nextInt();
		sc.nextLine();
		switch (choice) {
		case 1:
			System.out.println("Enter the name of the author");
			librarian.removeBook(sc.nextLine(), true, books);
			break;
		case 2:
			System.out.println("Enter the name of the tile");
			librarian.removeBook(sc.nextLine(), false , books);
			break;
		default:
			System.out.println("Enter Valid Choice");
		}
	}


	private void showAll() {
		// TODO Auto-generated method stub
		librarian.showAll(books);
	}


	private void getBook() {
			// TODO Auto-generated method stub
			System.out.println("Chose one of the following");
			System.out.println("1. Add to an existing book by author");
			System.out.println("2. Add to an existing book by title");
			System.out.println("3. Add a new book");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				System.out.println("Enter the name of the author");
				librarian.addBook(sc.nextLine(), true, books);
				break;
			case 2:
				System.out.println("Enter the name of the tile");
				librarian.addBook(sc.nextLine(), false , books);
				break;
			case 3:
				addNewBook();
				break;
			default:
				System.out.println("Enter Valid Choice");
			}
		
	}


	private void addNewBook() {
		// TODO Auto-generated method stub
		System.out.println("Enter the details of the new Book");
		System.out.println("Title");
		String title = sc.nextLine();
		System.out.println("Author");
		String author = sc.nextLine();
		System.out.println("ISBN");
		String isbn = sc.nextLine();
		System.out.println("Publisher");
		String publisher = sc.nextLine();
		System.out.println("Count");
		int count = sc.nextInt();
		sc.nextLine();
		
		librarian.addNewBook(title, author, isbn, publisher, count, books);
	}
	
	public void ScanClose() {
		sc.close();
	}
}
