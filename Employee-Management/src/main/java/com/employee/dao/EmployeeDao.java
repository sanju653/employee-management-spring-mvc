package com.employee.dao;

import java.util.List;

import com.employee.entity.Employee;



public interface EmployeeDao {
	public void saveEmployee(Employee emp);
	
	public void updateEmployee(Employee emp);
	
	public void deleteEmployee(int id);
	
	
	public List<Employee>getAllEmployees();
	
	public Employee getEmployeeById(int id);
}


