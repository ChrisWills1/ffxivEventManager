package ffxivEventManager;

public class Character {

	// all variables used to create and store information about a character
	private String charName;
	private String whichGame;
	private String classType;
	private String currentServer;
	private boolean isActive = true;
	private int currentLevel;
	private boolean isMainChar = true;
	// alt class type is not always used as this is only for characters with multiple class types. (E.g. can be tank or DPS)
	private String altClassType;
	
	// constructor for a character, takes a name, game, class type, current server, level and if it is the main. Assumed to be active on create.
	public Character(String cName, String game, String cType, int cLevel, boolean mainChar) {
		
		this.charName = cName;
		this.whichGame = game;
		this.classType = cType;
		this.currentLevel = cLevel;
		
		if(mainChar == true) {
			this.isMainChar = true;
		} else if(mainChar == false) {
			this.isMainChar = false;
		}
		
		
		System.out.println("Character created successfully");
		showCharDetails();
		
	}
	
	// method to show details about the character
	public void showCharDetails() {
		System.out.println("Character Details are: " + 
							"\nCharacter Name: " + charName +
							"\nType of Class: " + classType + 
							"\nCurrent Level: " + currentLevel +
							"\nCurrent Server: " + currentServer +
							"\nIs this the main character?  " + isMainChar +
							"\nIs the character active? " + isActive + 
							"\nGame character is from: " + whichGame);
	}
	
	
	//getter and setter methods for the class
	public void setCharName(String cName) {
		this.charName = cName;
	}
	
	public String getCharName() {
		return charName;
	}
	
	public void setGame(String game) {
		this.whichGame = game;
	}
	
	public String getGame() {
		return whichGame;
	}
	
	public void setClassType(String cType) {
		this.classType = cType;
	}
	
	public String getClassType() {
		return classType;
	}
	
	public void setAltClassType(String altClass) {
		this.altClassType = altClass;
	}
	
	public String getAltClassType() {
		return altClassType;
	}
	
	public void setCurrentServer(String cServer) {
		this.currentServer = cServer;
	}
	
	public String getCurrentServer() {
		return currentServer;
	}
	
	public void setActive(boolean active) {
		this.isActive = active;
	}
	
	public boolean getActiveStatus() {
		return isActive;
	}
	
	public void setCurrentLevel(int newLevel) {
		this.currentLevel = newLevel;
	}
	
	public int getCurrentLevel() {
		return currentLevel;
	}
	
	public void setMain(boolean nMain) {
		this.isMainChar = nMain;
	}
	
	public boolean getIsMain() {
		return isMainChar;
	}
}
