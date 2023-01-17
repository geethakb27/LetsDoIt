package com.xworkz.bean;

import org.springframework.stereotype.Component;

@Component
public class Jio  implements Provider
{


	public Jio() {

		System.out.println("creating classss in jio");
	}
	@Override
	public void connect() {
		System.out.println("conncet class");		
	}
}
