package ffxivEventManager;

public class FfxivEventManager {

	public static void main(String[] args) {
		
		User user = new User("chris", "wills");
		user.showUserInfo();
		
		Character c1 = new Character("Sel Caster", "FFXIV", "Healer", "Phoenix", 80, true);
		c1.showCharDetails();
		
	}

}
