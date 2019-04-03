package com.class14;

public class IQ8 {

	public static void main(String[] args) {
		// WRITE A PROGRAM TO PRINT FIRST 10 NUMBERS OF FIBONACCI SERIES
		int a = 1;
		int b = 0;
		int c = 0;
		for (int i = 0; i < 10; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(a + " ");
		}
	}

}
