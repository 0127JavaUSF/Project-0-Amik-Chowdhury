package com.revature.project0.util;

import java.util.Scanner;
// This utility class will be used primarily to retrieve user input.

public class InputUtil {
	private static Scanner scan = new Scanner(System.in); // Creation of a scanner object w/
	// user input passed in as an argument
	
	public static int getIntBetween(int min, int max) {
		int selected = 0;
		outer: do {
			System.out.println("Instructions: User must enter in a number between " + min + 
					" and " + max);
			while(!scan.hasNextInt()) {
				scan.nextLine();
				continue outer;
				
			}
			selected = scan.nextInt();
			scan.nextLine();
		} while(selected < min || selected > max);
		
		return selected;
	} 
	public static String getNextString() {
		return scan.nextLine();
	}
	
}
