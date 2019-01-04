package com.bilgeadam.homework;

public class HomeWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer word = new StringBuffer("saa");
		System.out.println(isPalindrome(word));
	}
	static boolean isPalindrome (StringBuffer word) {
		if(word.equals( word.reverse() )) {
			return true;
		}else {
			return false;
		}
	}
}
