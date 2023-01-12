package com.xworkz.spring3.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoftwareEngineer 
{
	@Autowired
	@Qualifier("sename")
	private String name;
	@Autowired
	@Qualifier("sesalary")
	private int salary;
	@Autowired
	@Qualifier("secompName")
	private String compName;
	@Autowired
	@Qualifier("seexp")
	private int exp;
	
	public SoftwareEngineer() 
	{
    System.out.println("========================");
	}

	@Override
	public String toString() {
		return "SoftwareEngineer [name=" + name + ", salary=" + salary + ", compName=" + compName + ", exp=" + exp
				+ "]";
	}
	
	

}
