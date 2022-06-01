package com.w3d1q1;
import java.util.Scanner;
public class Demo  {
	public Hotel provideFood(int amount){
		if(amount >= 1000) {
			TajHotel taj = new TajHotel();
			return  taj;	
		}else if(amount >200 && amount<1000){
			RoadSideHotel desi = new RoadSideHotel();
			return desi;
		}else {
			return null;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the amount");
		int amount = sc.nextInt();
		
		Demo d1 = new Demo();
		
		Object obj = d1.provideFood(amount);
		if(obj instanceof TajHotel) {
			TajHotel taj = new TajHotel();
			taj.welcomeDrink();
		}else if(obj == null){
			System.out.println("Enter a valid amount");
		}else {
			RoadSideHotel desi = new RoadSideHotel();
			desi.chickenBiryani();
		}
		sc.close();
		
		
	}
}
