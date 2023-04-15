package in.cdac.acts.utils;

import in.cdac.acts.domain.MedicalRecord;

public class HospitalManager {	//Singleton class
	private Hospital hospital = Hospital.getReference();
	public void addMedicalRecord( String name, MedicalRecord medicalRecord) {
		this.hospital.addMedicalRecord(name, medicalRecord);
	}
	public void addPatientRecord(PatientRecord patientRecord ) {
		this.hospital.addPatientRecord(patientRecord);
	}
	public PatientRecord getPatientRecord( String name ) {
		return this.hospital.getPatientRecord(name);
	}
	public MedicalRecord[] getMedicalRecord( String name ) {
		return this.hospital.getMedicalRecord(name);
	}
	private static HospitalManager reference;
	public static HospitalManager getReference() {
		if( reference == null ) 
			reference = new HospitalManager();
		return reference;
	}
}
