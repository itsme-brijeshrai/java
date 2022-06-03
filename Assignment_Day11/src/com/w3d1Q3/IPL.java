package com.w3d1Q3;
import java.util.Scanner;
public class IPL {
		enum Stadium {
		EDEN_GARDENS_STADIUM,
		WANKHEDE_STADIUM,
		CHIDAMBARAM_STADIUM,
		M_CHINNASWAMY_STADIUM;
	}
	void homeTeamStadium(Stadium stadium) {
		switch(stadium){
		case EDEN_GARDENS_STADIUM:
			System.out.println("This is the home ground of KKR");
			break;
		case WANKHEDE_STADIUM:
			System.out.println("This is the home ground of Mumbai Indians");
			break;
		case CHIDAMBARAM_STADIUM:
			System.out.println("This is the home ground of CSK");
			break;
		case M_CHINNASWAMY_STADIUM:
			System.out.println("This is the home ground of RCB");
			break;
		default:
			System.out.println("Enter valid stadium!");
		}
			
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name of stadium :");
		String stadium = sc.next();
		stadium.charAt(0);
		sc.close();
	}
}
