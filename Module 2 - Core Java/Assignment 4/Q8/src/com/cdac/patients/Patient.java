package com.cdac.patients;

public abstract class Patient {
	private String name;
	private int id;
	private int age;
	private double totalFee;
	static final double TREATMENT_CHARGE =  500;
	
	public Patient(String name, int id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}
	
	public abstract double calculateBill();
	public abstract void printBill();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(double totalFee) {
		this.totalFee = totalFee;
	}
	
	

}



	
