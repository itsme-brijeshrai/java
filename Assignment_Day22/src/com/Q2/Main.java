package com.Q2;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D://abc.txt");
		int i = fr.read();
		while(i!=-1) {
			System.out.println((char)i);
			i=fr.read();
		}fr.close();

	}

}
