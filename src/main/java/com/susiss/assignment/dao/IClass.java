package com.susiss.assignment.dao;

import java.util.List;

import com.susiss.assignment.model.Class;


public interface IClass {

	public List<Class> toList();

	public Class listClassById (int id);
	
	public int Add (Class cl);
	
	public int Edit (Class cl);
	
	public void Delete (int id);
}
