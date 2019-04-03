package com.class15;

public class TaskPhone {
	String brand, color, size;

	boolean screen, earphone, camera;

	public static void main(String[]args) {
		
	
	TaskPhone phone1 = new TaskPhone();
    phone1.color ="white";
    phone1.brand="apple";
    phone1.size="plus size";
phone1.screen=true;
phone1.earphone=true;
phone1.camera=true;


phone1.playGames();
phone1.callSomeone();
phone1.takePic();


TaskPhone phone2=new TaskPhone();


phone2.color="black";
phone2.brand="android";
phone2.size="regular size";
phone2.screen=true;
phone2.earphone=true;
phone2.camera=true;


phone2.playGames();
phone2.callSomeone();
phone2.takePic();


	}

	private void takePic() {
		System.out.println("we can take a pic on phone");
	}

	private void callSomeone() {
		System.out.println("we can call some one");
		
	}

	private void playGames() {
		System.out.println("we can play games "+size +" "+brand);
		
	}	
	
}
