package database;

import java.io.Serializable;

public class Student implements Serializable{

	private static final long serialVersionUID = 1L;
	
	String name;
	String surname;
	String birthday;
	String gender;
	String citizenship;
	String birthplace;
	String studentID;
	String dad;
	String mom;
	double GPA;
	String reg_date;
	String status;
	String faculty;
	String departament;
	String program;
	String degree;
	String username;
	String password;
	public Course course1;
	public Course course2;
	public Course course3;
	public Course e_course1;
	public Course e_course2;
	public boolean firstLogin = false;

	public Student() {
		this.name = "Not Specified";
		this.surname = "Not Specified";
		this.gender = "Not Specified";
		this.birthday = "Not Specified";
		this.studentID = "Not Specified";
		this.citizenship = "Not Specified";
		this.birthplace = "Not Specified";
		this.studentID = "";
		this.dad = "Not Specified";
		this.mom = "Not Specified";
		this.GPA = 0;
		this.reg_date = "Not Specified";
		this.status = "Not Specified";
		this.faculty = "Not Specified";
		this.departament = "Not Specified";
		this.program = "Not Specified";
		this.degree = "Not Specified";
	}

	public Student(String name, String surname, String gender, String birthday, String citizenship, String birthplace,
			String studentID,  String dad, String mom, double GPA, String reg_date, String status,
			String faculty, String departament, String program, String degree, String username, String password) {
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.birthday = birthday;
		this.citizenship = citizenship;
		this.birthplace = birthplace;
		this.studentID = studentID;
		this.dad = dad;
		this.mom = mom;
		this.GPA = GPA;
		this.reg_date = reg_date;
		this.status = status;
		this.faculty = faculty;
		this.departament = departament;
		this.program = program;
		this.degree = degree;
		this.username = username;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCitizenship() {
		return citizenship;
	}

	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}

	public String getBirthplace() {
		return birthplace;
	}

	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getDad() {
		return dad;
	}

	public void setDad(String dad) {
		this.dad = dad;
	}

	public String getMom() {
		return mom;
	}

	public void setMom(String mom) {
		this.mom = mom;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double GPA) {
		this.GPA = GPA;
	}

	public String getReg_date() {
		return reg_date;
	}

	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getDepartament() {
		return departament;
	}

	public void setDepartament(String departament) {
		this.departament = departament;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	/*
	 * public String toString() { return "$$ Student $$" +
	 * "\nName: "+name+"\nSurname: "+surname+ "\nID: "+
	 * ID+"\nStudent ID: "+studentID
	 * +"\nBirthday: "+birthday+"\nCitizenship: "+citizenship
	 * +"\nBirthplace: "+birthplace+
	 * 
	 * }
	 */
}
