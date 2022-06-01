package com.w3d1q2;

public class ScienceStudent extends  Student {
	
	int physicsMarks;
	int chemistryMarks;
	int mathsMarks;
	
	@Override
	void getPercentage() {
		
		
	}
	
	void showDetails() {
		System.out.println("physicsMarks : " + physicsMarks);
		System.out.println("chemistryMarks : "+ chemistryMarks);
		System.out.println("mathsMarks : "+ mathsMarks);
	}

}
