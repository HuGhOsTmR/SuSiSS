package com.susiss.assignment.assigns;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.susiss.assignment.dao.IStudent;
import com.susiss.assignment.model.Student;

@Service
public class StudentAssigns implements IStudentAssigns {

	@Autowired
	private IStudent dao;
	
	@Override
	public List<Student> toList() {
		// TODO Auto-generated method stub
		return dao.toList();
	}

	@Override
	public Student listStudentById(int id) {
		// TODO Auto-generated method stub
		return dao.listStudentById(id);
	}

	@Override
	public int Add(Student st) {
		// TODO Auto-generated method stub
		dao.Add(st);
		return 0;
	}

	@Override
	public int Edit(Student st) {
		// TODO Auto-generated method stub
		dao.Edit(st);
		return 0;
	}

	@Override
	public void Delete(int id) {
		// TODO Auto-generated method stub
		dao.Delete(id);	
	}

}
