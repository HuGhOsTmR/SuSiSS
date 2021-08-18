package com.susiss.assignment.assigns;

import java.util.List;

import org.springframework.ui.Model;

import com.susiss.assignment.model.Assign;


public interface IAssignAssigns {
	
	public List<Assign> toList();

	public Assign listAssignById (int id);
	
	public int Add (Assign as);
	
	public int Edit (Assign as);
	
	public void Delete (int id);

}
