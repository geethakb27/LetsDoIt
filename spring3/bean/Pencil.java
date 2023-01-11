package com.xworkz.spring3.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pencil
{              
	@Autowired
	@Qualifier("pname")
	private String name;
	@Autowired
	@Qualifier("ptype")
	private String type;
	@Autowired
	@Qualifier("pprice")
	private int price;
	@Autowired
	@Qualifier("pcolor")
	private String color;
	@Autowired
	@Qualifier("psharp")
	private String sharp;
	@Autowired
	@Qualifier("pstolen")
	private String  stolen;
	
	public Pencil() {
		
		System.out.println("==================");
	}

	@Override
	public String toString() {
		return "Pencil [name=" + name + ", type=" + type + ", price=" + price + ", color=" + color + ", sharp=" + sharp
				+ ", stolen=" + stolen + "]";
	}
	
	
}
