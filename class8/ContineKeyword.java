package com.class8;

public class ContineKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<5;i++) {
			if(i==2) {//number 2 skip
				continue;
				
			}
		System.out.println(i);
		}
		
		//if i want to print number from 1 to 20 but skip those that divisible  by 3
		
	for( int a=1;a<=20;a++) {
	if (a%3==0) {
		continue;
	}
	System.out.println(a);
	}
	
	}

}
