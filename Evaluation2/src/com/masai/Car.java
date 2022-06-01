package com.masai;

public class Car {
	private int numberOfPassengers;
	private int numberOfKms;
	
	public Car() {
	}
	
	public Car(int numberOfPassengers, int numberOfKms) {
		this.numberOfPassengers = numberOfPassengers;
		this.numberOfKms = numberOfKms;
	}

	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}

	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}

	public int getNumberOfKms() {
		return numberOfKms;
	}

	public void setNumberOfKms(int numberOfKms) {
		this.numberOfKms = numberOfKms;
	}
	
}
class Sedan extends Car{
	final int farePerKm = 20;
	
}
class HatchBack extends Car{
	final int farePerKm = 15;
}
class OLA {	
	public Car bookCar(int numberOfPassengers, int numberOfKms) {
		return null;
	}
	public int calculateBill(Car car) {
		return 0;
	}
}
