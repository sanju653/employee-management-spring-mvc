package com.employee.dao;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.entity.Employee;

@Repository
public class EmployeeDaoImp implements EmployeeDao {
	@Autowired
private SessionFactory sessionFactory;
	
	@Override
	public void saveEmployee(Employee emp) {
		Session session=sessionFactory.getCurrentSession();
		session.save(emp);
		
	}

	@Override
	public void updateEmployee(Employee emp) {
		Session session=sessionFactory.getCurrentSession();
		session.update(emp);
	}

	@Override
	public void deleteEmployee(int id) {
		Session session=sessionFactory.getCurrentSession();
		Employee emp = session.get(Employee.class, id);//class name,pk
        if (emp != null) {
            session.delete(emp);
        }

		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAllEmployees() {
		Session session=sessionFactory.getCurrentSession();
		return  session.createQuery("from Employee",Employee.class).list();
	}

	@Override
	public Employee getEmployeeById(int id) {
		Session session=sessionFactory.getCurrentSession();
			return session.get(Employee.class,id );
	}

}

