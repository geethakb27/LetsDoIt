package com.xworkz.spring3.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.spring3")
public class SpringConfiguration {
	
	public SpringConfiguration() {
		System.out.println("Created SpringConfiguration");
	}

	@Bean
	public int hid() {
		System.out.println("registering id");
		return 5;
	}

	@Bean
	public String hname() {
		System.out.println("registering name");
		return "shree hardware";
	}

	@Bean
	public String hownerName() {
		System.out.println("registering ownerName");
		return "Navya";
	}

	@Bean
	public String haddress() {
		System.out.println("registering address");
		return "rajaji nagar";
	}
	

	@Bean
	public String pname() {
		System.out.println("registering pname");
		return "nataraja";
	}

	@Bean
	public String ptype() {
		System.out.println("registering ptype");
		return "cricle";
	}

	@Bean
	public String pcolor() {
		System.out.println("registering pcolor");
		return "red";
	}
	@Bean
	public int pprice() {
		System.out.println("registering pprice");
		return 10;
	}
	
	@Bean
	public String  psharp() {
		System.out.println("registering sharp");
		return "fine";
	}
	@Bean
	public String pstolen() {
		System.out.println("registering stolen");
		return "fast";
	}
	@Bean
	public String rname() {
		System.out.println("registering rname");
		return "Domes";
	}

	@Bean
	public String rtype() {
		System.out.println("registering rtype");
		return "cylinder";
	}

	@Bean
	public String rcolor() {
		System.out.println("registering rcolor");
		return "blue";
	}
	@Bean
	public int rprice() {
		System.out.println("registering rprice");
		return 10;
	}
	
	@Bean
	public String  rsharp() {
		System.out.println("registering rsharp");
		return "fine";
	}
	@Bean
	public String rstolen() {
		System.out.println("registering stolen");
		return "fast";
	}
	@Bean
	public int rsize() {
		System.out.println("registering size");
		return 10;
	}
	@Bean
	public String sname()
	{
		System.out.println("registering name");
		return "Abhi";
	}
	@Bean
	public int sversion()
	{
		System.out.println("registering version");
		return 10;
	}
	@Bean
	public String sdeveloper()
	{
		System.out.println("registeringdeveloper ");
		return "software developer";
	}
	@Bean
	public LocalDate sdate()
	{
		System.out.println("registering date");
		return LocalDate.of(1990, 03, 03);
	}
	@Bean
	public int sfree()
	{
		System.out.println("registering free");
		return 20000;
	}
	@Bean
	public String sename() {
		System.out.println("registering name");
		return "mohan";
	}

	@Bean
	public int sesalary() {
		System.out.println("registering salary");
		return 30000;
	}

	@Bean
	public String secompName() {
		System.out.println("registering compName");
		return "IMB";
	}
	@Bean
	public int seexp() {
		System.out.println("registering exp");
		return 4;
	}
	@Bean
	public String flowernm() {
		System.out.println("registering flowernm");
		return "rose";
	}

	@Bean
	public String fcolor() {
		System.out.println("registering  color");
		return "pink";
	}
	@Bean
	public int fprice() {
		System.out.println("registering price");
		return 50;
	}
	@Bean
	public String flavours() {
		System.out.println("registering  flavours");
		return "gulkan";
	}
	
	@Bean
	public String fsize() {
		System.out.println("registering  fsize");
		return "small";
	}
	@Bean
	public int fqunatity() {
		System.out.println("registering  fqunatity");
		return 5;
	}
	@Bean
	public String fuse() {
		System.out.println("registering  fuse");
		return "perfumes";
	}
	@Bean
	public int fnoOfType() {
		System.out.println("registering  fnoOfType");
		return 8;
	}

}
