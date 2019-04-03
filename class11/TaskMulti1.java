package com.class11;

public class TaskMulti1 {

	public static void main(String[] args) {
		// creat a @d array where you will store the following values :mr,mrs,ms,miss
		//and smith,jordan , jackson, obama after storing values print 
		//mrs simth, mr obama ms jackson miss jordan
		String [][]names={
			{"mr","mrs","ms","miss"},
			{"smith","jordan","jackson","obama"},
		};
		System.out.println(names[0][1]+" "+names[1][0]);
		System.out.println(names[0][0]+" "+names[1][3]);
		System.out.println(names[0][2]+" "+names[1][2]);
		System.out.println(names[0][3]+" "+names[1][1]);

	}

}
