package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentServiceImpl;

@Controller
@Component
public class StudentController {
	@Autowired
	private StudentServiceImpl service;

	@GetMapping("/")
	public String viewHomepage(Model model)
	{
		model.addAttribute("listSudents",service.getAllStudents());
		return "index";		
	}
	@GetMapping("/showStudentForm")
	public String showStudentForm(Model model)
	{
		Student s1=new Student();
		model.addAttribute("student", s1);
		return "new_student";		
	}
	@PostMapping("/saveStudent")
	public String saveStudent(@ModelAttribute ("student") Student student)
	{
		service.saveStudent(student);
		return "redirect:/";
		
	}
	
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable (value="id") int id,Model model)
	{
		Student student=service.getStudentById(id);
		model.addAttribute("student",student);
		return "update_student";
		
	}
	//showFormForUpdate
	
	@GetMapping("/deletestudent/{id}")
	public String deleteStudent(@PathVariable (value="id") int id)
	{
		this.service.deleteEmployeeById(id);
		return "redirect:/"; 
	}
	
	
	
}
