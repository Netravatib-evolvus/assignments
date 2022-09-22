package com.example.demo.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;

@Service
public interface IEmployeeService {
	
	public String registerEmp(Employee emp);
	public Optional<Employee>fetchEmplyeeById(int id);
	public String updateEmployee(int id,String newaddress);
    public String removeEmployee(Employee emp);
}
