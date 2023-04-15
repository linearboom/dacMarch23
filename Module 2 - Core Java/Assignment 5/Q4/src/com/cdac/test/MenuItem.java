package com.cdac.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import com.cdac.restros.CalorieComparator;
import com.cdac.restros.Dish;
import com.cdac.restros.NameComparator;
import com.cdac.restros.PriceComparator;

public class MenuItem {
	private Dish[] menu =  new Dish[10];
	private Scanner sc = new Scanner(System.in);
	
	public MenuItem() {
		menu[0] = new Dish("Paneer", 250, 75);
		menu[1] = new Dish("Mushroom", 300, 100);
		menu[2] = new Dish("Chicken", 500, 125);
		menu[3] = new Dish("Rice", 200, 150);
		menu[4] = new Dish("Roti", 250, 90);
		menu[5] = new Dish("Soy Vegetable", 250, 100);
		menu[6] = new Dish("Dessert", 100, 25);
		menu[7] = new Dish("Salad", 150, 50);
		menu[8] = new Dish("Fish", 300, 275);
		menu[9] = new Dish("Soup", 175, 80);
	}
	
	public void start() {
		int choice;
		while (( choice = menu() ) != 0 ) {
			Comparator<Dish > compare  =  null;
			switch (choice) {
			case 1:
				compare =  new PriceComparator();
				Arrays.sort(menu, compare);
				break;
			case 2:
				compare = new CalorieComparator();
				Arrays.sort(menu, compare);
				break;
			case 3:
				compare = new NameComparator();
				Arrays.sort(menu, compare);
				break;
			default:
				System.out.println("By default ordering by price");
				Arrays.sort(menu);
			}
			print();
		}
	}

	private int menu() {
		// TODO Auto-generated method stub
		System.out.println("Chose how you want to sort");
		System.out.println("0. Exit");
		System.out.println("1. To sort menu by Price");
		System.out.println("2. To sort menu by Calorie");
		System.out.println("3. To sort meny by Name");
		return sc.nextInt();
	}
	
	private void print() {
		for (Dish dish : menu) {
			System.out.println(dish);
		}
	}
}