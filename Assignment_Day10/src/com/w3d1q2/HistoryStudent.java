package com.w3d1q2;

public class HistoryStudent extends Student {
	int historyMarks;
	int civicsMarks;
	
	
	public HistoryStudent(String name, String address, int historyMarks, int civicsMarks) {
		super(name, address);
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}
	@Override
	double getPercentage() {
		double percent = (historyMarks+civicsMarks)/2;
		return percent;
		
	}
	
	void showDetails() {
		System.out.println("Name : "+name);
		System.out.println("address : " + address);
		System.out.println("historyMarks : " + historyMarks);
		System.out.println("civicsMarks : "+ civicsMarks);
	}

	
}
