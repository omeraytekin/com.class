package com.class5;

import java.util.Scanner;

public class LogicalPractice2 {

	public static void main(String[] args) {
	/*
		// Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules:
	//if the average score >=90 =>grade=A
    //	if the average score >= 70 and <90 => grade=B
    //if the average score>=50 and <70 =>grade=C
	//if the average score<50 =>grade=F
*/
	int quiz,midTerm,finalScores;
	
	Scanner input=new Scanner(System.in);
	System.out.println("please entere your score quiz");
	quiz=input.nextInt();
	System.out.println("please enter your midTerm");
	midTerm=input.nextInt();
	System.out.println("please enter finalscores");
	finalScores=input.nextInt();
	int totalscores=quiz/3+midTerm/3+finalScores/3;
	System.out.println("you are total score "+totalscores);
	
	
	if(totalscores>=90) {
		
	System.out.println("grade A");	
	}else if (totalscores>=70 && totalscores<90) {
	
	System.out.println("grade B");	
	}else if (totalscores>=50 && totalscores<70) {
	System.out.println("grade C");
	} else if(totalscores<50) {
	System.out.println("grade F");	
	}
	
	
	
	
	
	
	}
	

}
