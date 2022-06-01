package com.masai;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Car car = new Car();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of passengers:");
		int numberOfPassengers = sc.nextInt();
		
		System.out.println("Enter number of km - ");
		int numberOfKms = sc.nextInt();
		
		car.setNumberOfPassengers(numberOfPassengers);
		car.setNumberOfKms(numberOfKms);
		
		OLA myOla = new OLA();
		Car myCar = myOla.bookCar(numberOfPassengers, numberOfKms);
		int res = myOla.calculateBill(myCar);
		System.out.println("The total fare amount is"+ res);
		sc.close();
	}

}
