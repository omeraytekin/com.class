package com.class8;

import java.util.Scanner;

public class ForAndScanner {

	public static void main(String[] args) {
		// prompt user to enter 2 int and compare
		//at the end print largers
		
		Scanner scan;
		int num1,num2;
		int largest=0;
		scan=new Scanner(System.in);
		System.out.println("please enter first number");
		num1=scan.nextInt();
		
		System.out.println("please enter second number");
		num2=scan.nextInt();
		
		if(num1>num2) {
			largest=num1;
		}else if (num2>num1) {
			largest=num2;
		}else {
			System.out.println(num1+" is equal to "+num2);
		}
		System.out.println(largest +" is the largest");

		
		
		
		
	}

}
