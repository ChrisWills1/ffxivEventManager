package ffxivEventManager;

public class FfxivEventManager {

	public static void main(String[] args) {
		
		Admin user = new Admin("chris", "wills", 2);
		user.showUserInfo();
		user.showAdminDetails();
		
		System.out.println("************************");
		
		Player player1 = new Player("Chris", "Wills");
		player1.addGames();
		player1.showGamesOwned();
		System.out.println("**************************");
		player1.addCharacters();
		System.out.println("**************************");
		player1.showUserCharacters();
		
		//Character c1 = new Character("Sel Caster", "FFXIV", "Healer", "Phoenix", 80, true);
		//c1.showCharDetails();
		
	}

}
