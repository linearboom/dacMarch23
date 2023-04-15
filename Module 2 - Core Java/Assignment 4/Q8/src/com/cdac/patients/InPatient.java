package com.cdac.patients;



public class InPatient extends Patient {
	private int numberOfDays;
	private double roomCharges;
	private double medicineCharges;
	private double discount;
	private final static double ROOM_CHARGE = 100;
	private final static double DISCOUNT = 0.10d;
	
	public InPatient(String name, int id, int age, int numberOfDays, double medicineCharges) {
		super(name, id, age);
		this.numberOfDays = numberOfDays;
		this.medicineCharges = medicineCharges;
	}
	
	@Override
	public double calculateBill() {
		// TODO Auto-generated method stub
		roomCharges = numberOfDays * ROOM_CHARGE;
		if ( super.getAge() >= 60 )
			discount = medicineCharges * DISCOUNT;
		super.setTotalFee(roomCharges + medicineCharges + Patient.TREATMENT_CHARGE -  discount); 
		return super.getTotalFee();
	}	
	
	@Override
	public void printBill() {
		// TODO Auto-generated method stub
		System.out.println("Your total Bill is:");
		System.out.println("Name : " + super.getName());
		System.out.println("Age  : " + super.getAge());
		System.out.println("Id   : " + super.getId());
		System.out.println("TreatMent Charge :" + Patient.TREATMENT_CHARGE);
		System.out.println("Room Charge for " + numberOfDays +"Days : "+ roomCharges);
		System.out.println("Medicine Charge : "+medicineCharges);
		System.out.println("Senior Citizen Discount : "+ discount);
		System.out.println("Total Charge : "+super.getTotalFee());
	}
	
	
	public int getNumberOfDays() {
		return numberOfDays;
	}

	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

	public double getRoomCharges() {
		return roomCharges;
	}

	public void setRoomCharges(double roomCharges) {
		this.roomCharges = roomCharges;
	}

	public double getMedicineCharges() {
		return medicineCharges;
	}

	public void setMedicineCharges(double medicineCharges) {
		this.medicineCharges = medicineCharges;
	}
	
	
	
}
