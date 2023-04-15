package in.cdac.acts.test;

import java.util.Scanner;

import in.cdac.acts.domain.MedicalRecord;
import in.cdac.acts.domain.Patient;
import in.cdac.acts.utils.HospitalManager;
import in.cdac.acts.utils.PatientRecord;

public class HospitalManagerTest {
	private static Scanner sc = new Scanner(System.in);
	private HospitalManager manager = HospitalManager.getReference();
	public static void acceptRecord( Patient patient ) {
		//TODO accept record and set to patient
		
	}
	public static void acceptRecord( MedicalRecord medicalRecord ) {
		//TODO accept medical record and set to medicalRecord
	}
	public void addPatientRecord( ) {
		Patient patient = new Patient();
		HospitalManagerTest.acceptRecord(patient);
		
		MedicalRecord medicalRecord = new MedicalRecord();
		HospitalManagerTest.acceptRecord(medicalRecord);
		
		PatientRecord patientRecord = new PatientRecord();
		patientRecord.setPatient(patient);
		patientRecord.addMedicalRecord(medicalRecord);
		this.manager.addPatientRecord(patientRecord);
	}
	public void addMedicalRecord( ) {
		sc.nextLine();
		System.out.print("Enter Patient Name	:	");
		String patientName = sc.nextLine();
		//Here we can add some validation logic
		MedicalRecord medicalRecord = new MedicalRecord();
		HospitalManagerTest.acceptRecord(medicalRecord);
		
		this.manager.addMedicalRecord(patientName, medicalRecord);
	}
	public void printPatientRecord( ) {
		sc.nextLine();
		System.out.print("Enter Patient Name	:	");
		String patientName = sc.nextLine();
		PatientRecord patientRecord = this.manager.getPatientRecord(patientName);
		if( patientRecord != null ) {
			System.out.println( patientRecord.getPatient());
			MedicalRecord[] medicalRecords = patientRecord.getMedicalRecords();
			for (MedicalRecord medicalRecord : medicalRecords) {
				if( medicalRecord != null )
					System.out.println(medicalRecord);
			}
		}
	}
	public void printMedicalRecords( ) {
		sc.nextLine();
		System.out.print("Enter Patient Name	:	");
		String patientName = sc.nextLine();
		MedicalRecord[] medicalRecords = this.manager.getMedicalRecord(patientName);
		for (MedicalRecord medicalRecord : medicalRecords) {
			if( medicalRecord != null )
				System.out.println(medicalRecord);
		}
	}
	public static int menuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Add Patient Record");
		System.out.println("2.Add Medical Record");
		System.out.println("3.Print Patient Record");
		System.out.println("4.Print Medical Record(s)");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
}
