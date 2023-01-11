package com.xworkz.spring3.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Hardware {

	@Autowired
	@Qualifier("hid")
	private int id;
	@Autowired
	@Qualifier("hname")
	private String name;
	@Autowired
	@Qualifier("hownerName")
	private String ownerName;
	@Autowired
	@Qualifier("haddress")
	private String address;

	public Hardware() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Hardware [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", address=" + address + "]";
	}

}
