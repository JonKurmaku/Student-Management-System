package database;


public class Admin {
	
	
	public static String username = "Admin";
	public static String password = "Password";
	public static String adminID = "000001";
	

	public static boolean isAdmin(String username1, String password1) {
		
		
		if(username.equals(username1) && password.equals(password1)) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
}
