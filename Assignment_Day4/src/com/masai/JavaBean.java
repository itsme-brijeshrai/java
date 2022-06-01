package com.masai;

public class JavaBean {

	  private  int roll;
	  private String name;
	  private  int age;
	  private  int marks;

	  public JavaBean() {}
	  public JavaBean(int roll2, String name2, int age2, int marks2) {
		  this.roll=roll2;
		  this.name=name2;
		  this.age=age2;
		  this.marks=marks2;
		// TODO Auto-generated constructor stub
	}
	public void setName(String name) { //Setting the name.
		  this.name=name;
	  }
	  
	  public String getName() { //Getting the name here.
		  return name;
	  }
	  
	  
	  public void setRoll(int roll) {
		  this.roll=roll;
	  }
	  
	  public int getRoll() {
		  return roll;
	  }
	  
	  public void setAge(int age) {
		 if(age>18 && age<60) {
		  this.age=age;
		 }
		  
	  }
	  
	  public int getAge() {
		  return age;
	  }
	  
	  public void setMarks(int marks) {
		  if(marks>0 && marks<=500) {
		  this.marks=marks;
		  }  
	  }
	  public int getMarks() {
		  return marks;
	  }
	  
	//  public void showDetails() {
//		  System.out.println("Name: "+name);
//		  System.out.println("Roll : "+roll);
//		  System.out.println("Age: "+age);
//		  System.out.println("Marks: "+marks);
	//  }
	}