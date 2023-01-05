package com.xworkz.collections.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class WeaponDTO implements Serializable, Comparable<WeaponDTO> {

	private String name;
	private String madeBy;
	private LocalDate madeOn;
	private Double price;
	private WeaponType type;

	public WeaponDTO() {

	}

	public WeaponDTO(String name, String madeBy, LocalDate madeOn, Double price, WeaponType type) {
		super();
		this.name = name;
		this.madeBy = madeBy;
		this.madeOn = madeOn;
		this.price = price;
		this.type = type;
	}

	@Override
	public int hashCode() {

		return 60;
	}

	@Override
	public String toString() {
		return "WeaponDTO [name=" + name + ", madeBy=" + madeBy + ", madeOn=" + madeOn + ", price=" + price + "]";
	}

	@Override
	public int compareTo(WeaponDTO o) {

		return o.name.compareTo(this.name);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof WeaponDTO) {
				WeaponDTO dto = (WeaponDTO) obj;
				{
					if (dto.name.equals(this.name) && dto.type.equals(this.type))
						return true;
				}
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMadeBy() {
		return madeBy;
	}

	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	public LocalDate getMadeOn() {
		return madeOn;
	}

	public void setMadeOn(LocalDate madeOn) {
		this.madeOn = madeOn;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public WeaponType getType() {
		return type;
	}

	public void setType(WeaponType type) {
		this.type = type;
	}

}
