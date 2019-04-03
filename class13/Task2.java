package com.class13;

public class Task2 {

	public static void main(String[] args) {
		// CreAT A STRING THAT should be combination of letters, numbers ad special characters.
		//find out how many alpha characters are there in the string
	String omer="123i love so much**&";
	String b=omer.replaceAll("[^A-Za-z]"," ");
System.out.println(b);	
	
	
	
	
	
	
	/*String newString=replacedNoNumbers.replaceAll("[^A-Za-z]", "");
	System.out.println(newString);
	*/
	}

}
