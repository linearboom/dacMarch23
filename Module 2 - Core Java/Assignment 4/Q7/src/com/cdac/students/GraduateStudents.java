package com.cdac.students;

public class GraduateStudents extends Student {
	private int creditHours;
	private double researchFee;
	private static final double TUTION_RATE = 1000;
	private static final double DISCOUNT =  0.9;

	
	
	public GraduateStudents(String name, int id, String major, double gpa, int creditHours, double researchFee) {
		super(name, id, major, gpa);
		this.creditHours = creditHours;
		this.researchFee = researchFee;
	}



	@Override
	public void calculateTution() {
		// TODO Auto-generated method stub
		
		if (researchFee >= 5000) {
			 super.setPendingFees(creditHours * TUTION_RATE * DISCOUNT);
		} else {
			super.setPendingFees(creditHours * TUTION_RATE );
		}
	}



	public int getCreditHours() {
		return creditHours;
	}



	public void setCreditHours(int creditHours) {
		this.creditHours = creditHours;
	}



	public double getResearchFee() {
		return researchFee;
	}



	public void setResearchFee(double researchFee) {
		this.researchFee = researchFee;
	}



	public static double getTutionRate() {
		return TUTION_RATE;
	}



	public static double getDiscount() {
		return DISCOUNT;
	}



	@Override
	public String toString() {
		return "creditHours=" + creditHours + ", researchFee=" + researchFee + ", Name="
				+ getName() + ", Id=" + getId() + ", Major=" + getMajor() + ", GPA=" + getGpa()
				+ ", Pending Fees =" + getPendingFees() + "]";
	}

    
	
}
