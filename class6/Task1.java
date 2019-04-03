package com.class6;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*wrire a program that prints out if it is good weather to go for any activitiy.
		 * 
		 * if the temperature is between 40 degress and 80 degress inclusive &no rain-->we will go
		 * otherwise-->we will not go hiking
		 * if temperature is between 25 and 40 inclusive & snowing -->going snowboarding otherwise
		 * we are not going snowboarding
		 * if it temperature is more than 80 & sunny-->go  to beach
		 * otherwise-->not go to beach
		 * 
		 */
	
	Scanner scan;
	boolean snow = false;
	boolean rain,sunny;
	int temp;
	String activity;
	
	scan=new Scanner(System.in);
	System.out.println("please enter a temp");
	temp=scan.nextInt();
	
	if(temp>=40 && temp<80) {
	System.out.println("is it raing?");
	rain=scan.nextBoolean();
	if(rain) {
	activity="watch a movie";	
	}else {
	activity="go hiking";	
	}
	
    }else if(temp>=25 && temp<40) {
    System.out.println("is it snowing?");	
    snow=scan.hasNextBoolean();
    if(snow) {
    	activity="snowboarding";
    }else {
    activity="drink tea";	
    }
    
    }else if (temp>=80) {
    System.out.println("is it sunny?");
    sunny=scan.nextBoolean();
    if(sunny) {
    activity="go to the beach";
    }else {
    activity="do more coding";	
    }
    
    
    }else {
    System.out.println("please enter diffirent temp");	
    activity="unknown"; 
    }
    	
    System.out.println("my activity for today "+activity);
	
	}
	
	
	
	
	
	}


