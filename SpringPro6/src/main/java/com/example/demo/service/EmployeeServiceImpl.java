package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.IEmployeeRepository;

@Service("EmployeeService")
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeRepository repo;
	
	public String registerEmp(Employee emp) {
		// TODO Auto-generated method stub
		System.out.println("--------saveoperation--------------");
		Employee emp1=repo.save(emp);
		System.out.println("Database "+emp1);
		
		return "Saved"+emp1.getId();
	}

	@Override
	public Optional<Employee> fetchEmplyeeById(int id) {
		System.out.println("--------findById------------");
		Optional<Employee>opt=repo.findById(id);
		return opt;
	}

	@Override
	public String updateEmployee(int id, String newaddress) {
		System.out.println("--------update operation------------");
		Optional<Employee>opt=repo.findById(id);
		if(opt.isPresent())
		{
			Employee emp=opt.get();
			emp.setAddress(newaddress);
			System.out.println(emp);
			return id+" is updated new address"+newaddress;
		}
		
		return id+" employee id is not found";
	}

	@Override
	public String removeEmployee(Employee emp) {
		// TODO Auto-generated method stub
		boolean flag=repo.existsById(emp.getId());
		if(flag) {
			repo.delete(emp);
			System.out.println(emp);
			return emp.getId()+" actor deleted";
		}
		else
		return emp.getId()+"actor not found";
	}

}
