package com.xworkz.spring3.bean;


import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Software 
{
	@Autowired
	@Qualifier("sname")
	private String name;
	@Autowired
	@Qualifier("sversion")
	private int version;
	@Autowired
	@Qualifier("sdeveloper")
	private  String developer;
	@Autowired
	@Qualifier("sdate")
	private LocalDate date;
	@Autowired
	@Qualifier("sfree")
	private  int free;
	
	public   Software()
	{
		System.out.println("=====");
	}

	@Override
	public String toString() {
		return "Software [name=" + name + ", version=" + version + ", developer=" + developer + ", date=" + date
				+ ", free=" + free + "]";
	}
	
	
}
