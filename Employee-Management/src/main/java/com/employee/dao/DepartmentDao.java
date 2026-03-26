package com.employee.dao;

import java.util.List;

import com.employee.entity.Department;

public interface DepartmentDao {
	public void saveDepartment(Department dept);
	public List<Department>getAllDepartments();

}


