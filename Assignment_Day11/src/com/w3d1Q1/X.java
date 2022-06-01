package com.w3d1Q1;

public interface X {
	
	void print();
	
	default void x() {
		System.out.println("Printing by default method");
	}
	
	static void x2() {
		System.out.println("Printing by static method.");
	}

	
}
