package com.class12;

public class ForEachIn2D {

	public static void main(String[] args) {
		// Creat a grocery list :fruits{}
		// vegitables{}
		// dairy{}
		// retrieve all values using 2 diffrent loops

		String[][] fruits = { { "orange", "watermelan", "apple" }, { "carrot", "tomato", "mushroom" },
				{ "mercimek", "fasulye", "makarna" } };
		for (int i = 0; i < fruits.length; i++) {
			for (int k = 0; k < fruits[i].length; k++) {
				System.out.println(fruits[i][k] + " ");
			}
		}
		System.out.println("------for each loop-----");

		for (String[] items : fruits) {
			for (String loop : items) {

				System.out.print(loop + " ");
			}
			System.out.println();

		}

	}

}
