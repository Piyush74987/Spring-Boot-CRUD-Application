package com.mydata.model;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity @Table(name="Employee_hib")
public class Employee  implements Serializable{
	
	@Id @Column(name="ID")
	private int id;
	@Column(name="Name")
	private String name;
	@Column(name="Salary")
	private float salary;
	@Column(name="City")
	private String address;
	public int getEid() {
		return id;
	}
	public void setEid(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Employee(int id, String name, float salary, String address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	public Employee(){}
	

}
