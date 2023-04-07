package com.cdac.days;

public enum DayOfWeek {
	
	SUN("Sunday",1),
	MON("Monday",2),
	TUE("Tuesday",3),
	WED("Wednesday",4),
	THU("Thursday",5),
	FRI("Friday",6),
	SAT("Saturday",7);
	
	private String name;
	private int dayNo;
	
	private DayOfWeek(String name, int dayNo){
		this.name = name;
		this.dayNo = dayNo;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDayNo() {
		return dayNo;
	}

	public void setDayNo(int dayNo) {
		this.dayNo = dayNo;
	}
	
	public static void printDay(DayOfWeek day) {
		System.out.println(day.getName());
	}

	public static DayOfWeek getNextDay(DayOfWeek day) {
		// TODO Auto-generated method stub
		// Next logic according to ordinal
		DayOfWeek[]  days = DayOfWeek.values();
		if (day.ordinal() == 6)
			return days[0];
		else
			return days[day.ordinal()+1];
		
	}

	static int getDayNumber(DayOfWeek day) {
		// TODO Auto-generated method stub
		return day.getDayNo();
	}
	
	void pr(int x) {
		System.out.println(x);
	}

	static DayOfWeek[] getWeekendDays() {
		// TODO Auto-generated method stub
		DayOfWeek weekends[] = new DayOfWeek[] {DayOfWeek.SAT, DayOfWeek.SUN};
		return weekends;
	}
	
}
