package com.revature.project0.viewer;

import com.revature.project0.daos.UserAccountDao;
import com.revature.project0.models.UserAccount;
import com.revature.project0.util.InputUtil;

public class LoginViwer implements Viewer {
UserAccountDao userAccDao =  new UserAccountDao();
UserAccount usrAcc = null;
	@Override
	public void openMenu() {
		System.out.println("Press 1 to confirm you want to login: \n"
				+ "Press 0 to return to main menu: \n "+
	"                   -o-   \r\n" + 
	"                   `//   \r\n" + 
	"                   `:+   \r\n" + 
	"                  `.-+/  \r\n" + 
	"                 ``.:/+. \r\n" + 
	"                ```.://` \r\n" + 
	"               `...-///` \r\n" + 
	"             `....-///-  \r\n" + 
	"           `....-:///:`  \r\n" + 
	"        `....--:///:-`   \r\n" + 
	"     `...--://////:.     \r\n" + 
	" ``..--://++++//:.`      \r\n" + 
	":y+++++++++//:.`         \r\n" + 
	"   `.....``              "
	 );
		// TODO Auto-generated method stub
		
	}

	@Override
	public Viewer pickOption() {
		// TODO Auto-generated method stub
		int selected = InputUtil.getIntBetween(0, 1);
		switch(selected) {
		case 1: 
			loginUser();
			if(usrAcc == null){
				return new MainMenu();
			}
			else {
				return new UserProfileView(this.usrAcc);
			}
		case 0:
			return new MainMenu(); 
		
		}
		// By default null to exit.
		return null;
	}


	private void loginUser() {
		// TODO Auto-generated method stub
		System.out.println("Enter username: ");
		String userName = InputUtil.getNextString();
		System.out.println("Enter password: ");
		String userPassword = InputUtil.getNextString();
		
		this.usrAcc = userAccDao.getAcc(userName, userPassword);
			
		
		
	}

}
