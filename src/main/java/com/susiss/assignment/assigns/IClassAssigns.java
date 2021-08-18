package com.susiss.assignment.assigns;

import java.util.List;

import com.susiss.assignment.model.Class;


public interface IClassAssigns {
	
	public List<Class> toList();

	public Class listClassById (int id);
	
	public int Add (Class cl);
	
	public int Edit (Class cl);
	
	public void Delete (int id);

}
