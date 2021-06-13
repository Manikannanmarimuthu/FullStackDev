package com.practice.cons;

public class Employee {

	private int id;
	private String empName;
	private String empAdd;

	public Employee(int id, String empName) {
		this.id = id;
		this.empName = empName;
	}

	public Employee(int id, String empName, String empAdd) {
		this(id, empName);
		this.empAdd = empAdd;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAdd() {
		return empAdd;
	}

	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}

}
