package com.product.test;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.cdac.util.ProductPriceComparator;
import com.cdac.util.Products;

public class ProductTest {
	private Products[] products;
	private static Scanner sc = new Scanner(System.in);

	public ProductTest(int size) {
		super();
		this.products = new Products[size];
	}
	
	public void  getvalues() throws InputMismatchException {
		System.out.println("Enter the Product Details");
		for (int i = 0 ; i< products.length; i++) {
			System.out.println("Enter the Product Name");
			String name = sc.nextLine();
			System.out.println("Enter the Price of the Product");
			double price = sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter the category");
			String cat =  sc.nextLine();
			products[i] =  new Products(name, price, cat);
		}
	}
	
	public void sort() {
		System.out.println("The Sorted List is :");
		ProductPriceComparator com =  new ProductPriceComparator();
		Arrays.sort(products,com);
	}
	
	public void print() {
		for (Products pro : products) {
			System.out.println(pro);
		}
	}
	
	
}
