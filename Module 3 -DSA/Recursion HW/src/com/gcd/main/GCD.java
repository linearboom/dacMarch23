package com.gcd.main;

public class GCD {
	public static int gcd(int num1, int num2) {
		//System.out.println("Num 1 = " + num1 + " Num 2 = "+ num2);
		if (num1!=0) {
			return gcd(num2%num1,num1);
		}else {
			return num2;
		}

	}

	public static void main(String[] args) {
		System.out.println(gcd(24,80));
	}
}
