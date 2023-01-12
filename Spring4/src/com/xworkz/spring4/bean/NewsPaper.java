package com.xworkz.spring4.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NewsPaper {
	@Autowired
	@Qualifier("nid")
	private int id;
	private String name;
	private String ownwerName;
	@Autowired
	@Qualifier("nlang")
	private String lang;
	private int price;

	@Autowired
	public NewsPaper(@Qualifier("nname") String name, @Qualifier("nownwerName") String ownwerName) {
		super();
		this.name = name;
		this.ownwerName = ownwerName;
	}

	@Autowired
	@Qualifier("nprice")
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "NewsPaper [id=" + id + ", name=" + name + ", ownwerName=" + ownwerName + ", lang=" + lang + ", price="
				+ price + "]";
	}

}
