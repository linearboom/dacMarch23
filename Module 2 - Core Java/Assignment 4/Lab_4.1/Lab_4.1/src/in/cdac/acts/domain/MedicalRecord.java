package in.cdac.acts.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MedicalRecord {
	private Date date;
	private String doctorName;
	private String diagnosis;
	private String treatment;
	public MedicalRecord() {
		this.date = new Date();
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	public String getTreatment() {
		return treatment;
	}
	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}
	@Override
	public String toString() {
		String strDate = new SimpleDateFormat("dd-MMM-yyyy").format(this.date);
		return String.format("%-15s%-25s%-25s%-50s", strDate, this.doctorName, this.diagnosis, this.treatment);
	}
}
