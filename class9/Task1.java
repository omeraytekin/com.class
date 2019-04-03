package com.class9;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
//Write a program that reads a range of integers (start and end point),
//provided by a user and then from that range prints the sum of the even and odd integers.
 int sumof;
 int Even;
	
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first number");
		int num1=scan.nextInt();
		System.out.println("enter last number");
		int num2=scan.nextInt();
		if(num1>num2) {
			for(int a=num1;a<=num2;a++) {
				if(a%2==0){
					sumofEven+=a;
				}
			}
		}
	
		
	
	}

}
