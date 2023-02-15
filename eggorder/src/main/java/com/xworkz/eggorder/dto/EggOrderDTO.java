package com.xworkz.eggorder.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name= "egg_table")
public class EggOrderDTO {

	@Column(name = "c_id")
	@Id
	private int id;
	@Column(name = "c_hotelName")
	private String hotelName;
	@Column(name = "c_dishName")
	private String dishName;
	@Column(name = "c_type")
	private String type;
	@Column(name = "c_price")
	private Double price;
	@Column(name = "c_quantity")
	private Integer quantity;
	@Column(name = "c_takeAway")
	private Boolean takeAway;
}
