package com.class12;

public class StringManupulation3 {

	public static void main(String[] args) {
//charAt() -->returns a character at specified index
		String str = "students";
		char character = str.charAt(0);
		System.out.println(character);

		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i) + " ");
		}

		System.out.println("-----indexOf----------");

		String str1 = "Sunday";
		int index = str1.indexOf("u");
		System.out.println(index);

		String str2 = "Syntax Tec";
		System.out.println(str2.indexOf("Syntax"));
		System.out.println(str2.indexOf("w"));

		// substing(0-->gives another string from your corrent string

		System.out.println("----------substring------------");

		String str3 = "Today is Sunday Java class";
		String newString = str3.substring(8);
		System.out.println(newString);

		System.out.println(str3.subSequence(0, 5));// istedigin araligi yazarsan sana o araliktaki
		// yaziyi veriyor
		System.out.println(str3.substring(9, 20));
		System.out.println(str3.substring(21));
		System.out.println(str3.substring(21, 26));
	}

}
