package com.revature.project0.util;

import java.util.Scanner;
// This utility class will be used primarily to retrieve user input.

public class InputUtil {
	private static Scanner scan = new Scanner(System.in); // Creation of a scanner object w/
	// user input passed in as an argument
	
	
	// asks user to put in a number between a range of numbers. 
	public static int getIntBetween(int min, int max) {
		int selected = 0;
		outer: do {
			System.out.println("\nInstructions:\nSelect an option from " + min + 
					" to " + max + "!\n" + "-------------------------------------------------\n"+ 
					"-------------------------------------------------");
			while(!scan.hasNextInt()) { // keep asking user for input, if scanner detects nothing.
				scan.nextLine();
				continue outer;
			}
			selected = scan.nextInt(); // place user input into selected variable.
			scan.nextLine();
		} while(selected < min || selected > max);
		return selected; //return if condition not met.
	} 
	public static String getNextString() {
		return scan.nextLine(); //return if valid input.
	}
	
}
