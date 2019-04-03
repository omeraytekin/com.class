package com.class11;

public class Task123 {

	public static void main(String[] args) {
		//Creat an array of countries ;north america countries,south america countries ,eorupe 
		//countries,asian countires,african countries then print all values from that array
		
		String[][]contry= {
				{"usa","canada"},
				{"mexico","uruguay"},
				{"germany","holland"},
				{"china","japan"},
				{"nigerya","nepal"},
		};
		for(int i=0;i<contry.length;i++) {
			for(int w=0;w<contry[i].length;w++) {
			System.out.print(contry[i][w]+" ");	
			}
		System.out.println();
		}
		

	}

}
