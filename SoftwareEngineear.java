package com.xworkz.spring.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoftwareEngineear {
	
	@Autowired
	@Qualifier("engineername")
	private String name;
	@Autowired
	@Qualifier("engineerSalary")
	private Double salary;
	@Autowired
	@Qualifier("engineerCompany")
	private String company;
	@Autowired
	@Qualifier("experience")
	private int exprience;

	public SoftwareEngineear() {

		System.out.println("Softwate engoinerr constructor Running");
	}

	@Override
	public String toString() {
		return "SoftwareEngineear [name=" + name + ", salary=" + salary + ", company=" + company + ", exprience="
				+ exprience + "]";
	}
	
	

}
