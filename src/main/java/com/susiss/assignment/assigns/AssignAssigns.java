package com.susiss.assignment.assigns;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.susiss.assignment.dao.IAssign;
import com.susiss.assignment.model.Assign;

@Service
public class AssignAssigns implements IAssignAssigns {

	@Autowired
	private IAssign dao;
	
	@Override
	public List<Assign> toList() {
		// TODO Auto-generated method stub
		return dao.toList();
	}

	@Override
	public Assign listAssignById(int id) {
		// TODO Auto-generated method stub
		return dao.listAssignById(id);
	}

	@Override
	public int Add(Assign as) {
		// TODO Auto-generated method stub
		dao.Add(as);
		return 0;
	}

	@Override
	public int Edit(Assign as) {
		// TODO Auto-generated method stub
		dao.Edit(as);
		return 0;
	}

	@Override
	public void Delete(int id) {
		// TODO Auto-generated method stub
		dao.Delete(id);	
	}

}
