package com.evolvus.Pro2_;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.evolvus.Pro2_.bean.Employee;
import com.evolvus.Pro2_.rowmapper.EmployeeMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    	String oracle_jdbc_url="jdbc:oracle:thin:@localhost:49191:XE";
    	
    	String userName="IBLQA";
    	String password="root";
    	
    	DriverManagerDataSource ds=new DriverManagerDataSource(oracle_jdbc_url,userName,password);
    	
    	JdbcTemplate jdbcTemp=new JdbcTemplate(ds);
    	
    	
    	String insert="INSERT INTO EMPLOYEE (EMPID,DOJ,SALARY) VALUES (?,?,?)";
    	
    	String selectSql="SELECT * FROM EMPLOYEE WHERE EMPID=1";
    	
    	String selectAll="SELECT * FROM EMPLOYEE";
    	//  Statement statement = jdbcTewmp.createStatement());
    	
    	Employee emp=new Employee();
    	emp.setEmpId(2l);
    	emp.setDoj(new Date(0));
    	emp.setSalary(new BigDecimal(234));
    	
    	try
    	{
      System.out.println("=====Single record===============");
        
    		Employee empobj=jdbcTemp.queryForObject(selectSql,new EmployeeMapper());
    		System.out.println("The returned jdbc "+empobj );
    		
    	System.out.println("=======Multiple records===========");
    		
    		List<Employee>empobj2=jdbcTemp.query(selectAll, new EmployeeMapper());
    		System.out.println("List of objects "+empobj2);
    		
    		System.out.println("=============Query ===========");
    		
    		String selectSingle="SELECT * FROM EMPLOYEE WHERE EMPID=?";
    		
    		long empId=1l;
    		Employee emp2=jdbcTemp.queryForObject(selectSingle,new Object[] {empId}, new EmployeeMapper());
    		
    		System.out.println("The single object "+emp2);
    		
    		System.out.println("---------UPDATION OPERATION-----");
    		
    	
    		String updateOperation="update Employee set SALARY=4566778 where EMPID=3";
  
    		 int row = jdbcTemp.update(updateOperation);
             System.out.println(row);
            
             System.out.println("---------DELETE OPERATION---------------------");
             
             String deleteOperation="Delete from Employee where EMPID=4";
             
             int rowDelete=jdbcTemp.update(deleteOperation);
             System.out.println("Delete Operation "+rowDelete);
    		
    		
    		
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	
    }
    
    	
    	
    	
    	
    	
    
}
