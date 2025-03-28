package com.demo.manytomany;

public class Employee {

	int id;
	
	
	String name;
	
	
	String Salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String salary) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
	}

	public Employee(String name, String salary) {
		super();
		this.name = name;
		Salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return Salary;
	}

	public void setSalary(String salary) {
		Salary = salary;
	}
	
	
}
