package com.cdac.matrix;

import java.util.Scanner;

public class Program {
	private static Scanner sc = new Scanner(System.in);
	
	public int menu() {
		System.out.println("1. Addition of two matrices");
		System.out.println("2. Subtraction of two matrices");
		System.out.println("3. Multiplication of two matrices");
		System.out.println("4. Transpose of a matrix");
		System.out.println("5. EXIT");
		return sc.nextInt();
	}
	
	public void start() {
		int choice;
		while (( choice = menu() ) != 5) {
			switch (choice) {
			case 1:
				add();
				break;
			case 2:
				subtract();
				break;
			case 3:
				multiplication();
				break;
			case 4:
				transpose();
				break;
			default:
				System.out.println("Enter Valid input");
			}
		}
	
	}
	
	private boolean transpose() {
		// TODO Auto-generated method stub
		System.out.println("Enter details of Matrix 1");
		int[][] mat1 = getMatrix();
		if (mat1 == null)
			return false;
		int result [][] = Matrix.transpose(mat1);
		if (result ==  null)
			return false;
		Matrix.display(result);
		return true;		
	}

	private boolean multiplication() {
		// TODO Auto-generated method stub
		System.out.println("Enter details of Matrix 1");
		int[][] mat1 = getMatrix();
		if (mat1 == null)
			return false;
		System.out.println("Enter details of Matrix 2");
		int[][] mat2 = getMatrix();
		if (mat2 == null)
			return false;
	
		int result [][] = Matrix.multiply(mat1, mat2);
		if (result ==  null)
			return false;
		Matrix.display(result);
		return true;		
	}

	private boolean subtract() {
		System.out.println("Enter details of Matrix 1");
		int[][] mat1 = getMatrix();
		if (mat1 == null)
			return false;
		System.out.println("Enter details of Matrix 2");
		int[][] mat2 = getMatrix();
		if (mat2 == null)
			return false;
	
		int result [][] = Matrix.subtract(mat1, mat2);
		if (result ==  null)
			return false;
		Matrix.display(result);
		return true;		
	}

	private int[][] getMatrix(){
		System.out.println("Enter number of rows of matrix ");
		int row = sc.nextInt();
		System.out.println("Enter number of cols of matrix ");
		int col = sc.nextInt();
		if (row < 1 || col < 1) {
			System.out.println("Invalid row or column");
			return null;
		}
		int matrix [][] = new int[row][col];
		System.out.println("Enter the elements of matrix");
		for (int i = 0;  i < row ;  i++) {
			for (int j = 0; j< col ; j++) {
				System.out.print("Enter element["+i+"]["+j+"]");
				matrix[i][j] = sc.nextInt();
			}
		}
		return matrix;
	}

	private boolean add() {
		// TODO Auto-generated method stub
		System.out.println("Enter details of Matrix 1");
		int[][] mat1 = getMatrix();
		if (mat1 == null)
			return false;
		System.out.println("Enter details of Matrix 2");
		int[][] mat2 = getMatrix();
		if (mat2 == null)
			return false;
	
		int result [][] = Matrix.add(mat1, mat2);
		if (result ==  null)
			return false;
		Matrix.display(result);
		return true;
	}
}
