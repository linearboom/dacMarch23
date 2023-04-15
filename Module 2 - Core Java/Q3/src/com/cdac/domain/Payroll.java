package com.cdac.domain;

public class Payroll {
	Employee[] emp =  new Employee[10];
	{
		emp[0] = new FullTimeEmployee("Mohit", 21, 35000);
		emp[1] = new PartTimeEmployee("Suresh",22,42,35);
		emp[2] = new FullTimeEmployee("Ganesh", 23, 60000);
		emp[3] = new PartTimeEmployee("Lokesh",24,15,40);
		emp[4] = new PartTimeEmployee("Rahul",25,35,35);
		emp[5] = new FullTimeEmployee("Ganesh", 26, 80000);
	}
	
	public void showPay() {
		double totalPay = 0;
		for (int i =0 ; i< emp.length; i++) {
			if (emp[i] != null) {
			emp[i].calculatePay();
			System.out.println(emp[i]);
			totalPay += emp[i].getSalary();
			}
		}
		System.out.println("The total pay for the company is : "+totalPay);
	}
	
	public void showFullTime() {
		for (Employee emps : emp) {
			if (emps instanceof FullTimeEmployee ) { // Using instance of Operator
			FullTimeEmployee fulltime = (FullTimeEmployee) emps;
			fulltime.showRecord();
			}
		}
	}
}
