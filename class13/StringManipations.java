package com.class13;

public class StringManipations {

	public static void main(String[] args) {

		// 1replace()-will replace
		String str = "i am a good tester#1!";
		String newStr = str.replace("a", "e");
		System.out.println(newStr);

		String newStr2 = str.replace("tester", "programmer");
		System.out.println(newStr2);
//what we are looking for to replace ,new value 
		String newStr3 = str.replace("Tester", "Programmer");
		System.out.println(newStr3);
		str = str.replace("!", "?");
		System.out.println(str);
		str.replace("1", "2");
		System.out.println(str);

//2
		String str1 = "12Hello 3234 World 465%@";

		String replacedNoNumbers = str1.replaceAll("[0-9]", "");
		System.out.println(replacedNoNumbers);

		String newString=replacedNoNumbers.replaceAll("[^A-Za-z]", "");
		System.out.println(newString);
		
		//String replacedNoCharacters = replacedNoNumbers.replaceAll("[A=Za-z]", "");
	//	System.out.println(replacedNoCharacters);
		
		
		String str2="1Hello123";
		System.out.println(str2.replaceAll("[^0-9]",""));
			
		
		
		
		
		
		
	}
}
