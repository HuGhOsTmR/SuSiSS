package com.susiss.assignment.model;

public class Student {

	private int id;
	private String studentID;
	private String studentLastName;
	private String studentFirstName;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String studentID, String studentLastName, String studentFirstName) {
		super();
		this.id = id;
		this.studentID = studentID;
		this.studentLastName = studentLastName;
		this.studentFirstName = studentFirstName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}
	
}
