package com.example.sample2;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample2Controller {

	public Sample2Service sampleservice;
	
	public List<Employee> sorting(){
		return sampleservice.sortEmployees();
	}
}
