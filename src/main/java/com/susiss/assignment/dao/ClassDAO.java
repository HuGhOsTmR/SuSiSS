package com.susiss.assignment.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.susiss.assignment.model.Class;
import com.susiss.assignment.model.Student;

@Repository
public class ClassDAO implements IClass {

	@Autowired
	private JdbcTemplate template;
	
	@Override
	public List<Class> toList() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM class";
		List<Class>Classes = template.query(sql, new BeanPropertyRowMapper<Class>(Class.class));
		return Classes;
	}

	@Override
	public Class listClassById(int id) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM CLASS WHERE id=?";
		Class cl = template.queryForObject(sql, new Object[] {id}, new BeanPropertyRowMapper<Class>(Class.class));								 
		return cl;
	}

	@Override
	public int Add(Class cl) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO CLASS(classCode, classTitle, classDescription) VALUES (?,?,?)";
		int res = template.update(sql, cl.getClassCode(), cl.getClassTitle(), cl.getClassDescription());
		return res;
	}

	@Override
	public int Edit(Class cl) {
		// TODO Auto-generated method stub
		String sql = "UPDATE CLASS SET classCode=?, classTitle=?, classDescription=? WHERE id=?";
		int res = template.update(sql,cl.getClassCode(), cl.getClassTitle(), cl.getClassDescription(), cl.getId());
		return res;
	}

	@Override
	public void Delete(int id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM CLASS WHERE id=?";
		template.update(sql, id);		
	}
}
