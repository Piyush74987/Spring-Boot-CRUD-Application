package com.mydata.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mydata.model.Employee;
import com.mydata.repository.EmployeeRepository;
import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepository er;
	

	public void setEr(EmployeeRepository er) {
		this.er = er;
	}

	@Override @Transactional
	public void saveEmp(Employee e) {
		// TODO Auto-generated method stub
		er.saveEmp(e);
		
	}

	@Override @Transactional
	public void deleteEmp(int id) {
		// TODO Auto-generated method stub
		er.deleteEmp(id);
		
	}

	@Override @Transactional
	public void updateEmp(int id, float salary, String address) {
		// TODO Auto-generated method stub

		er.updateEmp(id, salary, address);
	}

	@Override
	public List<Employee> listAllEmployee() {
		// TODO Auto-generated method stub
		return er.listAllEmployee();
	}

	@Override
	public Employee getEmpById(int id) {
		// TODO Auto-generated method stub
		return er.getEmpById(id);
	}

}
