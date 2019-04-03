package com.class5;

public class LogicalOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*if number is between 1-10-->number is small
		 * if number is between 11-100-->number is medium
		 * if number is between 101-1000-->number is large
		 */
		
		
		int num=9;
		//  true AND False-->false
		
		if(num>=1 && num<=10) {
			System.out.println("number is small");
		//        true AND true-->true	
		}else if (num>=11 && num<=100) {
			System.out.println("number is medium");
		//       false AND  ture-->false
		}else if(num>=101 && num<=1000) {
			System.out.println("number is larger");
		}else {
			System.out.println("number is not in your range");
		}
		
		
	}

}
