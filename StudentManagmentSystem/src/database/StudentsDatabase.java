package database;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentsDatabase implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private static List<Student> students = new ArrayList<>();
	
	public static List<Student> getStudents(){
		return students;
	}
	
	public static void addStudent (Student student)
	{
		students.add(student);
	}
	
	public static Student getStudentByUsername(String username)
	{
		
		if(students.stream().anyMatch(o -> username.equals(o.getUsername()))) {
			return students.stream().filter(o -> o.getUsername().equals(username)).findFirst().get();
		}
		else {
			return null;
		}
	}
	
	public static Student getStudentById(String id)
	{
		
		if(students.stream().anyMatch(o -> id.equals(o.getStudentID()))) {
			return students.stream().filter(o -> o.getStudentID().equals(id)).findFirst().get();
		}
		else {
			return null;
		}
	}
	
	public static boolean removeStudent(String id)
	{
		if(students.stream().anyMatch(o -> id.equals(o.getStudentID()))) {
			students.remove(getStudentById(id));
			return true;
		}else {
			return false;
		}
	}
	
	
	public static void save() {
		try {
			 
            FileOutputStream fileOut = new FileOutputStream("./studentsObj");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(students);
            objectOut.close();
            System.out.println("The Object  was succesfully written to a file");
 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
	}
	
	@SuppressWarnings("unchecked")
	public static void load() {
		try {
			 
            FileInputStream fileIn = new FileInputStream("./studentsObj");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
 
            students = (List<Student>) objectIn.readObject();
 
            System.out.println("The Object has been read from the file");
            objectIn.close();
 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
	}
	
	public static void print() {
		System.out.println(students.size());
	}
	
	
	
	

}
