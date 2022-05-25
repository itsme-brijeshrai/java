package com.inheritance;

public class Bank {
	String branchName;
	String ifscCode;
	
	void displayDetails() {
		System.out.println("Name of the branch is : "+ branchName+ " Ifsc code : "+ ifscCode);
	}
	
	
	public static void main(String[] args) {
		AxisBank axis = new AxisBank();
		axis.branchName = "Axis Bank";
		axis.ifscCode = "AXIS6007";
		axis.displayDetails();
		
		ICICIBank icici = new ICICIBank();
		icici.branchName = "ICICI BANK";
		icici.ifscCode = "icici2345";
		icici.displayDetails();
	}
}
class AxisBank extends Bank{
	double rateOfInterest = 12;
	
	void getCreditCard() {
		System.out.println("Get the credit card from the Axis Bank");
	}
	
}

class ICICIBank extends Bank{
	double rateOfInterest = 16;
}
