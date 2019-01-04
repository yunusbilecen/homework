package com.bilgeadam.homework;

import java.util.ArrayList;

public class HomeWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Palindrome of word is " + isPalindrome("see"));
		System.out.println("Palindrome of word is " + isPalindrome("ses"));
		/*------------------------------------*/
		System.out.println();
		String [] strArray = {"Ahmet", "Ali", "Feyzullah", "Ayþe"};
		System.out.println("The longest of string is " + findLongestWord(strArray));
		System.out.println();
		/*------------------------------------*/
		for (char c : makeReverseCharArray("university")) {
			System.out.print(c);
		}
		/*------------------------------------*/
		System.out.println();
		for (char c : makeCharArray("university")) {
			System.out.print(c+" ");
		}
		System.out.println();
		/*------------------------------------*/
		System.out.println();
		System.out.println("Reverse of Long text is " + reversWords("Sebahat Onur Atilla Deniz Cenk Hamza Mehmet Ali Onur Seçil Nariman Özkan Fulya Murat"));
	}
	static boolean isPalindrome (String word) {
		String newWord = "";
		char [] charWord = word.toCharArray();
		for (int i = word.length()-1; i >= 0; i--) {
			newWord += charWord[i];
		}
		
		if(newWord.indexOf(word) == -1) {
			return false;
		}else {
			return true;
		}
	}
	
	static String findLongestWord (String [] words) {
		int maxLenght = 0;
		String result = words[0];
		for (int i = 1; i < words.length; i++) {
			if(result.length() < words[i].length()) {
				result = words[i];
			}
		}
		return result;
	}
	
	static char[] makeReverseCharArray (String word) {
		char [] reverseChar = new char[word.length()];
		char [] charWord = word.toCharArray();
		int x = 0;
		for (int i = word.length()-1; i >= 0; i--) {
			reverseChar[x] += charWord[i];
			x++;
		}
		return reverseChar;	
	}
	
	static char[] makeCharArray (String word) {
		char [] newChar = word.toCharArray();
		return newChar;
	}
	static String reversWords (String longText) {
		String [] newArray = longText.split(" ");
		String newLongText = "";
		for (String word : newArray) {
			
			String newWord = "";
			char [] charWord = word.toCharArray();
			for (int i = word.length()-1; i >= 0; i--) {
				newWord += charWord[i];
			}
			newLongText += newWord + " ";
		}
		return newLongText;
	}
}
