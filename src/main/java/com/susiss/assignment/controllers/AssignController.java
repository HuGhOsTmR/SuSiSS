package com.susiss.assignment.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.susiss.assignment.assigns.IAssignAssigns;
import com.susiss.assignment.assigns.IClassAssigns;
import com.susiss.assignment.assigns.IStudentAssigns;
import com.susiss.assignment.model.Assign;
import com.susiss.assignment.model.Student;

@Controller
public class AssignController {

	@Autowired
	private IAssignAssigns assigns;
	private IStudentAssigns assignsStudent;
	private IClassAssigns assignsClass;
	
	@GetMapping("/toListAssigns")
	public String toList(Model model) {
		
		model.addAttribute("Assigns", assigns.toList());
		return "indexAssign";
	}
	
	@GetMapping("/newAssign")
	public String newAssign() {
		return "addAssign";		
	}
	
	@PostMapping("/addAssign")
	public String addAssign(Assign as) {
		assigns.Add(as);
		return "redirect:/toListAssigns";
	}
	
	@GetMapping("/editAssign/{id}")
	public String editAssign(@PathVariable int id, Model model) {
		Assign as = assigns.listAssignById(id);
		model.addAttribute("Assign", as);
		return "editAssign";
	}
	
	@PostMapping("/updateAssign")
	public String updateAssign(Assign as) {
		assigns.Edit(as);
		return "redirect:/toList";
	}
	
	@GetMapping("/deleteAssign/{id}")
	public String deleteAssign(@PathVariable int id) {
		assigns.Delete(id);
		return "redirect:/toList";
	}
	@GetMapping ("/newAssignClasses/{id}")
	public String AssignStudentClass(@PathVariable int id, Model model) {
		Student st = assignsStudent.listStudentById(id);
		model.addAttribute("studentAssign", st);
		return "indexStudentAssign";		
	}
}
