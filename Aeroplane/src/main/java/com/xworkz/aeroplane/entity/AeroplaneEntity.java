package com.xworkz.aeroplane.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="aeroplane_table")
public class AeroplaneEntity {

	@Id
	@Column(name = "aer_id")
	private int id;
	
	@Column(name = "aer_name")
	private String name;

	@Column(name = "aer_company")
	private String company;
	
	@Column(name="aer_cost")
	private double cost;
	
	@Column(name = "aer_type")
	private String types;
	
	@Column(name = "aer_country")
	private String countries;
	
}
