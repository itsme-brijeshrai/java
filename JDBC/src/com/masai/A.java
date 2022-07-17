package com.masai;

public class A {
	{
		System.out.println("xyz");
	}
	static {
		System.out.println("abc");
	}
	A(){
		System.out.println("Inside fun of A");
	}
	public void funA() {
		System.out.println("123");
	}
	public static void main(String[] args) {
		System.out.println("Inside main of A");
		
		A a1 = new A();
		a1.funA();
	}
}
