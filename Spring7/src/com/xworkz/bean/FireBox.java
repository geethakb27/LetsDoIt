package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FireBox implements Browse {
	@Autowired
	@Qualifier("jio")
	private Provider provider;
	@Autowired
	@Qualifier("airtel")
	private Provider provider1;

	public FireBox() {
		System.out.println("creating frie box");

	}

	@Override
	public void browse() {
		System.out.println("haiii");
		provider.connect();
		provider1.connect();
	}
}
