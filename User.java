package ffxivEventManager;

public class User {

	private String forename;
	private String surname;
	private String addressLine1;
	private String addressLine2;
	private String townCity;
	private String postCode;
	private String country;
	private String mobileNum;
	private String facebook;
	private String instagram;
	private String discord;
	private String whatsapp;
	private String uniqueUserID;
	private String password;
	static int index = 0;
	private int defaultPasswordLength = 10;
	
	// constructor to create a User only required information is a name at the start
	public User(String fName, String sName) {
		this.forename = fName;
		this.surname = sName;
		
		this.password = createRandomPassword(defaultPasswordLength);
		this.uniqueUserID = createUniqueID(index);
		
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
		
		String acceptedChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ|.,/;'#[]{}:@~<>?!£$%^&)(_+";
		
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
	public void setPassword(String pWord) {
		this.password = pWord;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getForename() {
		return forename;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public String getUniqueID() {
		return uniqueUserID;
	}
		
	public void setAddress1(String add1) {
		this.addressLine1 = add1;
	}
	
	public String getAddress1() {
		return addressLine1;	
	}
	
	public void setAddress2(String add2) {
		this.addressLine2 = add2;
	}
	
	public String getAddress2() {
		return addressLine2;
	}
	
	public void setTownCity(String twnCty) {
		this.townCity = twnCty;
	}
	
	public String getTownCity() {
		return townCity;
	}
	
	public void setPostCode(String pCode) {
		this.postCode = pCode;
	}
	
	public String getPostCode() {
		return postCode;
	}
	
	public void setCountry(String ctry) {
		this.country = ctry;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setMobileNum(String mobNum) {
		this.mobileNum = mobNum;
	}
	
	public String getMobileNum() {
		return mobileNum;
	}
	
	public void setFacebook(String fBook) {
		this.facebook = fBook;
	}
	
	public String getFacebook() {
		return facebook;
	}
	
	public void setInstagram(String igram) {
		this.instagram = igram;
	}
	
	public String getInstagram() {
		return instagram;
	}
	
	public void setDiscord(String dcord) {
		this.discord = dcord;
	}
	
	public String getDiscord() {
		return discord;
	}
	
	public void setWhatsapp(String wApp) {
		this.whatsapp = wApp;
	}
	
	public String getWhatsapp() {
		return whatsapp;
	}
	
	// show user information
	public void showUserInfo() {
		System.out.println("The Details for the current user are:" + 
							"\nName is: " + forename + " " + surname +
							"\nUnique User ID: " + uniqueUserID + 
							"\nPassword: " + password + 
							"\nAddress Line 1: " + addressLine1 + 
							"\nAddress Line 2: " + addressLine2 +
							"\nTown/City: " + townCity + 
							"\nPostcode: " + postCode + 
							"\nCountry: " + country +
							"\nMobile Number: " + mobileNum + 
							"\nFacebook: " + facebook + 
							"\nInstagram: " + instagram +
							"\nDiscord: " + discord + 
							"\nWhatsapp: " + whatsapp);
		
	}
	
}
