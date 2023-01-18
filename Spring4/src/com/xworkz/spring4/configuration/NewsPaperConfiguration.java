package com.xworkz.spring4.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.xworkz.spring4.bean.Engine;
import com.xworkz.spring4.bean.Ghost;
import com.xworkz.spring4.bean.Sanke;

@Configuration
@ComponentScan(basePackages = "com.xworkz,spring4", excludeFilters = {
		@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = { SnakeConfiguration.class,
				EngineConfiguration.class, GhostConfiguration.class, Ghost.class, Engine.class, Sanke.class }) })
public class NewsPaperConfiguration {

	public NewsPaperConfiguration() {
		System.out.println("===============");

	}

	@Bean
	public int nid() {
		System.out.println("registering nid");
		return 5;
	}

	@Bean
	public String nname() {
		System.out.println("registering nname");
		return "The Hindu";
	}

	@Bean
	public String nownwerName() {
		System.out.println("registering ownwerName");
		return "Jhon";
	}

	@Bean
	public String nlang() {
		System.out.println("registering lang");
		return "English";
	}

	@Bean
	public int nprice() {
		System.out.println("registering nprice");
		return 20;
	}
}
