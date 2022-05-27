package com.masai;

public class StaticNonstatic {
	//Every method in java defaults to a non-static method without static keyword preceding it. Non-static methods can access any static method
	//and static variable, without creating an instance of the object.
	int x = 10;
	int y = 20;
	
	public static void main(String[] args) {
		//A static method is a method that belongs to a class, but it does not belong to an instance of that class
		//and this method can be called without the instance or object of that class.
		int x = 20;
		int y = 10;
		int totalSum = x + y;
		System.out.println("Total sum (Static method) is " + totalSum);
		
		
		StaticNonstatic totalsum = new StaticNonstatic();
		int sum = totalsum.x + totalsum.y;
		System.out.println("total sum (non-static method) is " + sum );
	}

}
