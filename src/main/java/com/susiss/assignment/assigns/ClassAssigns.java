package com.susiss.assignment.assigns;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.susiss.assignment.dao.IClass;
import com.susiss.assignment.model.Class;

@Service
public class ClassAssigns implements IClassAssigns {

	@Autowired
	private IClass dao;
	
	@Override
	public List<Class> toList() {
		// TODO Auto-generated method stub
		return dao.toList();
	}

	@Override
	public Class listClassById(int id) {
		// TODO Auto-generated method stub
		return dao.listClassById(id);
	}

	@Override
	public int Add(Class cl) {
		// TODO Auto-generated method stub
		dao.Add(cl);
		return 0;
	}

	@Override
	public int Edit(Class cl) {
		// TODO Auto-generated method stub
		dao.Edit(cl);
		return 0;
	}

	@Override
	public void Delete(int id) {
		// TODO Auto-generated method stub
		dao.Delete(id);
	}
}
