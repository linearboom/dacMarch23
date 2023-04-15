package com.cdac.students;

public abstract class Student {
	private String name;
	private int id;
	private String major;
	private double gpa;
	private double pendingFees;
	
	public Student(String name, int id, String major, double gpa) {
		this.name = name;
		this.id = id;
		this.major = major;
		this.gpa = gpa;
	}
	
	public abstract void calculateTution();

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

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public double getPendingFees() {
		return pendingFees;
	}

	public void setPendingFees(double pendingFees) {
		this.pendingFees = pendingFees;
	}
	
	
	
}



	
