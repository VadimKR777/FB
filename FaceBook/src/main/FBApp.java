package main;

public class FBApp {

	public static void main(String[] args) {
		User user1 = new User("user1");
		
//-------------------------------------------------
		User close_user = new User("Dorin");
		User common_user = new User("Max");
	
		user1.addCloseFriend(close_user);
		user1.addCommonFriend(common_user);
		
		
		System.out.println(user1);
		
		
		
		user1.removeCloseFriend(close_user);
		System.out.println(user1);
		
		user1.removeCommonFriend(common_user);
		System.out.println(user1);
		
		System.out.println();
		System.out.println("Total registered accounts: " + User.total);
	
	
	}
	
     
}
