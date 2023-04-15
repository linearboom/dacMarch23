package com.cdac.restros;

import java.util.Comparator;

public class CalorieComparator implements Comparator<Dish> {
	@Override
	public int compare(Dish o1, Dish o2) {
		// TODO Auto-generated method stub
		return Double.valueOf(o1.getCalories()).compareTo(o2.getCalories());
	}
}
