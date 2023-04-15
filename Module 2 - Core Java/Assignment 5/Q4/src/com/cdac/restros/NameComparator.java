package com.cdac.restros;

import java.util.Comparator;

public class NameComparator implements Comparator<Dish> {
	@Override
	public int compare(Dish o1, Dish o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
}
