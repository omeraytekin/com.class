package com.class14;

import java.util.Scanner;

public class IQ6 {

	public static void main(String[] args) {
		// creat java program to find whether a String is palindrome or not?
		//(dad,mom,madam)
		Scanner omer=new Scanner(System.in);
System.out.println("enter any words to check if it a palidrome");
	String word=omer.nextLine();
	String reverse="";
	for(int i=word.length()-1;i>=0;i--) {
		reverse+=word.charAt(i);
	}
	//System.out.print(reverse);
	if(word.equalsIgnoreCase(reverse));{
		
	System.out.println("the word is palindrome ");
	}else {
		System.out.println("the word is not palindrome!");
	}

	}
}