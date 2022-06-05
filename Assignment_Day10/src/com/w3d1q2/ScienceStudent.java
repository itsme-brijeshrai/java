package com.w3d1q2;

public class ScienceStudent extends  Student {
	
	int physicsMarks;
	int chemistryMarks;
	int mathsMarks;
	
	
	
	public ScienceStudent(String name, String address, int physicsMarks, int chemistryMarks, int mathsMarks) {
		super(name, address);
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}

	@Override
	double getPercentage() {
		double percent = (physicsMarks+chemistryMarks+mathsMarks)/3;
		return percent;
		
	}
	
	void showDetails() {
		System.out.println("Name : "+name);
		System.out.println("address : " + address);
		System.out.println("physicsMarks : " + physicsMarks);
		System.out.println("chemistryMarks : "+ chemistryMarks);
		System.out.println("mathsMarks : "+ mathsMarks);
	}

}
