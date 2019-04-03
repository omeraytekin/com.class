package com.class13;

public class ReverseString {

	public static void main(String[] args) {
		// Reverse a string wihout using a reverse function
		// 1 using tocharArray();

		String orginal = "Today is Java Class";
		String reverse = "";// bunu neden koyduk?
		char[] array = orginal.toCharArray();
		for (int i = array.length - 1; i >= 0; i--) {
			reverse = reverse + array[i];

		}
		System.out.println("Reverse String is " + reverse);

		// 2 CharAt()

		String reverse1 = "";
		for (int i = orginal.length() - 1; i >= 0; i--) {
			reverse1 = reverse1 + orginal.charAt(i);
			System.out.println("reversed string is " + reverse1);
		}
		// using substring
		String reverse3 = "";
		System.out.println(orginal.length());
		for (int i = orginal.length(); i > 0; i--) {
			reverse3 = reverse3 + orginal.substring(i - 1, i);

		}

		System.out.println("reversed string is " + reverse3);
	}

}
