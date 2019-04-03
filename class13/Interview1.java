package com.class13;

public class Interview1 {

	public static void main(String[] args) {
		// write a program to swap 2 numbers without a temporary varible swap 2 strings
		// without a temporary varible?
		int birincisayi = 3;
		int ikincisayi = 2;

		birincisayi = birincisayi + ikincisayi;// 5
		ikincisayi = birincisayi - ikincisayi;// 3
	//	birinci sayi=birincisayi-ikincisayi;//2
		
		System.out.println("birincisayi=" + birincisayi);
		System.out.println("ikincisayi=" + ikincisayi);
System.out.println("------------");
		// Write a java program to find the second largest number in the array?
		// Maximum and minimum number in the array?
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 99 };
		int min = array[0];
		int max = array[0];
		int max2 = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max2 = max;
				max = array[i];

			}
			if (array[i] < min) {
				min = array[i];
			}

		}
		System.out.println(min);
		System.out.println(max);
		System.out.println(max2);
	System.out.println("-----------------");
	/*find out how many alpha characters present in a string 
	 * 
	 */
	String alphacharacter="i love so muchdgfs123e";
	System.out.println("this is a length--->"+alphacharacter.length());
	/*how to find out the part of the string from a string 
	 * what is the substring find number of words in string
	 * 
	 */
	

	        
	        String str1="We are good a tester and programmer!";
	        
	        String subString=str1.substring(7);
	        
	        System.out.println("substring 1 :"+subString);
	        
	        String subString2=str1.substring(7, 11);
	        
	        System.out.println("substring 1 :"+subString2);
	        
	        int splited=str1.split("").length;
	        
	        System.out.println("number of words: "+splited);

	System.out.println("---------------");
	//5 write a java program to reverse string ?reverse a string word by word
	        
	        
	        
	        String rev="good morning class";
	        String reverse="";
	        for(int i=rev.length();i>0;i--) {
	        	reverse+=rev.substring(i-1,i);
	        	
	        }
	System.out.println(reverse);
	
	
	
	
	
	
		
		
	}

}
