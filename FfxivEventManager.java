package ffxivEventManager;

public class FfxivEventManager {

	public static void main(String[] args) {
		
		User user = new User("chris", "wills");
		user.uniqueUserID = user.createUniqueID(user.index);
		user.password = user.createRandomPassword(user.defaultPasswordLength);
		System.out.println(user.uniqueUserID);
		System.out.println(user.password);
	}

}
