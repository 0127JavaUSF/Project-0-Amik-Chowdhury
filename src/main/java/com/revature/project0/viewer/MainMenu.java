package com.revature.project0.viewer;

import com.revature.project0.util.InputUtil;

public class MainMenu implements Viewer{
//	@Override
	public void openMenu() {
		// TODO Auto-generated method stub
		System.out.println("Hello Valued Customer: Welcome to Amik's 'Already Too Much' ATM Service:");
		System.out.println("Instructions: Please enter 1 if you want to log-in: ");
		System.out.println("Instructions: Please enter 2 if you want to create an account: ");
		System.out.println("Instructions: Please enter 3 if you want to exit out of the program: ");
		
	}
//	@Override
	public Viewer pickOption() {
		int selected = InputUtil.getIntBetween(1, 3);
		// The user selected a choice - and that should be reusable
		switch(selected) {
			case 0: return null;
		//	case 1: return new; 
			case 2: return null;
			default: return null;
		}
	}
}
