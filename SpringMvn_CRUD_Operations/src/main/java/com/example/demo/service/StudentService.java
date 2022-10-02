package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;

@Service
@Component
public interface StudentService {
	public List<Student> getAllStudents();
	void saveStudent(Student student);
	Student getStudentById(int id);
	void deleteEmployeeById(int id);

}
