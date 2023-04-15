package com.cdac.util;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.cdac.players.Players;

public class SportsComplex  {
	private Scanner sc = new Scanner(System.in);
	private final int MAX_SIZE =  22;
	private Players[] players  = new Players[22];
	private Manager manager = new Manager();
	
	public void start() {
		int choice;
		while (true) {
			try {
				choice = menu();
				if (choice == 0)
					break;
				switch (choice) {
				case 1:
					footballGame();
					break;
				case 2:
					cricketGame();
					break;
				case 3:
					System.out.println("Not yet implemented");
					break;
				case 4:
					System.out.println("Not yet implemented");
					break;
				case 5:
					manager.showScore(players);
					break;
				case 6:
					manager.populatePlayers(players);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Enter valid Input");
				e.printStackTrace();
				sc.nextLine(); // It works as intended after this.
			} 
		}
	}
	
	
	private void cricketGame() {
		// TODO Auto-generated method stub
		sc.nextLine(); // NExt Line Trap
		System.out.println("Enter the name of the player");
		String name = sc.nextLine();
		System.out.println("Enter 1  if you want to add runs");
		System.out.println("Enter 2  if you want to add wickets");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println(manager.addRuns(name, players));
			break;
		case 2:
			System.out.println(manager.addAssist(name, players));
			break;
		default:
			System.out.println("Enter a valid option");
		}

	}


	private void footballGame() throws Exception {
		// TODO Auto-generated method stub
		sc.nextLine(); // NExt Line Trap
		System.out.println("Enter the name of the player");
		String name = sc.nextLine();
		System.out.println("Enter 1  if you want to add a goal");
		System.out.println("Enter 2  if you want to add an assist");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println(manager.addGoal(name, players));
			break;
		case 2:
			manager.addAssist(name, players);
			break;
		default:
			System.out.println("Enter a valid option");
		}
	}


	private void acceptRecord() throws InputMismatchException {
		// TODO Auto-generated method stub
		System.out.println("");
	}


	private int menu() throws InputMismatchException {
		System.out.println("Chose one of the following");
		System.out.println("1. Update football Game");
		System.out.println("2. Update Cricket Game");
		System.out.println("3. Add a cricket player");
		System.out.println("4. Add a football player");
		System.out.println("5. Check the winners!");
		int choice =  sc.nextInt();
		//sc.nextLine();
		return choice;
	}

		
	
	
	
	
	
	
	
}
