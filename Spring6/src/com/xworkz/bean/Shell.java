package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Shell implements PetrolBunk {

	@Autowired
	@Qualifier("diesel")
	private Fuel fuel;

	public Shell() {
		System.out.println("Creating Shell  default Const");

	}

	@Override
	public void purchase() {
		System.out.println("Creating purchase");
		fuel.consume();

	}

}
