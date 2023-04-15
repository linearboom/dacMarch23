package com.cdac.main;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the F.Q name of the path including class name");
		String path = sc.nextLine();
		try {
			Class<?> classFind = Class.forName(path);
			String className = classFind.getName();
			System.out.println("Class Found on the path");
			System.out.println("The Class Name is : " + className);
			Method[] methods = classFind.getDeclaredMethods();
			for (Method meth : methods) {
				if (meth.getAnnotations().length != 0)
					System.out.println(Arrays.toString(meth.getAnnotations()));
				System.out.print(Modifier.toString(meth.getModifiers())+" ");
				System.out.print(meth.getName()); // Shows the Full method names
				System.out.print("( ");
				Parameter[] params = meth.getParameters();
				for (int i = 0 ; i < params.length ; i++) {
					System.out.print(params[i].getType() +" "+ params[i].getName());
					if (i != params.length-1)
						System.out.print(", ");
				}
				System.out.print(" )");
				System.out.println("");
			}
			System.out.println("Fields are: ");
			Field[] fields = classFind.getDeclaredFields();
			for (Field field : fields) {
				if (field.getAnnotations().length != 0)
					System.out.println(Arrays.toString(field.getAnnotations()));
				System.out.print(Modifier.toString(field.getModifiers()) + " "); // getModifiers returns an int.
																					// Modifiers toStrong will convert
																					// the value
				System.out.println(field.getName());
			}
			System.out.println("Annotations are: ");
			Annotation[] ann = classFind.getAnnotations();
			for (Annotation a : ann) {
				System.out.println(a.toString());
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
