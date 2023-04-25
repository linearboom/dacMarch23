package com.StringPerm.main;

public class StrinPerm {
	public static void perm(String s,String ans) {
		System.out.println("s : " + s + " ans : " + ans);
		if (s.length() == 0) {
			System.out.println(ans + " ");
			return;
		}else {
			for (int i =0;i<s.length(); i++) {
				char fixed = s.charAt(i); // Fixes one character at index
				String left = s.substring(0,i); // Left Side of the String
				String right = s.substring(i+1); // Right Side of the String
				perm(left + right ,ans + fixed); // Sending the fixed components in the ans argument and the variable components in the s argument
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		perm("ABC","");
	}

}
