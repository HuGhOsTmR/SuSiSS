package com.susiss.assignment.dao;

import java.util.List;

import com.susiss.assignment.model.Student;

public interface IStudent {

	public List<Student> toList();

	public Student listStudentById (int id);
	
	public int Add (Student st);
	
	public int Edit (Student st);
	
	public void Delete (int id);
}
