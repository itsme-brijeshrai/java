package com.inheritance;
import java.util.Scanner;
public class Demo {
	public static Bank getBank(String bank) {
		if(bank.equalsIgnoreCase("axis")){
			AxisBank axisbank = new AxisBank();
			return axisbank;
		}
		else if(bank == "icici") {
			ICICIBank icicibank = new ICICIBank();
			return icicibank;
		}
		return null;
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
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of the bank :");
		String bank = sc.next();
		sc.close();
		
		getBank(bank);
	}
	

}
class Bank{
	String branchName;
	String ifscCode;
	
	void displayDetails() {
		System.out.println("Name of the branch is : "+ branchName+ " Ifsc code : "+ ifscCode);
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
	void displayDetails() {
		System.out.println("Name of the branch is : "+ branchName+ " Ifsc code : "+ ifscCode);
	}
}


