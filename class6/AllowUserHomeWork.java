package com.class6;

import java.util.Scanner;

public class AllowUserHomeWork {

	public static void main(String[] args) {
		/*allow user to enter grade and then provide explanation:A-excellent,B-good,C-average,d=bad
		 * any other grade-->not acceptable, At the end your program should print which grade was 
		 * entered by a user with explanation 
		 */

	    String grade;
		Scanner input=new Scanner(System.in);
		System.out.println("please enter your grade");
		grade=input.nextLine();
		
		switch(grade) {
		case"A":
		grade="excellent";
		break;
		case"B":
		grade="good";
		break;
		case"C":
		grade="average";
		break;
		case"D":
		grade="bad";
		break;
		default:
			grade="Not accepted";
		}
		System.out.println("your grade is "+grade);
		
		
		
		
		
		
		
		
		
		
	}

}
