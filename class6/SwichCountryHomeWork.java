package com.class6;

import java.util.Scanner;

public class SwichCountryHomeWork {

	public static void main(String[] args) {
		/*ask user to enter their country and capture it.
		 *once values are captured print which language user speaks
		 *
		 */

		Scanner scan;
		String country;
		String language;
		
		scan=new Scanner(System.in);
		System.out.println("please enter your country");
		country =scan.nextLine();
		
	switch(country) {
	case "Turkey":
		language="turkish";
	break;
	case "USA":
		language="english";
	break;
	case "China":
		language="chinese";
	break;
	case"Spain":
		language="spanish";
	break;
	case "Greece":
		language="rumca";
	break;
	default:
		language="unknown";
	}
	
	System.out.println("your language is "+language);
	}


}
