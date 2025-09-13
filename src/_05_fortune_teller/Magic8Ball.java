package _05_fortune_teller;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
	public static void main(String[] args) {
	// 1. Make a main method that includes all the steps below….
	
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	int ballNumber = new Random().nextInt(4);
	// 3. Print out this variable
	System.out.println(ballNumber);
	// 4. Get the user to enter a question for the 8 ball
	JOptionPane.showInputDialog("Write any yes or no question to me");
	// 5. If the random number is 0
	if(ballNumber == 0) {
		System.out.println("Yes");
	}
	// -- tell the user "Yes"

	// 6. If the random number is 1

	// -- tell the user "No"
	if(ballNumber == 1) {
		System.out.println("No");
	}
	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"
	if(ballNumber == 2) {
		System.out.println("Maybe you should ask Google?");
	}

	// 8. If the random number is 3
	
	// -- write your own answer
	if(ballNumber == 3) {
		System.out.println("Write your own answer");
		JOptionPane.showInputDialog("Down here");
	}
}
}
