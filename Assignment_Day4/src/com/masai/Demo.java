package com.masai;

public class Demo {
	Demo(){
		System.out.println("This is 0 args constructor");
	}
	
	Demo(String s){
		System.out.println("This is constructor passed wid String parameter");
	}
	
	Demo(int i){
		System.out.println("This is constructor passed with int variable");
	}
	Demo(float f){
		System.out.println("This is constructor passed with float variable");
	}
	
	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println(demo);
		
	}
}
