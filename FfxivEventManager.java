package ffxivEventManager;

public class FfxivEventManager {

	public static void main(String[] args) {
		
		Admin user = new Admin("chris", "wills", 2);
		user.showUserInfo();
		user.showAdminDetails();
		
		//Character c1 = new Character("Sel Caster", "FFXIV", "Healer", "Phoenix", 80, true);
		//c1.showCharDetails();
		
	}

}
