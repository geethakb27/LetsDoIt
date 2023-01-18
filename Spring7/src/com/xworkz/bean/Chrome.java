package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Chrome implements Browse {
	@Autowired
	@Qualifier("jio")
	private Provider provider;
	@Autowired
	@Qualifier("airtel")
	private Provider provider1;

	@Override
	public void browse() {
		System.out.println(" implements browers");
		provider.connect();
		provider1.connect();
	}
}
