package com.employee.sercive;

import java.util.List;

import com.employee.entity.Department;

public interface DepartmentService {
	public void saveDepartment(Department dept);
	public List<Department>getAllDepartments();
}
