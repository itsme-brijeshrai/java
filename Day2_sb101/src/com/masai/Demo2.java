package com.masai;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Demo2 {
	public static void main(String[] args) {
		
		File f = new File("d://projects");
		try {
			FileWriter fw = new FileWriter(f);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
