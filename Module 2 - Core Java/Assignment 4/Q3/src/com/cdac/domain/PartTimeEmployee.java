package com.cdac.domain;

public class PartTimeEmployee extends Employee {
	private int hoursWorked;
	private double hourlyRate;
	private final double  bonus = 1.2;
	
	public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
		super(name,id);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	
	

	@Override
	public void calculatePay() {
		double salary =  hoursWorked * hourlyRate;
		// TODO Auto-generated method stub
		this.setSalary(salary);
		if (hoursWorked > 40)
			this.setSalary(salary * bonus);
		
	}



	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public double getBonus() {
		return bonus;
	}



	@Override
	public String toString() {
		return super.toString() + "PartTimeEmployee [hoursWorked=" + hoursWorked + ", hourlyRate=" + hourlyRate + "]";
	}
	
	
	
}
