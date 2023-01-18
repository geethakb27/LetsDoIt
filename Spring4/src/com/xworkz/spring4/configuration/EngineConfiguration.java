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
				SnakeConfiguration.class, GhostConfiguration.class, Ghost.class, Sanke.class, NewsPaper.class }) })
public class EngineConfiguration {

	public EngineConfiguration() {
		System.out.println("creating EngineConfiguration spring");
	}
	
	
	@Bean
	public String ename() {
		System.out.println("registering ename");
		return "motor";
	}
	@Bean
	public String etype() {
		System.out.println("registering type");
		return "basics";
	}
	@Bean
	public int enumber() {
		System.out.println("registering number");
		return 90;
	}
	@Bean
	public int eversion() {
		System.out.println("registering version");
		return 7;
	}
	@Bean
	public String ecompany() {
		System.out.println("registering company");
		return "BMW";
	}@Bean
	public String strokes() {
		System.out.println("registering strokes");
		return "full";
	}
}
