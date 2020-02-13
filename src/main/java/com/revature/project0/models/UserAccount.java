package com.revature.project0.models;

public class UserAccount {
	private int id;
	private String accName;
	private String accPass;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getAccPass() {
		return accPass;
	}

	public void setAccPass(String accPass) {
		this.accPass = accPass;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accPass == null) ? 0 : accPass.hashCode());
		result = prime * result + ((accName == null) ? 0 : accName.hashCode());
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserAccount other = (UserAccount) obj;
		if (accPass == null) {
			if (other.accPass != null)
				return false;
		} else if (!accPass.equals(other.accPass))
			return false;
		if (accName == null) {
			if (other.accName != null)
				return false;
		} else if (!accName.equals(other.accName))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", Account Name=" + accName + ", Account Password=" + accPass + "]";
		//return "Acc [accName=" + accName + "accPass=" + accPass + "]";
	}

	public UserAccount(int id, String accName, String accPass) {
	//public Acc(String accName, String accPass) {
		super();
		this.id = id;
		this.accName = accName;
		this.accPass = accPass;
	}

	public UserAccount() {
		super();
	}

}