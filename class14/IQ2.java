package com.class14;

public class IQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 122, 65, 343, 76, 11, 0, -6,340 };

		int min = arr[0];
		int secondlargest = arr[0];
		int largest = arr[0];

		for (int a : arr) {
			if (a > largest) {
				largest = a;
			}
			if (a < min) {
				min = a;
			}
		}
		for (int a : arr) {
			if (a > secondlargest && a < largest) {
				secondlargest = a;
			}
		}

		System.out.println("min=" + min);
		System.out.println("second largest=" + secondlargest);
		System.out.println("largest=" + largest);
	}

}
