package com.cdac.main;

public class Person {
	private String name;
	private int age;
	
	private Person() {
		
	}
	
	private Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public static void sum(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	
}
