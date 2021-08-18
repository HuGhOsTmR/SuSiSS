package com.susiss.assignment.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.susiss.assignment.model.Assign;

@Repository
public class AssignDAO implements IAssign {

	@Autowired
	private JdbcTemplate template;
	
	@Override
	public List<Assign> toList() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM Assign";
		List<Assign>Assigns = template.query(sql, new BeanPropertyRowMapper<Assign>(Assign.class));
		return Assigns;
	}

	@Override
	public Assign listAssignById(int id) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM Assign WHERE id=?";
		Assign as = template.queryForObject(sql, new Object[] {id}, new BeanPropertyRowMapper<Assign>(Assign.class));								 
		return as;
	}

	@Override
	public int Add(Assign as) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO Assign(classID, studentID, assignState) VALUES (?,?,?)";
		int res = template.update(sql, as.getClassID(), as.getStudentID(), as.getAssignState());
		return res;
	}

	@Override
	public int Edit(Assign as) {
		// TODO Auto-generated method stub
		String sql = "UPDATE Assign SET classID=?, studentID=?, assignState=? WHERE id=?";
		int res = template.update(sql,as.getClassID(), as.getStudentID(), as.getAssignState(), as.getId());
		return res;
	}

	@Override
	public void Delete(int id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM Assign WHERE id=?";
		template.update(sql, id);		
	}
	

}
