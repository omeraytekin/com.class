package com.class10;

public class Task1 {

	public static void main(String[] args) {
		// .Create an array of chars and store grades into it: A,B,C,D,E,F. 
		//Then print a grade B (use 2 different ways of creating an array).
char[] grades= {'A','B','C','D','E','F'};
System.out.println(grades[2]);
	//second way
char[] Grades =new char[6];
Grades[0]='A';
Grades[1]='B';
Grades[2]='C';
Grades[3]='D';
Grades[4]='E';
Grades[5]='F';

System.out.println(Grades[4]);
	
	}

}
