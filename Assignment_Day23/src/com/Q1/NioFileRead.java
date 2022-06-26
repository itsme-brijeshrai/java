package com.Q1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class NioFileRead {
	public static void main(String[] args) throws IOException {
		Path p = Paths.get("D://abc.txt");
		List<String> list = Files.readAllLines(p);
		list.forEach(a->{System.out.println(a);});
	}
}
