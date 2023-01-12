package com.xworkz.spring3.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Flower 

{
	@Autowired
	@Qualifier("flowernm")
	private String flowernm;
	@Autowired
	@Qualifier("fcolor")
	private String color;
	@Autowired
	@Qualifier("fprice")
	private int price;
	@Autowired
	@Qualifier("flavours")
	private String flavours;
	@Autowired
	@Qualifier("fsize")
	private String size;
	@Autowired
	@Qualifier("fqunatity")
	private int qunatity;
	@Autowired
	@Qualifier("fuse")
	private String use;
	@Autowired
	@Qualifier("fnoOfType")
	private int noOfType;
	
	
	
	
	
	
	public Flower() {

		System.out.println("===============");
		
	}

	@Override
	public String toString() {
		return "YourWish [flowernm=" + flowernm + ", color=" + color + ", price=" + price + "]";
	} 
	
	
}
