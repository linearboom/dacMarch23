package com.pallindrome.main;

public class Pallindrome {
	
	public static boolean pallindrome(String s) {
		//System.out.println(s);
		if (s.length() == 1 && s.length() == 0) {
			return true;
		}else {
			if (s.charAt(0) == s.charAt(s.length()-1)) {
				if (s.length() == 2) 
					return true;
				return pallindrome(s.substring(1, s.length()-1));
			}else {
				return false;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pallindrome(""));
	}

}
