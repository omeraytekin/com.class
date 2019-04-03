package com.class14;

public class IQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence="The master is speaking";
		String reverse="";
		
		
		for(int i=sentence.length()-1;i>=0;i--) {
		reverse=reverse+sentence.charAt(i);
		
		}
		System.out.println(reverse);
		
		
		
	}

}
