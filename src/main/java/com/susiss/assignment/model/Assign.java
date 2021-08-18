package com.susiss.assignment.model;

public class Assign {
	
	private int id;
	private int classID;
	private int studentID;
	private String assignState;
	
	public Assign() {
		// TODO Auto-generated constructor stub
	}

	public Assign(int id, int classID, int studentID, String assignState) {
		super();
		this.id = id;
		this.classID = classID;
		this.studentID = studentID;
		this.assignState = assignState;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getClassID() {
		return classID;
	}

	public void setClassID(int classID) {
		this.classID = classID;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getAssignState() {
		return assignState;
	}

	public void setAssignState(String assignState) {
		this.assignState = assignState;
	}

	
	
}
