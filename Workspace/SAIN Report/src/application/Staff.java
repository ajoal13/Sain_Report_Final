package application;

public class Staff {

	String userId, password, name;
	int staffFlag;
	
	
	
	
	
	
	
	
	public Staff() {
		super();
	}



	public Staff(String userId, String password, String name, int staffFlag) {
		super();
		this.userId = userId;
		this.password = password;
		this.name = name;
		this.staffFlag = staffFlag;
	}

	
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStaffFlag() {
		return staffFlag;
	}

	public void setStaffFlag(int staffFlag) {
		this.staffFlag = staffFlag;
	}
	
	
	
	
	
	
	
	
	
	
}
