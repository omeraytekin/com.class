package com.class9;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// /Ask user to enter the item they want to buy and the price for the item.
		// Then ask user to pay for it. Every time user enters money accumulate the
		// amount and
		// tell user how much is left to pay off the amount.
		// Whenever user done with payments tell them "Thank you for shopping!"

		Scanner scan;
		String item;
		double price;
		double payment;
		double totalpayment = 0;
		double balance;

		scan = new Scanner(System.in);
		System.out.println("Enter your item");
		item = scan.nextLine();

		System.out.println("enter item price");

		price = scan.nextDouble();
		do {
			System.out.println("enter your payment amount ");
			payment = scan.nextDouble();

			totalpayment = totalpayment + payment;

			balance = price - totalpayment;

			System.out.println("enter more $" + balance);

		} while (totalpayment != price);

		System.out.println("thank you shooping");

	}

}
