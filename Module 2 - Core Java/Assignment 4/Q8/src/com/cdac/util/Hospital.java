package com.cdac.util;

import com.cdac.patients.OutPatient;
import com.cdac.patients.Patient;
import com.cdac.patients.InPatient;

public class Hospital {
	private Patient[] hospital = new Patient[5];
	{
		hospital[0] = new OutPatient("Mahesh", 1, 65, 500, 250);
		hospital[1] = new InPatient("Ramesh", 2, 54, 5, 500);
		hospital[2] = new OutPatient("Suresh", 3, 55, 500, 250);
		hospital[3] = new InPatient("Ganesh", 4, 75, 10, 900);
		hospital[4] = new OutPatient("Kamlesh", 5, 15, 500, 250);
	}

	private Patient getPatient(int Id) {
		for (int i = 0; i < hospital.length; i++) {
			if (hospital[i] != null && hospital[i].getId() == Id) {
				return hospital[i];
			}
		}
		return null;
	}

	public void viewAll() {
		// TODO Auto-generated method stub
		double total = 0;
		for (int i = 0; i < hospital.length; i++) {

			if (hospital[i] != null) {
				total += hospital[i].calculateBill();
			}
		}
		System.out.println("The Total Pending bill of all the patients is " + total);
	}

	public boolean viewBill(int id) {
		// TODO Auto-generated method stub
		Patient pat = getPatient(id);
		if (pat == null)
			return false;
		pat.calculateBill();
		pat.printBill();
		return true;
	}

}
