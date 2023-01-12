package com.xworkz.spring4.bean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Ghost // 20 properties init 10 using const 10 using property
{
	private String name;
	private String look;
	private String color;
	private String lengthofHair;
	private String shapeofTheeth;
	private String food;
	private String appearence;
	private String region;
	private String place;
	private int no;
	@Autowired
	@Qualifier("ghouse")
	private String house;
	@Autowired
	@Qualifier("dress")
	private String dress;
	@Autowired
	@Qualifier("dresscolor")
	private String dresscolor;
	@Autowired
	@Qualifier("reason")
	private String reason;
	@Autowired
	@Qualifier("date")
	private LocalDate date;
	@Autowired
	@Qualifier("mothername")
	private String mothername;
	@Autowired
	@Qualifier("fathername")
	private String fathername;
	@Autowired
	@Qualifier("siblings")
	private String siblings;
	@Autowired
	@Qualifier("typeDeath")
	private String typeDeath;
	@Autowired
	@Qualifier("instaname")
	private String instaname;

	@Autowired
	public Ghost(@Qualifier("gname") String name, @Qualifier("look") String look, @Qualifier("gcolor") String color,
			@Qualifier("lengthofHair") String lengthofHair, @Qualifier("shapeofTheeth") String shapeofTheeth,
			@Qualifier("food") String food, @Qualifier("appearence") String appearence,
			@Qualifier("region") String region, @Qualifier("place") String place, @Qualifier("no") int no) {
		super();
		this.name = name;
		this.look = look;
		this.color = color;
		this.lengthofHair = lengthofHair;
		this.shapeofTheeth = shapeofTheeth;
		this.food = food;
		this.appearence = appearence;
		this.region = region;
		this.place = place;
		this.no = no;
	}

	@Override
	public String toString() {
		return "Ghost [name=" + name + ", look=" + look + ", color=" + color + ", lengthofHaird=" + lengthofHair
				+ ", shapeofTheeth=" + shapeofTheeth + ", food=" + food + ", appearence=" + appearence + ", region="
				+ region + ", place=" + place + ", no=" + no + ", house=" + house + ", dress=" + dress + ", dresscolor="
				+ dresscolor + ", reason=" + reason + ", date=" + date + ", mothername=" + mothername + ", fathername="
				+ fathername + ", siblings=" + siblings + ", typeDeath=" + typeDeath + ", instaname=" + instaname + "]";
	}

}
