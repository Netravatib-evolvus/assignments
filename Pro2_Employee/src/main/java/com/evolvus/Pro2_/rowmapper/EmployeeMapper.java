package com.evolvus.Pro2_.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.evolvus.Pro2_.bean.Employee;

public class EmployeeMapper implements RowMapper<Employee>{

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Employee obj=new Employee();
		obj.setEmpId(rs.getLong("EMPID"));
		obj.setDoj(rs.getDate("DOJ"));
		obj.setSalary(rs.getBigDecimal("SALARY"));
		return obj;
	}

}
