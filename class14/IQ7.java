package com.class14;

import java.util.Scanner;

public class IQ7 {

	public static void main(String[] args) {
		// WRITA A program to check whether a given number is proime or not?
		// primeNumber should meet 2 conditions:divisivble by 1 & byitself only
		int number;
		Scanner omer = new Scanner(System.in);

		System.out.println("enter a number to check if it is prime");

		number = omer.nextInt();
		if (number / number == 1 && number / 1 == number && number % 2 != 0 && number % 3 != 0) {
			System.out.println("prime");
		} else if (number % 2 == 0) {
			System.out.println("not prime");
		} else {
			System.out.println("not prime");
		}

	}

}
