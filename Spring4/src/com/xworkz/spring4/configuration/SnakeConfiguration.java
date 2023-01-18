package com.xworkz.spring4.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.xworkz.spring4.bean.Engine;
import com.xworkz.spring4.bean.Ghost;
import com.xworkz.spring4.bean.NewsPaper;
import com.xworkz.spring4.bean.Sanke;

@Configuration
@ComponentScan(basePackages = "com.xworkz,spring4", excludeFilters = {
		@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = { NewsPaperConfiguration.class,
				EngineConfiguration.class, GhostConfiguration.class, Ghost.class, Engine.class, NewsPaper.class }) })
public class SnakeConfiguration {
	public SnakeConfiguration() {

		System.out.println("=============");
	}

	@Bean
	public String sname() {
		System.out.println("registering sanke name");
		return "kalingasarpa";
	}

	@Bean
	public String slength() {
		System.out.println("registering sanke slength");
		return "long";
	}

	@Bean
	public String scolor() {
		System.out.println("registering sanke color");
		return "black";
	}

	@Bean
	public String stype() {
		System.out.println("registering sanke type");
		return "long";
	}

	@Bean
	public String spoisionous() {
		System.out.println("registering sanke poisionous");
		return "dangerous";
	}
}
