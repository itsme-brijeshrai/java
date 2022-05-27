package com.masai;
public class CheckWeather {
	
	public static void main(String[] args) {
		boolean isSnowing = false;
		boolean isRaining = true;
		double temperature = 50.0;
		
		if(isSnowing == true || isRaining == true || temperature>60) {
			System.out.println("Let's stay home");
		}else {
			System.out.println("Let's go out !");
		}
	}

}
