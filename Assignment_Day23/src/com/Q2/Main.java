package com.Q2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
	Address ad = new Address("Telangana", "Hyderabad", "500015");
	Student st = new Student(21, "Brijesh", ad, "Brijeshrai9848@gmail.com", "98Bliss@4801");
	
	ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abcd.txt"));
	oos.writeObject(st);
	oos.close();
	System.out.println("done...");
	}
	
}
