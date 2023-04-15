package com.cdac.main;

public class Person implements Cloneable {
	private String name;
	private Address add;
	
	public Person(String name, Address add) {
		this.name = name;
		this.add = add;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}
	
	@Override
	protected Person clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Person per = new Person(name, add.clone());
		return per;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name : " +  this.name + " " + this.add.toString();
	}
	
}
