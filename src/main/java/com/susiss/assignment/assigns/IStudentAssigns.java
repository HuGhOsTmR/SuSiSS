package com.susiss.assignment.assigns;

import java.util.List;

import com.susiss.assignment.model.Student;

public interface IStudentAssigns {
	
	public List<Student> toList();

	public Student listStudentById (int id);
	
	public int Add (Student st);
	
	public int Edit (Student st);
	
	public void Delete (int id);

}
