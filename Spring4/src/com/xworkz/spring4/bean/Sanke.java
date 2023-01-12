package com.xworkz.spring4.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Sanke {
	private String name;
	@Autowired
	@Qualifier("slength")
	private String length;
	@Autowired
	@Qualifier("scolor")
	private String color;
	private String type;
	private String poisionous;

	@Autowired
	public Sanke(@Qualifier("sname") String name, @Qualifier("stype") String type,
			@Qualifier("spoisionous") String poisionous) {
		super();
		this.name = name;
		this.type = type;
		this.poisionous = poisionous;
	}

	@Override
	public String toString() {
		return "Sanke [name=" + name + ", length=" + length + ", color=" + color + ", type=" + type + ", poisionous="
				+ poisionous + "]";
	}

}
