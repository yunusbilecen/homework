package com.bilgeadam.homework;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] intArray = {23,33,12,43,56,32,45,67,78,90};
		int [] newArray = findNumbersLessThan(intArray, 35);
		System.out.print("New Array 1 :");
		for (int i : newArray) {
			if(i != 0) {
				System.out.print(i +" ");
			}
		}
		/*-----------------------------------------------------------*/
		int [] intArray2 = {28,33,1,33,5,32,85,51,33,70};
		System.out.println();
		System.out.println("Total Count :"+findCount(intArray2, 33));
		
		/*-----------------------------------------------------------*/
		System.out.println();
		int [] intArray3 = {1,2,3,4,5,6,7};
		int [] newArray2 = addElementToArray(intArray3, 8);
		System.out.print("New Array 2 :");
		for (int i : newArray2) {
			if(i != 0) {
				System.out.print( i +" ");
			}
		}
		System.out.println();
		/*-----------------------------------------------------------*/
		System.out.println();
		System.out.println("Calculate Distance : " + calculateDistance(1, 4, 1, 5));
		/*-----------------------------------------------------------*/
		System.out.println();
		String [] products = {"Computer", "Table" , "Chair"};
		double [] prices = {3000, 250, 80};
		int[] counts = {3,2,8};
		printInformation(products, prices, counts);
		
		/*-----------------------------------------------------------*/
		System.out.println();
		System.out.println("Meta == tema : " +sameLetterCheck("meta", "tema"));
		System.out.println("Meta == Kerem : " +sameLetterCheck("meta", "kerem"));
		System.out.println("Meta == tem : " +sameLetterCheck("meta", "kerem"));
	}
	static int[] findNumbersLessThan (int [] intArray, int givenNumber) {
		int []  newArray = new int[16];
		int index = 0;
		for (int i : intArray) {
			if(i < givenNumber) {
				  newArray[index] = i;
				  index++;
			}
		}
		return newArray;
	}
	static int findCount (int [] intArray, int givenNumber) {
		int totalCount = 0;
		for (int i : intArray) {
			if(i == givenNumber) {
				totalCount++;
			}
		}
		return totalCount;
		
	}
	static int [] addElementToArray(int [] intArray, int givenNumber) {
	
		int [] newArray = new int[intArray.length+1];
		for (int i = 0; i < intArray.length-1; i++) {
			newArray[i] = intArray[i];
		}
		newArray[intArray.length] = givenNumber;
		return newArray;
	}
	static double calculateDistance (double x1, double x2, double y1, double y2) {
		double newX = x1 - x2;
		double newY = y1 -y2;
		newX = Math.pow(newX, 2);
		newY = Math.pow(newY, 2);
		double result = Math.sqrt((newX + newY));
		return result;
		
	}
	static void printInformation (String [] products, double [] prices, int[] counts) {
		for (int i = 0; i < products.length; i++) {
			System.out.println("We have "+ counts[i] + " " + products[i] + ", each one is "+ prices[i] + " TL and the total price of them is "+ (prices[i] * counts[i]) + " TL" );
		}
	}
	static boolean sameLetterCheck (String word1 , String word2) {
		char [] charArray2 = word2.toCharArray();
		if(word1.length() == word2.length()) {
			for (char c : charArray2) {
				if(word1.indexOf(c) == -1) {
					return false;
				}
			}
		}else {
			return false;
		}
		return true;
	}
 }
