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
public class StudentController {

	@Autowired
	private IStudentAssigns assigns;
	@Autowired
	private IClassAssigns assignsClass;
	
	@GetMapping("/toList")
	public String toList(Model model) {
		
		model.addAttribute("students", assigns.toList());
		return "index";
	}
	
	@GetMapping("/newStudent")
	public String newStudent() {
		return "addStudent";		
	}
	
	@PostMapping("/addStudent")
	public String addStudent(Student st) {
		assigns.Add(st);
		return "redirect:/toList";
	}
	
	@GetMapping("/editStudent/{id}")
	public String editStudent(@PathVariable int id, Model model) {
		Student st = assigns.listStudentById(id);
		model.addAttribute("student", st);
		return "editStudent";
	}
	
	@PostMapping("/updateStudent")
	public String updateStudent(Student st) {
		assigns.Edit(st);
		return "redirect:/toList";
	}
	
	@GetMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable int id) {
		assigns.Delete(id);
		return "redirect:/toList";
	}
	
	@GetMapping ("/newAssignClasses/{id}")
	public String AssignStudentClass(@PathVariable int id, Model model, Model modelClasses) {
		
		Student st = assigns.listStudentById(id);		
		modelClasses.addAttribute("Classes", assignsClass.toList());
		model.addAttribute("student", st);
		
		return "indexStudentAssign";		
	}
}
