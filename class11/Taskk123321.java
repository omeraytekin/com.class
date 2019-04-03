package com.class11;

public class Taskk123321 {

	public static void main(String[] args) {
		// creat an array of cars:amercan cars,german cars,korean cars,italian cars,
		// then retrieve all values from that array

		String[][] cars = { { "GMC", "FORD" }, { "BMW", "OPEL" }, { "HYUNDAI", "KIA" },
				{ "FERRRAI", "FIAT", "ALFA ROMEO" }

		};
		for (int i = 0; i < cars.length; i++) {

			for (int j = 0; j < cars[i].length; j++) {
				System.out.print(cars[i][j] + " ");
			}
			System.out.println();
		}

	}

}
