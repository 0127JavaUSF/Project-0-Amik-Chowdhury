package com.revature.project0.viewer;

import java.sql.Connection;
import java.sql.SQLException;

import com.revature.project0.util.DBConnectionUtil;
import com.revature.project0.util.InputUtil;

public class MainMenu implements Viewer{
	@Override
	public void openMenu() {
		// TODO Auto-generated method stub
		
		System.out.println("---------------------------\n| Hello Valued Customer! "
				+ " |\n| Welcome to Donkey Kong's| \n| 'Banana Stash Bank!'    |\n"
				+ "---------------------------");
		System.out.print(
		"\n|MENU OPTIONS|\n"+
		"1. Account Menu\n" + 
		"0. Exit out of the program. \n" +
		""
		);
		
	}
	@Override
	public Viewer pickOption() {
		int selected = InputUtil.getIntBetween(0, 1);
		try(Connection connection = DBConnectionUtil.getConnected()){ // try used for security reasons.
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		// The user selected a choice - and that should be reusable
		switch(selected) {
			case 0: return null;
			case 1: return new AccViewer();  // entering 1 will cause user to go to the account viewer method.
		   default: return null;
		}
	}
}
