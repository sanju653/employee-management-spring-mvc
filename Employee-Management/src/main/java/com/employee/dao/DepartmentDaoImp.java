package com.employee.dao;

import java.util.List;

import com.employee.entity.Department;





import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;




@Repository
public class DepartmentDaoImp implements DepartmentDao {
	 @Autowired
	    private SessionFactory sessionFactory;
	@Override
	public void saveDepartment(Department dept) {
		Session session = sessionFactory.getCurrentSession();
        session.save(dept);
	}

	@Override
	public List<Department> getAllDepartments() {
		 Session session = sessionFactory.getCurrentSession();
	        return session.createQuery("from Department", Department.class).list();
	}

}

