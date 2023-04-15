package com.cdac.patients;

public class OutPatient extends Patient {
	private double doctorFees;
	private double testCharges;
	private double discount;
	private static final double DISCOUNT = 0.95D;
	
	public OutPatient(String name, int id, int age, double doctorFees, double testCharges) {
		super(name, id, age);
		this.doctorFees = doctorFees;
		this.testCharges = testCharges;
	}

	@Override
	public double calculateBill() {
		// TODO Auto-generated method stub
		if (super.getAge() >= 60)
			discount = testCharges * DISCOUNT;
		setTotalFee(Patient.TREATMENT_CHARGE + testCharges + doctorFees -  discount);
		return getTotalFee();
	}

	@Override
	public void printBill() {
		// TODO Auto-generated method stub
		System.out.println("Your total Bill is:");
		System.out.println("Name : " + super.getName());
		System.out.println("Age  : " + super.getAge());
		System.out.println("Id   : " + super.getId());
		System.out.println("TreatMent Charge :" + Patient.TREATMENT_CHARGE);
		System.out.println("Doctor Fees : "+ doctorFees);
		System.out.println("Test Charge : "+testCharges);
		System.out.println("Senior Citizen Discount : "+ discount);
		System.out.println("Total Charge : "+super.getTotalFee());
	}

	public double getDoctorFees() {
		return doctorFees;
	}

	public void setDoctorFees(double doctorFees) {
		this.doctorFees = doctorFees;
	}

	public double getTestCharges() {
		return testCharges;
	}

	public void setTestCharges(double testCharges) {
		this.testCharges = testCharges;
	}
	
	
	
}
