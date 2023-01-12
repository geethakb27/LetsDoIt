package com.xworkz.spring4.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	@Autowired
	@Qualifier("ename")
	private String name;
	private String type;
	@Autowired
	@Qualifier("enumber")
	private int number;
	@Autowired
	@Qualifier("eversion")
	private int version;
	private String company;
	private String strokes;

	@Autowired
	public Engine(@Qualifier("etype") String type, @Qualifier("ecompany") String company) {
		super();
		this.type = type;
		this.company = company;
	}

	@Autowired
	@Qualifier("strokes")
	public void setStrokes(String strokes) {
		this.strokes = strokes;
	}

	@Override
	public String toString() {
		return "Engine [name=" + name + ", type=" + type + ", number=" + number + ", version=" + version + ", company="
				+ company + ", strokes=" + strokes + "]";
	}

}
