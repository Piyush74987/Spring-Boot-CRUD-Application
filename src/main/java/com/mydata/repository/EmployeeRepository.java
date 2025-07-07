package com.mydata.repository;

import java.util.List;
import com.mydata.model.Employee;

public interface EmployeeRepository {
	
	public void saveEmp(Employee e);
	public void deleteEmp(int id);
	public void updateEmp(int id,float salary,String address);
	public List<Employee> listAllEmployee();
	public Employee getEmpById(int id);

}
