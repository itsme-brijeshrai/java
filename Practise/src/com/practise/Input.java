package com.practise;

public class Input {
	private int roll;
	private int marks;
	private String batch_number;
	
	
	
	/**
	 * 
	 */
	public Input() {
	}
	public Input(int roll, int marks, String batch_number) {
		this.roll = roll;
		this.marks = marks;
		this.batch_number = batch_number;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getBatch_number() {
		return batch_number;
	}
	public void setBatch_number(String batch_number) {
		this.batch_number = batch_number;
	}
	
	
}
