package com.class11;

public class Task3 {

	public static void main(String[] args) {
	// creat an array of int and find largest number
    int[]numbers= {200,20,13,4,654,900};
    int largest=numbers[0];
    for(int i=0;i<numbers.length;i++) {
    	if(numbers[i]>largest) {
    		largest=numbers[i];
    		
    	}
    }
	System.out.println("the largest number is "+largest);

	
	}

}
