package com.xworkz.bean;

import org.springframework.stereotype.Component;

@Component
public class Deisel implements Fuel {

	public Deisel() {
		System.out.println("Creating Diesel const");
	}

	@Override
	public void consume() {
		System.out.println("Creating Consume");

	}

}
