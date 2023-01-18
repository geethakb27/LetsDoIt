package com.xworkz.spring2.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.spring2.bean.Actor;
import com.xworkz.spring2.bean.Rocket;
import com.xworkz.spring2.bean.Season;

@Configuration
@ComponentScan("com.xworkz.spring2")
public class SpringConfiguration {

	public SpringConfiguration() {
		System.out.println("Created SpringConfiguration");
	}

	@Bean
	public Rocket fly() {
		System.out.println("Registering fly with spring");
		Rocket rocket = new Rocket();
		return rocket;
	}

	@Bean
	public Actor comedy() {
		System.out.println("Registering comedy with spring");
		Actor actor = new Actor("Ram charan", "Telugu", 31);
		return actor;
	}

	@Bean
	public Season cold() {
		System.out.println("Registering cold with spring");
		Season season = new Season();
		season.setName("Mansoon");
		season.setDuration(1);
		season.setStartingMonth("May");
		return season;

	}
}
