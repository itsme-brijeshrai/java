package com.masai;
import java.util.Scanner;
public class CricketScore {
	
	public static void score(int singles, int doubles, int fours, int six ) {
		int totalScore = (singles * 1) + (doubles *2) + (fours *4) + (six * 6);
		System.out.println("Toatal score made by batsman is - " + totalScore);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter singles taken by batsman :");
		int singles = sc.nextInt();
		System.out.println("Enter doubles taken by batsman :");
		int doubles = sc.nextInt();
		System.out.println("Enter fours taken by batsman :");
		int fours = sc.nextInt();
		System.out.println("Enter six taken by batsman :");
		int six = sc.nextInt();
		sc.close();
		score(singles,doubles,fours,six);
	}

}
