package com.cdac.restros;

import java.util.Comparator;

public class PriceComparator implements Comparator<Dish> {
	@Override
	public int compare(Dish o1, Dish o2) {
		// TODO Auto-generated method stub
		return Double.valueOf(o1.getPrice()).compareTo(o2.getPrice());
	}
}
