package com.class9;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
//6. Ask a user to input a leap year. Give the user 10 chances to enter a correct leap year.
// As soon as the user enters the correct leap year exit the loop.
//leap year is the that
		Scanner scan;
		int year;
		scan = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("enter a guessed leap year");
			year = scan.nextInt();

			if (year % 4 == 0) {
				System.out.println("the year is a leap year");
				break;
			}else {
				System.out.println("the year is not a leap year");
			}
		}

	}

}
