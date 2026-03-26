package com.employee.sercive;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employee.dao.DepartmentDao;
import com.employee.entity.Department;

@Service
@Transactional
public class DepartmentServiceImp implements DepartmentService {
@Autowired
	private DepartmentDao departmentDao; 
	@Override
	public void saveDepartment(Department dept) {
		departmentDao.saveDepartment(dept);
		
	}

	@Override
	public List<Department> getAllDepartments() {
		return departmentDao.getAllDepartments();
	}


}
