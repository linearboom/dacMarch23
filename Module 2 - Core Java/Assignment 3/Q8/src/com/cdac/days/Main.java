package com.cdac.days;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DayOfWeek [] days = DayOfWeek.values();
		
		System.out.println(Arrays.toString(days));
		//b
		DayOfWeek.printDay(DayOfWeek.SUN);
		
		//c
		DayOfWeek day = DayOfWeek.getNextDay(days[3]);
		System.out.println("The next day is :"+day.getName());
		
		//d
		int num = DayOfWeek.getDayNumber(day);
		System.out.println(num);
		
		//e
		DayOfWeek weekends[] =  DayOfWeek.getWeekendDays();
		System.out.println(Arrays.toString(weekends));
		
	}
	

}
