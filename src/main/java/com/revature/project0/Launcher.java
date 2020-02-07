package com.revature.project0;

import com.revature.project0.viewer.MainMenu;
import com.revature.project0.viewer.Viewer;

 
public class Launcher {
public static void main(String[] args) {
	Viewer view = new MainMenu();
	
	while(view != null) {
		view.openMenu();
		view = view.pickOption();
	}
	System.out.println("Exiting...");
	}

}
