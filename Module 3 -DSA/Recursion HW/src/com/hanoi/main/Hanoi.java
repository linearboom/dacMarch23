package com.hanoi.main;

public class Hanoi {
	public static void  toh(int n, char s, char a, char d) {
		if (n==1) {
			System.out.println("Moving Disk from "+ s + " to " + d);
		}else {
			toh(n-1,s,d,a);
			System.out.println("Moving Disk from "+ s + " to " + d);
			toh(n-1,a,s,d);
		}
	}
	
	public static void main(String[] args) {
		toh(5,'A','B','C');
	}
}
