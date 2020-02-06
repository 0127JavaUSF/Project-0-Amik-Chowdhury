package com.revature.project0;
import java.util.*;
import com.revature.project0.prompts.UserPrompts;

 enum userStates{
	MainMenu{
	}, 
	LoginPage{
		
	},
	CreateAccount{
		
	},
	Exit{
		
	}
}
 
public class Launcher {
public static userStates myUserState;
public Launcher(userStates myUserState) { // this is a lucking constructor
	this.myUserState = myUserState;
		switch(myUserState){
			case MainMenu:
				UserPrompts.MainMenuPrompt();
				break;
			case LoginPage:
				break;
			case CreateAccount:
				break;
			case Exit:			
				break;		
		}
	
}

	
	
	public static void main(String[] args) {
		Launcher myLauncher = new Launcher(myUserState.MainMenu);		
	}

}
