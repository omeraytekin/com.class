package com.class7;

public class Task {

	public static void main(String[] args) {
		// Creat a boolean varible workDay and assing true
		//craet int varible day and assing it to 1
		//as long as it is workDay print-->"i need a day off" and increment day 
		//day once day is 6-->your condition for your loop should become false //
		
		boolean workDay=true;
		int day=1;
		while(workDay) {
	
		System.out.println("i need a day off");
		if(day==6) {
			System.out.println("i do not need a day off");
		
		workDay=false;
		}
		day++;
		
		}
		
		
		
	}

}
