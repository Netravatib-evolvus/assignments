package com.example.demo;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.dao.DataAccessException;

import com.example.demo.model.Employee;
import com.example.demo.service.IEmployeeService;

@SpringBootApplication
public class SpringPro6Application {
	//http://localjhost:8082/h2-console

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringPro6Application.class, args);
		IEmployeeService service=ctx.getBean("EmployeeService",IEmployeeService.class);
	try {	
		Employee emp=new Employee();
		emp.setName("netra");
		emp.setAddress("Bijapur");
		String msg=service.registerEmp(emp);
		System.out.println(msg);
	}
	catch(DataAccessException dae)
	{
		dae.printStackTrace();
	}catch(Exception e)
	{
		e.printStackTrace();
		
	}
	try {
		
		Optional<Employee>opt=service.fetchEmplyeeById(1);
		if(opt.isPresent())
			System.out.println("Employee info"+opt.get());
		else
			System.out.println("Employee not found");
		
	}catch(DataAccessException dae)
	{
		dae.printStackTrace();
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
	
try {
		System.out.println(service.updateEmployee(1, " Bangalore"));
		
	}catch(DataAccessException dae)
	{
		dae.printStackTrace();
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
try {
	System.out.println("---------delete operation---------------");
	Employee emp=new Employee(1,null,null);
	System.out.println(service.removeEmployee(emp));
}catch(DataAccessException dae)
{
	dae.printStackTrace();
}
catch(Exception e)
{
	e.printStackTrace();
	
}



	}

}
