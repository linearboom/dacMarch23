package com.cdac.util;

import java.util.Comparator;

public class ProductPriceComparator implements Comparator<Products>{
	
	@Override
	public int compare(Products o1, Products o2) {
		return Double.valueOf(o1.getPrice()).compareTo(Double.valueOf(o2.getPrice()));
	}
}
