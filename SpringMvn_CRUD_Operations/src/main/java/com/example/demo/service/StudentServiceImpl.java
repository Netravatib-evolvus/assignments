package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
@Component
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentRepository repo;

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	
	@Override
	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		this.repo.save(student);
	}


	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method 
		Optional<Student> opt=repo.findById(id);
		Student std=null;
		if(opt.isPresent())
		{
			std=opt.get();
		}
		else
		{
			throw new RuntimeException("Student not found"+id);
		}
		
		return std;
	}


	@Override
	public void deleteEmployeeById(int id) {
		// TODO Auto-generated method stub
		this.repo.deleteById(id);
		
	}

	
   
	
	
	
}
