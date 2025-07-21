package com.model;

public class Employee {

	private int empid;
	private String empname;
	private int age;
	private double salary;
	public Employee(int empid, String empname, int age, double salary) {
		this.empid = empid;
		this.empname = empname;
		this.age = age;
		this.salary = salary;
	}
	public Employee() {
	
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
