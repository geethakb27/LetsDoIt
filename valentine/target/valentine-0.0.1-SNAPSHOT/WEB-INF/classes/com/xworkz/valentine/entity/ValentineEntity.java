package com.xworkz.valentine.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class ValentineEntity {

	
	@Column(name = "v_id")
	@Id
	private String id;
	@Column(name = "v_name")
	private String name;
	@Column(name = "v_valentineName")
	private String valentineName;
	@Column(name = "v_places")
	private String places;
	@Column(name = "v_gifts")
	private String gifts;

   
}
