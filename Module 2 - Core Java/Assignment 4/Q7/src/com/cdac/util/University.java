package com.cdac.util;

import com.cdac.students.Student;
import com.cdac.students.UnderGraduateStudent;
import com.cdac.students.GraduateStudents;

public class University {
	private Student [] student = new Student[5];
	{
		student[0] = new GraduateStudents("Mahesh",1,"Physics",3.6,40,10_000D);
		student[1] = new UnderGraduateStudent("Ramesh",1,"CS",2.9,32);
		student[2] = new GraduateStudents("Suresh",3,"Robotics",4,40,10_000D);
		student[3] = new UnderGraduateStudent("Ganesh",1,"Mechanical",3.6,33);
		student[4] = new GraduateStudents("Kamlesh",5,"DS",3.6,40,3000);
	}
	
	private Student getStudent(int Id) {
		for (int i = 0 ; i < student.length ; i++) {
			if (student[i] !=  null && student[i].getId() == Id) {
				return student[i];
			}
		}
		return null;
	}
	
	public void viewAll() {
		// TODO Auto-generated method stub
		for (int i = 0 ; i< student.length; i++) {
			if (student[i] !=  null) {
				student[i].calculateTution();
				System.out.println(student[i]);
			}
		}
	}

	
}
