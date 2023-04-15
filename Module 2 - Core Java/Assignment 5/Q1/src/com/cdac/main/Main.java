package com.cdac.main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address add1 =  new Address("WallStreet", "NY", "NY");
		Person p1 = new Person("John", add1);
		
		try {
			Person p2 = p1.clone();
			p2.getAdd().setCity("Nevada");
			System.out.println(p1.getAdd().getCity());
			System.out.println(p2.getAdd().getCity());
			
			System.out.println(p1);
			System.out.println(p2);
		} catch (Exception e) {
			System.out.println("Could not clone Object");
		}
		
	}

}
