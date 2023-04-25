package com.seriessum.main;

import java.util.Arrays;

public class SeriesSum {
	public static int sum(int [] arr) {
		if (arr.length == 1) {
			return arr[0];
		} else {
			return arr[arr.length-1] + sum(Arrays.copyOf(arr, arr.length-1));
		}
	}
	
	public static void main(String[] args) {
		int [] arr = new int[] {1,5,10};
		System.out.println(sum(arr));
	}
}
