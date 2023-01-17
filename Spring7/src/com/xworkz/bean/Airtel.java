package com.xworkz.bean;

import org.springframework.stereotype.Component;

@Component
public class Airtel implements Provider

{
	public Airtel() {
		System.out.println(" creating class airtile");

	}
	@Override
	public void connect() {
		System.out.println(" hhhhdhhd");
	}
}
