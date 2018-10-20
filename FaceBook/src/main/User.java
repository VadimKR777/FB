package main;

public class User {
	 static int total = 0;
	 public String name;
	 int friends_count;
	
	 
	 User close_friend;
	 User common_friend;
	 
	 public User (String name) {
		 this.name = name;
		 this.friends_count = 0;
		 total++;
	 }
	 

	 public void addCloseFriend(User cf) {
		this.close_friend = cf; 
		this.friends_count ++; 
		 
	 }
	 
	 public void addCommonFriend(User cf) {
		this.common_friend = cf; 
		this.friends_count ++; 	 
	 }
	 
	 public  void removeCommonFriend(User cf) {
		 this.common_friend = cf;
		 this.common_friend = null;
		 this.friends_count --;  
	 }
	 
	 public  void removeCloseFriend(User cf) {
			this.close_friend = cf;
			this.close_friend = null;
			this.friends_count --;  
	 }

	 public String toString() {
		return "[name=" + this.name + ", friends_count=" +  this.friends_count + "]\n\t" +  
	      (friends_count != 0 ? ("My Friend are:\n\t\t\t\t\t\t" + (this.common_friend == null ? " ": this.common_friend) + 
	    		 "\n\t\t\t\t\t\t" +  (this.close_friend == null ? " ": this.close_friend  )) : " ");
	 }
	 
	

}
