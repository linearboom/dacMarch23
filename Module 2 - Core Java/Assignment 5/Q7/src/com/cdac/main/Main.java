package com.cdac.main;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) {
		Class<?> person = Person.class; // Here I can mention Person in <>
		try {
			Constructor<?> ctor = person.getDeclaredConstructor(String.class, int.class);
			ctor.setAccessible(true); // Makes Construcotr accessible
			Person per = (Person) ctor.newInstance("John",40);
			System.out.println(per.getAge());
			Field age = person.getDeclaredField("age");
			age.setAccessible(true);
			age.setInt(per,100);
			System.out.println(per.getAge());
			Method method = person.getDeclaredMethod("setAge", int.class);
			method.invoke(per, 25);
			System.out.println(per.getAge());
			
			System.out.println(per.getName());
			Field name = person.getDeclaredField("name");
			name.setAccessible(true);
			name.set(per, "Totto");
			System.out.println(per.getName());
			
			Method setName = person.getDeclaredMethod("setName", String.class);
			setName.invoke(per, "Moon");
			System.out.println(name.get(per));
			
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException | NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
