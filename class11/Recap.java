package com.class11;

public class Recap {

	public static void main(String[] args) {
		// lets creat an array of names thats will hold 5 elemnets and retrieve all
		// values from it

		String[] names = new String[7];

		names[0] = "asel";
		names[1] = "awet";
		names[2] = "arif";
		names[3] = "weqas";
		names[4] = "dzmitri";
		names[5] = "shiva"; // will get an runtime exception when trying to access it
		names[6] = "sandesh";
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		// 2. creat an array using array luteral

		String[] studentNames = { "shaban", "bilal", "mehmet", "zaki", "frank" };

		for (int i = 0; i <= studentNames.length - 1; i++) {
			System.out.println(studentNames[i]);
		}

		// retrieve values using: advanced for loop ,for each loop ,enhanced for loop

		for (String student : studentNames) {
			System.out.println(student);
		}

	}

}
