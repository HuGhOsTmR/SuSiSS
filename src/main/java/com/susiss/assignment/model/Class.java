package com.susiss.assignment.model;

public class Class {
	
	private int id;
	private String classCode;
	private String classTitle;
	private String classDescription;
	
	public Class() {
		// TODO Auto-generated constructor stub
	}

	public Class(int id, String classCode, String classTitle, String classDescription) {
		super();
		this.id = id;
		this.classCode = classCode;
		this.classTitle = classTitle;
		this.classDescription = classDescription;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClassCode() {
		return classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	public String getClassTitle() {
		return classTitle;
	}

	public void setClassTitle(String classTitle) {
		this.classTitle = classTitle;
	}

	public String getClassDescription() {
		return classDescription;
	}

	public void setClassDescription(String classDescription) {
		this.classDescription = classDescription;
	}
	
}
