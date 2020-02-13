  
package com.revature.project0.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.project0.models.UserAccount;
//import com.revature.models.House;
//import com.revature.models.Resident;
import com.revature.project0.util.DBConnectionUtil;

/**
 * DAO - Data Access Object
 * DAOs are a particular kind of abstraction that define an object whose responsibility
 * is the retrieval and management of data persistence. 
 *
 */
public class UserAccountDao {
	
	
	public UserAccount getAcc(String account_name, String account_password) {
		try(Connection connection = DBConnectionUtil.getConnected()) {
			String sql = "SELECT * FROM useraccount " + 
					"WHERE account_name = ? AND account_password = ?;";
			PreparedStatement statement = connection.prepareStatement(sql);
			// Set PreparedStatement parameters
			statement.setString(1, account_name);
			statement.setString(2, account_password);
			ResultSet result = statement.executeQuery();
			if(result.next()) {
				String accName = result.getString("account_name");
				String accPass = result.getString("account_password");
				int id = result.getInt("id");
				return new UserAccount(id, accName, accPass);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;		
	}
	
	private UserAccount extractAcc(ResultSet result) throws SQLException {
		int id = result.getInt("id");
		String accName = result.getString("account_name");
		String accPass = result.getString("account_password");
		return new UserAccount(id, accName, accPass);
	}
	public UserAccount createAcc(String uname, String password) {
		try(Connection connection = DBConnectionUtil.getConnected()) {
			String sql = "INSERT INTO userAccount (account_name, account_password) " +
					" VALUES (?, ?) RETURNING *";
			PreparedStatement statement = connection.prepareStatement(sql);
			
			statement.setString(1, uname);
			statement.setString(2, password);
			
			ResultSet result = statement.executeQuery();
			
			if(result.next()) {
				return extractAcc(result);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
