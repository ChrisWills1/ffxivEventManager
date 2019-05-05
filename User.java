package ffxivEventManager;

public class User {

	String forename;
	String surname;
	String addressLine1;
	String addressLine2;
	String townCity;
	String postCode;
	String mobileNum;
	String facebook;
	String instagram;
	String discord;
	String whatsapp;
	String uniqueUserID;
	String password;
	static int index = 0;
	int defaultPasswordLength = 10;
	
	
	// constructor to create a User only required information is a name at the start
	public User(String fName, String sName) {
		this.forename = fName;
		this.surname = sName;
		
	}
	
	
	
	// create a unique ID for the user the first number will always be auto incremented to provide exclusivity. 
	// a random 3 digit number is then added to the end of the ID. This unique user ID will be used as the Username to log in.
	public String createUniqueID(int index) {
		
		index++;
		
		int randomNum;
		// creates a random 
		randomNum = (int)(Math.random() * Math.pow(10, 3));
		
		
		return index + "" + randomNum;
	}
	
	// create a random password from a string of accepted characters
	public String createRandomPassword(int pWordLength) {
		
		String acceptedChars = "abcdefghijklmnopqrstuvwxyz.,/;'#[]{}:@~<>?!£$%^&)(_+";
		
		char[] password = new char[pWordLength];
		
		for(int i=0; i<pWordLength; i++) {
			
			// cast as an integer. Times the random number by the length of the password set, this will always make
			// the random value between 1 and the number provided by the length variable.
			int rand = (int) (Math.random() * acceptedChars.length());
			
			// takes the character at the random number in the password set and adds this to the password array.
			password[i] = acceptedChars.charAt(rand);
			
		}
		
		// changes the password array into a string.
		return new String(password);
		
	}
	
	// change password
	public void setPassword() {
		
	}
	
	
	
	public void setAddress1() {
		
	}
	
	public String getAddress1() {
		return addressLine1;	
	}
	
	public void setAddress2() {
		
	}
	
	public String getAddress2() {
		return addressLine2;
	}
	
	public void setTownCity() {
		
	}
	
	public String getTownCity() {
		return townCity;
	}
	
	public void setPostCode() {
		
	}
	
	public String getPostCode() {
		return postCode;
	}
	
	public void setMobileNum() {
		
	}
	
	public String getMobileNum() {
		return mobileNum;
	}
	
	public void setFacebook() {
		
	}
	
	public String getFacebook() {
		return facebook;
	}
	
	public void setInstagram() {
		
	}
	
	public String getInstagram() {
		return instagram;
	}
	
	public void setDiscord() {
		
	}
	
	public String getDiscord() {
		return discord;
	}
	
	public void setWhatsapp() {
		
	}
	
	public String getWhatsapp() {
		return whatsapp;
	}
	
	// show user information
	public void showUserInfo() {
		
	}
	
}
