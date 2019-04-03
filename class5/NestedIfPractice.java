package com.class5;

public class NestedIfPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean creditcard=false;
		int balance=1000;
		
		if(creditcard) {
			System.out.println("lets check the balance");
		if(balance>=1000) {
			System.out.println("pay off now");
		}else 
		System.out.println("you are good");
		}
		else {
			System.out.println("do you want a creditcard");
		}
		
		
	}

}
