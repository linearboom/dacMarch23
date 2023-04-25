package com.mult.main;

public class Mult {
	public static void mult(int n, int i,int count) {
		if (i > count) {
			return;
		} else {
			System.out.println(n +" * " + i + " = " + i*n );
			mult(n,i+1,count);
		}
	}
	
	public static void main(String[] args) {
		mult(5,1,10);
	}
}
