package com.cdac.main;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Fully Qualified Name of the Class");
		try(Scanner sc = new Scanner(System.in)){
			Class<?> c = Class.forName(sc.nextLine());
			Method[] methods = c.getDeclaredMethods();
			int i = 0;
			for (Method method : methods) {
				StringBuffer str =  new StringBuffer(i+" ");
				str.append(Modifier.toString(method.getModifiers())); 
				str.append(" ");
				str.append(method.getReturnType().getSimpleName() + " ");
				str.append(method.getName() +" (");
				Parameter[] params =  method.getParameters();
				//str.append(" ");
				int count = 1;
				for(Parameter param : params) {
					str.append(param.getType().getSimpleName());
					if (params.length != count)
						str.append(", ");
					count++;
				}
				str.append(")");
				System.out.println(str);
				i++;
			}
			
			System.out.println("Enter the number of the method you want to invoke");
			Method meth = methods[sc.nextInt()];
			sc.nextLine();
			Parameter[] param = meth.getParameters();
			Object[] arguments = new Object[param.length];
			for (int j = 0; j< param.length; j++) {
				System.out.print("Enter the argument of type" + param[j].getType().getSimpleName());
				arguments[j] = changeType(sc.nextLine(), param[j]);
			}
			Constructor<?> ctor = c.getDeclaredConstructor();
			ctor.setAccessible(true);
			Object obj = ctor.newInstance();
			meth.setAccessible(true);
			meth.invoke(obj, arguments);
			System.out.println("Done");
		} catch(ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	
	private static Object changeType (String newVal, Parameter f) {
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
			System.out.println("Null value");
			return null;
		}
	}
		

}
