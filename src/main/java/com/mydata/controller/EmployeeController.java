package com.mydata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mydata.service.EmployeeService;
import com.mydata.model.Employee;
import java.util.List;
@RestController
@RequestMapping(path="/emp")
public class EmployeeController {
	
	@Autowired
	EmployeeService es;
	public void setEs(EmployeeService es) {
		this.es = es;
	}
	
	@PostMapping(path="/create")
	public String createNewEmp(@RequestBody Employee e ) {
		es.saveEmp(e);
		return "Created";
	}
	@PutMapping(path="/update/{id}/{salary}/{city}")
	public String updateEmpl(@PathVariable int id,@PathVariable float salary, @PathVariable String city){
		es.updateEmp(id, salary, city);
		return "updated";	
	}
	@DeleteMapping(path="/delete/{id}")
	public String deleteEmpl(@PathVariable int id) {
		es.deleteEmp(id);
		return "Deleted";
	}
	@GetMapping(path="/oneid/{id}")
	public Employee empById(@PathVariable int id) {
		return es.getEmpById(id);
	}
	@GetMapping(path="/allData")
	public List<Employee> AllEmployee(){
		return es.listAllEmployee();
	}

	
	
	

}
