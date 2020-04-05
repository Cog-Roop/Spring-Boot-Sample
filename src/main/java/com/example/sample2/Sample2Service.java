package com.example.sample2;

import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class Sample2Service implements Comparator<Employee> {

	public ArrayList<Employee> sortEmployees(){
	ArrayList<Employee> emplist= new ArrayList<Employee>();
	emplist.add(new Employee(132, "latha", 4, "Ahmadabad"));
	emplist.add(new Employee(134, "sunidha", 4, "delhi"));
	emplist.add(new Employee(131, "Rohan", 5, "chennai"));
	emplist.add(new Employee(133, "Rakesh", 5, "Hyderabad"));



		Collections.sort(emplist, new Sample2Service());
		return emplist;
	}

	public int compare(Employee a, Employee b)
	{
		return a.empID - b.empID;
	}

}
 