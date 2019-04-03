package com.class8;

import java.util.Scanner;

public class Taskkkkk {

	public static void main(String[] args) {
		// let user define a range of numbes to print

		Scanner scan = new Scanner(System.in);

		System.out.println("please enter starting number");
		int startnumber = scan.nextInt();

		System.out.println("plesae enter ending number");
		int endnumber = scan.nextInt();
		if (startnumber <= endnumber) {

			for (int i = startnumber; i <= endnumber; i++) {
				System.out.println(i);
			}
		} else {
			System.out.println("i wont run your code");
		}

	}

}
