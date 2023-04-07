package com.cdac.sales;

public class SalesPerson {
	private String name;
	private int id;
	private float[] salesFig = new float[12]; // Array storing 12 data of 12 months
	
	
	public SalesPerson(String name, int id, float[] salesFig) {
		super();
		this.name = name;
		this.id = id;
		for (int i = 0 ; i< salesFig.length; i++) {
			this.salesFig[i] = salesFig[i]; // Value Copy
		}
	}
	
	public float totalSales() {
		float sum = 0;
		for (float sale : salesFig) {
			sum += sale;
		}
		return sum;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float[] getSalesFig() {
		float [] arr = new float[12];
		for (int i = 0 ; i< salesFig.length; i++) {
			arr[i] = salesFig[i]; // Value Copy
		}
		return arr;
	}
	public void setSalesFig(float[] salesFig) {
		for (int i = 0 ; i< salesFig.length; i++) {
			this.salesFig[i] = salesFig[i]; // Value Copy
		}
	}
	
	
}
