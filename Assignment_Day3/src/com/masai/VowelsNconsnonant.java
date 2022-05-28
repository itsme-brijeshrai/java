package com.masai;

public class VowelsNconsnonant {

	void findVowelorNot(char ch) {
		if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
			System.out.println("Entered character " + ch + " is vowel");
		}
		else if ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
			System.out.println("Entered character " + ch + " is consonant.");
		}else {
			System.out.println("Not a valid alphabet !");
		}
	}
	
	
	
	public static void main(String[] args) {
		VowelsNconsnonant vowels = new VowelsNconsnonant();
		vowels.findVowelorNot('a');
		vowels.findVowelorNot('A');
		vowels.findVowelorNot('&');
	}

}
