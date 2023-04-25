package com.seriessumfraction.main;

public class SeriesSum {
	
	public static float sum(int n) {
		if (n == 1) 
			return 1;
		else
			return sum(n-1) - ((float)Math.pow(-1, n) * (1f/(float)n));
	}
	
	public static void main(String[] args) {
		int n =3;
		System.out.println(sum(n));
	}
}
