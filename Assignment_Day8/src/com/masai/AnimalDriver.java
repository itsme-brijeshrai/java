package com.masai;

public class AnimalDriver {
	public static void main(String[] args) {
		Animal[] animal = new Animal[3];
		animal[0] = new Dog();
		animal[1] = new Cat();
		animal[2] = new Tiger();
		
		for(int i=0;i<animal.length;i++) {
			animal[i].makeNoise();
			animal[i].eat();
			animal[i].walk();
			System.out.println("=====================");
		}

	}
}
