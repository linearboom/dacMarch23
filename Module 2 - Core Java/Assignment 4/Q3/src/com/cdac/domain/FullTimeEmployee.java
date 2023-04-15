package com.cdac.domain;

public class FullTimeEmployee extends Employee {
	private final float bonus = 1.10f;

	public FullTimeEmployee(String name, int id, double salary) {
		super(name, id, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculatePay() {
		this.setSalary(this.getSalary()*bonus);
	}
	
	public void showRecord() {
		System.out.println("Name of the Employee" + this.getName());
		System.out.println("Employee Id : " +  this.getId());
		System.out.println("Employee Salary: " + this.getSalary());
	}
	
}
