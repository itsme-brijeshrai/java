package com.practise2;
import java.util.*;
public class StudentDriver {
	
	public static void getstudent(boolean isFromNIT) {
    	if(isFromNIT==true) {
    		Student s1=new Student(24,"Chandani","Gorakhpur");
    		s1.setCollageName("NIT");
//    		System.out.println(s1.getcName()); 
    		s1.showDetails();
    	}
    	else {
    		Student s2=new Student(28,"Brijesh","Ghazipur","other");
    		s2.showDetails();
    	}
    }
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Are you from NIT");
		boolean answer = sc.nextBoolean();
		sc.close();
		getstudent(answer);
	


	}
	

}
