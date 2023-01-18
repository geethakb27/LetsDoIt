package com.xworkz.spring4.configuration;

import java.time.LocalDate;

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
				SnakeConfiguration.class, EngineConfiguration.class, Engine.class, Sanke.class, NewsPaper.class }) })
public class GhostConfiguration
{
	public GhostConfiguration() {
		System.out.println("========");
	}
	@Bean
	public String gname() {
		System.out.println("registering gname");
		return "muddugumma";
	}

	@Bean
	public String look() {
		System.out.println("registering  look");
		return "chabbicheeks";
	}

	@Bean
	public String gcolor() {
		System.out.println("registering  gcolor");
		return "white";
	}

	@Bean
	public String lengthofHair() {
		System.out.println("registering lengthofHair");
		return "babcut";
	}

	@Bean
	public String shapeofTheeth() {
		System.out.println("registering shapeofTheeth");
		return "korehallu";
	}

	@Bean
	public String food() {
		System.out.println("registering food");
		return "blood";
	}

	@Bean
	public String appearence() {
		System.out.println("registering appearence");
		return "cute";
	}

	@Bean
	public String region() {
		System.out.println("registering region");
		return "south";
	}

	@Bean
	public String place() {
		System.out.println("registering place");
		return "harishchandra ghat";
	}

	@Bean
	public int no() {
		System.out.println("registering no");
		return 03;
	}

	@Bean
	public String ghouse() {
		System.out.println("registering house");
		return "baniantree";
	}

	@Bean
	public String dress() {
		System.out.println("registering dress");
		return "dangri";
	}

	@Bean
	public String dresscolor() {
		System.out.println("registering dresscolor");
		return "black";
	}

	@Bean
	public String reason() {
		System.out.println("registering reason");
		return "heartbreak";
	}

	@Bean
	public LocalDate date() {
		System.out.println("registering reason");
		return LocalDate.of(1995, 01, 31);
	}

	@Bean
	public String mothername() {
		System.out.println("registering mothername");
		return "mari muttu";
	}

	@Bean
	public String fathername() {
		System.out.println("registering fathername");
		return "muddu raj";
	}

	@Bean
	public String siblings() {
		System.out.println("registering siblings");
		return "muddu bangara";
	}

	@Bean
	public String typeDeath() {
		System.out.println("registering typeDeath");
		return "phenoyl";
	}

	@Bean
	public String instaname() {
		System.out.println("registering instaname");
		return "the name is muddu";
	}

}
