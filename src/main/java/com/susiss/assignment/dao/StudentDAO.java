package com.susiss.assignment.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.susiss.assignment.model.Student;

@Repository
public class StudentDAO implements IStudent {

	@Autowired
	private JdbcTemplate template;
	
	@Override
	public List<Student> toList() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM student";
		List<Student>Students = template.query(sql, new BeanPropertyRowMapper<Student>(Student.class));
		return Students;
	}

	@Override
	public Student listStudentById(int id) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM STUDENT WHERE id=?";
		Student st = template.queryForObject(sql, new Object[] {id}, new BeanPropertyRowMapper<Student>(Student.class));								 
		return st;
	}

	@Override
	public int Add(Student st) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO student(studentID, studentLastName, studentFirstName) VALUES (?,?,?)";
		int res = template.update(sql, st.getStudentID(), st.getStudentLastName(), st.getStudentFirstName());
		return res;
	}

	@Override
	public int Edit(Student st) {
		// TODO Auto-generated method stub
		String sql = "UPDATE STUDENT SET studentID=?, studentLastName=?, studentFirstName=? WHERE id=?";
		int res = template.update(sql,st.getStudentID(), st.getStudentLastName(), st.getStudentFirstName(), st.getId());
		return res;
	}

	@Override
	public void Delete(int id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM STUDENT WHERE id=?";
		template.update(sql, id);		
	}
	

}
