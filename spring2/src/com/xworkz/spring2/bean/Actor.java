package com.xworkz.spring2.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor {

	private String name;
	private String language;
	private int age;

	public Actor(@Value("Sudeep") String name, @Value("Kannada") String language, @Value("50") int age) {
		this.name = name;
		this.language = language;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getLanguage() {
		return language;
	}

	public int getAge() {
		return age;
	}

}
