package com.masai;

import java.io.File;

public class Demo {
	public static void readFiles(File f) {
		File[] files = f.listFiles();
		for(File file:files) {
			if(file.isDirectory()) {
				readFiles(file);
			}else {
				System.out.println(file.getName());
			}
		}
	}
	
	public static void main(String[] args) {
		File f = new File("d://xyz");
		readFiles(f);
	}
} 
