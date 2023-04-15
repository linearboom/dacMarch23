package in.cdac.acts.utils;

import in.cdac.acts.domain.MedicalRecord;
import in.cdac.acts.domain.Patient;

public class PatientRecord {
	private Patient patient;
	public static final int MAX_COUNT = 10;
	private int index = 0;
	private MedicalRecord[] medicalRecords = new MedicalRecord[ MAX_COUNT ];
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public MedicalRecord[] getMedicalRecords() {
		return medicalRecords;
	}
	public void setMedicalRecords(MedicalRecord[] medicalRecords) {
		this.medicalRecords = medicalRecords;
	}
	public void addMedicalRecord( MedicalRecord medicalRecord) {
		this.medicalRecords[ this.index ] = medicalRecord;
		this.index = this.index + 1;
	}
}
