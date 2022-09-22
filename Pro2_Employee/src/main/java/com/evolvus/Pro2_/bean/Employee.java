package com.evolvus.Pro2_.bean;

import java.math.BigDecimal;
import java.sql.Date;

public class Employee {
	
	private long empId;
	private Date doj;
	private BigDecimal salary;
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	public Employee(long empId, Date doj, BigDecimal salary) {
		super();
		this.empId = empId;
		this.doj = doj;
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", doj=" + doj + ", salary=" + salary + "]";
	}
	
	
}
