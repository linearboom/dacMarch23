package com.cdac.matrix;

public class Matrix {

	public static int[][] add(int[][] mat1, int[][] mat2) {
		// TODO Auto-generated method stub
		if (mat1.length != mat2.length && mat1[0].length != mat2[0].length) {
			System.out.println("For Matrix Addition the order of matrix needs to be same!");
			return null;
		}
		int result [][] = new int [mat1.length][mat1[0].length];
		for (int i = 0; i< mat1.length ; i++) {
			for (int j = 0 ; j< mat1[0].length ; j++) {
				result[i][j] =  mat1[i][j] + mat1[i][j] ;
			}
		}
		return result;
	}

	public static void display(int[][] result) {
		// TODO Auto-generated method stub
		for (int i = 0 ;  i < result.length ; i++) {
			for (int j = 0 ; j < result[0].length ; j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println("");
		}
	}

	public static int[][] subtract(int[][] mat1, int[][] mat2) {
		// TODO Auto-generated method stub
		if (mat1.length != mat2.length && mat1[0].length != mat2[0].length) {
			System.out.println("For Matrix Subtraction the order of matrix needs to be same!");
			return null;
		}
		int result [][] = new int [mat1.length][mat1[0].length];
		for (int i = 0; i< mat1.length ; i++) {
			for (int j = 0 ; j< mat1[0].length ; j++) {
				result[i][j] =  mat1[i][j] - mat1[i][j] ;
			}
		}
		return result;
	}

	public static int[][] multiply(int[][] mat1, int[][] mat2) {
		if (mat1[0].length == mat2.length) {
			int result [][] = new int [mat1.length][mat2[0].length];
			for (int i = 0; i< mat1.length ; i++) {
				for (int j = 0 ; j< mat2[0].length ; j++) {
					for (int k = 0 ; k < mat1[0].length; k++) {
						result[i][j] +=  mat1[i][k] * mat2[k][j];
					}
				}
			}
			return result;
		}
		System.out.println("The number of columns of the first matrix must be equal to number of rows");
		return null;
	}

	public static int[][] transpose(int[][] mat1) {
		// TODO Auto-generated method stub
		int result [][] = new int [mat1[0].length][mat1.length];
		for (int i = 0; i< mat1.length ; i++) {
			for (int j = 0 ; j< mat1[0].length ; j++) {
				result[j][i] =  mat1[i][j] ;
			}
		}
		return result;
	}

}
