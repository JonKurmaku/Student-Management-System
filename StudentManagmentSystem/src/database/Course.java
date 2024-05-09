package database;

import java.io.Serializable;

public class Course implements Serializable{
	private static final long serialVersionUID = 1L;
	public String name;
	public int midterm_exam;
	public int final_exam;
	public int homework;
	public int final_grade;
	public String letter_grade = "NA";
	public boolean dropped = false;
}
