package com.revature.project0.viewer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.project0.models.UserAccount;
import com.revature.project0.util.DBConnectionUtil;
import com.revature.project0.util.InputUtil;

public class UserProfileView implements Viewer {
private UserAccount userAcc;

UserProfileView(UserAccount useracc){
	this.userAcc = userAcc;
	
}
	@Override
	public void openMenu() { // Gives menu to view User's bank account options.
		// TODO Auto-generated method stub
		System.out.println("1. Create Bank Account");
		System.out.println("2. View Bank Accounts");
		System.out.println("3. Logout and return to main menu");
	}

	@Override
	public Viewer pickOption() { 
		// TODO Auto-generated method stub
		int selected = InputUtil.getIntBetween(1, 3);
		switch(selected){
			case 1: createBankAccount(); return this;
//			case 2: viewBankAccounts(); return this;
			case 3: return new MainMenu();
		}
		return null;
	}
	private void createBankAccount() {
		//local variables for user inputs on bank account specs
		System.out.println("Enter 1 for checking, 2 for savings account");
		 
		int checkOrSave = InputUtil.getIntBetween(1, 2);
		
		String typeOfAcc = checkOrSave == 1 ? "CHECKING": "SAVINGS";
		
		System.out.println("Enter a name for the bank account");
		
		String bAccName = InputUtil.getNextString();
	
		//local variables end
		try(Connection connection = DBConnectionUtil.getConnected()){
			
			connection.setAutoCommit(false);
			String sql =  
					"INSERT INTO public.bank_accounts " + 
					"(bank_acc_name, acc_type) " + 
					" VALUES(?, ?) returning *";
			
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(bAccName, x);
			ResultSet rs = ps.executeQuery();
			
			int newBankId = 0;
			while(rs.next()) {
				newBankId = rs.getInt("id");
				
			}
				
			
			String sql2 =  
					"INSERT INTO bank_join_table " + 
					"(bank_accounts_id, useraccount_id) " + 
					" VALUES(?, ?) returning *";
			
			PreparedStatement ps2 = connection.prepareStatement(sql2);
			ps2.setInt(1, newBankId);
			ps2.setInt(2, this.userAcc.getId());
			ResultSet rs2 = ps2.executeQuery();
								
			connection.commit();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Bank Account created for User: " + this.userAcc.getAccName());
	}
}
