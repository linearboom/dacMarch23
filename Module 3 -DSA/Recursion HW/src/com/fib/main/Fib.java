package com.fib.main;

public class Fib {
	public static int fib(int n) {
		if (n<=1) {
			//System.out.println(n);
			return n;
		}
		return fib(n-1) + fib(n-2);
	}
	
	public static void main(String[] args) {
		int n = 100;
		for (int i = 0; i <=n ; i++) {
			System.out.print(fib(i)+" ");
		}
	}
}
