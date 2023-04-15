package com.cdac.students;



public class UnderGraduateStudent extends Student {
	private int creditHours;
	private static final double TUTION_RATE = 500; //Rate per hour
	private static final double DISCOUNT = 0.8D;
	
	public UnderGraduateStudent(String name, int id, String major, double gpa, int creditHours) {
		super(name, id, major, gpa);
		this.creditHours = creditHours;
	}


	@Override
	public void calculateTution() {
		// TODO Auto-generated method stub
		
		if (super.getGpa() >= 3.5) {
			 super.setPendingFees(creditHours * TUTION_RATE * DISCOUNT);
		} else {
			super.setPendingFees(creditHours * TUTION_RATE );
		}
	}


	@Override
	public String toString() {
		return "UnderGraduateStudent [creditHours=" + creditHours + ", Name =" + getName() + ", Id =" + getId()
				+ ", Major =" + getMajor() + ", GPA =" + getGpa() + ", Pending Amount =" + getPendingFees()
				+ "]";
	}
	
	
	
	
	
	
}
