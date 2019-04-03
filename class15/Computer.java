package com.class15;

public class Computer {
	String os,brand;
	
	boolean mouse, keybord;
	int ram, screen;
public static void main(String[]args) {
	Computer comp1=new Computer();
	comp1.os="windows";
	comp1.mouse=true;
	comp1.keybord=true;
	comp1.screen=2;
	comp1.ram=8;
	comp1.brand="lenova";
	
	comp1.watchMovie();
	comp1.doJava();
	comp1.playMusic();
	
	
	Computer comp2=new Computer();
	comp2.mouse=false;
	comp2.keybord=false;
	comp2.screen =4;
	comp2.ram=5;
	comp2.os="ios";
	comp2.brand="apple";
	
	
	comp2.watchMovie();
	
	
}
	void watchMovie() {
		System.out.println("we can watch movie on a " +brand+" computer");
	}

	void doJava() {
		System.out.println("we can do Java coding on a computer");
	}

	void playMusic() {
		System.out.println("we can listen to music on a computer");
	}
}
