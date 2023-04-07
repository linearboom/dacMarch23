package org.cdac.array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int [] arr = new int[sc.nextInt()];
		int sum = 0;
		for(int i =0; i< arr.length; i++) {
			System.out.println("Enter the element at index  "+i);
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		Arrays.toString(arr);
		System.out.println("The sum of the numbers in the array is  :"+sum);
		System.out.println("The sum of the numbers in the array is  :"+sum/arr.length);
		Arrays.sort(arr);
		System.out.println("The largest element in the array is: "+ arr[arr.length -1]);
		System.out.println("The smalles element in the array is: "+ arr[0]);
		System.out.println("The array in the sorte dorder is : "+ Arrays.toString(arr));
		
	}

}
