package com.class12;

public class StringManupulation2 {

	public static void main(String[] args) {
		// contains(-->checks for spesific value in the string
		// if values
		// TODO Auto-generated method stub//eger mavi yazilarin seklinin ve sayisinin
		// disinda
		// baska sey yazarsan false olarak cikiyor

		String str = "Good morning students";
		boolean contains = str.contains("morning");
		System.out.println(contains);

		String present = "welcome,Asel";
		String needValue = "welcome";
		boolean flag = present.contains(needValue);
		System.out.println(flag);

		boolean flag1 = present.toLowerCase().contains(needValue);
		System.out.println(flag1);

		// startswith(),endwith-->will return true if staring starts/endswith
		// else-->false
		System.out.println("---------startwith & endwiht----------------");

		String str1 = "syntax";

		boolean starts1 = str1.startsWith("s");
		System.out.println(starts1);
		System.out.println(str1.endsWith("y"));

		// isEmpty() if length of a string is=0-->string is empty else-->it is no
		System.out.println("--------isEmpty()---------");

		String str2 = "";
		boolean isEmpty = str2.isEmpty();
		System.out.println(isEmpty);

		// will concatenate 1 string to the end of another
		System.out.println("------concat()----------");

		String str3 = "Hello ";
		String str4 = "Ali ";
		System.out.println(str3 + str4);
		System.out.println(str3.concat(str4));
		
		System.out.println("______--______");
		String expected="you may quality for a multi-polciy discount";
		String actual="  you may quality for a multi-polciy discount";
		
		
		actual=actual.trim();//bu kodu kullandigin zaman yazidaki bastaki ve sondaki 
		//bosluklari yok sayiyor ve 
		//her zaman true veriyor.Sadece bosluk(space)kesiyor 
		System.out.println(expected.equals(actual));
		
		
		
		
		

	}

}
