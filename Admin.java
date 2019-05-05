package ffxivEventManager;

public class Admin extends User {

	// an Admin will have a seperate adminID and password to allow for tracking of what they have done while using admin priveledges.
	// the Admin ID will be unique as it uses the uniqueUserID as part of it.
	private int accessLevel;
	private String adminID;
	private String adminPassword;
	private int adminPasswordLength = 5;
	
	public Admin(String fName, String sName, int aLevel) {
		super(fName, sName);
		this.accessLevel = aLevel;
		this.adminID = genAdminID();
		this.adminPassword = createRandomPassword(adminPasswordLength);
	}
	
	
	public int getAccessLevel() {
		return accessLevel;
	}
	
	public void setAccessLevel(int aLevel) {
		this.accessLevel = aLevel;
	}
	
	public String getAdminID() {
		return adminID;
	}
	
	
	public String genAdminID() {
		return this.adminID = this.getUniqueID() + "" + accessLevel;
	}

	public String getAdminPassword() {
		return adminPassword;
	}
	
	public void setAdminPassword(String aPWord) {
		this.adminPassword = aPWord;
	}
	
	public void showAdminDetails() {
		System.out.println("The admin details for this user are:" + 
							"\nAdminID: " + adminID + 
							"\nAdmin Password: " + adminPassword + 
							"\nUser Access Level: " + accessLevel);
	}
}
