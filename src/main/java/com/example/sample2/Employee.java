package com.example.sample2;

import java.util.Comparator;

public class Employee implements Comparator<Employee>{

	public int empID;
	public String name;
	public int rating;
	public String location;
	
	
	public Employee(int empID, String name, int rating, String location) {
		super();
		this.empID = empID;
		this.name = name;
		this.rating = rating;
		this.location = location;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", location=" + location + "]";
	}
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
