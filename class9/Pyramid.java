package com.class9;

public class Pyramid {

	public static void main(String[] args) {
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * 
		 */
	for(int i=0;i<4;i++) {
		for(int y=0;y<=i;y++) {
		System.out.print("*");	
		}
	System.out.println();
	}
	
	//******--->rows=4.clos=6
	//*    *
	//*	   *
	//******
	
		for(int i=1;i<=4;i++) {
			for(int y=1;y<=6;y++) {
				
				if(i==1||i==4||y==1||y==6) {
					System.out.print("*");	
				}else {
					System.out.print(" ");
				}
				
			}
		System.out.println();
		}
	
	
	
	
	}

}
