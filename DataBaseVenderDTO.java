package com.xworkz.Sanitizer;

import java.io.Serializable;

public class DataBaseVenderDTO implements Serializable{
	private String name;
	private String developedBy;
	private Type type;
	private double size;
	private double licenceCost;
	public DataBaseVenderDTO() {
		// TODO Auto-generated constructor stub
	}
	public DataBaseVenderDTO(String name, String developedBy, Type type, double size, double licenceCost) {
		super();
		this.name = name;
		this.developedBy = developedBy;
		this.type = type;
		this.size = size;
		this.licenceCost = licenceCost;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 30;
		
	}
	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof DataBaseVenderDTO) {
				DataBaseVenderDTO dataBaseVenderDTO = (DataBaseVenderDTO) obj;
				if (dataBaseVenderDTO.getName().equals(this.name)
						&& dataBaseVenderDTO.getDevelopedBy().equals(this.developedBy)
						) {

					System.out.println("Cheacking Sucessfully ");
					return true;
				}

			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "DataBaseVenderDTO [name=" + name + ", developedBy=" + developedBy + ", type=" + type + ", size=" + size
				+ ", licenceCost=" + licenceCost + "]";
	}
	public String getName() {
		return name;
	}
	public String getDevelopedBy() {
		return developedBy;
	}
	public Type getType() {
		return type;
	}
	public double getSize() {
		return size;
	}
	public double getLicenceCost() {
		return licenceCost;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public void setLicenceCost(double licenceCost) {
		this.licenceCost = licenceCost;
	}
	
	
	
	
	
	

}

