package com.bilgeadam.homework4;

public class ProductsTest {

	public static void main(String[] args) {
		
		String[] linesArr = IOUtils.FileReader("./products.txt").split("\n");
		
		String [] types = {"computer","phone","tablet"};
		
		String[] productType = new String[linesArr.length];
		String[] productBrand = new String[linesArr.length];
		String[] productPrice = new String[linesArr.length];
		
		
		for (int i = 0; i < linesArr.length; i++) {
			String [] arr = linesArr[i].split("-");
			productType[i] = arr[0];
			productBrand[i] = arr[1];
			productPrice[i] = arr[2];
		}
		
		
		String context = "";
		int totalPrice = 0;
		for (String string : types) {
			context += "***********************\n";
			context +=  string.toUpperCase() + "\n";
			
			for (int i = 0; i < productType.length; i++) {
				if(productType[i].equals(string)) {
					context += "\t"+productBrand[i]+":"+productPrice[i] + "\n";
					totalPrice += Integer.parseInt(productPrice[i]);
				}
			}
		}
		context += "***********************\n";
		context += "Total price of products: "+totalPrice; 
		IOUtils.FileWriter(context, "./productsOutput.txt");
		
	}

}
