package com.xworkz.bean;

import org.springframework.stereotype.Component;

@Component
public class Petrol implements Fuel {
	
	
	public Petrol() {
		System.out.println(" create petrole  ");
	}

	@Override
	public void consume() {
		System.out.println("Creating Consume");
		
	}
	

}
