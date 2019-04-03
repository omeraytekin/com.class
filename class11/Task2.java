package com.class11;

public class Task2 {

	public static void main(String[] args) {
//Create an array of countries. While retrieving all values
// from an array print capital for each country.
// (use 2 different loops).

		String[] countries = { "usa", "germany", "england", "turkey" };
		for (int i = 0; i < countries.length; i++) {
			if (countries[i].equals("usa")) {
				System.out.println("WASHINGTON");

			} else if (countries[i].equals("germany")) {
				System.out.println("berlin");
			} else if (countries[i].equals("england")) {
				System.out.println("london");
			} else if (countries[i].equals("turkey")) {
				System.out.println("ankara");
			}
		}

	}

}

//String[] contries = { "USA", "Afghanistan", "Kazakhstan", "Ukraine" };
for (String country : contries) {
    switch (country) {
    case "USA":
        System.out.println("Washington DC");
        break;
    case "Afghanistan":
        System.out.println("Kabul");
        break;
    case "Kazakhstan":
        System.out.println("Astana");
        break;
    case "Ukraine":
        System.out.println("Kiev");
        break;
    }







