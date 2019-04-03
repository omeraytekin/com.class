package com.class4;

public class NestedIfAgain {

	public static void main(String[] args) {
		// declare varible 

		
		double gpa=3.6;
		double 	expectedGpa=3.7;
		
		boolean  hasDiploma=true;
		if(hasDiploma==true) {
			System.out.println("cong");
			if(gpa>expectedGpa) {
				System.out.println("you are hired");
			}else {
			System.out.println("unfortuanly we cannot hire you");	
			}
		}else {
			System.out.println("please get your degree");
		}
		
		
		
	}

}
