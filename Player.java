package ffxivEventManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player extends User {
	
	//array list of characters which will later be filled with all the characters that this player owns.
	List<Character> characters = new ArrayList<Character>();
	
	//an array list of the games that the player owns
	List<String> games = new ArrayList<String>();
	
	// constructor for the player, takes all from the User parent class.
	public Player(String fName, String sName) {
		super(fName, sName);
		
	}

	// asks the user for an input to show which games they own and adds it to the arraylist of games.
	public void addGames() {
		
		// loops until the exit clause Q is typed by the user.
		do {
			System.out.print("Enter game to add (Type Q to finish): ");
			Scanner in = new Scanner(System.in);
			String gameName = in.nextLine();
			
			
			// if the value input is not Q then add the game to the list of games.
			if(!gameName.equals("Q")) {
				
			games.add(gameName);				
				
			// else breaks out of the loop.	
			} else {
				
				break; 
				
			}
			
		} while (1 !=0);

	}
	
	// shows all games in the arraylist of games owned.
	public void showGamesOwned() {
		
		System.out.println(games);
		
	}
	
	// adds characters to the list of characters that the user owns.
	public void addCharacters() {
		
		//used for the do while loop.
		int iterator = 1;
		
		String charName;
		String game;
		String cType;
		int level;
		String isMain;
		
		do {
			System.out.println("****** New Character *******");
			System.out.print("Enter Character name to add: ");
			Scanner in = new Scanner(System.in);
			charName = in.nextLine();
			
			
			// if the value input is not Q then add the game to the list of games.
			if(!charName.equals("Q")) {
				System.out.println("Please enter the game the character is based within: ");
				game = in.nextLine();
				
				System.out.println("Please enter the type of character: Healer, Tank, DPS");
				cType = in.nextLine();
				
				System.out.println("Please enter true or false, is this your main charater for this game?");
				String mainClass = in.nextLine();
				
				System.out.println("Please enter the current level of the character: ");
				level = in.nextInt();
				// added this to eliminate the issue with .nextInt where it only consumes the int and not the \n from pressing enter.
				in.nextLine();
				
				// takes the input from the question of if it is the main class and returns true/false depending on the input.
				if(mainClass.equals("true")) {
					isMain = "true";
				} else {
					isMain = "false";
				}
			
				// asks the user if they would like to add another character.
				String newChar = "";
				System.out.println("Do you want to add another character? Please enter yes or no.");
				newChar = in.nextLine();
				
				if(newChar.equals("no")) {
					iterator = 0;
				}
				
				// creates a character object with the details input from the user.
				Character character = new Character(charName, game, cType, level, isMain);
				
				// adds the character object to the listArray of characters
				characters.add(character);
				
			// else breaks out of the loop.	
			} else {
				
				break; 
				
			}
			
		} while (iterator !=0);
		
	}
	
	// show all the characters associated with the Player.
	public void showUserCharacters() {
		
	}
	
}
