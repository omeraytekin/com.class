package com.class14;

public class IQ1 {

	public static void main(String[] args) {
		//
	
	String str1="hello";//5
	String str2="world";//5
	str1=str1+str2;//helloworld-->10
	str2=str1.substring(0,str1.length()-str2.length());//hello
	str1=str1.substring(str2.length());	
	
	System.out.println("the value of str1="+str1+" value of str2="+str2);
	
	}

}
