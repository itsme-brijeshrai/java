package com.w3d1q1;

class TajHotel implements Hotel {
	public void welcomeDrink(){
		System.out.println("Welcome Drink from the TajHotel");
		}

	@Override
	public void chickenBiryani() {
		
		
	}

	@Override
	public void masalaDosa() {
		
		
	}
}

class RoadSideHotel implements Hotel{

	@Override
	public void chickenBiryani() {
		System.out.println("Lo desi biryani");
		
	}

	@Override
	public void masalaDosa() {
		
		
	}
	
}
public interface Hotel {
	void chickenBiryani();
	void masalaDosa();
}
