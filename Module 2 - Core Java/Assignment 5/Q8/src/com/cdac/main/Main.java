package com.cdac.main;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Fully Qualified Name of the class");
		String cname = sc.nextLine();
		try {
			Class<?> c = Class.forName(cname);
			System.out.println("Found class! : "+c.getName() );
			Field[]  field = c.getDeclaredFields();
			Constructor<?> ctor =  c.getDeclaredConstructor();
			ctor.setAccessible(true);
			Object obj = ctor.newInstance();
			System.out.println("");
			for (int i = 0 ; i< field.length ; i++) {
				System.out.println(i+". "+field[i].getType().getSimpleName() +" "+ field[i].getName());
			}
			System.out.println("Enter the field you want to manipulate");
			String fname =  sc.nextLine();
			Field f = c.getDeclaredField(fname);
			System.out.println("Enter the new Value of the field");
			String newVal = sc.nextLine();
			Object v = changeType(newVal,f);
			f.setAccessible(true);
			f.set(obj, v);
			System.out.println(f.get(obj));
		} catch (ClassNotFoundException | NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException | InstantiationException | InvocationTargetException | NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static Object changeType (String newVal, Field f) {
		switch (f.getType().getSimpleName()) {
		case "int":
			return Integer.parseInt(newVal);
		case "float":
			return Float.parseFloat(newVal);
		case "double":
			return Double.parseDouble(newVal);
		case "long":
			return Long.parseLong(newVal);
		case "String":
			return newVal;
		case "boolean":
			return Boolean.parseBoolean(newVal);
		default:
			return null;
		}
	}

}
