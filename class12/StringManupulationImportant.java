package com.class12;

public class StringManupulationImportant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "syntax";

		int lengthOfString = str.length();
		System.out.println(lengthOfString);

		String str1 = "Syntax tec"; 
		int lengthOf2String = str1.length();
		System.out.println(lengthOf2String);

		String str2 = "welcome students";
		System.out.println(str2.length());
		String str3 = "hello";
		String newString = str3.toUpperCase();
		System.out.println(newString);

		String loverCaseString = newString.toLowerCase();
		System.out.println(loverCaseString);

		String str4 = "Hello";
		String str5 = "hello";
		boolean equality = str4.contentEquals(str5);
		System.out.println(equality);

		String expectedBrowser = "Chrome";
		String actualBrowser = "CHROME";
		boolean equals = expectedBrowser.equalsIgnoreCase(actualBrowser);
		System.out.println(equals);

	}

}
