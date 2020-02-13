package com.revature.project0.viewer;

import java.util.List;

import com.revature.project0.daos.UserAccountDao;
import com.revature.project0.models.UserAccount;
import com.revature.project0.util.InputUtil;



public class AccViewer implements Viewer{
	UserAccountDao accDao = new UserAccountDao();
	
	//@Override 
	public void openMenu() { // Account menu
		// TODO Auto-generated method stub
		System.out.println("\n1. Log in to your Account ");
		System.out.println("2. Create an Account ");
		
	}
	//@Override
	public Viewer pickOption() { // pick whether you want to log in or create account
		// TODO Auto-generated method stub
		int selected = InputUtil.getIntBetween(0, 2);
		switch(selected) {
		case 1: return new LoginViwer();
		case 2: createAcc(); return this;
			
		}
		return null;
	}

	// This method is used to create an account.
	private void createAcc() { 
		System.out.println("Please enter your desired username: ");
		String accName = InputUtil.getNextString(); //stores user input into var.
		
		System.out.println("Please enter your desired password: ");
		String accPass = InputUtil.getNextString(); //stores user input into var.
		
		UserAccount newAcc = accDao.createAcc(accName, accPass); // pass info and make use of dao.
		
		System.out.println("REMEMBER THIS INFO:\n" + newAcc +"\n");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
