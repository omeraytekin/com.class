package com.class13;

public class Task3 {

	public static void main(String[] args) {
		// you have to a string ="Is it saturday? Is it raining? Do we have a Java class Today?"
		//how would you find out how many sentences are in that Sting
		
		String a="is it saturday? is it raining? do we have a java class today?";
		String []array =a.split("\\?");//{!?];//("\\?") soru isareti ile cumleleri ayiriyorsunuz ve ? bu simge bunun icin
		//isaret olarak kabul ediyor.baska simgede olabillir veya bosluk 
System.out.println(array.length);
		
		
		
		
		
		/*
		 * tring[] array = str.split(" ");
		System.out.println(array.length+array.length);
		for (String substring : array) {
			System.out.println();
			System.out.println(substring);
		}
		 */
		
		
	}

}
