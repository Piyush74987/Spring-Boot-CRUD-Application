package com.mydata.repository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.mydata.model.Employee;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {
	
	@Autowired
	EntityManager em;
	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Override
	public void saveEmp(Employee e) {
		// TODO Auto-generated method stub
		Session s=em.unwrap(Session.class);
		s.persist(e);
	}

	@Override
	public void deleteEmp(int id) {
		// TODO Auto-generated method stub
		Session s=em.unwrap(Session.class);
		Employee e=s.get(Employee.class, id);
		s.remove(e);
	}

	@Override
	public void updateEmp(int id, float salary, String address) {
		// TODO Auto-generated method stub
		Session s=em.unwrap(Session.class);
		Employee e=s.get(Employee.class, id);
		e.setAddress(address);
		e.setSalary(salary);
		s.merge(e);
	}

	@Override
	public List<Employee> listAllEmployee() {
		Session s=em.unwrap(Session.class);
		Query<Employee> q = s.createQuery("from Employee", Employee.class);
		List<Employee> listallemployee=q.list();
		return listallemployee;
	}

	@Override
	public Employee getEmpById(int id) {
		Session s=em.unwrap(Session.class);
		Employee e=s.get(Employee.class, id);
		return e;
	}

}
