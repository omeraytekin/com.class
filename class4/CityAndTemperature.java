package com.class4;

import java.util.Scanner;

public class CityAndTemperature {

	public static void main(String[] args) {
	/*
	 * Ask user to enter city and temperature in Fahrenheit
	 * 	your program should convert F-->C
	 * Your program should say"The temperature in the city__ is __"
	 * 
	 */
		
		String cityName;
		int temp;
		
		Scanner myScanner=new Scanner(System.in);
		System.out.println("please enter your city");
		cityName=myScanner.nextLine();
		System.out.println("please enter temperature in Fahrenheit");
		temp=myScanner.nextInt();
		//formula(F-32)* 5/9;
		int convertedTemp=(temp-32)*5/9;
		System.out.println("the temperature in the city "+cityName+" is "+convertedTemp);
		
		
		
		
	}

}
