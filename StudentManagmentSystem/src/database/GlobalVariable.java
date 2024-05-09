package database;

public class GlobalVariable {

	private static Student currentUser;
	public static Student currentStudent;
	
	public static void setCurrentUser(Student user) {
		currentUser = user;
	}
	
	public static Student getCurrentUser() {
		return currentUser;
	}
	
	public static void setCurrentStudent(Student student) {
		currentStudent = student;
	}
	public static Student getCurrentStudent() {
		return currentStudent;
	}
}
