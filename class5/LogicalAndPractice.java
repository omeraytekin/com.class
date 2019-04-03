package com.class5;

import java.util.Scanner;

public class LogicalAndPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Prompt the user to enter two people's heights in inches. Each person should be classified as one of the following:
 *short (under 5 feet)
 *medium(5 to 6 feet)
 *tall (6 feet and over)
 */
	
	Scanner inc=new Scanner(System.in);
	System.out.println("please enter your height in inches");
		int height=inc.nextInt();
		
		if(height<5) {
			System.out.println("short");
		}else if (height==5)||height<6){
			System.out.println("medium");
		}else if (height>=6) {
		System.out.println("tall");	
		}else {
		System.out.println("please enter your valid");	
		}
		
		
		
		
			}
		
			
		
		
		
		
		
		
		
	}


