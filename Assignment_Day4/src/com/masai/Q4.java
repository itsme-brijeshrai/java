package com.masai;
import java.util.Scanner;
public class Q4 {

	public static void data(int num) {
		if(num%2==0 && num>0) {
			int n1=num%10;
			int n2=10-n1;
			num=num+n2;
			System.out.println(num);
		}
		else if(num%2!=0 && num>0) {
			System.out.println(num);
		}
		else if(num<0) {
			System.out.println("Error");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		data( number);
		sc.close();
		// TODO Auto-generated method stub

	}

}