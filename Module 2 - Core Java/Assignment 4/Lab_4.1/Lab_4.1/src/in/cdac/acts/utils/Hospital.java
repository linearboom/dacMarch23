package in.cdac.acts.utils;

import in.cdac.acts.domain.MedicalRecord;

public class Hospital {	//Singleton class
	public static int MAX_COUNT = 100;
	private int index = 0;
	private PatientRecord[] patientRecords = new PatientRecord[ MAX_COUNT ];
	public void addPatientRecord(PatientRecord patientRecord ) {
		this.patientRecords[ index ] = patientRecord;
		this.index = this.index + 1;
	}
	public void addMedicalRecord( String name, MedicalRecord medicalRecord ) {
		for( int indx = 0; indx < this.index; ++ indx ) {
			if( this.patientRecords[ indx ] != null && this.patientRecords[ indx ].getPatient() != null ) {
				if( this.patientRecords[ indx ].getPatient().getName() == name )
					this.patientRecords[ indx ].addMedicalRecord(medicalRecord);
			}
		}
	}
	public PatientRecord getPatientRecord( String name ) {
		for( int indx = 0; indx < this.index; ++ indx ) {
			if( this.patientRecords[ indx ] != null && this.patientRecords[ indx ].getPatient() != null ) {
				if( this.patientRecords[ indx ].getPatient().getName() == name )
					return this.patientRecords[ indx ];
			}
		}	
		return null;
	}
	public MedicalRecord[] getMedicalRecord( String name ) {
		for( int indx = 0; indx < this.index; ++ indx ) {
			if( this.patientRecords[ indx ] != null && this.patientRecords[ indx ].getPatient() != null ) {
				if( this.patientRecords[ indx ].getPatient().getName() == name )
					return this.patientRecords[ indx ].getMedicalRecords();
			}
		}	
		return null;
	}
	private static Hospital reference;
	public static Hospital getReference() {
		if( reference == null )
			reference = new Hospital();
		return reference;
	}
}
