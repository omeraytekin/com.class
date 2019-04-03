package com.class10;

public class Task2 {

	public static void main(String[] args) {
// Create an array of names and store all names of your group. Then print your name from that array.
//(use 2 different ways of creating an array).
 
	String[] names = {"omer","faruk","zeynep","deniz","ismet"};
	System.out.println(names[3]);
	//second way
	
	String [] name =new String[5];
	name[0]="omer";
	name[1]="faruk";
	name[2]="zeynep";
	name[3]="deniz";
	name[4]="ismet";
	System.out.println(name[4]);
	}

}
