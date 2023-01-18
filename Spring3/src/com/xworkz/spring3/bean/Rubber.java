package com.xworkz.spring3.bean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Rubber
{
	@Autowired
	@Qualifier("rname")
	private String name;
	@Autowired
	@Qualifier("rtype")
	private String type;
	@Autowired
	@Qualifier("rprice")
	private int price;
	@Autowired
	@Qualifier("rcolor")
	private String color;
	@Autowired
	@Qualifier("rsharp")
	private String shape;
	@Autowired
	@Qualifier("rstolen")
	private String stlone;
	@Autowired
	@Qualifier("rsize")
	private int size;

	public Rubber() {
		System.out.println("================");	
	}

	@Override
	public String toString() {
		return "Rubber [name=" + name + ", type=" + type + ", price=" + price + ", color=" + color + ", shape=" + shape
				+ ", stlone=" + stlone + ", size=" + size + "]";
	}

	

}
