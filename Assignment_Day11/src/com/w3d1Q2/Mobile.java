package com.w3d1Q2;
import java.util.Scanner;
public class Mobile {
	String[] outdatedModel = {"note4","note5","note6","note7"};
	void searchOutdatedModel(String name, String ...model){
		for(String mod:model) {
			int flag = 0;
			for(int i=0;i<outdatedModel.length;i++) {
				if(mod.equalsIgnoreCase(outdatedModel[i])) {
					flag++;
				}
			}
			if(flag == 0) {
				System.out.println(mod + " _Outdated");
			}
		}
	}
	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		Scanner sc = new Scanner(System.in);
		mobile.searchOutdatedModel("nokia", "note5", "note8");
		mobile.searchOutdatedModel("moto","note10");
		sc.close();
	}

}
