package com.class15;

public class Car {

	String make;
	String model;
	String colur;
	int door, wheels;

	public static void main(String[] args) {
//classname varibleName =new className ();
//1 object
		Car car1 = new Car();
		car1.make = "honda";
		car1.model = "civic";
		car1.colur = "white";
		car1.door = 4;
		car1.wheels = 4;
		System.out.println("Car " + car1.make + " has " + car1.wheels + " wheels");
		// define behaviour
		car1.drive();
		car1.reverse();
		car1.stop();
        car1.udonusu();
		// my car is tesla my car blue tesla
		// System.out.println("my car is "+car2.colur+" "+car2.make);
		// 2 object
		Car car2 = new Car();
		car2.make = "tesla";
		car2.model = "x";
		car2.colur = "blue";
		car2.door = 4;
		car2.wheels = 4;
		System.out.println("my car is " + car2.colur + " " + car2.make);
	}

	void drive() {
		System.out.println("car can drive");
	}

	void reverse() {
		System.out.println("car can reverse");
	}

	void stop() {
		System.out.println("car can stop");
	}
void udonusu() {
	System.out.println("can car u donusu");
}
}

