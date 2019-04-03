package com.class10;

public class ArrayIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num;
num=10;//int num=10;


	int[] array1;//declare an array-->preferred way
	int[] array2;//declare an array
	int[] array3;//declare an array
	
	array1=new int[4];//initialize; creat an array
	
	//assinging value
	array1[0]=10;
	array1[1]=20;
	array1[2]=30;
	array1[3]=40;
	
	//access value
	System.out.println(array1[2]);
	
	
	
	int[]numbers=new int[3];
	numbers[0]=5;
	numbers[1]=10;
	numbers[2]=15;
	//numbers[3]=20;no error during compiailation but error during ruun time
	System.out.println(numbers[1]);
	//System.out.println(numbers[3]); array index out of bounds exception
	
	String[] a= new String[3];
	a[0]="hello";
	a[1]="hi";
	a[2]="bye";
	
	System.out.println(a[1]+" friends");
	
	
	}

}
