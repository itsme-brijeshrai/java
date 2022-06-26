package com.Q2;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {
	public static void main(String[] args) throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abcd.txt"));
		Student st = (Student)ois.readObject();
		System.out.println(st);
		ois.close();
	}
}
