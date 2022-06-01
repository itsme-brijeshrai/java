package com.w3d1q2;

public abstract class Student {
	String name;
	String Address;
	
	
	/**
	 * 
	 */
	public Student() {
		super();
	}


	public Student(String name, String address) {
		this.name = name;
		Address = address;
	}
	
	

	abstract void getPercentage();
}

