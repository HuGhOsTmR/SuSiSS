package com.susiss.assignment.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.susiss.assignment.assigns.IClassAssigns;
import com.susiss.assignment.assigns.IStudentAssigns;
import com.susiss.assignment.model.Class;
import com.susiss.assignment.model.Student;

@Controller
public class ClassController {

	@Autowired
	private IClassAssigns assigns;
	
	@GetMapping("/toListClasses")
	public String toList(Model model) {
		
		model.addAttribute("Classes", assigns.toList());
		return "indexClasses";
	}
	
	@GetMapping("/newClass")
	public String newClass() {
		return "addClass";		
	}
	
	@PostMapping("/addClass")
	public String addClass(Class cl) {
		assigns.Add(cl);
		return "redirect:/toListClasses";
	}
	
	@GetMapping("/editClass/{id}")
	public String editClass(@PathVariable int id, Model model) {
		
		Class cl = assigns.listClassById(id);
		model.addAttribute("Class", cl);
		return "editClass";
	}
	
	@PostMapping("/updateClass")
	public String updateClass(Class cl) {
		assigns.Edit(cl);
		return "redirect:/toListClasses";
	}
	
	@GetMapping("/deleteClass/{id}")
	public String deleteClass(@PathVariable int id) {
		assigns.Delete(id);
		return "redirect:/toListClasses";
	}
}
