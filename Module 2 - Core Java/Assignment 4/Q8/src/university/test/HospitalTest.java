
package university.test;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.cdac.patients.Patient;
import com.cdac.util.Hospital;

public class HospitalTest {
	private Scanner sc = new Scanner(System.in);
	Hospital hospital = new Hospital();

	public void start() {
		int choice;
		while (true) {
			try {
				choice = menu();
				if (choice == 0)
					break;
				switch (choice) {
				case 1:
					viewBill();
					break;
				case 2:
					hospital.viewAll();
					break;
				default:
					System.out.println("Enter Valid input");
				}
			} catch (InputMismatchException e) {
				// TODO Auto-generated catch block
				System.out.println("Please Enter a Valid input");
				sc.nextLine();
			} catch (Exception e) {
				e.getStackTrace();
			}
		}
		System.out.println("Exiting System");
		sc.close();
	}

	private void viewBill() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Patient Id");
		if (hospital.viewBill(sc.nextInt())) {
			
		}else {
			System.out.println("Patient not found!");
		}
	}

	private int menu() throws InputMismatchException {
		System.out.println("0. Exit Application");
		System.out.println("1. View Bill of patient");
		System.out.println("2. View the total Pending bill of all Patients");
		return sc.nextInt();
	}

}
