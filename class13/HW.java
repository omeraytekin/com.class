package com.class13;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		//

		Scanner omer;
		String motherName, fatherName, gender,babyName;
		omer = new Scanner(System.in);
		System.out.println("please enter mothers name");
		motherName = omer.nextLine();

		System.out.println("please enter fathers name");
		fatherName = omer.nextLine();
if(gender.equalsIgnoreCase("boy")) {
	babyName=fatherName.substring(0,fatherName.length()/2)+motherName.substring(motherName.length()/2);

}else if (gender.equalsIgnoreCase("girl")) {
	babyName=motherName.substring(0,motherName.length()/2)+
			fatherName .substring(fatherName.length()/2);
	
}else {
	babyName="no  suggestion";
	System.out.println("babyName.toUpperCase");
}

	
	}

}



package com.class14;

import java.util.Scanner;

public class HW {
/*
 * Write a program that reads two people's first names 
 * and if they expecting boy or girl?
 * Based on the input suggests a name for a baby:

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan; 
		String motherName,fatherName, gender, babyName;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter mothers name");
		motherName=scan.nextLine();
		
		System.out.println("Please enter fathers name");
		fatherName=scan.nextLine();
		
		System.out.println("Please enter expected gender");
		gender=scan.nextLine();
		
		
		if(gender.equalsIgnoreCase("boy")) {
			babyName=fatherName.substring(0, fatherName.length()/2)+
					motherName.substring(motherName.length()/2);
		}else if(gender.equalsIgnoreCase("girl")){
		babyName=motherName.substring(0, motherName.length()/2)+
				fatherName.substring(fatherName.length()/2);
		}else {
			babyName="No suggestion";
			
		}
		System.out.println(babyName.toUpperCase());
	}
}
Collapse



Message Input


Message #live_questions