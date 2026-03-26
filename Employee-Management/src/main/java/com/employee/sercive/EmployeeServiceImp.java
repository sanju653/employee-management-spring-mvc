package com.employee.sercive;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employee.dao.EmployeeDao;
import com.employee.entity.Employee;


@Service
@Transactional
public class EmployeeServiceImp  implements EmployeeService{
@Autowired
	private EmployeeDao employeeDao;
	@Override
	public void saveEmployee(Employee emp) {
		employeeDao.saveEmployee(emp);
		
	}

	@Override
	public void updateEmployee(Employee emp) {
		employeeDao.updateEmployee(emp);
		
	}

	@Override
	public void deleteEmployee(int id) {
		employeeDao.deleteEmployee(id);		
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeDao.getAllEmployees();
	}

	@Override
	public Employee getEmployeeById(int id) {
		 return employeeDao.getEmployeeById(id);
	}

}
